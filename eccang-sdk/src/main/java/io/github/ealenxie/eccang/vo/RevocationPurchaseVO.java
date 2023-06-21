package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月23日 0023 16 58
 */
@Getter
@Setter
public class RevocationPurchaseVO {
    /**
     * 采购单号
     */
    @JsonProperty("poCode")
    private String poCode;

    /**
     * 采购单状态
     */
    @JsonProperty("poStatus")
    private String poStatus;

    /**
     * 撤销结果
     */
    @JsonProperty("poResult")
    private String poResult;

}
