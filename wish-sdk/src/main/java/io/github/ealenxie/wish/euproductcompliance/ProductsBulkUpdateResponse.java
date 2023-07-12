package io.github.ealenxie.wish.euproductcompliance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/12 14:01
 */
@Getter
@Setter
public class ProductsBulkUpdateResponse {

    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * newPersonId
     */
    @JsonProperty("new_person_id")
    private String newPersonId;
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
     * updatedAt
     */
    @JsonProperty("updated_at")
    private String updatedAt;
    /**
     * processedCount
     */
    @JsonProperty("processed_count")
    private Integer processedCount;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * oldPersonId
     */
    @JsonProperty("old_person_id")
    private String oldPersonId;
}
