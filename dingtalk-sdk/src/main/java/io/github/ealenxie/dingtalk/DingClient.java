package io.github.ealenxie.dingtalk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author create by sch  2023/4/28 14:53
 * @version 1.0
 */
public class DingClient {
    // 新版链接
    protected static final String DEFAULT_API_URL = "https://api.dingtalk.com";
    // 旧版链接
    protected static final String OLD_API_URL = "https://oapi.dingtalk.com/topapi/";

    protected static final String VERSION = "v1.0";

    protected static final String OLD_VERSION = "v2";

    protected final RestOperations restOperations;
    protected final ObjectMapper objectMapper;

    public DingClient() {
        this(new RestTemplate(), new ObjectMapper());
    }

    public DingClient(ObjectMapper objectMapper) {
        this(new RestTemplate(), objectMapper);
    }

    public DingClient(RestOperations restOperations, ObjectMapper objectMapper) {
        this.restOperations = restOperations;
        this.objectMapper = objectMapper;
    }

    public HttpHeaders getDingHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    public HttpHeaders getDingHeader(String apiSecret) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("x-acs-dingtalk-access-token", apiSecret);
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    @SuppressWarnings("all")
    public LinkedMultiValueMap<String, String> getQueryParams(Object dto) {
        Map<String, String> args = objectMapper.convertValue(dto, new TypeReference<Map<String, String>>() {
        });
        LinkedMultiValueMap<String, String> req = new LinkedMultiValueMap<>();
        req.setAll(args);
        return req;
    }
}
