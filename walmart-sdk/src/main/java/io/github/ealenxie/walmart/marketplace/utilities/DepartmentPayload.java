package io.github.ealenxie.walmart.marketplace.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 15:25
 */
@Getter
@Setter
public class DepartmentPayload {
    /**
     * superDepartment
     */
    @JsonProperty("superDepartment")
    private String superDepartment;
    /**
     * superDepartmentId
     */
    @JsonProperty("superDepartmentId")
    private String superDepartmentId;
    /**
     * departments
     */
    @JsonProperty("departments")
    private List<Department> departments;
}
