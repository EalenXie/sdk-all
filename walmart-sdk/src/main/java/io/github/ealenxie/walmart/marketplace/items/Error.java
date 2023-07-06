package io.github.ealenxie.walmart.marketplace.items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 16:21
 * @version 1.0
 */
@Getter
@Setter
public class Error {
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
     * info
     */
    @JsonProperty("info")
    private String info;
    /**
     * severity
     */
    @JsonProperty("severity")
    private String severity;
    /**
     * category
     */
    @JsonProperty("category")
    private String category;
    /**
     * causes
     */
    @JsonProperty("causes")
    private List<Cause> causes;
    /**
     * errorIdentifiers
     */
    @JsonProperty("errorIdentifiers")
    private Object errorIdentifiers;
    /**
     * component
     */
    @JsonProperty("component")
    private String component;
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * serviceName
     */
    @JsonProperty("serviceName")
    private String serviceName;
    /**
     * gatewayErrorCategory
     */
    @JsonProperty("gatewayErrorCategory")
    private String gatewayErrorCategory;
}
