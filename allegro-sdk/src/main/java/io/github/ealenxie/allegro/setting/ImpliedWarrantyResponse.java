package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/3 13:05
 * @version 1.0
 */
@Getter
@Setter
public class ImpliedWarrantyResponse extends ImpliedWarrantyPayload {

    /**
     * id
     */
    @JsonProperty("id")
    private String id;


    /**
     * id
     */
    @JsonProperty("seller")
    private Seller seller;
}
