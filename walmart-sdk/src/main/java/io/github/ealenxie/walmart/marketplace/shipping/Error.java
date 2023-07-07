package io.github.ealenxie.walmart.marketplace.shipping;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/6 16:21
 * @version 1.0
 */
@Getter
@Setter
public class Error {

    /**
     * info
     */
    @JsonProperty("info")
    private String info;
    /**
     * code
     */
    @JsonProperty("code")
    private String code;
    /**
     * field
     */
    @JsonProperty("field")
    private String field;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;

    /**
     * severity
     */
    @JsonProperty("severity")
    private String severity;

    @JsonProperty("httpStatus")
    private Integer httpStatus;

}
