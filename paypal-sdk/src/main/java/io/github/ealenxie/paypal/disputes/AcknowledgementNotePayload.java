package io.github.ealenxie.paypal.disputes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/18 15:07
 */
@NoArgsConstructor
@Data
public class AcknowledgementNotePayload {
    /**
     * note
     */
    @JsonProperty("note")
    private String note;
    /**
     * acknowledgementType
     */
    @JsonProperty("acknowledgement_type")
    private String acknowledgementType;
}
