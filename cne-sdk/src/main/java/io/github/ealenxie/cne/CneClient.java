package io.github.ealenxie.cne;


import io.github.ealenxie.cne.dto.CneCommon;
import io.github.ealenxie.cne.dto.GetTrackNumberDTO;
import io.github.ealenxie.cne.dto.PreInputSetDTO;
import io.github.ealenxie.cne.dto.RecDTO;
import io.github.ealenxie.cne.vo.EmsKindListVO;
import io.github.ealenxie.cne.vo.ReturnParam;
import io.github.ealenxie.cne.vo.TrackNumberVO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestOperations;

import java.net.URI;
import java.util.List;

/**
 * Created by EalenXie on 2022/9/16 9:51
 * 递一国际
 */
public class CneClient {

    private static final String CNE_URL = "https://api.cne.com/cgi-bin/EmsData.dll?DoApi";
    private final RestOperations restOperations;

    public CneClient(RestOperations restOperations) {
        this.restOperations = restOperations;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }

    public HttpHeaders getCneHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    /**
     * <a href="https://docs.qq.com/pdf/DRmhmeW5uSWJxc3Fu">获取渠道列表</a>
     *
     * @param clientId     客户端Id(也就是icID)
     * @param clientSecret 客户端秘钥(也就是apiToken)
     */
    public EmsKindListVO emsKindList(String clientId, String clientSecret) {
        CneCommon cneCommon = new CneCommon("EmsKindList", clientId, clientSecret);
        HttpHeaders headers = getCneHeader();
        return getRestOperations().exchange(CNE_URL, HttpMethod.POST, new HttpEntity<>(cneCommon, headers), EmsKindListVO.class).getBody();
    }


    /**
     * <a href="https://docs.qq.com/pdf/DRmhmeW5uSWJxc3Fu">订单预报</a>
     * <p>
     * 上传订单数据，返回物流跟踪号码
     * </p>
     *
     * @param clientId     客户端Id(也就是icID)
     * @param clientSecret 客户端秘钥(也就是apiToken)
     * @param recList      交运参数
     */
    public ReturnParam preInputSet(String clientId, String clientSecret, List<RecDTO> recList) {
        PreInputSetDTO dto = new PreInputSetDTO(clientId, clientSecret, recList);
        HttpHeaders headers = getCneHeader();
        return getRestOperations().exchange(CNE_URL, HttpMethod.POST, new HttpEntity<>(dto, headers), ReturnParam.class).getBody();
    }

    /**
     * <a href="https://docs.qq.com/pdf/DRmhmeW5uSWJxc3Fu">尾程单号</a>
     *
     * @param clientId     客户端Id(也就是icID)
     * @param clientSecret 客户端秘钥(也就是apiToken)
     * @param cNo          cNo 运单号(物流追踪号码)
     */
    public TrackNumberVO getTrackNumber(String clientId, String clientSecret, String cNo) {
        GetTrackNumberDTO dto = new GetTrackNumberDTO(clientId, clientSecret, cNo);
        HttpHeaders headers = getCneHeader();
        return getRestOperations().exchange(CNE_URL, HttpMethod.POST, new HttpEntity<>(dto, headers), TrackNumberVO.class).getBody();
    }

    /**
     * 文件下载
     *
     * @param url 路径
     */
    public byte[] download(String url) {
        HttpHeaders headers = new HttpHeaders();
        URI uri = URI.create(url);
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), byte[].class).getBody();
    }
}
