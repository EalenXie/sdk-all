package io.github.ealenxie.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/24 18:09
 */
@Getter
@Setter
public class OrderAbnormalList {

    @JsonProperty("request_no")
    private String requestNo;
    @JsonProperty("start_time_of_create_consignment")
    private Long startTimeOfCreateConsignment;
    @JsonProperty("end_time_of_create_consignment")
    private Long endTimeOfCreateConsignment;
    @JsonProperty("abnormal_type")
    private String abnormalType;
}
