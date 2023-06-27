package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.track.dto.CreateBusiness;
import io.github.ealenxie.fop.track.dto.CreateByTrackNo;
import io.github.ealenxie.fop.track.dto.CreateTrack;
import io.github.ealenxie.fop.track.dto.DeliveryOrderNoDTO;
import io.github.ealenxie.fop.track.vo.DeliveryOrder;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

/**
 * Created by EalenXie on 2023/3/2 12:28
 * 轨迹服务
 */
public class TrackClient extends FopClient {
    public TrackClient() {

    }

    public TrackClient(RestOperations restOperations) {
        super(restOperations);
    }

    public TrackClient(RestOperations restOperations, ObjectMapper objectMapper) {
        super(restOperations, objectMapper);
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=25">物流轨迹查询</a>
     *
     * @param deliveryOrderNo 物流单号
     */
    public FopResp<DeliveryOrder> getTrackingOrder(AppKeySecret appKeySecret, String deliveryOrderNo) {
        CommonArgs common = new CommonArgs(appKeySecret, "tr.order.tracking.get");
        return readFopBody(callFop(HttpMethod.POST, common, new DeliveryOrderNoDTO(deliveryOrderNo)), new TypeReference<FopResp<DeliveryOrder>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=170">添加轨迹数据</a>
     */
    public FopResp<Void> createTrack(AppKeySecret appKeySecret, CreateTrack createTrack) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.track.track.create");
        return readFopBody(callFop(HttpMethod.POST, common, createTrack), new TypeReference<FopResp<Void>>() {
        });
    }


    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=171">添加业务数据</a>
     */
    public FopResp<Void> createBusiness(AppKeySecret appKeySecret, CreateBusiness createBusiness) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.track.business.create");
        return readFopBody(callFop(HttpMethod.POST, common, createBusiness), new TypeReference<FopResp<Void>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=172">通过递四方单号添加轨迹数据</a>
     */
    public FopResp<Void> createByTrackNo(AppKeySecret appKeySecret, CreateByTrackNo createByTrackNo) {
        CommonArgs common = new CommonArgs(appKeySecret, "com.track.track.createByTrackNo");
        return readFopBody(callFop(HttpMethod.POST, common, createByTrackNo), new TypeReference<FopResp<Void>>() {
        });
    }
}
