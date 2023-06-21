package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 12:24
 */
@Getter
@Setter
public class BagLabelResp {


    private String requestId;

    private String bagCode;

    @JsonProperty("bagLabelURL")
    private String bagLabelUrl;
}
