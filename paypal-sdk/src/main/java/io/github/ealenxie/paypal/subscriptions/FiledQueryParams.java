package io.github.ealenxie.paypal.subscriptions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/26 14:13
 * @version 1.0
 */
@Getter
@Setter
public class FiledQueryParams {
    /**
     * fields
     */
    @JsonProperty("fields")
    private List<String> fields;
}
