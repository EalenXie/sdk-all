package io.github.ealenxie.kaufland.v1.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/08/15 11:12
 */
@Getter
@Setter
public class OrdersDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String limit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ts_updated:from")
    private String tsUpdated;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String offset;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
}
