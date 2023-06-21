package io.github.ealenxie.alyunwms.dto.asn;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/24 16:03
 * @version 1.0
 */
@Getter
@Setter
public class CancelAsnDTO {
    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;
}
