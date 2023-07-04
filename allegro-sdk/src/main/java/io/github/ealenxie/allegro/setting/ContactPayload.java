package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 11:07
 * @version 1.0
 */

@Getter
@Setter
public class ContactPayload {
    /**
     * id
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * emails
     */
    @JsonProperty("emails")
    private List<Emails> emails;
    /**
     * phones
     */
    @JsonProperty("phones")
    private List<Phones> phones;
}
