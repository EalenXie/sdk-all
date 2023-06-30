package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Interlocutor {
    /**
     * login
     */
    @JsonProperty("login")
    private String login;
    /**
     * avatarUrl
     */
    @JsonProperty("avatarUrl")
    private String avatarUrl;
}
