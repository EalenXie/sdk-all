package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 12:42
 */
@Getter
@Setter
public class CreateXmsBagResp {
    /**
     * 请求唯一识别号
     */
    @JsonProperty("request_id")
    private String requestId;

    /**
     * 袋子号
     */
    @JsonProperty("bag_code")
    private String bagCode;

    /**
     * 袋标签，下载地址
     */
    @JsonProperty("bag_label_url")
    private String bagLabelUrl;

}
