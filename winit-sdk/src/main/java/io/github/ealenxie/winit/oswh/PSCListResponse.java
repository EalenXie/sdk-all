package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 10:49
 */
@NoArgsConstructor
@Data
public class PSCListResponse {

    /**
     * list
     */
    @JsonProperty("list")
    private List<PscResponse> list;
}
