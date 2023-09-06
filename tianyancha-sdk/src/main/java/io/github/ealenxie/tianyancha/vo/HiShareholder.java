package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HiShareholder {
    /**
     * 金额
     */
    @JsonProperty("amount")
    private String amount;

    /**
     * 拥有公司数量
     */
    @JsonProperty("toco")
    private Integer toco;

    /**
     * 人或公司id
     */
    @JsonProperty("id")
    private String id;

    /**
     * 类型，2-人 1-公司
     */
    @JsonProperty("type")
    private Integer type;

    /**
     * 入股时间
     */
    @JsonProperty("startTime")
    private Long startTime;

    /**
     * 退股时间
     */
    @JsonProperty("endTime")
    private Long endTime;

    /**
     * 认缴信息
     */
    @JsonProperty("capital")
    private List<Capital> capital;

    /**
     * 股东名
     */
    @JsonProperty("name")
    private String name;
}