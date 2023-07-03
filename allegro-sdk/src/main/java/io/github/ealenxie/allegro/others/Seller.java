package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Seller {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * login
     */
    @JsonProperty("login")
    private String login;
    /**
     * company
     */
    @JsonProperty("company")
    private Boolean company;
    /**
     * superSeller
     */
    @JsonProperty("superSeller")
    private Boolean superSeller;
}
