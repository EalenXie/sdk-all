package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/24 18:02
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScanNoPayload {

    /**
     * 面单条码
     */
    @JsonProperty("scanNo")
    private String scanNo;
}
