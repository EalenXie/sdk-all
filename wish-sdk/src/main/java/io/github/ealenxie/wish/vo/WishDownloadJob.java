package io.github.ealenxie.wish.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/18 16:43
 */
@Getter
@Setter
public class WishDownloadJob {
    @JsonProperty("total_count")
    private Integer totalCount;
    @JsonProperty("processed_count")
    private Integer processedCount;
    @JsonProperty("status")
    private String status;
    @JsonProperty("expiry_time")
    private String expiryTime;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("completed_at")
    private String completedAt;
    @JsonProperty("file_urls")
    private List<String> fileUrls;
    @JsonProperty("id")
    private String id;
}
