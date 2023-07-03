package io.github.ealenxie.allegro.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/3 10:00
 * @version 1.0
 */
@Getter
@Setter
public class Parcels {
    /**
     * waybill
     */
    @JsonProperty("waybill")
    private String waybill;
    /**
     * items
     */
    @JsonProperty("items")
    private List<Items> items;
}
