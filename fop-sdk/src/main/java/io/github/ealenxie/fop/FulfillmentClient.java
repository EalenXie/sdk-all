package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.fulfillment.dto.*;
import io.github.ealenxie.fop.fulfillment.vo.*;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

import java.util.List;

/**
 * 订单履约服务
 */
public class FulfillmentClient extends FopClient {


    public FulfillmentClient() {

    }

    public FulfillmentClient(RestOperations restOperations) {
        super(restOperations);
    }

    public FulfillmentClient(RestOperations restOperations, ObjectMapper objectMapper) {
        super(restOperations, objectMapper);
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=106">创建SKU</a>
     */
    public FopResp<SkuCreateVO> skuCreate(AppKeySecret appKeySecret, SkuCreate dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.sku.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<SkuCreateVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=107">创建入库委托</a>
     */
    public FopResp<InboundCreateVO> inboundCreate(AppKeySecret appKeySecret, InboundCreate dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.inbound.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<InboundCreateVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=108">批量查询SKU</a>
     */
    public FopResp<SkuListVO> getSkuList(AppKeySecret appKeySecret, SkuGetList dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.sku.getlist");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<SkuListVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=109">取消入库委托</a>
     */
    public FopResp<InboundCancelVO> inboundCancel(AppKeySecret appKeySecret, InboundCancel dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.inbound.cancel");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<InboundCancelVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=110">批量查询入库委托</a>
     */
    public FopResp<FopPage<List<InboundConsignment>>> inboundList(AppKeySecret appKeySecret, InboundList dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.inbound.getlist");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<FopPage<List<InboundConsignment>>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=111">创建出库委托</a>
     *
     * @param dto 请求参数
     */
    public FopResp<OutboundCreateVO> outboundCreate(AppKeySecret appKeySecret, OutboundCreate dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.outbound.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<OutboundCreateVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=112">取消出库委托</a>
     */
    public FopResp<OutboundCancelVO> outboundCancel(AppKeySecret appKeySecret, OutboundCancel dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.outbound.cancel");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<OutboundCancelVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=113">批量查询出库委托</a>
     *
     * @param dto 请求参数
     */
    public FopResp<FopPage<List<Outbound>>> outboundList(AppKeySecret appKeySecret, OutboundList dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.outbound.getlist");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<FopPage<List<Outbound>>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=114">库存查询</a>
     */
    public FopResp<FopPage<List<Inventory>>> inventoryList(AppKeySecret appKeySecret, InventoryList dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.inventory.get");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<FopPage<List<Inventory>>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=115">查询库存流水</a>
     */
    public FopResp<FopPage<List<InventoryFlow>>> inventoryLog(AppKeySecret appKeySecret, InventoryLog dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.inventory.getlog");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<FopPage<List<InventoryFlow>>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=116">查询库存库龄</a>
     */
    public FopResp<InventoryDetailVO> inventoryDetail(AppKeySecret appKeySecret, InventoryDetail dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.inventory.getdetail");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<InventoryDetailVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=117">修改sku图片</a>
     */
    public FopResp<String> editPicture(AppKeySecret appKeySecret, EditPicture dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.sku.editpicture");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=117">查询出库委托费用</a>
     */
    public FopResp<OutBoundBillingVO> outboundBilling(AppKeySecret appKeySecret, OutBoundBilling dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.outbound.getbilling");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<OutBoundBillingVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=119">获取入库委托标签文件</a>
     */
    public FopResp<InboundLabelVO> getInboundLabel(AppKeySecret appKeySecret, GetInboundLabel dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.inbound.getinboundlabel");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<InboundLabelVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=120">上传箱单发票</a>
     */
    public FopResp<List<String>> uploadInvoiceFile(AppKeySecret appKeySecret, UploadInvoiceFile dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.inbound.uploadinvoicefile");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<List<String>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=176">创建派送委托</a>
     */
    public FopResp<CreateShipmentVO> createShipment(AppKeySecret appKeySecret, CreateShipment dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.basis.external.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<CreateShipmentVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=177">获取派送委托发货面单</a>
     */
    public FopResp<LabelShipmentVO> getLabelShipment(AppKeySecret appKeySecret, LabelShipment dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.basis.external.getLabel");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<LabelShipmentVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=178">取消派送委托</a>
     */
    public FopResp<CancelShipmentVO> cancelShipment(AppKeySecret appKeySecret, CancelShipment dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.basis.external.cancelLabel");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<CancelShipmentVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=182">创建SKU (新参数对接)</a>
     */
    public FopResp<SkuCreateVO> skuNewCreate(AppKeySecret appKeySecret, SkuNewCreate dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.sku.newcreate");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<SkuCreateVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=195">修改SKU信息/添加国家信息</a>
     */
    public FopResp<String> skuEdit(AppKeySecret appKeySecret, SkuEdit dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "fu.wms.sku.edit");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=200">创建LMA订单</a>
     */
    public FopResp<ExternalCreateVO> externalCreate(AppKeySecret appKeySecret, ExternalCreate dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.basis.external.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<ExternalCreateVO>>() {
        });
    }


}
