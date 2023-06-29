package io.github.ealenxie.allegro.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/29 10:58
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarriersTrackingQueryParams {
    private List<String> waybill;
}
