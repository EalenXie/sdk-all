package io.github.ealenxie.wish.euproductcompliance;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/12 13:59
 */
@Getter
@Setter
public class ProductsBulkUpdateQueryParams {
    @JsonProperty("new_person_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String newPersonId;
    @JsonProperty("old_person_id")
    private String oldPersonId;

}
