package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class UserRatingRemovalPayload {


    /**
     * request
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("request")
    private MessagePayload request;
}
