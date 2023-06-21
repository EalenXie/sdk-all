package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {

    private Long id;
    private String name;
    private String address1;
    private String address2;
    private String city;
    private String zip;
    private String province;
    private String country;
    private String phone;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("province_code")
    private String provinceCode;

    private Boolean legacy;
    /**
     * 该位置是否处于活动状态。如果true，则该位置可用于销售产品、库存库存和履行订单。商家可以从 Shopify 后台停用位置
     */
    private Boolean active;
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonProperty("localized_country_name")
    private String localizedCountryName;
    @JsonProperty("localized_province_name")
    private String localizedProvinceName;
}

