package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.pds.dto.PdsOrderCancel;
import io.github.ealenxie.fop.pds.dto.PdsOrderCreate;
import io.github.ealenxie.fop.pds.vo.PdsOrderResp;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

/**
 * Created by EalenXie on 2023/3/2 12:28
 * 末端网络服务
 */
public class PdsClient extends FopClient {
    public PdsClient() {

    }

    public PdsClient(RestOperations restOperations) {
        super(restOperations);
    }

    public PdsClient(RestOperations restOperations, ObjectMapper objectMapper) {
        super(restOperations, objectMapper);
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=5&mainId=179">末端派送下单</a>
     */
    public FopResp<PdsOrderResp> pdsOrderCreate(AppKeySecret appKeySecret, PdsOrderCreate dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "lm.pds.order.create");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<PdsOrderResp>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=5&mainId=180">末端派送订单取消</a>
     */
    public FopResp<Void> pdsOrderCancel(AppKeySecret appKeySecret, PdsOrderCancel dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "lm.pds.order.cancel");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<Void>>() {
        });
    }

}
