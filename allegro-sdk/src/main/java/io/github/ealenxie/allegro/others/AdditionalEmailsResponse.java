package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class AdditionalEmailsResponse {


    /**
     * additional-emails
     */
    @JsonProperty("additional-emails")
    private List<AdditionalEmail> additionalEmails;
}
