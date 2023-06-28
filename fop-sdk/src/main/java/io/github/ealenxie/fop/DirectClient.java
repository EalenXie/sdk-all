package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.direct.dto.*;
import io.github.ealenxie.fop.direct.vo.*;
import io.github.ealenxie.fop.direct.vo.FpxTrackingNoPayload;
import org.springframework.web.client.RestOperations;

import java.util.List;

public class DirectClient extends FopClient {
    public DirectClient(String appKey, String appSecret) {
        super(appKey, appSecret);
    }

    public DirectClient(String appKey, String appSecret, RestOperations restOperations) {
        super(appKey, appSecret, restOperations);
    }

    public DirectClient(String appKey, String appSecret, RestOperations restOperations, ObjectMapper objectMapper) {
        super(appKey, appSecret, restOperations, objectMapper);
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=96">创建直发委托单</a>
     */
    public FopResp<CreateXmsOrderResp> createXmsOrder(CreateXmsOrder dto) {
        return postFop("ds.xms.order.create", dto, new TypeReference<FopResp<CreateXmsOrderResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=98">查询直发委托单</a>
     */
    public FopResp<List<XmsOrder>> getXmsOrder(GetXmsOrder dto) {
        return postFop("ds.xms.order.get", dto, new TypeReference<FopResp<List<XmsOrder>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=99">取消直发委托单</a>
     */
    public FopResp<Void> cancelXmsOrder(CancelXmsOrder dto) {
        return postFop("ds.xms.order.cancel", dto, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=100">申请|取消拦截订单</a>
     */
    public FopResp<Void> holdXmsOrder(HoldXmsOrder dto) {
        return postFop("ds.xms.order.hold", dto, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=102">获取标签</a>
     */
    public FopResp<XmsLabelInfo> getXmsLabel(GetXmsLabel dto) {
        return postFop("ds.xms.label.get", dto, new TypeReference<FopResp<XmsLabelInfo>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=134">直发授权-出库预报</a>
     * <p><b>收费</b></p>
     */
    public FopResp<CreatBatchOutboundResp> creatBatchOutbound(CreateBatchOutbound dto) {
        return postFop("ds.xms.batch_outbound.create", dto, new TypeReference<FopResp<CreatBatchOutboundResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=136">直发授权-袋标签</a>
     * <p><b>收费</b></p>
     */
    public FopResp<BagLabelResp> getBagLabel(GetBagLabel dto) {
        return postFop("ds.xms.bag_label.get", dto, new TypeReference<FopResp<BagLabelResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=163">直发授权-批量单票出库预报</a>
     * <p><b>收费</b></p>
     */
    public FopResp<DepartureCodeResp> departureMailItem(DepartureMailItem dto) {
        return postFop("ds.xms.departure.mailitem", dto, new TypeReference<FopResp<DepartureCodeResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=164">直发授权-完成装袋</a>
     */
    public FopResp<CreateXmsBagResp> createXmsBag(CreateXmsBag dto) {
        return postFop("ds.xms.bag.create", dto, new TypeReference<FopResp<CreateXmsBagResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=165">批量获取标签</a>
     */
    public FopResp<String> getXmsLabelList(GetXmsLabelList dto) {
        return postFop("ds.xms.label.getlist", dto, new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=166">单票交航</a>
     */
    public FopResp<Void> createOrderAirline(CreateOrderAirline dto) {
        return postFop("ds.xms.order_airline.create", dto, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=167">物流产品查询</a>
     */
    public FopResp<List<LogisticsProduct>> getLogisticsProductList(GetLogisticsProductList dto) {
        return postFop("ds.xms.logistics_product.getlist", dto, new TypeReference<FopResp<List<LogisticsProduct>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=168">单票入库</a>
     */
    public FopResp<Void> createOrderInbound(CreateOrderInbound dto) {
        return postFop("ds.xms.order_inbound.create", dto, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=169">更新预报重</a>
     */
    public FopResp<Void> updateXmsOrderWeight(UpdateXmsOrderWeight dto) {
        return postFop("ds.xms.order.updateweight", dto, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=174">单票出库</a>
     * <p><b>收费</b></p>
     */
    public FopResp<Void> createOrderOutbound(CreateOrderOutbound dto) {
        return postFop("ds.xms.order_outbound.create", dto, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=181">预估费用查询/运费试算</a>
     */
    public FopResp<List<XmsEstimatedCost>> getEstimatedCost(GetEstimatedCost dto) {
        return postFop("ds.xms.estimated_cost.get", dto, new TypeReference<FopResp<List<XmsEstimatedCost>>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=183">新增预约组包接口</a>
     */
    public FopResp<BagCollectResp> createCollectBig(CreateCollectBig dto) {
        return postFop("ds.xms.api.collect.create.big", dto, new TypeReference<FopResp<BagCollectResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=184">取消预约组包</a>
     */
    public FopResp<Void> cancelCollectBig(CancelCollectBig dto) {
        return postFop("ds.xms.api.collect.cancel.big", dto, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=185">打印组包面单</a>
     */
    public FopResp<String> printCollectBig(PrintCollectBig dto) {
        return postFop("ds.xms.api.collect.print.big", dto, new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=186">创建揽收预约单</a>
     */
    public FopResp<CollectNoPayload> createCollectOrder(CreateCollectOrder dto) {
        return postFop("ds.xms.api.collect.create.order", dto, new TypeReference<FopResp<CollectNoPayload>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=187">取消预约单</a>
     */
    public FopResp<Void> cancelCollectOrder(CancelCollectOrder dto) {
        return postFop("ds.xms.api.collect.cancel.order", dto, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=188">打印预约单</a>
     */
    public FopResp<String> printCollectOrder(CollectOrderNos dto) {
        return postFop("ds.xms.api.collect.print.order", dto, new TypeReference<FopResp<String>>() {
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
    public FopResp<PackageLabel> packageGroup(PackageGroup dto) {
        return postFop("bws.package.group", dto, new TypeReference<FopResp<PackageLabel>>() {
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
    public FopResp<FpxTrackingNoPayload> pcsInboundCancel(CancelPayload dto) {
        return postFop("pcs.order.inbound.cancel", dto, new TypeReference<FopResp<FpxTrackingNoPayload>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=209">集运二段包裹拦截</a>
     */
    public FopResp<FpxTrackingNoPayload> pcsOutboundCancel(CancelPayload dto) {
        return postFop("pcs.order.outbound.cancel", dto, new TypeReference<FopResp<FpxTrackingNoPayload>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=210">集运订单查询</a>
     */
    public FopResp<PcsOrderResp> pcsOrderQuery(PcsOrderQuery dto) {
        return postFop("pcs.order.query", dto, new TypeReference<FopResp<PcsOrderResp>>() {
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
