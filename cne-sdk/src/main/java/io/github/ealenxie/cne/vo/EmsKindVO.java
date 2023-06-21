package io.github.ealenxie.cne.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/9/16 10:51
 */
@Getter
@Setter
public class EmsKindVO {
    /**
     * 渠道中文名称
     */
    @JsonProperty("oName")
    private String oName;
    /**
     * 渠道编码
     */
    @JsonProperty("cName")
    private String cName;
}
