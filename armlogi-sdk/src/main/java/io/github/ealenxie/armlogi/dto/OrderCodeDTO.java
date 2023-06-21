package io.github.ealenxie.armlogi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/23 11:23
 * @version 1.0
 */
@Getter
@Setter
public class OrderCodeDTO {

    /**
     * orderCode
     */
    @JsonProperty("orderCode")
    private List<String> orderCodes;
}
