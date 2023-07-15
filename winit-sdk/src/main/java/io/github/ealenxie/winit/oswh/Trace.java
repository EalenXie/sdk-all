package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EalenXie created on 2023/7/15 13:51
 */
@NoArgsConstructor
@Data
public class Trace {
    /**
     * type
     */
    @JsonProperty("type")
    private String type;
    /**
     * date
     */
    @JsonProperty("date")
    private String date;
    /**
     * location
     */
    @JsonProperty("location")
    private String location;
    /**
     * lastEvent
     */
    @JsonProperty("lastEvent")
    private String lastEvent;
    /**
     * eventCode
     */
    @JsonProperty("eventCode")
    private String eventCode;
    /**
     * eventStatus
     */
    @JsonProperty("eventStatus")
    private String eventStatus;
    /**
     * eventDescription
     */
    @JsonProperty("eventDescription")
    private String eventDescription;
    /**
     * operator
     */
    @JsonProperty("operator")
    private String operator;
    /**
     * trackingType
     */
    @JsonProperty("trackingType")
    private Object trackingType;
}
