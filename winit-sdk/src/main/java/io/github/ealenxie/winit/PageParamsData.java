package io.github.ealenxie.winit;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 14:21
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PageParamsData {
    @JsonProperty("pageParams")
    private PageParams pageParams;
}
