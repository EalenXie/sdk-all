package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.User;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 14:33
 * @version 1.0
 */
@Getter
@Setter
public class BlackPayload {

    /**
     * user
     */
    @JsonProperty("user")
    private User user;
    /**
     * note
     */
    @JsonProperty("note")
    private String note;
    /**
     * date
     */
    @JsonProperty("date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String date;
}
