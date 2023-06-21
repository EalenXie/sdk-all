package io.github.ealenxie.walmart.marketplace.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/9 9:29
 * @version 1.0
 */
@Getter
@Setter
public class ReportDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String reportDate;

    private String reportVersion = "v1";

}
