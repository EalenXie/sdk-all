package io.github.ealenxie.payoneer.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/6/30 13:04
 */
@Getter
@Setter
public class PayoneerPage<T> {
    @JsonProperty("items")
    private List<T> items;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("next")
    private String next;

}
