package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/18 15:47
 * @version 1.0
 */
@Getter
@Setter
public class Plan {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * usageType
     */
    @JsonProperty("usage_type")
    private String usageType;
    /**
     * createTime
     */
    @JsonProperty("create_time")
    private String createTime;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
