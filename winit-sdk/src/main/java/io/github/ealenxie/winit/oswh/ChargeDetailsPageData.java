package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.winit.PageParams;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/17 13:57
 */
@NoArgsConstructor
@Data
public class ChargeDetailsPageData {

    /**
     * businessDocumentNo
     */
    @JsonProperty("businessDocumentNo")
    private String businessDocumentNo;
    /**
     * deducationTimeStart
     */
    @JsonProperty("deducationTimeStart")
    private String deducationTimeStart;
    /**
     * deducationTimeEnd
     */
    @JsonProperty("deducationTimeEnd")
    private String deducationTimeEnd;
    /**
     * businessDocumentType
     */
    @JsonProperty("businessDocumentType")
    private String businessDocumentType;
    /**
     * pageParams
     */
    @JsonProperty("pageParams")
    private PageParams pageParams;
}
