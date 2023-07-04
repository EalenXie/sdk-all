package io.github.ealenxie.allegro.setting;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/4 11:11
 * @version 1.0
 */
@Getter
@Setter
public class ContactResponse {
    /**
     * contacts
     */
    @JsonProperty("contacts")
    private List<ContactPayload> contacts;
}
