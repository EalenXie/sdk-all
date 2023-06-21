package io.github.ealenxie.cne.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * cne面单参数
 * zhn
 */
@Getter
@Setter
public class LabelContent {

    /**
     * 面单类型 默认：pdf
     */
    @JsonProperty("fileType")
    private String fileType;
    /**
     * 打印类型 默认：label10x10 ,label10x10：10x10纸张, label10x15：10x15纸张
     */
    @JsonProperty("labelType")
    private String labelType;
    /**
     * 拣货单配置 默认：0, 0：不包含拣货单, 1：包含拣货单
     */
    @JsonProperty("pickList")
    private Integer pickList;
}
