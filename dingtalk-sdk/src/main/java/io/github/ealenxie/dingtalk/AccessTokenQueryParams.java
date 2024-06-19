package io.github.ealenxie.dingtalk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/12/22 10:20
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccessTokenQueryParams {
    @JsonProperty("access_token")
    private String accessToken;
}
