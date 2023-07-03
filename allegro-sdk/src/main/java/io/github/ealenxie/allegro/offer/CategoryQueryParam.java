package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/3 14:14
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryQueryParam {
    @JsonProperty("parent.id")
    private String parentId;
}
