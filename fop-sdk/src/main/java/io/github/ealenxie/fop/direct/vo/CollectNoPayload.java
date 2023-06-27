package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 16:38
 */
@Getter
@Setter
public class CollectNoPayload {

    @JsonProperty("collect_no")
    private String collectNo;
}
