package io.github.ealenxie.goodcang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/11/22 17:20
 */
@Getter
@Setter
public class ReferenceNoDTO {

    @JsonProperty("reference_no")
    private String referenceNo;

    public ReferenceNoDTO(String referenceNo) {
        this.referenceNo = referenceNo;
    }
}
