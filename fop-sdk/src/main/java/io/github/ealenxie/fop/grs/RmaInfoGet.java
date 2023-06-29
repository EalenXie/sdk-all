package io.github.ealenxie.fop.grs;

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
    /**
     * 退货单（退货预报单）
     */
    @JsonProperty("rma_no")
    private String rmaNo;
}
