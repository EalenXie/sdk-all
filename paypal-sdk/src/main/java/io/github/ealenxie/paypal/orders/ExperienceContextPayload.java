package io.github.ealenxie.paypal.orders;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/24 15:27
 */
@Getter
@Setter
public class ExperienceContextPayload {
    /**
     * experienceContext
     */
    @JsonProperty("experience_context")
    private ExperienceContext experienceContext;
}
