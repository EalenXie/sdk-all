package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessagePayload {

    /**
     * message
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("message")
    private String message;
}
