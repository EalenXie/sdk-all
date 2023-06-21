package io.github.ealenxie.fruugo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class OrdersDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String from;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String to;

}
