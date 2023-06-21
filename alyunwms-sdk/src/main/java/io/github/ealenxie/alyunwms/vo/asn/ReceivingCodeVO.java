package io.github.ealenxie.alyunwms.vo.asn;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/22 16:27
 * @version 1.0
 */
@Getter
@Setter
public class ReceivingCodeVO {

    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    private String receivingCode;
}
