package io.github.ealenxie.walmart.marketplace.feeds;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/7/6 14:34
 * @version 1.0
 */
@Getter
@Setter
public class ItemDetail {
    /**
     * itemIngestionStatus
     */
    @JsonProperty("itemIngestionStatus")
    private List<ItemIngestionStatus> itemIngestionStatus;
}
