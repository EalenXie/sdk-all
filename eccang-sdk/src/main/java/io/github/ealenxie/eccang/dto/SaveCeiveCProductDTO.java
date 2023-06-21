package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月26日 0026 11 04
 */
@Getter
@Setter
public class SaveCeiveCProductDTO {
    /**
     * 产品代码
     */
    @JsonProperty("productSku")
    private String productSku;

    /**
     * 产品数量
     */
    @JsonProperty("qty")
    private Integer qty;

    /**
     * 备注
     */
    @JsonProperty("cudNote")
    private String cudNote;

    /**
     * 入库单号 ceiveType=15时传入
     */
    @JsonProperty("receivingCode")
    private String receivingCode;

}
