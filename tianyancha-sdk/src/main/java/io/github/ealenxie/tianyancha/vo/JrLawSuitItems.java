package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author EalenXie created on 2023/8/1 9:37
 */
public class JrLawSuitItems {
    @JsonProperty("total")
    private Integer total;

    @JsonProperty("items")
    private List<JrLawSuit> items;
}
