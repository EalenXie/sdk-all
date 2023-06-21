package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/21 13:09
 * @version 1.0
 */
@Getter
@Setter
public class Participant {
    @JsonProperty("id")
    private String id;
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("login")
    private String login;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("address")
    private Address address;
}
