package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.transfer.dto.*;
import io.github.ealenxie.fop.transfer.vo.*;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

/**
 * Created by EalenXie on 2023/3/1 12:37
 * 转运服务
 */
public class TransferClient extends FopClient {
    public TransferClient() {

    }

    public TransferClient(RestOperations restOperations) {
        super(restOperations);
    }

    public TransferClient(RestOperations restOperations, ObjectMapper objectMapper) {
        super(restOperations, objectMapper);
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=48">创建集货入库委托</a>
     *
     * @param appKeySecret 4px授权信息
     */
    public FopResp<InboundCreateVO> inboundCreate(AppKeySecret appKeySecret, InboundCreate dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "cs.trs.inbound.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<InboundCreateVO>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=49">创建集运出库委托</a>
     *
     * @param appKeySecret 4px授权信息
     */
    public FopResp<OutboundCreateVO> outboundCreate(AppKeySecret appKeySecret, OutboundCreate dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "cs.trs.outbound.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<OutboundCreateVO>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=50">取消入库委托</a>
     *
     * @param appKeySecret 4px授权信息
     */
    public FopResp<TrackingNoVO> inboundCancel(AppKeySecret appKeySecret, InboundCancel dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "cs.trs.inbound.cancel");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<TrackingNoVO>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=51">查询出库委托</a>
     *
     * @param appKeySecret 4px授权信息
     */
    public FopResp<OutboundVO> getOutbound(AppKeySecret appKeySecret, GetOutbound dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "cs.trs.outbound.get");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<OutboundVO>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=143">会员注册</a>
     *
     * @param appKeySecret 4px授权信息
     */
    public FopResp<Void> memberRegister(AppKeySecret appKeySecret, MemberRegister dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "cs.trs.member.register");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=157">入库异常解决方案</a>
     *
     * @param appKeySecret 4px授权信息
     */
    public FopResp<Void> inboundExceptionHandle(AppKeySecret appKeySecret, InboundExceptionHandle dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "cs.trs.inbound.exception.handle");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=162">创建直运委托</a>
     *
     * @param appKeySecret 4px授权信息
     */
    public FopResp<TrackingNo> directShipCreate(AppKeySecret appKeySecret, DirectShipCreate dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "cs.trs.directship.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<TrackingNo>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=196">轨迹节点查询</a>
     *
     * @param appKeySecret 4px授权信息
     */
    public FopResp<OrderNodeVO> queryOrderNode(AppKeySecret appKeySecret, TrackingNo dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "cs.trs.query.orderNode");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<OrderNodeVO>>() {
        });
    }

}
