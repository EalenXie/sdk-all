package io.github.ealenxie.walmart.marketplace.feeds;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 14:06
 * @version 1.0
 */
@Getter
@Setter
public class Result {
    /**
     * feed
     */
    @JsonProperty("feed")
    private List<Feed> feed;
}
