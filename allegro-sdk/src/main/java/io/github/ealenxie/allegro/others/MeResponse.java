package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.IdPayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class MeResponse {

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
     * firstName
     */
    @JsonProperty("firstName")
    private String firstName;
    /**
     * lastName
     */
    @JsonProperty("lastName")
    private String lastName;
    /**
     * email
     */
    @JsonProperty("email")
    private String email;
    /**
     * baseMarketplace
     */
    @JsonProperty("baseMarketplace")
    private IdPayload baseMarketplace;
    /**
     * company
     */
    @JsonProperty("company")
    private Company company;
    /**
     * features
     */
    @JsonProperty("features")
    private List<String> features;
}
