package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 11:39
 */
@Getter
@Setter
public class Bag {
    @JsonProperty("bagCode")
    private String bagCode;
    @JsonProperty("pieces")
    private String pieces;
    @JsonProperty("bagWeight")
    private String bagWeight;
    @JsonProperty("destinationCountry")
    private String destinationCountry;
    @JsonProperty("partition")
    private String partition;
    @JsonProperty("orderList")
    private List<OrderVO> orderList;
}
