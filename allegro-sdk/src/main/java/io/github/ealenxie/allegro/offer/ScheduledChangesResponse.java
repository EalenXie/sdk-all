package io.github.ealenxie.allegro.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/3 15:35
 */
@NoArgsConstructor
@Data
public class ScheduledChangesResponse {

    /**
     * scheduledChanges
     */
    @JsonProperty("scheduledChanges")
    private List<ScheduledChange> scheduledChanges;
}
