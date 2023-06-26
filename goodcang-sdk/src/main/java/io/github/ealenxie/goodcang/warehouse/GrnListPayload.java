package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/6/26 10:04
 */
@Getter
@Setter
public class GrnListPayload {

    /**
     * 入库单号
     */
    @JsonProperty("receiving_code_arr")
    private List<String> receivingCodeArr;
    /**
     * 创建开始日期
     */
    @JsonProperty("create_date_from")
    private String createDateFrom;
    /**
     * 创建结束日期
     */
    @JsonProperty("create_date_to")
    private String createDateTo;
    /**
     * 修改开始时间
     */
    @JsonProperty("modify_date_from")
    private String modifyDateFrom;
    /**
     * 修改结束时间
     */
    @JsonProperty("modify_date_to")
    private String modifyDateTo;
    /**
     * 是否仓库装箱商品
     */
    @JsonProperty("is_rollover")
    private Integer isRollover;
    /**
     * 每页数据长度
     */
    @JsonProperty("pageSize")
    private Integer pageSize;
    /**
     * 当前页
     */
    @JsonProperty("page")
    private Integer page;
}
