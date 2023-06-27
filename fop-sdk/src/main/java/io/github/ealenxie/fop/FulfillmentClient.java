package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.fulfillment.dto.*;
import io.github.ealenxie.fop.fulfillment.vo.*;
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

    public FulfillmentClient(String appKey, String appSecret, RestOperations restOperations, ObjectMapper objectMapper) {
        super(appKey, appSecret, restOperations, objectMapper);
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=106">创建SKU</a>
     */
    public FopResp<SkuCreateVO> skuCreate(SkuCreate dto) {
        return postFop("fu.wms.sku.create", dto, new TypeReference<FopResp<SkuCreateVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=107">创建入库委托</a>
     */
    public FopResp<InboundCreateVO> inboundCreate(InboundCreate dto) {
        return postFop("fu.wms.inbound.create", dto, new TypeReference<FopResp<InboundCreateVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=108">批量查询SKU</a>
     */
    public FopResp<SkuListVO> getSkuList(SkuGetList dto) {
        return postFop("fu.wms.sku.getlist", dto, new TypeReference<FopResp<SkuListVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=109">取消入库委托</a>
     */
    public FopResp<InboundCancelVO> inboundCancel(InboundCancel dto) {
        return postFop("fu.wms.inbound.cancel", dto, new TypeReference<FopResp<InboundCancelVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=110">批量查询入库委托</a>
     */
    public FopResp<FopPage<List<InboundConsignment>>> inboundList(InboundList dto) {
        return postFop("fu.wms.inbound.getlist", dto, new TypeReference<FopResp<FopPage<List<InboundConsignment>>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=111">创建出库委托</a>
     *
     * @param dto 请求参数
     */
    public FopResp<OutboundCreateVO> outboundCreate(OutboundCreate dto) {
        return postFop("fu.wms.outbound.create", dto, new TypeReference<FopResp<OutboundCreateVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=112">取消出库委托</a>
     */
    public FopResp<OutboundCancelVO> outboundCancel(OutboundCancel dto) {
        return postFop("fu.wms.outbound.cancel", dto, new TypeReference<FopResp<OutboundCancelVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=113">批量查询出库委托</a>
     *
     * @param dto 请求参数
     */
    public FopResp<FopPage<List<Outbound>>> outboundList(OutboundList dto) {
        return postFop("fu.wms.outbound.getlist", dto, new TypeReference<FopResp<FopPage<List<Outbound>>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=114">库存查询</a>
     */
    public FopResp<FopPage<List<Inventory>>> inventoryList(InventoryList dto) {
        return postFop("fu.wms.inventory.get", dto, new TypeReference<FopResp<FopPage<List<Inventory>>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=115">查询库存流水</a>
     */
    public FopResp<FopPage<List<InventoryFlow>>> inventoryLog(InventoryLog dto) {
        return postFop("fu.wms.inventory.getlog", dto, new TypeReference<FopResp<FopPage<List<InventoryFlow>>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=116">查询库存库龄</a>
     */
    public FopResp<InventoryDetailVO> inventoryDetail(InventoryDetail dto) {
        return postFop("fu.wms.inventory.getdetail", dto, new TypeReference<FopResp<InventoryDetailVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=117">修改sku图片</a>
     */
    public FopResp<String> editPicture(EditPicture dto) {
        return postFop("fu.wms.sku.editpicture", dto, new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=118">查询出库委托费用（逐步弃用）</a>
     */
    public FopResp<OutBoundBillingVO> outboundBilling(OutBoundBilling dto) {
        return postFop("fu.wms.outbound.getbilling", dto, new TypeReference<FopResp<OutBoundBillingVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=119">获取入库委托标签文件</a>
     */
    public FopResp<InboundLabelVO> getInboundLabel(GetInboundLabel dto) {
        return postFop("fu.wms.inbound.getinboundlabel", dto, new TypeReference<FopResp<InboundLabelVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=120">上传箱单发票</a>
     */
    public FopResp<List<String>> uploadInvoiceFile(UploadInvoiceFile dto) {
        return postFop("fu.wms.inbound.uploadinvoicefile", dto, new TypeReference<FopResp<List<String>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=176">创建派送委托</a>
     */
    public FopResp<CreateShipmentVO> createShipment(CreateShipment dto) {
        return postFop("com.basis.external.create", dto, new TypeReference<FopResp<CreateShipmentVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=177">获取派送委托发货面单</a>
     */
    public FopResp<LabelShipmentVO> getLabelShipment(LabelShipment dto) {
        return postFop("com.basis.external.getLabel", dto, new TypeReference<FopResp<LabelShipmentVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=178">取消派送委托</a>
     */
    public FopResp<CancelShipmentVO> cancelShipment(CancelShipment dto) {
        return postFop("com.basis.external.cancelLabel", dto, new TypeReference<FopResp<CancelShipmentVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=182">创建SKU (新参数对接)</a>
     */
    public FopResp<SkuCreateVO> skuNewCreate(SkuNewCreate dto) {
        return postFop("fu.wms.sku.newcreate", dto, new TypeReference<FopResp<SkuCreateVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=195">修改SKU信息/添加国家信息</a>
     */
    public FopResp<String> skuEdit(SkuEdit dto) {
        return postFop("fu.wms.sku.edit", dto, new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=200">创建LMA订单</a>
     */
    public FopResp<ExternalCreateVO> externalCreate(ExternalCreate dto) {
        return postFop("com.basis.external.create", dto, new TypeReference<FopResp<ExternalCreateVO>>() {
        });
    }


}
