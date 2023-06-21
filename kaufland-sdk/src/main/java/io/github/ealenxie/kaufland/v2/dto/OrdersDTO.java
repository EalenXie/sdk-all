package io.github.ealenxie.kaufland.v2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/11/15 13:26
 */
@Getter
@Setter
public class OrdersDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String limit;
    /**
     * 时间不建议使用
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ts_created_from_iso")
    private String tsCreatedFromIso;
    /**
     * 时间不建议使用
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ts_updated_from_iso")
    private String tsUpdatedFromIso;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String offset;
    /**
     * cancelled,
     * need_to_be_sent,
     * open, received,
     * returned,
     * returned_paid,
     * sent,
     * sent_and_autopaid
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
    /**
     * 新版使用
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sort;

}
