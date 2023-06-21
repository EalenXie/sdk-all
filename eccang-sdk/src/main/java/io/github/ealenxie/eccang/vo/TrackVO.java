package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/27 8:53
 */
@Getter
@Setter
public class TrackVO {
    /**
     * 跟单状态中文名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 跟单状态英文名称
     */
    @JsonProperty("name_en")
    private String nameEn;
}
