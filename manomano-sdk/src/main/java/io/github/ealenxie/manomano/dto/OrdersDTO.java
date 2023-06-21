package io.github.ealenxie.manomano.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie
 * @since 2022/08/16 8:53
 */
@Setter
@Getter
public class OrdersDTO extends ManoManoDTO {
    /**
     * 开始时间
     */
    @JsonProperty("update_time_start")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updateTimeStart;
    /**
     * 结束时间
     */
    @JsonProperty("update_time_end")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String updateTimeEnd;

    public OrdersDTO(String login, String password, String method) {
        super(login, password, method);
    }
}
