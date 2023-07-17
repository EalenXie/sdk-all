package io.github.ealenxie.winit;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/17 13:16
 */
@NoArgsConstructor
@Data
public class TransactionChargeGetData {

    /**
     * businessDocumentType
     */
    @JsonProperty("businessDocumentType")
    private String businessDocumentType;
    /**
     * businessDocumentNo
     */
    @JsonProperty("businessDocumentNo")
    private String businessDocumentNo;
    /**
     * tradeDateFrom
     */
    @JsonProperty("tradeDateFrom")
    private String tradeDateFrom;
    /**
     * tradeDateTo
     */
    @JsonProperty("tradeDateTo")
    private String tradeDateTo;
    /**
     * pageParams
     */
    @JsonProperty("pageParams")
    private PageParams pageParams;
}
