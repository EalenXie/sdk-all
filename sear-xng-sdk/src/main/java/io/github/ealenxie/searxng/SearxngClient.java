package io.github.ealenxie.searxng;

import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

/**
 * 对应的格式支持需要修改配置文件 settings.yml
 * <p>
 * <blockquote><pre>
 *    search:
 *     # 添加格式支持
 *     formats:
 *         - html
 *         - json
 * </pre></blockquote>
 */
public class SearxngClient {
    private final String baseUrl;
    private final RestOperations restOperations;

    public SearxngClient(String baseUrl) {
        this.baseUrl = baseUrl;
        this.restOperations = new RestTemplate();
    }

    public SearxngClient(String baseUrl, RestOperations restOperations) {
        this.baseUrl = baseUrl;
        this.restOperations = restOperations;
    }

    /**
     * GET 方式搜索
     */
    public SearchResponse search(SearchRequest request) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/search", baseUrl));
        Map<String, String> params = request.toParams();
        params.forEach(builder::queryParam);
        URI uri = builder.build().toUri();
        ResponseEntity<SearchResponse> response = restOperations.getForEntity(uri, SearchResponse.class);
        return response.getBody();
    }

    /**
     * POST 方式搜索（适用于长查询）
     */
    public SearchResponse searchPost(SearchRequest request) {
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        request.toParams().forEach(map::add);
        ResponseEntity<SearchResponse> response = restOperations.postForEntity(String.format("%s/search", baseUrl), map, SearchResponse.class);
        return response.getBody();
    }
}