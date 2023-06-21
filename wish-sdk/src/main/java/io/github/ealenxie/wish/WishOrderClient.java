package io.github.ealenxie.wish;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.wish.dto.*;
import io.github.ealenxie.wish.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * Created by EalenXie on 2022/2/23 9:51
 * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#tag/Orders">wish 商户平台</a>
 */
public class WishOrderClient extends WishClient {

    public WishOrderClient() {
        this(new RestTemplate());
    }

    public WishOrderClient(RestOperations restOperations) {
        this(new ObjectMapper(), restOperations);
    }

    public WishOrderClient(ObjectMapper objectMapper, RestOperations restOperations) {
        super(objectMapper, restOperations);
    }


    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#tag/Brands">Get a list of brands from a particular ID range</a>
     * <p>Wish上可用的品牌列表，可用于标记产品。</p>
     *
     * @param accessToken 令牌
     * @return {@link Brand} 品牌信息
     */
    public WishResponse<List<Brand>> brands(String accessToken, BrandsDTO dto) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v3/brands", isSandbox() ? SANDBOX_HOST : HOST)).queryParams(req);
        return getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.GET, new HttpEntity<>(null, headers), new ParameterizedTypeReference<WishResponse<List<Brand>>>() {
        }).getBody();
    }


    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getProducts">Get products</a>
     * <p>Get products asynchronously.</p>
     *
     * @param accessToken 令牌
     * @return {@link ProductsBulk}
     */
    public WishResponse<ProductsBulk> getProductsJobs(String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v3/products/bulk_get", isSandbox() ? SANDBOX_HOST : HOST));
        return getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.POST, new HttpEntity<>(null, headers), new ParameterizedTypeReference<WishResponse<ProductsBulk>>() {
        }).getBody();
    }


    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getUpdateProductsStatus">Get the update products job status</a>
     *
     * @param accessToken 令牌
     * @return {@link ProductsBulk}
     */
    public WishResponse<ProductsBulk> getProductsJob(String accessToken, String productJobId) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v3/products/bulk_update/%s", isSandbox() ? SANDBOX_HOST : HOST, productJobId));
        return getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.POST, new HttpEntity<>(null, headers), new ParameterizedTypeReference<WishResponse<ProductsBulk>>() {
        }).getBody();
    }


    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetOrder">Get an order</a>
     * <p>获取订单详情</p>
     *
     * @param orderId     订单Id
     * @param accessToken 令牌
     * @return {@link WishOrder} 订单详情
     */
    public WishResponse<WishOrder> getOrder(String orderId, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        return getRestOperations().exchange(URI.create(String.format("%s/api/v3/orders/%s", isSandbox() ? SANDBOX_HOST : HOST, orderId)), HttpMethod.GET, new HttpEntity<>(null, headers), new ParameterizedTypeReference<WishResponse<WishOrder>>() {
        }).getBody();
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetMultipleOrders">List orders</a>
     * <p>获取订单列表</p>
     *
     * @param dto         订单请求参数
     * @param accessToken 令牌
     * @return {@link WishOrder} 订单详情
     */
    public WishResponse<List<WishOrder>> getOrders(OrdersDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v3/orders", isSandbox() ? SANDBOX_HOST : HOST)).queryParams(req);
        return getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.GET, new HttpEntity<>(null, headers), new ParameterizedTypeReference<WishResponse<List<WishOrder>>>() {
        }).getBody();
    }


    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetShippingCarriers">Get accepted shipping carriers</a>
     * <p>获取货运公司</p>
     *
     * @param dto         请求参数
     * @param accessToken 令牌
     * @return {@link NameVO} 物流公司
     */
    public List<NameVO> shippingCarriers(ShippingCarriersDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v3/shipping_carriers", isSandbox() ? SANDBOX_HOST : HOST)).queryParams(req);
        return getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.GET, new HttpEntity<>(null, headers), new ParameterizedTypeReference<List<NameVO>>() {
        }).getBody();
    }


    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/downloadOrders">Batch download orders</a>
     * <p>批量获取订单下载</p>
     *
     * @param dto         请求参数
     * @param accessToken 令牌
     * @return {@link WishDownloadJob} 订单下载信息
     */
    public WishDownloadJob batchDownloadOrders(OrdersDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v3/bulk_get", isSandbox() ? SANDBOX_HOST : HOST)).queryParams(req);
        return getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.POST, new HttpEntity<>(null, headers), WishDownloadJob.class).getBody();
    }


    /**
     * 接口文档 <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/getOrderDownloadJob">Get batch download job status</a>
     *
     * <p>获取订单下载</p>
     *
     * @param accessToken 令牌
     * @return {@link WishDownloadJob} 订单下载信息
     */
    public WishDownloadJob batchDownloadJobStatus(String jobId, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        return getRestOperations().exchange(String.format("%s/api/v3/bulk_get/%s", isSandbox() ? SANDBOX_HOST : HOST, jobId), HttpMethod.GET, new HttpEntity<>(null, headers), WishDownloadJob.class).getBody();
    }

    /**
     * 接口文档  <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/ShipOrder">Ship or update tracking</a>
     * <p> 发货或更新跟踪订单。 此操作为异步操作</p>
     *
     * @param orderId     订单id
     * @param dto         请求参数
     * @param accessToken 令牌
     * @return {@link WishOrder} 发货返回信息
     */
    public WishOrder shipOrder(String orderId, TrackingDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<TrackingDTO> httpEntity = new HttpEntity<>(dto, headers);
        return getRestOperations().exchange(String.format("%s/api/v3/orders/%s/tracking", isSandbox() ? SANDBOX_HOST : HOST, orderId), HttpMethod.PUT, httpEntity, WishOrder.class).getBody();
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetValidRefundReasons">Get valid refund reasons</a>
     * <p>获取退货原因</p>
     *
     * @param orderId     订单id
     * @param accessToken 令牌
     */
    public List<String> refundReasons(String orderId, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        return getRestOperations().exchange(String.format("%s/api/v3/orders/%s/refund_reasons", isSandbox() ? SANDBOX_HOST : HOST, orderId), HttpMethod.GET, new HttpEntity<>(null, headers), new ParameterizedTypeReference<List<String>>() {
        }).getBody();
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/RefundOrder">Refund/Cancel an order</a>
     * <p>取消订单</p>
     *
     * @param orderId     订单id
     * @param dto         请求参数
     * @param accessToken 令牌
     * @return {@link WishOrder} 取消订单返回结果
     */
    public WishOrder refund(String orderId, RefundDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        headers.setContentType(MediaType.APPLICATION_JSON);
        return getRestOperations().exchange(String.format("%s/api/v3/orders/%s/refund", isSandbox() ? SANDBOX_HOST : HOST, orderId), HttpMethod.PUT, new HttpEntity<>(dto, headers), WishOrder.class).getBody();
    }


    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/UpdateOrder">Update an LTL order</a>
     * <p>更新订单</p>
     *
     * @param orderId     订单Id
     * @param accessToken 令牌
     * @return {@link WishOrder} 订单返回信息
     */
    public WishOrder updateLTLOrder(String orderId, UpdateLtlDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        return getRestOperations().exchange(URI.create(String.format("%s/api/v3/orders/%s", isSandbox() ? SANDBOX_HOST : HOST, orderId)), HttpMethod.PUT, new HttpEntity<>(dto, headers), WishOrder.class).getBody();
    }

    /**
     * <a href="https://china-merchant.wish.com/documentation/api/v3/reference#operation/ModifyAddress">Modify shipping address</a>
     * <p>修改物流地址</p>
     *
     * @param orderId     订单Id
     * @param accessToken 令牌
     * @return {@link WishOrder} 订单返回信息
     */
    public WishOrder modifyAddress(String orderId, ModifyAddressDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        return getRestOperations().exchange(URI.create(String.format("%s/api/v3/orders/%s/address", isSandbox() ? SANDBOX_HOST : HOST, orderId)), HttpMethod.PUT, new HttpEntity<>(dto, headers), WishOrder.class).getBody();
    }

}
