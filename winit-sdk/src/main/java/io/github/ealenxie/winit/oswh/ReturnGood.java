package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 10:20
 */
@Getter
@Setter
public class ReturnGood {
    /**
     * defectiveMethod
     */
    @JsonProperty("defectiveMethod")
    private String defectiveMethod;
    /**
     * goodMethod
     */
    @JsonProperty("goodMethod")
    private String goodMethod;
    /**
     * handleMethod
     */
    @JsonProperty("handleMethod")
    private String handleMethod;
    /**
     * itemCodeList
     */
    @JsonProperty("itemCodeList")
    private List<ReturnGoodItemCode> itemCodeList;
    /**
     * productCode
     */
    @JsonProperty("productCode")
    private String productCode;
    /**
     * productNum
     */
    @JsonProperty("productNum")
    private String productNum;
    /**
     * specification
     */
    @JsonProperty("specification")
    private String specification;
}
