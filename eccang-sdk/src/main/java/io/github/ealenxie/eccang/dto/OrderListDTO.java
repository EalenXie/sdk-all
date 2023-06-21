package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/11/2 10:50
 */
@Getter
@Setter
public class OrderListDTO {
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("pageSize")
    private Integer pageSize;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer getDetail;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer getAddress;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer getCustomOrderType;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("condition")
    private Condition condition;
}
