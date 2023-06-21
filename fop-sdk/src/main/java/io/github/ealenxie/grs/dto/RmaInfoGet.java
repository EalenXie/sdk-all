package io.github.ealenxie.grs.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 11:09
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RmaInfoGet {
    @JsonProperty("rma_no")
    private String rmaNo;
}
