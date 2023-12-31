package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.grs.*;
import org.springframework.web.client.RestOperations;

/**
 * Created by EalenXie on 2023/3/2 12:28
 * 退件服务
 */
public class GrsClient extends FopClient {
    public GrsClient(String appKey, String appSecret) {
        super(appKey, appSecret);
    }

    public GrsClient(String appKey, String appSecret, boolean isFop) {
        super(appKey, appSecret, isFop);
    }

    public GrsClient(String appKey, String appSecret, RestOperations restOperations) {
        super(appKey, appSecret, restOperations);
    }

    public GrsClient(String appKey, String appSecret, boolean isFop, RestOperations restOperations, ObjectMapper objectMapper) {
        super(appKey, appSecret, isFop, restOperations, objectMapper);
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=4&mainId=138">批量查询退货单信息</a>
     */
    public FopResp<RmaInfoPage> rmaInfoList(RmaInfoList dto) {
        return postFop("re.grs.rmainfo.list", dto, new TypeReference<FopResp<RmaInfoPage>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=4&mainId=139">查询退货单信息</a>
     *
     * @param rmaNo 退货单（退货预报单）
     */
    public FopResp<ReceivedInfo> rmaInfoGet(String rmaNo) {
        return postFop("re.grs.rmainfo.get", new RmaInfoGet(rmaNo), new TypeReference<FopResp<ReceivedInfo>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=4&mainId=148">创建退货预报单</a>
     */
    public FopResp<String> rmaInfoCreate(RmaInfoCreate rmaInfoCreate) {
        return postFop("re.grs.rma.create", rmaInfoCreate, new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=4&mainId=149">购买预付款标签</a>
     */
    public FopResp<PrepaymentLabel> prepaymentBuy(PrepaymentBuy prepaymentBuy) {
        return postFop("re.grs.prepayment.buy", prepaymentBuy, new TypeReference<FopResp<PrepaymentLabel>>() {
        });
    }


}
