package io.github.ealenxie.alibaba;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.alibaba.dto.UploadRefundVoucher;
import io.github.ealenxie.alibaba.dto.*;
import io.github.ealenxie.alibaba.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;

import java.util.List;


/**
 * <a href="https://open.1688.com/solution/solutionDetail.htm?spm=a260s.11247765.je8hk6gy.24.5d2932ba0QlkSC&solutionKey=1610440369288#apiAndMessageList">跨境ERP对接解决方案</a>
 *
 * @author jadechiang
 * @since 2022/12/15 15:42
 */
public class CrossBorderERPClient extends Alibaba1688Client {
    public CrossBorderERPClient() {
    }

    public CrossBorderERPClient(ObjectMapper mapper, RestOperations restOperations) {
        super(mapper, restOperations);
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.get.buyerView-1&aopApiCategory=trade_new">订单详情查看(买家视角)</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<TradeInfo> getTradeInfo(RequireArgs requireArgs, GetTradeInfo dto) {
        return postAlibaba("com.alibaba.trade:alibaba.trade.get.buyerView-1", requireArgs, dto, new ParameterizedTypeReference<Resp<TradeInfo>>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.createCrossOrder-1">跨境订单创建</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<CreateCrossOrderResp> createCrossOrder(RequireArgs requireArgs, CreateCrossOrder dto) {
        return postAlibaba("com.alibaba.trade:alibaba.trade.createCrossOrder-1", requireArgs, dto, new ParameterizedTypeReference<Resp<CreateCrossOrderResp>>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.createOrder.preview-1&aopApiCategory=trade_new">创建订单前预览数据接口</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public CreateOrderResp createOrder(RequireArgs requireArgs, CreateOrder dto) {
        return postAlibaba("com.alibaba.trade:alibaba.createOrder.preview-1", requireArgs, dto, new ParameterizedTypeReference<CreateOrderResp>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.alipay.url.get-1">批量获取订单的支付链接</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public CrossBorderPayUrl alipayUrlGet(RequireArgs requireArgs, OrderIdListDTO dto) {
        return postAlibaba("com.alibaba.trade:alibaba.alipay.url.get-1", requireArgs, dto, new ParameterizedTypeReference<CrossBorderPayUrl>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.product:alibaba.cross.productInfo-1">跨境场景获取商品详情</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public ProductInfoResp getProductInfo(RequireArgs requireArgs, GetProductInfo dto) {
        return postAlibaba("com.alibaba.product:alibaba.cross.productInfo-1", requireArgs, dto, new ParameterizedTypeReference<ProductInfoResp>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.product.push:alibaba.cross.syncProductListPushed-1">跨境场景下将商品加入铺货列表</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<SyncProductResp> syncProductListPushed(RequireArgs requireArgs, SyncProductListPushed dto) {
        return postAlibaba("com.alibaba.product.push:alibaba.cross.syncProductListPushed-1", requireArgs, dto, new ParameterizedTypeReference<Resp<SyncProductResp>>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.OpQueryMarketingMixConfig-1&aopApiCategory=trade_new">查询卖家混批设置</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<OpMarketingMixConfig> opQueryMarketingMixConfig(RequireArgs requireArgs, OpQueryMarketingMixConfigDTO dto) {
        return postAlibaba("com.alibaba.trade:alibaba.trade.OpQueryMarketingMixConfig-1", requireArgs, dto, new ParameterizedTypeReference<Resp<OpMarketingMixConfig>>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.addresscode.parse-1&aopApiCategory=trade_new">根据地址解析地区码</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<ReceiveAddress> addressCodeParse(RequireArgs requireArgs, AddressCodeParse dto) {
        return postAlibaba("com.alibaba.trade:alibaba.trade.addresscode.parse-1", requireArgs, dto, new ParameterizedTypeReference<Resp<ReceiveAddress>>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.order.memoAdd-1&aopApiCategory=trade_new">修改订单备忘</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<Void> memoAdd(RequireArgs requireArgs, MemoAdd dto) {
        return postAlibaba("com.alibaba.trade:alibaba.order.memoAdd-1", requireArgs, dto, new ParameterizedTypeReference<Resp<Void>>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.cancel-1&aopApiCategory=trade_new">取消交易</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<Void> tradeCancel(RequireArgs requireArgs, TradeCancel dto) {
        return postAlibaba("com.alibaba.trade:alibaba.trade.cancel-1", requireArgs, dto, new ParameterizedTypeReference<Resp<Void>>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.logistics:alibaba.trade.getLogisticsInfos.buyerView-1&aopApiCategory=Logistics_NEW">获取交易订单的物流信息(买家视角)</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<List<LogisticsInfo>> getLogisticsInfos(RequireArgs requireArgs, GetLogisticsInfos dto) {
        return postAlibaba("com.alibaba.logistics:alibaba.trade.getLogisticsInfos.buyerView-1", requireArgs, dto, new ParameterizedTypeReference<Resp<List<LogisticsInfo>>>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.logistics:alibaba.trade.getLogisticsTraceInfo.buyerView-1&aopApiCategory=Logistics_NEW">获取交易订单的物流跟踪信息(买家视角)</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<List<LogisticsTraceInfo>> getLogisticsTraceInfo(RequireArgs requireArgs, GetLogisticsTraceInfo dto) {
        return postAlibaba("com.alibaba.logistics:alibaba.trade.getLogisticsTraceInfo.buyerView-1", requireArgs, dto, new ParameterizedTypeReference<Resp<List<LogisticsTraceInfo>>>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.crossBorderPay.url.get-1">获取使用跨境宝支付的支付链接</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public CrossBorderPayUrl crossBorderPayUrlGet(RequireArgs requireArgs, OrderIdListDTO dto) {
        return postAlibaba("com.alibaba.trade:alibaba.crossBorderPay.url.get-1", requireArgs, dto, new ParameterizedTypeReference<CrossBorderPayUrl>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.creditPay.url.get-1">获取使用诚e赊支付的支付链接</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public CrossBorderPayUrl creditPayUrlGet(RequireArgs requireArgs, OrderIdListDTO dto) {
        return postAlibaba("com.alibaba.trade:alibaba.creditPay.url.get-1", requireArgs, dto, new ParameterizedTypeReference<CrossBorderPayUrl>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.addFeedback-1&aopApiCategory=trade_new">买家补充订单留言接口</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<List<FeedbackResp>> addFeedback(RequireArgs requireArgs, AddFeedback dto) {
        return postAlibaba("com.alibaba.trade:alibaba.trade.addFeedback-1", requireArgs, dto, new ParameterizedTypeReference<Resp<List<FeedbackResp>>>() {
        });
    }


    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.refund.OpQueryBatchRefundByOrderIdAndStatus-1&aopApiCategory=trade_new">查询退款单详情-根据订单ID（买家视角）</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<OpQueryBatchRefundResp> opQueryBatchRefundByOrderIdAndStatus(RequireArgs requireArgs, OpQueryBatchRefund dto) {
        return postAlibaba("com.alibaba.trade:alibaba.trade.refund.OpQueryBatchRefundByOrderIdAndStatus-1", requireArgs, dto, new ParameterizedTypeReference<Resp<OpQueryBatchRefundResp>>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.account:alibaba.account.agent.basic-1&aopApiCategory=member">获取非授权用户的基本信息</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<SimpleAccountInfo> agentBasic(RequireArgs requireArgs, AgentBasic dto) {
        return postAlibaba("com.alibaba.account:alibaba.account.agent.basic-1", requireArgs, dto, new ParameterizedTypeReference<Resp<SimpleAccountInfo>>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=system.oauth2:subaccount.auth.add-1">批量添加子账号授权</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<AuthResultModel> authAdd(RequireArgs requireArgs, AddSubAccount dto) {
        return postAlibaba("system.oauth2:subaccount.auth.add-1", requireArgs, dto, new ParameterizedTypeReference<Resp<AuthResultModel>>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.createRefund-1">创建退款退货申请</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<CreateRefundResp> createRefund(RequireArgs requireArgs, CreateRefund dto) {
        return postAlibaba("com.alibaba.trade:alibaba.trade.createRefund-1", requireArgs, dto, new ParameterizedTypeReference<Resp<CreateRefundResp>>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.getRefundReasonList-1">查询退款退货原因（用于创建退款退货）</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<RefundReasonResp> getRefundReasonList(RequireArgs requireArgs, GetRefundReasonList dto) {
        return postAlibaba("com.alibaba.trade:alibaba.trade.getRefundReasonList-1", requireArgs, dto, new ParameterizedTypeReference<Resp<RefundReasonResp>>() {
        });
    }

    /**
     * <a href="https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.uploadRefundVoucher-1">上传退款退货凭证</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public Resp<UploadRefundVoucherResp> uploadRefundVoucher(RequireArgs requireArgs, UploadRefundVoucher dto) {
        return postAlibaba("com.alibaba.trade:alibaba.trade.uploadRefundVoucher-1", requireArgs, dto, new ParameterizedTypeReference<Resp<UploadRefundVoucherResp>>() {
        });
    }


}
