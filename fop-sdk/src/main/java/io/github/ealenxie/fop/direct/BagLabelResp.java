package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 12:24
 */
@Getter
@Setter
public class BagLabelResp {

    /**
     * 请求id
     */
    private String requestId;

    /**
     * 袋序号
     */
    private String bagCode;

    /**
     * 袋标签地址
     */
    @JsonProperty("bagLabelURL")
    private String bagLabelUrl;
}
