package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.winit.PageParams;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/17 13:16
 */
@Getter
@Setter
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
