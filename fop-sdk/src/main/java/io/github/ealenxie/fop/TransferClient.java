package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.transfer.dto.*;
import io.github.ealenxie.fop.transfer.vo.*;
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
    public FopResp<InboundCreateVO> inboundCreate(InboundCreate dto) {
        return postFop("cs.trs.inbound.create", dto, new TypeReference<FopResp<InboundCreateVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=49">创建集运出库委托</a>
     */
    public FopResp<OutboundCreateVO> outboundCreate(OutboundCreate dto) {
        return postFop("cs.trs.outbound.create", dto, new TypeReference<FopResp<OutboundCreateVO>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=50">取消入库委托</a>
     */
    public FopResp<TrackingNoVO> inboundCancel(InboundCancel dto) {
        return postFop("cs.trs.inbound.cancel", dto, new TypeReference<FopResp<TrackingNoVO>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=51">查询出库委托</a>
     */
    public FopResp<OutboundVO> getOutbound(GetOutbound dto) {
        return postFop("cs.trs.outbound.get", dto, new TypeReference<FopResp<OutboundVO>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=143">会员注册</a>
     */
    public FopResp<Void> memberRegister(MemberRegister dto) {
        return postFop("cs.trs.member.register", dto, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=157">入库异常解决方案</a>
     */
    public FopResp<Void> inboundExceptionHandle(InboundExceptionHandle dto) {
        return postFop("cs.trs.inbound.exception.handle", dto, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=162">创建直运委托</a>
     */
    public FopResp<TrackingNo> directShipCreate(DirectShipCreate dto) {
        return postFop("cs.trs.directship.create", dto, new TypeReference<FopResp<TrackingNo>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=196">轨迹节点查询</a>
     */
    public FopResp<OrderNodeVO> queryOrderNode(TrackingNo dto) {
        return postFop("cs.trs.query.orderNode", dto, new TypeReference<FopResp<OrderNodeVO>>() {
        });
    }

}
