package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 13:12
 */
@Getter
@Setter
public class GetXmsOrder {

    @JsonProperty("request_no")
    private String requestNo;
    @JsonProperty("start_time_of_create_consignment")
    private Long startTimeOfCreateConsignment;
    @JsonProperty("end_time_of_create_consignment")
    private Long endTimeOfCreateConsignment;
    @JsonProperty("consignment_status")
    private String consignmentStatus;
}
