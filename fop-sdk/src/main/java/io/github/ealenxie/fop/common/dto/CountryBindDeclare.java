package io.github.ealenxie.fop.common.dto;

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

    @JsonProperty("declare_category_id")
    private String declareCategoryId;
    @JsonProperty("declare_country_list")
    private List<DeclareCountryDTO> declareCountryList;
}
