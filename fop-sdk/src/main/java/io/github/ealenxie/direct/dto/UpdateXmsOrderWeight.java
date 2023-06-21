package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/22 13:16
 */
@Getter
@Setter
public class UpdateXmsOrderWeight {
    @JsonProperty("request_no")
    private String requestNo;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("parcelist")
    private List<ParcelVO> parcelist;
}
