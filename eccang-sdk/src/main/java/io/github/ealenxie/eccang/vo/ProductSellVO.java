package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/13 9:39
 */
@Getter
@Setter
public class ProductSellVO {
    /**
     * 销售状态id
     */
    @JsonProperty("ps_id")
    private String psId;
    /**
     * 产品销售状态名称
     */
    @JsonProperty("ps_name")
    private String psName;

}
