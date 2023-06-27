package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 10:35
 * 列表总数型响应 : 响应结构为 {"list":[],"total":0}
 */
@Getter
@Setter
public class ListTotalPayload<T> extends ListPayload<T> {

    /**
     * 总记录数
     */
    @JsonProperty("total")
    private Integer total;


}
