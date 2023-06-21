package io.github.ealenxie.fop.track.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 16:02
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryOrderNoDTO {

    @JsonProperty("deliveryOrderNo")
    private String deliveryOrderNo;
}
