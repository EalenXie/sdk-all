package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/31 16:29
 */
@Getter
@Setter
public class ShareHolder {

    /**
     * 股东名
     */
    @JsonProperty("name")
    private String name;

    /**
     * logo
     */
    @JsonProperty("logo")
    private String logo;

    /**
     * 简称
     */
    @JsonProperty("alias")
    private String alias;

    /**
     * 对应表id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 1-公司 2-人
     */
    @JsonProperty("type")
    private Integer type;

    /**
     * 股东的认缴列表
     */
    @JsonProperty("capital")
    private List<Capital> capitalList;

    /**
     * 股东的实缴列表
     */
    @JsonProperty("capitalActl")
    private List<Capital> capitalActlList;
}
