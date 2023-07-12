package io.github.ealenxie.wish.brands;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/3 12:42
 */
@Getter
@Setter
public class BrandsQueryParams {

    @JsonProperty("id_max")
    private String idMax;
    @JsonProperty("id_min")
    private String idMin;
    private String limit;
    @JsonProperty("sort_by")
    private String sortBy;


}
