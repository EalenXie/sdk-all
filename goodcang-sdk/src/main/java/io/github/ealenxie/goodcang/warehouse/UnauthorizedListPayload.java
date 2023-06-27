package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.PagePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 15:58
 */
@Getter
@Setter
public class UnauthorizedListPayload extends PagePayload {
    /**
     * 退件单号
     */
    @JsonProperty("asro_code")
    private String asroCode;
    /**
     * 参考号
     */
    @JsonProperty("reference_no")
    private String referenceNo;
    /**
     * 开始时间
     */
    @JsonProperty("start_time")
    private String startTime;
    /**
     * 结束时间
     */
    @JsonProperty("end_time")
    private String endTime;
    /**
     * 售后码
     */
    @JsonProperty("pas_code")
    private String pasCode;
    /**
     * 商品编码
     */
    @JsonProperty("product_sku")
    private String productSku;
    /**
     * 时间筛选类型, 默认为创建时间(售后码创建时间)
     */
    @JsonProperty("time_type")
    private Integer timeType;
}
