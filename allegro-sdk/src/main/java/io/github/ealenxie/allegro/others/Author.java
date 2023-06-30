package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Author {
    /**
     * login
     */
    @JsonProperty("login")
    private String login;
    /**
     * isInterlocutor
     */
    @JsonProperty("isInterlocutor")
    private Boolean isInterlocutor;
}
