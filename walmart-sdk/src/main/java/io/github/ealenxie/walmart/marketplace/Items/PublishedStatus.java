package io.github.ealenxie.walmart.marketplace.Items;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 15:38
 * @version 1.0
 */
@Setter
@Getter
public class PublishedStatus {
    /**
     * reasons
     */
    @JsonProperty("reasons")
    private List<String> reasons;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
}
