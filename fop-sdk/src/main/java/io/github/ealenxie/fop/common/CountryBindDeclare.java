package io.github.ealenxie.fop.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/1 0:07
 */
@Getter
@Setter
public class CountryBindDeclare {
    /**
     * 申报产品代码，客户创建申报产品时唯一代码。
     * <p>
     * 申报产品审核失败后，客户可根据申报产品代码修改。
     */
    @JsonProperty("declare_product_code")
    private String declareProductCode;

    /**
     * 申报国家列表
     */
    @JsonProperty("declare_country_list")
    private List<DeclareCountryPayload> declareCountryList;
}
