package io.github.ealenxie.paypal.tracking;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.paypal.vo.Link;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/19 11:25
 */
@Getter
@Setter
public class TrackersResponse {


    /**
     * trackerIdentifiers
     */
    @JsonProperty("tracker_identifiers")
    private List<TrackerIdentifier> trackerIdentifiers;
    /**
     * errors
     */
    @JsonProperty("errors")
    private List<Error> errors;
    /**
     * links
     */
    @JsonProperty("links")
    private List<Link> links;
}
