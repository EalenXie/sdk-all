package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2023/4/4 9:16
 */
@Getter
@Setter
public class RequestParcelInput {
    @JsonProperty("parcelIds")
    private List<String> parcelIds;
    @JsonProperty("pickupDate")
    private Proposals pickupDate;
}
