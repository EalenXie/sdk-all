package io.github.ealenxie.fop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fop.grs.dto.PrepaymentBuy;
import io.github.ealenxie.fop.grs.dto.RmaInfoCreate;
import io.github.ealenxie.fop.grs.dto.RmaInfoGet;
import io.github.ealenxie.fop.grs.dto.RmaInfoList;
import io.github.ealenxie.fop.grs.vo.PrepaymentLabel;
import io.github.ealenxie.fop.grs.vo.ReceivedInfo;
import io.github.ealenxie.fop.grs.vo.RmaInfoPage;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

/**
 * Created by EalenXie on 2023/3/2 12:28
 * 退件服务
 */
public class GrsClient extends FopClient {
    public GrsClient() {

    }

    public GrsClient(RestOperations restOperations) {
        super(restOperations);
    }

    public GrsClient(RestOperations restOperations, ObjectMapper objectMapper) {
        super(restOperations, objectMapper);
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=4&mainId=138">批量查询退货单信息</a>
     */
    public FopResp<RmaInfoPage> rmaInfoList(AppKeySecret appKeySecret, RmaInfoList dto) {
        CommonArgs common = new CommonArgs(appKeySecret, "re.grs.rmainfo.list");
        return readFopBody(callFop(HttpMethod.POST, common, dto), new TypeReference<FopResp<RmaInfoPage>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=4&mainId=139">查询退货单信息</a>
     *
     * @param rmaNo 退货单（退货预报单）
     */
    public FopResp<ReceivedInfo> rmaInfoGet(AppKeySecret appKeySecret, String rmaNo) {
        CommonArgs common = new CommonArgs(appKeySecret, "re.grs.rmainfo.get");
        return readFopBody(callFop(HttpMethod.POST, common, new RmaInfoGet(rmaNo)), new TypeReference<FopResp<ReceivedInfo>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=4&mainId=148">创建退货预报单</a>
     */
    public FopResp<String> rmaInfoCreate(AppKeySecret appKeySecret, RmaInfoCreate rmaInfoCreate) {
        CommonArgs common = new CommonArgs(appKeySecret, "re.grs.rma.create");
        return readFopBody(callFop(HttpMethod.POST, common, rmaInfoCreate), new TypeReference<FopResp<String>>() {
        });
    }

    /**
     * <a href="http://open.4px.com/apiInfo/apiDetail?itemId=4&mainId=149">购买预付款标签</a>
     *
     * todo 这个接口的传参，与文档参数不对应
     */
    public FopResp<PrepaymentLabel> prepaymentBuy(AppKeySecret appKeySecret, PrepaymentBuy prepaymentBuy) {
        CommonArgs common = new CommonArgs(appKeySecret, "re.grs.prepayment.buy");
        return readFopBody(callFop(HttpMethod.POST, common, prepaymentBuy), new TypeReference<FopResp<PrepaymentLabel>>() {
        });
    }


}
