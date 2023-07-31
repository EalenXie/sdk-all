package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/29 16:40
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class KeywordQueryParams {
    @JsonProperty("keyword")
    private String keyword;
}
