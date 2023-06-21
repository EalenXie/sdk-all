package io.github.ealenxie.armlogi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/3/31 9:44
 * @version 1.0
 */
@Getter
@Setter
public class AsnDTO {
    /**
     * 入库单号
     */
    @JsonProperty("receivingCode")
    private String receivingCode;
}
