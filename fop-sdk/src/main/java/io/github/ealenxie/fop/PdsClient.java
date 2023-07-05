package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.pds.PdsOrderCancel;
import io.github.ealenxie.fop.pds.PdsOrderCreate;
import io.github.ealenxie.fop.pds.PdsOrderResponse;
import org.springframework.web.client.RestOperations;

/**
 * Created by EalenXie on 2023/3/2 12:28
 * 末端网络服务
 */
public class PdsClient extends FopClient {
    public PdsClient(String appKey, String appSecret) {

        super(appKey, appSecret);
    }

    public PdsClient(String appKey, String appSecret, RestOperations restOperations) {
        super(appKey, appSecret, restOperations);
    }

    public PdsClient(String appKey, String appSecret, boolean isFop, RestOperations restOperations, ObjectMapper objectMapper) {
        super(appKey, appSecret, isFop, restOperations, objectMapper);
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=5&mainId=179">末端派送下单</a>
     */
    public FopResp<PdsOrderResponse> pdsOrderCreate(PdsOrderCreate dto) {
        return postFop("lm.pds.order.create", dto, new TypeReference<FopResp<PdsOrderResponse>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=5&mainId=180">末端派送订单取消</a>
     */
    public FopResp<Void> pdsOrderCancel(PdsOrderCancel dto) {
        return postFop("lm.pds.order.cancel", dto, new TypeReference<FopResp<Void>>() {
        });
    }

}
