package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class SendAnnouncement {
    /**
     * 标题
     */
    @JsonProperty("title")
    private String title;

    /**
     * 法院
     */
    @JsonProperty("court")
    private String court;

    /**
     * 内容
     */
    @JsonProperty("content")
    private String content;

    /**
     * 发布日期
     */
    @JsonProperty("startDate")
    private String startDate;


}