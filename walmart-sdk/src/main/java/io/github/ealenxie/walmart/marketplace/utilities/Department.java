package io.github.ealenxie.walmart.marketplace.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/7 15:25
 */
@NoArgsConstructor
@Data
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
