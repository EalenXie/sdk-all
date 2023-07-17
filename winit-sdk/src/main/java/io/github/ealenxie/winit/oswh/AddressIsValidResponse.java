package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/17 11:07
 */
@NoArgsConstructor
@Data
public class AddressIsValidResponse {

    /**
     * result
     */
    @JsonProperty("result")
    private Boolean result;
    /**
     * suggestionList
     */
    @JsonProperty("suggestionList")
    private List<Suggestion> suggestionList;
    /**
     * resultMsg
     */
    @JsonProperty("resultMsg")
    private String resultMsg;
}
