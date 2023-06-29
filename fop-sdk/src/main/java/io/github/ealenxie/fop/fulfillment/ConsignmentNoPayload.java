package io.github.ealenxie.fop.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ConsignmentNoPayload {
    /**
     * 返回派送委托单号
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;
}
