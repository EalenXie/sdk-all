package io.github.ealenxie.wish.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/13 10:46
 */
@Getter
@Setter
public class PaymentInvoicesResponse {

    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * jobId
     */
    @JsonProperty("job_id")
    private String jobId;
    /**
     * totalCount
     */
    @JsonProperty("total_count")
    private Integer totalCount;
    /**
     * createdAt
     */
    @JsonProperty("created_at")
    private String createdAt;
    /**
     * completedAt
     */
    @JsonProperty("completed_at")
    private String completedAt;
    /**
     * fileUrls
     */
    @JsonProperty("file_urls")
    private List<String> fileUrls;
    /**
     * processedCount
     */
    @JsonProperty("processed_count")
    private Integer processedCount;
    /**
     * merchantId
     */
    @JsonProperty("merchant_id")
    private String merchantId;
    /**
     * expiryTime
     */
    @JsonProperty("expiry_time")
    private String expiryTime;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
}
