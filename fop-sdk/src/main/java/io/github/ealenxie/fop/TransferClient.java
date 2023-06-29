package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.transfer.*;
import org.springframework.web.client.RestOperations;

/**
 * Created by EalenXie on 2023/3/1 12:37
 * 转运服务
 */
public class TransferClient extends FopClient {
    public TransferClient(String appKey, String appSecret) {

        super(appKey, appSecret);
    }

    public TransferClient(String appKey, String appSecret, RestOperations restOperations) {
        super(appKey, appSecret, restOperations);
    }

    public TransferClient(String appKey, String appSecret, RestOperations restOperations, ObjectMapper objectMapper) {
        super(appKey, appSecret, restOperations, objectMapper);
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=48">创建集货入库委托</a>
     */
    public FopResp<InboundCreateResponse> inboundCreate(InboundCreate payload) {
        return postFop("cs.trs.inbound.create", payload, new TypeReference<FopResp<InboundCreateResponse>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=49">创建集运出库委托</a>
     */
    public FopResp<OutboundCreateResponse> outboundCreate(OutboundCreate payload) {
        return postFop("cs.trs.outbound.create", payload, new TypeReference<FopResp<OutboundCreateResponse>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=50">取消入库委托</a>
     */
    public FopResp<TrackingNoPayload> inboundCancel(InboundCancel payload) {
        return postFop("cs.trs.inbound.cancel", payload, new TypeReference<FopResp<TrackingNoPayload>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=51">查询出库委托</a>
     */
    public FopResp<OutboundResponse> getOutbound(GetOutbound payload) {
        return postFop("cs.trs.outbound.get", payload, new TypeReference<FopResp<OutboundResponse>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=143">会员注册</a>
     */
    public FopResp<Void> memberRegister(MemberRegister payload) {
        return postFop("cs.trs.member.register", payload, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=157">入库异常解决方案</a>
     */
    public FopResp<Void> inboundExceptionHandle(InboundExceptionHandle payload) {
        return postFop("cs.trs.inbound.exception.handle", payload, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=162">创建直运委托</a>
     */
    public FopResp<TrackingNo> directShipCreate(DirectShipCreate payload) {
        return postFop("cs.trs.directship.create", payload, new TypeReference<FopResp<TrackingNo>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=196">轨迹节点查询</a>
     */
    public FopResp<OrderNodeResponse> queryOrderNode(TrackingNo payload) {
        return postFop("cs.trs.query.orderNode", payload, new TypeReference<FopResp<OrderNodeResponse>>() {
        });
    }

}
