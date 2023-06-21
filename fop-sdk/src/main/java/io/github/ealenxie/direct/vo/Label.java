package io.github.ealenxie.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/24 17:51
 */
@Getter
@Setter
public class Label {

    @JsonProperty("requestNo")
    private String requestNo;
    @JsonProperty("labelUrl")
    private String labelUrl;
}
