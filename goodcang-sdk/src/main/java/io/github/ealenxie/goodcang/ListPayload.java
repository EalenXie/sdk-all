package io.github.ealenxie.goodcang;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/27 10:35
 * 列表型响应 : 响应结构为 {"list":[]}
 */
@Getter
@Setter
public class ListPayload<T> {
    /**
     * 列表
     */
    @JsonProperty("list")
    private List<T> list;


}
