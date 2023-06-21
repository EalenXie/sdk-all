package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月23日 0023 16 09
 */
@Getter
@Setter
public class VerifyPurchaseDTO {
    /**
     * 采购单号：["PO66242104060011","PO6624210406001"]
     */
    @JsonProperty("poCode")
    private Object poCode;

    /**
     * verify 0：不通过，1：通过
     */
    @JsonProperty("verify")
    private Integer verify;

    /**
     * 备注消息 verify = 0时 审核备注必填
     */
    @JsonProperty("note")
    private String note;

    /**
     * 兼容参数，1：twrok调用。默认不填
     */
    @JsonProperty("type")
    private Integer type;

    /**
     * 审核人id
     */
    @JsonProperty("verifyUserId")
    private Integer verifyUserId;
}
