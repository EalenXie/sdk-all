package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/8/1 9:58
 */
@Getter
@Setter
public class TotalItems<T> {
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("items")
    private List<T> items;
}
