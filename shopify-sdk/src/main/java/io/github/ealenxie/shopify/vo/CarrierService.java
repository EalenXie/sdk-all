package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/27 17:12
 */
@Getter
@Setter
public class CarrierService {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("service_discovery")
    private Boolean serviceDiscovery;
    @JsonProperty("carrier_service_type")
    private String carrierServiceType;
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonProperty("format")
    private String format;
    @JsonProperty("callback_url")
    private String callbackUrl;
}
