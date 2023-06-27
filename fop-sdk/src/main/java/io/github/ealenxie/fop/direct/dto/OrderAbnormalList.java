package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/24 18:09
 */
@Getter
@Setter
public class OrderAbnormalList {
    /**
     * 请求单号(支持4PX单号、面单号、客户单号)； 请求单号和异常件类型二选一；
     */
    @JsonProperty("request_no")
    private String requestNo;

    /**
     * 异常发生-开始时间（*注：时间格式的传入值需要转换为long类型格式。）时间差为30天； 进行单号请求时，时间搜索将不生效；
     */
    @JsonProperty("start_time_of_create_consignment")
    private Long startTimeOfCreateConsignment;

    /**
     * 异常发生-结束时间（*注：时间格式的传入值需要转换为long类型格式。）时间差为30天； 进行单号请求时，时间搜索将不生效；
     */
    @JsonProperty("end_time_of_create_consignment")
    private Long endTimeOfCreateConsignment;

    /**
     * 异常件类型（ALL：全部；IW：仓内异常件；OW：仓外异常件）；
     * <p>
     * 请求单号和异常件类型二选一；
     */
    @JsonProperty("abnormal_type")
    private String abnormalType;
}
