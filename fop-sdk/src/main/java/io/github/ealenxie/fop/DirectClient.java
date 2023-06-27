package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.direct.dto.*;
import io.github.ealenxie.fop.direct.vo.*;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

import java.util.List;

public class DirectClient extends FopClient {
    public DirectClient() {

    }

    public DirectClient(RestOperations restOperations) {
        super(restOperations);
    }

    public DirectClient(RestOperations restOperations, ObjectMapper objectMapper) {
        super(restOperations, objectMapper);
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=96">创建直发委托单</a>
     */
    public FopResp<CreateXmsOrderResp> createXmsOrder(AppKeySecret appKeySecret, CreateXmsOrder dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.order.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<CreateXmsOrderResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=98">查询直发委托单</a>
     */
    public FopResp<List<XmsOrder>> getXmsOrder(AppKeySecret appKeySecret, GetXmsOrder dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.order.get");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<List<XmsOrder>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=99">取消直发委托单</a>
     */
    public FopResp<Void> cancelXmsOrder(AppKeySecret appKeySecret, CancelXmsOrder dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.order.cancel");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=100">申请|取消拦截订单</a>
     */
    public FopResp<Void> holdXmsOrder(AppKeySecret appKeySecret, HoldXmsOrder dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.order.hold");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=102">获取标签</a>
     */
    public FopResp<XmsLabelInfo> getXmsLabel(AppKeySecret appKeySecret, GetXmsLabel dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.label.get");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<XmsLabelInfo>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=134">直发授权-出库预报</a>
     * <p><b>收费</b></p>
     */
    public FopResp<CreatBatchOutboundResp> creatBatchOutbound(AppKeySecret appKeySecret, CreateBatchOutbound dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.batch_outbound.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<CreatBatchOutboundResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=136">直发授权-袋标签</a>
     * <p><b>收费</b></p>
     */
    public FopResp<BagLabelResp> getBagLabel(AppKeySecret appKeySecret, GetBagLabel dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.bag_label.get");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<BagLabelResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=163">直发授权-批量单票出库预报</a>
     * <p><b>收费</b></p>
     */
    public FopResp<DepartureCodeResp> departureMailItem(AppKeySecret appKeySecret, DepartureMailItem dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.departure.mailitem");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<DepartureCodeResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=164">直发授权-完成装袋</a>
     */
    public FopResp<CreateXmsBagResp> createXmsBag(AppKeySecret appKeySecret, CreateXmsBag dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.bag.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<CreateXmsBagResp>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=165">批量获取标签</a>
     */
    public FopResp<String> getXmsLabelList(AppKeySecret appKeySecret, GetXmsLabelList dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.label.getlist");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=166">单票交航</a>
     */
    public FopResp<Void> createOrderAirline(AppKeySecret appKeySecret, CreateOrderAirline dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.order_airline.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=167">物流产品查询</a>
     */
    public FopResp<List<LogisticsProduct>> getLogisticsProductList(AppKeySecret appKeySecret, GetLogisticsProductList dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.logistics_product.getlist");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<List<LogisticsProduct>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=168">单票入库</a>
     */
    public FopResp<Void> createOrderInbound(AppKeySecret appKeySecret, CreateOrderInbound dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.order_inbound.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=169">更新预报重</a>
     */
    public FopResp<Void> updateXmsOrderWeight(AppKeySecret appKeySecret, UpdateXmsOrderWeight dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.order.updateweight");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=174">单票出库</a>
     * <p><b>收费</b></p>
     */
    public FopResp<Void> createOrderOutbound(AppKeySecret appKeySecret, CreateOrderOutbound dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.order_outbound.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=181">预估费用查询/运费试算</a>
     */
    public FopResp<List<XmsEstimatedCost>> getEstimatedCost(AppKeySecret appKeySecret, GetEstimatedCost dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.estimated_cost.get");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<List<XmsEstimatedCost>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=183">新增预约组包接口</a>
     */
    public FopResp<BagCollectResp> createCollectBig(AppKeySecret appKeySecret, CreateCollectBig dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.api.collect.create.big");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<BagCollectResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=184">取消预约组包</a>
     */
    public FopResp<Void> cancelCollectBig(AppKeySecret appKeySecret, CancelCollectBig dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.api.collect.cancel.big");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=185">打印组包面单</a>
     */
    public FopResp<String> printCollectBig(AppKeySecret appKeySecret, PrintCollectBig dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.api.collect.print.big");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<String>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=186">创建揽收预约单</a>
     */
    public FopResp<CollectNoVO> createCollectOrder(AppKeySecret appKeySecret, CreateCollectOrder dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.api.collect.create.order");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<CollectNoVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=187">取消预约单</a>
     */
    public FopResp<Void> cancelCollectOrder(AppKeySecret appKeySecret, CancelCollectOrder dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.api.collect.cancel.order");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=188">打印预约单</a>
     */
    public FopResp<String> printCollectOrder(AppKeySecret appKeySecret, CollectOrderNos dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.api.collect.print.order");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=189">商家工作台-获取袋标</a>
     *
     * @param containerNo 袋号
     */
    public FopResp<PackageLabel> getPackageLabel(AppKeySecret appKeySecret, String containerNo) {
        CommonArgs common = new CommonArgs(appKeySecret, "bws.package.getLabel");
        return readFopBody(callFop(HttpMethod.POST, common, new ContainerNoDTO(containerNo)), new TypeReference<FopResp<PackageLabel>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=190">商家工作台-取消组包</a>
     *
     * @param containerNo 袋号
     */
    public FopResp<ContainerNoDTO> cancelPackage(AppKeySecret appKeySecret, String containerNo) {
        CommonArgs common = new CommonArgs(appKeySecret, "bws.package.cancelPackage");
        return readFopBody(callFop(HttpMethod.POST, common, new ContainerNoDTO(containerNo)), new TypeReference<FopResp<ContainerNoDTO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=191">商家工作台-组包</a>
     * <p>
     * todo 这个接口传参与文档不匹配
     */
    public FopResp<PackageLabel> packageGroup(AppKeySecret appKeySecret, PickupAddress pickupAddress) {
        CommonArgs common = new CommonArgs(appKeySecret, "bws.package.group");
        return readFopBody(callFop(HttpMethod.POST, common, pickupAddress), new TypeReference<FopResp<PackageLabel>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=192">商家工作台-批量获取标签接口</a>
     */
    public FopResp<List<Label>> getLabelList(AppKeySecret appKeySecret, GetLabelList getLabelList) {
        CommonArgs common = new CommonArgs(appKeySecret, "bws.label.getList");
        return readFopBody(callFop(HttpMethod.POST, common, getLabelList), new TypeReference<FopResp<List<Label>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=193">商家工作台-称重接口</a>
     */
    public FopResp<Void> orderWeigh(AppKeySecret appKeySecret, OrderWeigh orderWeigh) {
        CommonArgs common = new CommonArgs(appKeySecret, "bws.order.weigh");
        return readFopBody(callFop(HttpMethod.POST, common, orderWeigh), new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=194">商家工作台-订单分拣</a>
     *
     * @param scanNo 面单条码
     */
    public FopResp<SortingResp> sorting(AppKeySecret appKeySecret, String scanNo) {
        CommonArgs common = new CommonArgs(appKeySecret, "bws.sorting.sorting");
        return readFopBody(callFop(HttpMethod.POST, common, new ScanNoDTO(scanNo)), new TypeReference<FopResp<SortingResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=197">异常件查询接口</a>
     */
    public FopResp<List<XmsOrderAbnormal>> abnormalList(AppKeySecret appKeySecret, OrderAbnormalList list) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.order_abnormal.getlist");
        return readFopBody(callFop(HttpMethod.POST, common, list), new TypeReference<FopResp<List<XmsOrderAbnormal>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=206">集运一段包裹入库预报</a>
     */
    public FopResp<PcsInboundCreateResp> pcsInboundCreate(AppKeySecret appKeySecret, PcsInboundCreate pcsInboundCreate) {
        CommonArgs common = new CommonArgs(appKeySecret, "pcs.order.inbound.create");
        return readFopBody(callFop(HttpMethod.POST, common, pcsInboundCreate), new TypeReference<FopResp<PcsInboundCreateResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=207">集运一段包裹入库预报</a>
     */
    public FopResp<PcsOutboundCreateResp> pcsOutboundCreate(AppKeySecret appKeySecret, PcsOutboundCreate pcsOutboundCreate) {
        CommonArgs common = new CommonArgs(appKeySecret, "pcs.order.outbound.create");
        return readFopBody(callFop(HttpMethod.POST, common, pcsOutboundCreate), new TypeReference<FopResp<PcsOutboundCreateResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=208">集运一段包裹取消</a>
     */
    public FopResp<FpxTrackingNoVO> pcsInboundCancel(AppKeySecret appKeySecret, CancelDTO dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "pcs.order.inbound.cancel");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<FpxTrackingNoVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=209">集运二段包裹拦截</a>
     */
    public FopResp<FpxTrackingNoVO> pcsOutboundCancel(AppKeySecret appKeySecret, CancelDTO dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "pcs.order.outbound.cancel");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<FpxTrackingNoVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=210">集运订单查询</a>
     */
    public FopResp<PcsOrderResp> pcsOrderQuery(AppKeySecret appKeySecret, PcsOrderQuery dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "pcs.order.query");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<PcsOrderResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=214">查询订单费用信息</a>
     *
     * @param requestNo 请求单号，支持4PX单号、服务商单号、客户单号
     */
    public FopResp<OrderFreight> getFreight(AppKeySecret appKeySecret, String requestNo) {
        CommonArgs common = new CommonArgs(appKeySecret, "ds.xms.order.getFreight");
        return readFopBody(callFop(HttpMethod.POST, common, new RequestNoDTO(requestNo)), new TypeReference<FopResp<OrderFreight>>() {
        });
    }

}
