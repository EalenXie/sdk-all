package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 12:42
 */
@Getter
@Setter
public class CreateXmsBagResp {
    @JsonProperty("request_id")
    private String requestId;
    @JsonProperty("bag_code")
    private String bagCode;
    @JsonProperty("bag_label_url")
    private String bagLabelUrl;

}
