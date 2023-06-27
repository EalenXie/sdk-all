package io.github.ealenxie.goodcang.assistant;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.warehouse.PagePayload;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/27 9:52
 */
@Getter
@Setter
public class LogisticTicketListPayload extends PagePayload {

    /**
     * 查件状态
     */
    @JsonProperty("io_status")
    private Integer ioStatus;
    /**
     * 查单类型
     */
    @JsonProperty("code_type")
    private String codeType;
    /**
     * 单号值
     */
    @JsonProperty("code_value_list")
    private List<String> codeValueList;
    /**
     * 仓库编码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;
    /**
     * 物流方式编码
     */
    @JsonProperty("sm_code")
    private String smCode;
    /**
     * 销售平台
     */
    @JsonProperty("platform")
    private String platform;
    /**
     * 查件类型ID
     */
    @JsonProperty("it_type_id")
    private Integer itTypeId;
    /**
     * 时间类型
     */
    @JsonProperty("time_type")
    private String timeType;
    /**
     * 开始时间
     */
    @JsonProperty("time_start")
    private String timeStart;
    /**
     * 结束时间
     */
    @JsonProperty("time_end")
    private String timeEnd;
    /**
     * 轨迹状态
     */
    @JsonProperty("trail_status")
    private String trailStatus;
    /**
     * pageSize
     */
    @JsonProperty("page_size")
    private Integer pageSize;
    /**
     * page
     */
    @JsonProperty("page")
    private Integer page;
}
