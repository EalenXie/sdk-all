package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.PageQueryParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/5 13:11
 */
@Getter
@Setter
public class CompatibleProductsGroupsQueryParams extends PageQueryParams {
    @JsonProperty("type")
    private String type;
}
