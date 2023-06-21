package io.github.ealenxie.winit.oswh.inventory.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/1/28 16:07
 * @version 1.0
 */
@Getter
@Setter
public class CarryLabelDTO {
    /**
     * 标签编码
     * CE_LABEL CE标
     * FIRE_SAFETY_LABEL UM标签（防火标）
     * DANGEROUS_LABEL 9类危险品标
     * FRAGILE_LABEL 易碎品标
     * FRONT_UP_LABEL 正面朝上标
     */
    @JsonProperty("labelCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String labelCode;
    /**
     * 标签值,Y 含有该标签,N 不含有该标签
     */
    @JsonProperty("labelValue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String labelValue;
}
