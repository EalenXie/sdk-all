package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/3/3 12:47
 */
@Getter
@Setter
public class Author {
    @JsonProperty("login")
    private String login;
    @JsonProperty("role")
    private String role;
}
