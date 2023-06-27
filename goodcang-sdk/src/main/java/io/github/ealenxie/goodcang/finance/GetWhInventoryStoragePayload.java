package io.github.ealenxie.goodcang.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.goodcang.PagePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/27 11:18
 */
@Getter
@Setter
public class GetWhInventoryStoragePayload extends PagePayload {

    /**
     * 单号
     */
    @JsonProperty("wis_code")
    private String wisCode;
    /**
     * 仓库代码
     */
    @JsonProperty("ow_id_charge")
    private String owIdCharge;
    /**
     * 开始时间
     */
    @JsonProperty("dateFrom")
    private String dateFrom;
    /**
     * 截至时间
     */
    @JsonProperty("dateTo")
    private String dateTo;

}
