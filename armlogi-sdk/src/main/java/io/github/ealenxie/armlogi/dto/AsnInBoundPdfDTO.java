package io.github.ealenxie.armlogi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/3/31 9:02
 * @version 1.0
 */
@Getter
@Setter
public class AsnInBoundPdfDTO {

    /**
     * 入库单号集合
     */
    @JsonProperty("receivingCodes")
    private List<String> receivingCodes;
}
