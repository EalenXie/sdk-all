package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/3 11:15
 * @version 1.0
 */
@Setter
@Getter
public class ImpliedWarrantiesResponse {

    /**
     * count
     */
    @JsonProperty("count")
    private Integer count;
    /**
     * impliedWarranties
     */
    @JsonProperty("impliedWarranties")
    private List<ImpliedWarranties> impliedWarranties;
}
