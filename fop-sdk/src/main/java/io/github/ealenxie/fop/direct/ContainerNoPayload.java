package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 16:48
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContainerNoPayload {
    /**
     * 袋号
     */
    @JsonProperty("containerNo")
    private String containerNo;
}
