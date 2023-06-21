package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月26日 0026 10 55
 */
@Getter
@Setter
public class CeiveInfoVO {

    /**
     * 产品SKU
     */
    @JsonProperty("productSku")
    private String productSku;

    /**
     * 库位号
     */
    @JsonProperty("lcCode")
    private String lcCode;

}
