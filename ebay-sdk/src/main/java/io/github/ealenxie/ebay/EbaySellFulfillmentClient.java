package io.github.ealenxie.ebay;

import io.github.ealenxie.ebay.dto.OrdersDTO;
import io.github.ealenxie.ebay.dto.OrdersFilterDTO;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.lang.Nullable;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.beans.PropertyDescriptor;
import java.net.URI;
import java.util.Collection;

/**
 * Created by EalenXie on 2022/3/29 11:36
 * <a href="https://developer.ebay.com/api-docs/sell/fulfillment/overview.html">Fulfillment API</a>
 */
public class EbaySellFulfillmentClient extends EbayClient {

    private final RestOperations restOperations;

    /**
     * 正式环境接口地址
     */
    private static final String HOST = "https://api.ebay.com";

    /**
     * 沙箱环境接口地址
     */
    private static final String HOST_SANDBOX = "https://api.sandbox.ebay.com";


    public EbaySellFulfillmentClient() {
        this(new RestTemplate());
    }

    public EbaySellFulfillmentClient(RestOperations restOperations) {
        this.restOperations = restOperations;
    }


    /**
     * <a href="https://developer.ebay.com/api-docs/sell/fulfillment/resources/order/methods/getOrders">查询订单</a>
     */
    public String orders(String accessToken, OrdersDTO dto, @Nullable OrdersFilterDTO filterDTO) {
        HttpHeaders headers = getEbayHeader(accessToken);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/sell/fulfillment/v1/order", isSandBox() ? HOST_SANDBOX : HOST));
        BeanWrapper wrapper = new BeanWrapperImpl(dto);
        PropertyDescriptor[] pds = wrapper.getPropertyDescriptors();
        for (PropertyDescriptor descriptor : pds) {
            String propertyName = descriptor.getName();
            Object propertyValue = wrapper.getPropertyValue(propertyName);
            if (!propertyName.equals("class") && !ObjectUtils.isEmpty(propertyValue)) {
                if (propertyValue instanceof Collection) {
                    builder.queryParam(propertyName, (Collection<?>) propertyValue);
                } else {
                    builder.queryParam(propertyName, propertyValue);
                }
            }
        }
        if (filterDTO != null) {
            builder.query(filterQueryString(filterDTO));
        }
        URI uri = builder.build().encode().toUri();
        return restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), String.class).getBody();
    }


    /**
     * <a href="https://developer.ebay.com/api-docs/sell/fulfillment/resources/order/methods/getOrder">查询订单</a>
     */
    public String order(String accessToken, String orderId) {
        HttpHeaders headers = getEbayHeader(accessToken);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/sell/fulfillment/v1/order/%s", isSandBox() ? HOST_SANDBOX : HOST, orderId));
        URI uri = builder.build().encode().toUri();
        return restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), String.class).getBody();
    }


}
