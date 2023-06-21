package io.github.ealenxie.transfer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 20:35
 */
@Getter
@Setter
public class OrderNodeVO {
    @JsonProperty("contentData")
    private ContentData contentData;
    @JsonProperty("createTime")
    private Long createTime;
    @JsonProperty("nodeName")
    private String nodeName;
}
