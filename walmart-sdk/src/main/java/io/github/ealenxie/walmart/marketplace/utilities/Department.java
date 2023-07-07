package io.github.ealenxie.walmart.marketplace.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/7 15:25
 */
@Getter
@Setter
public class Department {
    /**
     * departmentName
     */
    @JsonProperty("departmentName")
    private String departmentName;
    /**
     * departmentId
     */
    @JsonProperty("departmentId")
    private String departmentId;
}
