package io.github.ealenxie.shopify.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/9/26 15:24
 */
@Getter
@Setter
public class Duty {

    @JsonProperty("id")
    private String id;
    @JsonProperty("harmonized_system_code")
    private String harmonizedSystemCode;
    @JsonProperty("country_code_of_origin")
    private String countryCodeOfOrigin;
    @JsonProperty("shop_money")
    private Money shopMoney;
    @JsonProperty("presentment_money")
    private Money presentmentMoney;
    @JsonProperty("tax_lines")
    private List<TaxLine> taxLines;
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
}
