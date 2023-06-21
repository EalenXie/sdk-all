package io.github.ealenxie.alyunwms.dto.asn;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/2/22 16:01
 * @version 1.0
 */
@Getter
@Setter
public class QueryAsnDTO {
    /**
     * 每页数据长度，最大值为20
     */
    @JsonProperty("pageSize")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pageSize = 20;
    /**
     * 当前页
     */
    @JsonProperty("page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer page = 1;
    /**
     * 入库单ID
     */
    @JsonProperty("receiving_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receivingId;
    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receivingCode;
    /**
     * 多个入库单号
     */
    @JsonProperty("receiving_code_arr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> receivingCodeArr;
    /**
     * 参考号
     */
    @JsonProperty("reference_no")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String referenceNo;
    /**
     * 多个参考号
     */
    @JsonProperty("reference_no_arr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> referenceNoArr;
    /**
     * 起始时间(创建时间,有入库单号的时候此参数失效)
     */
    @JsonProperty("create_date_from")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createDateFrom;
    /**
     * 结束时间(创建时间,有入库单号的时候此参数失效)
     */
    @JsonProperty("create_date_to")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createDateTo;
    /**
     * 起始时间(修改时间,有入库单号的时候此参数失效)
     */
    @JsonProperty("modify_date_from")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String modifyDateFrom;
    /**
     * 结束时间(修改时间,有入库单号的时候此参数失效)
     */
    @JsonProperty("modify_date_to")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String modifyDateTo;
    /**
     * 保税用户填1,其它可不填
     */
    @JsonProperty("business_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String businessType;
    /**
     * 是否返回库存批次号字段；0否，1是；默认0
     */
    @JsonProperty("is_get_inventory_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer isGetInventoryCode;
}
