package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 16:59
 * @version 1.0
 */
@Getter
@Setter
public class CheckData {
    /**
     * packageNo
     */
    @JsonProperty("packageNo")
    private String packageNo;
    /**
     * thirdSerno
     */
    @JsonProperty("thirdSerno")
    private String thirdSerno;
}
