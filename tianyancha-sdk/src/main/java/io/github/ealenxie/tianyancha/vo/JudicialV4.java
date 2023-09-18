package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/9/18 14:43
 */
@Getter
@Setter
public class JudicialV4 {


    /**
     * 总数
     */
    @JsonProperty("total")
    private Long total;

    /**
     * 历史数量
     */
    @JsonProperty("historyCount")
    private Long historyCount;
    /**
     * 项列表
     */
    @JsonProperty("items")
    private List<JudicialItem> items;
}
