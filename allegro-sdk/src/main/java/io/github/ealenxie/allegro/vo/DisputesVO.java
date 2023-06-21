package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/3/3 12:46
 */
@Getter
@Setter
public class DisputesVO {
    /**
     * Array of objects (Dispute) [ items ]
     */
    @JsonProperty("disputes")
    private List<Dispute> disputes;
}
