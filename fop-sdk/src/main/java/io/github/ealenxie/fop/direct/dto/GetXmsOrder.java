package io.github.ealenxie.fop.direct.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 13:12
 */
@Getter
@Setter
public class GetXmsOrder {
    /**
     * 请求单号
     */
    @JsonProperty("request_no")
    private String requestNo;

    /**
     * 委托单创建时间-开始时间
     * <p>
     * *注：时间格式的传入值需要转换为long类型格式。
     * <p>
     * 时间差为7天
     */
    @JsonProperty("start_time_of_create_consignment")
    private Long startTimeOfCreateConsignment;

    /**
     * 委托单创建时间-结束时间
     * <p>
     * *注：时间格式的传入值需要转换为long类型格式。
     * <p>
     * 时间差为7天
     */
    @JsonProperty("end_time_of_create_consignment")
    private Long endTimeOfCreateConsignment;

    /**
     * 委托单状态：
     * <p>
     * <p>
     * 已预报：P；
     * <p>
     * 已交接/已交货：V；
     * <p>
     * 库内作业中/已入库：H；
     * <p>
     * 已出库：C；
     * <p>
     * 已完成：F；
     * <p>
     * 已退件：R；
     * <p>
     * 已关闭：X；
     * <p>
     * 所有：ALL（默认）
     */
    @JsonProperty("consignment_status")
    private String consignmentStatus;
}
