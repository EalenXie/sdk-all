package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.fulfillment.*;
import org.springframework.web.client.RestOperations;

import java.util.List;

/**
 * 订单履约服务
 */
public class FulfillmentClient extends FopClient {


    public FulfillmentClient(String appKey, String appSecret) {

        super(appKey, appSecret);
    }

    public FulfillmentClient(String appKey, String appSecret, RestOperations restOperations) {
        super(appKey, appSecret, restOperations);
    }

    public FulfillmentClient(String appKey, String appSecret, boolean isFop, RestOperations restOperations, ObjectMapper objectMapper) {
        super(appKey, appSecret, isFop, restOperations, objectMapper);
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=106">创建SKU</a>
     */
    public FopResp<SkuIdCodePayload> skuCreate(SkuCreate payload) {
        return postFop("fu.wms.sku.create", payload, new TypeReference<FopResp<SkuIdCodePayload>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=107">创建入库委托</a>
     */
    public FopResp<InboundCreateResponse> inboundCreate(InboundCreate payload) {
        return postFop("fu.wms.inbound.create", payload, new TypeReference<FopResp<InboundCreateResponse>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=108">批量查询SKU</a>
     */
    public FopResp<SkuListResponse> getSkuList(SkuListPayload payload) {
        return postFop("fu.wms.sku.getlist", payload, new TypeReference<FopResp<SkuListResponse>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=109">取消入库委托</a>
     */
    public FopResp<ConsignmentRefNoPayload> inboundCancel(ConsignmentRefNoPayload payload) {
        return postFop("fu.wms.inbound.cancel", payload, new TypeReference<FopResp<ConsignmentRefNoPayload>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=110">批量查询入库委托</a>
     */
    public FopResp<FopPage<List<InboundConsignment>>> inboundList(InboundListPayload payload) {
        return postFop("fu.wms.inbound.getlist", payload, new TypeReference<FopResp<FopPage<List<InboundConsignment>>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=111">创建出库委托</a>
     *
     * @param payload 请求参数
     */
    public FopResp<OutboundCreateResponse> outboundCreate(OutboundCreate payload) {
        return postFop("fu.wms.outbound.create", payload, new TypeReference<FopResp<OutboundCreateResponse>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=112">取消出库委托</a>
     */
    public FopResp<OutboundCancelResponse> outboundCancel(OutboundCancel payload) {
        return postFop("fu.wms.outbound.cancel", payload, new TypeReference<FopResp<OutboundCancelResponse>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=113">批量查询出库委托</a>
     *
     * @param payload 请求参数
     */
    public FopResp<FopPage<List<Outbound>>> outboundList(OutboundListPayload payload) {
        return postFop("fu.wms.outbound.getlist", payload, new TypeReference<FopResp<FopPage<List<Outbound>>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=114">库存查询</a>
     */
    public FopResp<FopPage<List<Inventory>>> inventoryList(InventoryList payload) {
        return postFop("fu.wms.inventory.get", payload, new TypeReference<FopResp<FopPage<List<Inventory>>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=115">查询库存流水</a>
     */
    public FopResp<FopPage<List<InventoryFlow>>> inventoryLog(InventoryLog payload) {
        return postFop("fu.wms.inventory.getlog", payload, new TypeReference<FopResp<FopPage<List<InventoryFlow>>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=116">查询库存库龄</a>
     */
    public FopResp<InventoryDetailResponse> inventoryDetail(InventoryDetailPayload payload) {
        return postFop("fu.wms.inventory.getdetail", payload, new TypeReference<FopResp<InventoryDetailResponse>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=117">修改sku图片</a>
     */
    public FopResp<String> editPicture(EditPicture payload) {
        return postFop("fu.wms.sku.editpicture", payload, new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=118">查询出库委托费用（逐步弃用）</a>
     */
    public FopResp<OutBoundBillingResponse> outboundBilling(ConsignmentRefNoPayload payload) {
        return postFop("fu.wms.outbound.getbilling", payload, new TypeReference<FopResp<OutBoundBillingResponse>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=119">获取入库委托标签文件</a>
     */
    public FopResp<InboundLabelResponse> getInboundLabel(GetInboundLabel payload) {
        return postFop("fu.wms.inbound.getinboundlabel", payload, new TypeReference<FopResp<InboundLabelResponse>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=120">上传箱单发票</a>
     */
    public FopResp<List<String>> uploadInvoiceFile(UploadInvoiceFile payload) {
        return postFop("fu.wms.inbound.uploadinvoicefile", payload, new TypeReference<FopResp<List<String>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=176">创建派送委托</a>
     */
    public FopResp<ConsignmentNoPayload> createShipment(CreateShipment payload) {
        return postFop("com.basis.external.create", payload, new TypeReference<FopResp<ConsignmentNoPayload>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=177">获取派送委托发货面单</a>
     *
     * @param consignmentNo 返回派送委托单号
     */
    public FopResp<LabelShipmentResponse> getLabelShipment(String consignmentNo) {
        return postFop("com.basis.external.getLabel", new ConsignmentNoPayload(consignmentNo), new TypeReference<FopResp<LabelShipmentResponse>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=178">取消派送委托</a>
     */
    public FopResp<ConsignmentNoPayload> cancelShipment(CancelShipment payload) {
        return postFop("com.basis.external.cancelLabel", payload, new TypeReference<FopResp<ConsignmentNoPayload>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=182">创建SKU (新参数对接)</a>
     */
    public FopResp<SkuIdCodePayload> skuNewCreate(SkuNewCreate payload) {
        return postFop("fu.wms.sku.newcreate", payload, new TypeReference<FopResp<SkuIdCodePayload>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=195">修改SKU信息/添加国家信息</a>
     */
    public FopResp<String> skuEdit(SkuEdit payload) {
        return postFop("fu.wms.sku.edit", payload, new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=200">创建LMA订单</a>
     */
    public FopResp<ConsignmentNoPayload> externalCreate(ExternalCreate payload) {
        return postFop("com.basis.external.create", payload, new TypeReference<FopResp<ConsignmentNoPayload>>() {
        });
    }


}
