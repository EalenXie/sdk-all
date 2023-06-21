package io.github.ealenxie.winit.lma.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 15:33
 * @version 1.0
 */
@Getter
@Setter
public class OrderNoDTO {
    /**
     * winit 订单号
     */
    @JsonProperty("winitOrderNOs")
    private List<String> orderNos;
}
