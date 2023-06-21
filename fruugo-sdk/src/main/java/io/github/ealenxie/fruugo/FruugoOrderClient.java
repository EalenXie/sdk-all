package io.github.ealenxie.fruugo;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.fruugo.dto.FruugoShipDTO;
import io.github.ealenxie.fruugo.dto.OrdersDTO;
import io.github.ealenxie.fruugo.vo.FruugoOrders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.lang.Nullable;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;


public class FruugoOrderClient extends FruugoClient {

    private final ObjectMapper mapper;

    public FruugoOrderClient() {
        this(new RestTemplate());

    }

    public FruugoOrderClient(RestOperations restOperations) {
        this(new ObjectMapper(), restOperations);
    }

    public FruugoOrderClient(ObjectMapper objectMapper, RestOperations restOperations) {
        super(restOperations);
        this.mapper = objectMapper;
    }

    /**
     * <a href="https://fruugo.atlassian.net/wiki/spaces/RR/pages/66158675/Requests+Calls">获取订单</a>
     */
    public FruugoOrders orders(String accountNumber, String password, OrdersDTO dto) {
        HttpHeaders headers = getBearerHeaders(accountNumber, password);
        URI uri = getURI(String.format("%s/orders/download/v2", HOST), dto);
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), FruugoOrders.class).getBody();
    }


    /**
     * 获取包含请求参数的 URI对象
     *
     * @param url            请求地址
     * @param queryParamsDTO 路径请求参数
     */
    public URI getURI(String url, @Nullable Object queryParamsDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        if (queryParamsDTO != null) {
            Map<String, String> args = mapper.convertValue(queryParamsDTO, new TypeReference<Map<String, String>>() {
            });
            LinkedMultiValueMap<String, String> req = new LinkedMultiValueMap<>();
            req.setAll(args);
            builder.queryParams(req);
        }
        return builder.build().encode().toUri();
    }


    /**
     * <a href="https://fruugo.atlassian.net/wiki/spaces/RR/pages/66158675/Requests+Calls">确认订单</a>
     */
    public String confirmOrder(String accountNumber, String password, String orderId) {
        HttpHeaders headers = getBearerHeaders(accountNumber, password);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/orders/confirm", HOST));
        LinkedMultiValueMap<String, String> req = new LinkedMultiValueMap<>();
        req.add("orderId", orderId);
        URI uri = builder.build().encode().toUri();


        return getRestOperations().exchange(uri, HttpMethod.POST, new HttpEntity<>(req, headers), String.class).getBody();
    }

    /**
     * <a href="https://fruugo.atlassian.net/wiki/spaces/RR/pages/66158675/Requests+Calls">标记发货</a>
     */
    public String shipOrder(String accountNumber, String password, FruugoShipDTO dto) {
        HttpHeaders headers = getBearerHeaders(accountNumber, password);
        Map<String, String> args = mapper.convertValue(dto, new TypeReference<Map<String, String>>() {
        });
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/orders/ship", HOST));
        LinkedMultiValueMap<String, String> req = new LinkedMultiValueMap<>();
        req.setAll(args);
        URI uri = builder.build().encode().toUri();
        return getRestOperations().exchange(uri, HttpMethod.POST, new HttpEntity<>(req, headers), String.class).getBody();

    }
}
