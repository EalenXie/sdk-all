package io.github.ealenxie.winit;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 13:23
 */
@Getter
@Setter
public class PageCurrentTotalListResponse<T> extends ListResponse<T> {
    @JsonProperty("pageParams")
    private PageParamsCurrentResponse pageParams;

}
