package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 15:34
 * @version 1.0
 */

@Getter
@Setter
public class CalculateFeeResponse {

    /**
     * commissions
     */
    @JsonProperty("commissions")
    private List<Commissions> commissions;
    /**
     * quotes
     */
    @JsonProperty("quotes")
    private List<Quotes> quotes;
}
