package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/9/14 9:43
 */
@Getter
@Setter
public class TitlePayload {
    /**
     * 公司名/律所名
     */
    @JsonProperty("title")
    private String title;
}
