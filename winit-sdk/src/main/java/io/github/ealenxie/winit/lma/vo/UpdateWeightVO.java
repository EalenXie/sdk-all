package io.github.ealenxie.winit.lma.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 15:26
 * @version 1.0
 */
@Getter
@Setter
public class UpdateWeightVO {

    /**
     * 是否更新面单：Y是，N否
     */
    @JsonProperty("isUpdateLabel")
    private String isUpdateLabel;
    /**
     * 提示描述
     */
    @JsonProperty("tip")
    private String tip;
}
