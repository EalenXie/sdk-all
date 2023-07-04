package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/4 14:34
 * @version 1.0
 */
@Getter
@Setter
public class User {
    /**
     * id
     */
    @JsonProperty("id")
    private Integer id;
    /**
     * login
     */
    @JsonProperty("login")
    private String login;
}
