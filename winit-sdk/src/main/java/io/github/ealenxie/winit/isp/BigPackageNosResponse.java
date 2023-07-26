package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/14 17:02
 */
@Getter
@Setter
public class BigPackageNosResponse {

    /**
     * 装箱单号
     */
    @JsonProperty("bigPackageNos")
    private List<String> bigPackageNos;
}
