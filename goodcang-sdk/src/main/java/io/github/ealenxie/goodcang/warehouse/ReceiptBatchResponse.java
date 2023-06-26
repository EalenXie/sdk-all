package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.vo.ResponseAsk;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 13:00
 */
@Setter
@Getter
public class ReceiptBatchResponse extends ResponseAsk<ReceiptBatchInfo> {

    @JsonProperty("receiving_status")
    private Integer receivingStatus;
    @JsonProperty("transit_type")
    private Integer transitType;

}
