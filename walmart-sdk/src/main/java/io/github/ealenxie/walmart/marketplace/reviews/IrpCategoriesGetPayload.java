package io.github.ealenxie.walmart.marketplace.reviews;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/7 13:01
 */
@NoArgsConstructor
@Data
public class IrpCategoriesGetPayload {

    /**
     * itemStatus
     */
    @JsonProperty("itemStatus")
    private List<String> itemStatus;
}
