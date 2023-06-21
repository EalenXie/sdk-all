package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/3 12:53
 */
@Getter
@Setter
public class ProductsBulk {

    @JsonProperty("status")
    private String status;
    @JsonProperty("total_count")
    private Integer totalCount;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("completed_at")
    private String completedAt;
    @JsonProperty("file_urls")
    private List<String> fileUrls;
    @JsonProperty("processed_count")
    private Integer processedCount;
    @JsonProperty("id")
    private String id;
}
