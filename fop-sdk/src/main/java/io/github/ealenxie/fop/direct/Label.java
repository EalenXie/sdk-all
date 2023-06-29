package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/24 17:51
 */
@Getter
@Setter
public class Label {
    /**
     * 请求单号
     */
    @JsonProperty("requestNo")
    private String requestNo;

    /**
     * 标签地址
     */
    @JsonProperty("labelUrl")
    private String labelUrl;
}
