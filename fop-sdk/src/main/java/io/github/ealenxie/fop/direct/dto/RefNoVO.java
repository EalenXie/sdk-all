package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 15:10
 */
@Getter
@Setter
public class RefNoVO {
    @JsonProperty("ref_no")
    private String refNo;
}
