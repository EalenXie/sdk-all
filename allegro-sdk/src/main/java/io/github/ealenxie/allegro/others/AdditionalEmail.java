package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class AdditionalEmail {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * email
     */
    @JsonProperty("email")
    private String email;
    /**
     * createdAt
     */
    @JsonProperty("createdAt")
    private String createdAt;
}
