package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/3 13:22
 * @version 1.0
 */
@Getter
@Setter
public class WarrantiesResponse {
    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * warranties
     */
    @JsonProperty("warranties")
    private List<ImpliedWarranties> warranties;
}
