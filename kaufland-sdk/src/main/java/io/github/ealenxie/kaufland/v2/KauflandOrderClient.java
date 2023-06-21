package io.github.ealenxie.kaufland.v2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.kaufland.KauflandClient;
import io.github.ealenxie.kaufland.v2.dto.OrdersDTO;
import io.github.ealenxie.kaufland.v2.dto.UploadInvoiceDTO;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Collections;

/**
 * @author 无敌暴龙战士
 * @since 2022/10/31 12:30
 */
public class KauflandOrderClient extends KauflandClient {

    /**
     * <a href="https://sellerapi.kaufland.com/?page=orders">订单接口地址</a>
     */
    public static final String API_HOST = "https://sellerapi.kaufland.com/v2";

    public KauflandOrderClient(RestOperations restOperations) {
        super(restOperations);
    }

    public KauflandOrderClient(ObjectMapper objectMapper, RestOperations restOperations) {
        super(objectMapper, restOperations);
    }


    /**
     * 获取包含认证的 Real Bearer 标准请求头
     *
     * @param appKey    令牌
     * @param signature 签名
     */
    @SuppressWarnings("all")
    public HttpHeaders getHeaders(String appKey, String signature, String timestamp) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Shop-Client-Key", appKey);
        headers.add("Shop-Signature", signature);
        headers.add("Shop-Timestamp", timestamp);
        headers.add("User-Agent", DEFAULT_USER_AGENT);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return headers;
    }

    /**
     * <a href="https://sellerapi.kaufland.com/?page=order-invoices#upload-order-invoice">更新发票</a>
     */
    public ResponseEntity<String> uploadInvoice(String appKey, String secretKey, String orderId, UploadInvoiceDTO uploadDTO) {
        try {
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order-invoices/%s", API_HOST, orderId));
            URI uri = builder.build().encode().toUri();
            HttpMethod post = HttpMethod.POST;
            String pdf = getMapper().writeValueAsString(uploadDTO);
            HttpHeaders headers = getHttpHeadersWithSign(appKey, secretKey, post, pdf, uri);
            return getRestOperations().exchange(uri, post, new HttpEntity<>(pdf, headers), String.class);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /**
     * <a href="https://sellerapi.kaufland.com/?page=orders#retrieving-order-units">获取订单</a>
     *
     * @param appKey    appKey
     * @param secretKey 密钥
     */
    public ResponseEntity<String> orders(String appKey, String secretKey, OrdersDTO dto) {
        LinkedMultiValueMap<String, String> req = queryParam(dto);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order-units", API_HOST));
        builder.queryParams(req);
        URI uri = builder.build().encode().toUri();
        HttpHeaders headers = getHttpHeadersWithSign(appKey, secretKey, HttpMethod.GET, "", uri);
        return getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), String.class);
    }
}
