package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.track.*;
import org.springframework.web.client.RestOperations;

/**
 * Created by EalenXie on 2023/3/2 12:28
 * 轨迹服务
 */
public class TrackClient extends FopClient {
    public TrackClient(String appKey, String appSecret) {
        super(appKey, appSecret);
    }

    public TrackClient(String appKey, String appSecret, RestOperations restOperations) {
        super(appKey, appSecret, restOperations);
    }

    public TrackClient(String appKey, String appSecret, RestOperations restOperations, ObjectMapper objectMapper) {
        super(appKey, appSecret, restOperations, objectMapper);
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=25">物流轨迹查询</a>
     *
     * @param deliveryOrderNo 物流单号
     */
    public FopResp<DeliveryOrder> getTrackingOrder(String deliveryOrderNo) {
        return postFop("tr.order.tracking.get", new DeliveryOrderNoPayload(deliveryOrderNo), new TypeReference<FopResp<DeliveryOrder>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=170">添加轨迹数据</a>
     */
    public FopResp<Void> createTrack(CreateTrack createTrack) {
        return postFop("com.track.track.create", createTrack, new TypeReference<FopResp<Void>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=171">添加业务数据</a>
     */
    public FopResp<Void> createBusiness(CreateBusiness createBusiness) {
        return postFop("com.track.business.create", createBusiness, new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=172">通过递四方单号添加轨迹数据</a>
     */
    public FopResp<Void> createByTrackNo(CreateByTrackNo createByTrackNo) {
        return postFop("com.track.track.createByTrackNo", createByTrackNo, new TypeReference<FopResp<Void>>() {
        });
    }
}
