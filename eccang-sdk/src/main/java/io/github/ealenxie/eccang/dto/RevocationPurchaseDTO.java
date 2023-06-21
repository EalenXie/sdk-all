package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhs
 * @since 2022年12月23日 0023 16 56
 */
@Getter
@Setter
public class RevocationPurchaseDTO {
    /**
     * 采购单号：["PO66242104060011","PO6624210406001"]
     */
    @JsonProperty("poCode")
    private List<String> poCode;

    /**
     * 备注消息
     */
    @JsonProperty("poNote")
    private String poNote;

    /**
     * 0:撤销未审核 1：撤销在途
     */
    @JsonProperty("type")
    private Integer type;

}
