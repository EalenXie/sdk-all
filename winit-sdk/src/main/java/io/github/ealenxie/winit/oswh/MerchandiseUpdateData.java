package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/17 10:23
 */
@NoArgsConstructor
@Data
public class MerchandiseUpdateData {

    /**
     * returnGoodsOrderNo
     */
    @JsonProperty("returnGoodsOrderNo")
    private String returnGoodsOrderNo;
    /**
     * originalMerchandiseSerno
     */
    @JsonProperty("originalMerchandiseSerno")
    private String originalMerchandiseSerno;
    /**
     * vatNo
     */
    @JsonProperty("vatNo")
    private String vatNo;
    /**
     * merchandiseCode
     */
    @JsonProperty("merchandiseCode")
    private String merchandiseCode;
    /**
     * specification
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * isGood
     */
    @JsonProperty("isGood")
    private String isGood;
    /**
     * newMerchandiseCode
     */
    @JsonProperty("newMerchandiseCode")
    private String newMerchandiseCode;
    /**
     * declareValue
     */
    @JsonProperty("declareValue")
    private Integer declareValue;
    /**
     * remarks
     */
    @JsonProperty("remarks")
    private String remarks;
}
