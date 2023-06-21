package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/16 10:11
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestNoDTO {

    @JsonProperty("request_no")
    private String requestNo;

}
