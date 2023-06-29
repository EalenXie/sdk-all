package io.github.ealenxie.allegro.others;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author TangShangCheng
 */
@Getter
@Setter
public class Company {
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * taxId
     */
    @JsonProperty("taxId")
    private String taxId;
}
