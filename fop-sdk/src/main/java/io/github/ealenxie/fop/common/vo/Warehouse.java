package io.github.ealenxie.fop.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月27日 0027 09 52
 */
@Getter
@Setter
public class Warehouse {
    /**
     * 仓库代码
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;

    /**
     * 仓库中文名称
     */
    @JsonProperty("warehouse_name_cn")
    private String warehouseNameCn;

    /**
     * 仓库英文名称
     */
    @JsonProperty("warehouse_name_en")
    private String warehouseNameEn;

    /**
     * 国家二字码
     */
    @JsonProperty("country")
    private String country;

    /**
     * 业务类型，多个使用英文逗号隔开
     */
    @JsonProperty("service_code")
    private String serviceCode;
}
