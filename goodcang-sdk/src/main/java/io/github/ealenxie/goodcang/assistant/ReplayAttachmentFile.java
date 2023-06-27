package io.github.ealenxie.goodcang.assistant;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 9:58
 */
@Getter
@Setter
public class ReplayAttachmentFile {
    /**
     * 链接
     */
    @JsonProperty("url")
    private String url;
    /**
     * 名称
     */
    @JsonProperty("name")
    private String name;
}
