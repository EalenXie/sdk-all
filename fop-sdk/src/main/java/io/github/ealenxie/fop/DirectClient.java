package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.direct.*;
import org.springframework.web.client.RestOperations;

import java.util.List;

public class DirectClient extends FopClient {
    public DirectClient(String appKey, String appSecret) {
        super(appKey, appSecret);
    }

    public DirectClient(String appKey, String appSecret, boolean isFop) {
        super(appKey, appSecret, isFop);
    }

    public DirectClient(String appKey, String appSecret, RestOperations restOperations) {
        super(appKey, appSecret, restOperations);
    }

    public DirectClient(String appKey, String appSecret, boolean isFop, RestOperations restOperations, ObjectMapper objectMapper) {
        super(appKey, appSecret, isFop, restOperations, objectMapper);
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=96">创建直发委托单</a>
     */
    public FopResp<CreateXmsOrderResponse> createXmsOrder(CreateXmsOrder payload) {
        return postFop("ds.xms.order.create", payload, new TypeReference<FopResp<CreateXmsOrderResponse>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=98">查询直发委托单</a>
     */
    public FopResp<List<XmsOrder>> getXmsOrder(GetXmsOrder payload) {
        return postFop("ds.xms.order.get", payload, new TypeReference<FopResp<List<XmsOrder>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=99">取消直发委托单</a>
     */
    public FopResp<Void> cancelXmsOrder(CancelXmsOrder payload) {
        return postFop("ds.xms.order.cancel", payload, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=100">申请|取消拦截订单</a>
     */
    public FopResp<Void> holdXmsOrder(HoldXmsOrder payload) {
        return postFop("ds.xms.order.hold", payload, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=102">获取标签</a>
     */
    public FopResp<XmsLabelInfo> getXmsLabel(GetXmsLabel payload) {
        return postFop("ds.xms.label.get", payload, new TypeReference<FopResp<XmsLabelInfo>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=134">直发授权-出库预报</a>
     * <p><b>收费</b></p>
     */
    public FopResp<CreatBatchOutboundResp> creatBatchOutbound(CreateBatchOutbound payload) {
        return postFop("ds.xms.batch_outbound.create", payload, new TypeReference<FopResp<CreatBatchOutboundResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=136">直发授权-袋标签</a>
     * <p><b>收费</b></p>
     */
    public FopResp<BagLabelResp> getBagLabel(GetBagLabel payload) {
        return postFop("ds.xms.bag_label.get", payload, new TypeReference<FopResp<BagLabelResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=163">直发授权-批量单票出库预报</a>
     * <p><b>收费</b></p>
     */
    public FopResp<DepartureCodeResp> departureMailItem(DepartureMailItem payload) {
        return postFop("ds.xms.departure.mailitem", payload, new TypeReference<FopResp<DepartureCodeResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=164">直发授权-完成装袋</a>
     */
    public FopResp<CreateXmsBagResp> createXmsBag(CreateXmsBag payload) {
        return postFop("ds.xms.bag.create", payload, new TypeReference<FopResp<CreateXmsBagResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=165">批量获取标签</a>
     */
    public FopResp<String> getXmsLabelList(GetXmsLabelList payload) {
        return postFop("ds.xms.label.getlist", payload, new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=166">单票交航</a>
     */
    public FopResp<Void> createOrderAirline(CreateOrderAirline payload) {
        return postFop("ds.xms.order_airline.create", payload, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=167">物流产品查询</a>
     */
    public FopResp<List<LogisticsProduct>> getLogisticsProductList(GetLogisticsProductList payload) {
        return postFop("ds.xms.logistics_product.getlist", payload, new TypeReference<FopResp<List<LogisticsProduct>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=168">单票入库</a>
     */
    public FopResp<Void> createOrderInbound(CreateOrderInbound payload) {
        return postFop("ds.xms.order_inbound.create", payload, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=169">更新预报重</a>
     */
    public FopResp<Void> updateXmsOrderWeight(UpdateXmsOrderWeight payload) {
        return postFop("ds.xms.order.updateweight", payload, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=174">单票出库</a>
     * <p><b>收费</b></p>
     */
    public FopResp<Void> createOrderOutbound(CreateOrderOutbound payload) {
        return postFop("ds.xms.order_outbound.create", payload, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=181">预估费用查询/运费试算</a>
     */
    public FopResp<List<XmsEstimatedCost>> getEstimatedCost(GetEstimatedCost payload) {
        return postFop("ds.xms.estimated_cost.get", payload, new TypeReference<FopResp<List<XmsEstimatedCost>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=183">新增预约组包接口</a>
     */
    public FopResp<BagCollectResp> createCollectBig(CreateCollectBig payload) {
        return postFop("ds.xms.api.collect.create.big", payload, new TypeReference<FopResp<BagCollectResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=184">取消预约组包</a>
     */
    public FopResp<Void> cancelCollectBig(CancelCollectBig payload) {
        return postFop("ds.xms.api.collect.cancel.big", payload, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=185">打印组包面单</a>
     */
    public FopResp<String> printCollectBig(PrintCollectBig payload) {
        return postFop("ds.xms.api.collect.print.big", payload, new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=186">创建揽收预约单</a>
     */
    public FopResp<CollectNoPayload> createCollectOrder(CreateCollectOrder payload) {
        return postFop("ds.xms.api.collect.create.order", payload, new TypeReference<FopResp<CollectNoPayload>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=187">取消预约单</a>
     */
    public FopResp<Void> cancelCollectOrder(CancelCollectOrder payload) {
        return postFop("ds.xms.api.collect.cancel.order", payload, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=188">打印预约单</a>
     */
    public FopResp<String> printCollectOrder(CollectOrderNos payload) {
        return postFop("ds.xms.api.collect.print.order", payload, new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=189">商家工作台-获取袋标</a>
     *
     * @param containerNo 袋号
     */
    public FopResp<PackageLabel> getPackageLabel(String containerNo) {
        return postFop("ds.xms.api.collect.print.order", new ContainerNoPayload(containerNo), new TypeReference<FopResp<PackageLabel>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=190">商家工作台-取消组包</a>
     *
     * @param containerNo 袋号
     */
    public FopResp<ContainerNoPayload> cancelPackage(String containerNo) {
        return postFop("bws.package.cancelPackage", new ContainerNoPayload(containerNo), new TypeReference<FopResp<ContainerNoPayload>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=191">商家工作台-组包</a>
     */
    public FopResp<PackageLabel> packageGroup(PackageGroup payload) {
        return postFop("bws.package.group", payload, new TypeReference<FopResp<PackageLabel>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=192">商家工作台-批量获取标签接口</a>
     */
    public FopResp<List<Label>> getLabelList(GetLabelList getLabelList) {
        return postFop("bws.label.getList", getLabelList, new TypeReference<FopResp<List<Label>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=193">商家工作台-称重接口</a>
     */
    public FopResp<Void> orderWeigh(OrderWeigh orderWeigh) {
        return postFop("bws.label.getList", orderWeigh, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=194">商家工作台-订单分拣</a>
     *
     * @param scanNo 面单条码
     */
    public FopResp<SortingResp> sorting(String scanNo) {
        return postFop("bws.sorting.sorting", new ScanNoPayload(scanNo), new TypeReference<FopResp<SortingResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=197">异常件查询接口</a>
     */
    public FopResp<List<XmsOrderAbnormal>> abnormalList(OrderAbnormalList list) {
        return postFop("ds.xms.order_abnormal.getlist", list, new TypeReference<FopResp<List<XmsOrderAbnormal>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=206">集运一段包裹入库预报</a>
     */
    public FopResp<PcsInboundCreateResp> pcsInboundCreate(PcsInboundCreate pcsInboundCreate) {
        return postFop("pcs.order.inbound.create", pcsInboundCreate, new TypeReference<FopResp<PcsInboundCreateResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=207">集运一段包裹入库预报</a>
     */
    public FopResp<PcsOutboundCreateResp> pcsOutboundCreate(PcsOutboundCreate pcsOutboundCreate) {
        return postFop("pcs.order.outbound.create", pcsOutboundCreate, new TypeReference<FopResp<PcsOutboundCreateResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=208">集运一段包裹取消</a>
     */
    public FopResp<FpxTrackingNoPayload> pcsInboundCancel(CancelPayload payload) {
        return postFop("pcs.order.inbound.cancel", payload, new TypeReference<FopResp<FpxTrackingNoPayload>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=209">集运二段包裹拦截</a>
     */
    public FopResp<FpxTrackingNoPayload> pcsOutboundCancel(CancelPayload payload) {
        return postFop("pcs.order.outbound.cancel", payload, new TypeReference<FopResp<FpxTrackingNoPayload>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=210">集运订单查询</a>
     */
    public FopResp<PcsOrderResp> pcsOrderQuery(PcsOrderQuery payload) {
        return postFop("pcs.order.query", payload, new TypeReference<FopResp<PcsOrderResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=214">查询订单费用信息</a>
     *
     * @param requestNo 请求单号，支持4PX单号、服务商单号、客户单号
     */
    public FopResp<OrderFreight> getFreight(String requestNo) {
        return postFop("ds.xms.order.getFreight", new RequestNoPayload(requestNo), new TypeReference<FopResp<OrderFreight>>() {
        });
    }

}
