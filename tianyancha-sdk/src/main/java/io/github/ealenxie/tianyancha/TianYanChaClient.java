package io.github.ealenxie.tianyancha;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.tianyancha.vo.Response;
import io.github.ealenxie.tianyancha.vo.ResponseJsonNode;
import io.github.ealenxie.tianyancha.vo.ResultVO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * Created by EalenXie on 2022/12/14 15:23
 */
public class TianYanChaClient {

    private final RestOperations restOperations;
    private final ObjectMapper objectMapper;
    private static final String HOST = "http://open.api.tianyancha.com";

    public TianYanChaClient() {
        this(new RestTemplate(), new ObjectMapper());
    }

    public TianYanChaClient(RestOperations restOperations) {
        this.restOperations = restOperations;
        this.objectMapper = new ObjectMapper();
    }


    public TianYanChaClient(RestOperations restOperations, ObjectMapper objectMapper) {
        this.restOperations = restOperations;
        this.objectMapper = objectMapper;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }

    /**
     * <a href="http://open.tianyancha.com/open/1116">企业基本信息查询</a>
     */
    public Response<ResultVO> icBaseInfoNormal(String token, String keyword) {
        HttpHeaders headers = getAuthHeader(token);
        headers.setContentType(MediaType.APPLICATION_JSON);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/services/open/ic/baseinfo/normal?keyword=%s", HOST, keyword));
        URI uri = builder.build().encode().toUri();
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), new ParameterizedTypeReference<Response<ResultVO>>() {
        }).getBody();
    }

    /**
     * <a href="https://open.tianyancha.com/open/1117">特殊企业基本信息</a>
     * <p>getResult()返回值 序列化 请参考 ResponseJsonNode#getEntityType()和  getResult(ResponseJsonNode, Class)</p>
     *
     * @return 响应的 ResponseJsonNode
     */
    public ResponseJsonNode icBaseInfoSpecial(String token, String keyword) {
        HttpHeaders headers = getAuthHeader(token);
        headers.setContentType(MediaType.APPLICATION_JSON);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/services/open/ic/baseinfo/special?keyword=%s", HOST, keyword));
        URI uri = builder.build().encode().toUri();
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), ResponseJsonNode.class).getBody();
    }

    /**
     * 获取 Result
     * <p>当 entityType 为null 则未成功查询到结果信息
     * <p>当 entityType = 2, 可调用  getResult(response, Result2.class)进行序列化</p>
     * <p>当 entityType = 3, 可调用  getResult(response, Result3.class)进行序列化</p>
     * <p>当 entityType = 4, 可调用  getResult(response, Result4.class)进行序列化</p>
     * <p>当 entityType = 5, 可调用  getResult(response, Result5.class)进行序列化</p>
     * <p>当 entityType = 6, 可调用  getResult(response, Result6.class)进行序列化</p>
     * <p>当 entityType = 9, 可调用  getResult(response, Result9.class)进行序列化</p>
     *
     * @param response        结果响应
     * @param entityTypeClass 由 {@link ResponseJsonNode#getEntityType()}返回值 决定
     * @return 返回值决定实体转换类型
     */

    public <T> T getResult(ResponseJsonNode response, Class<T> entityTypeClass) {
        return objectMapper.convertValue(response.getResult(), entityTypeClass);
    }


    private HttpHeaders getAuthHeader(String token) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", token);
        return headers;
    }


}
