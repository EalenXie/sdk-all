package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2023/3/17 13:11
 */
@Getter
@Setter
public class GetWarehouse {
    /**
     * 仓库代码["code1","code2"]
     */
    private List<String> warehouseCodeList;
    /**
     * 是否支持分销，
     * 0不支持，
     * 1 支持
     */
    @JsonProperty("is_shared_product")
    private Integer isSharedProduct;
    /**
     * 是否为易销宝仓库，
     * 0否
     * ，1是
     */
    @JsonProperty("is_ecb_warehouse")
    private Integer isEcbWarehouse;
    /**
     * 用户中心ID，用户获取绑定用户的仓库
     */
    @JsonProperty("user_center_id")
    private Integer userCenterId;
}
