package io.github.ealenxie.eccang.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月23日 0023 17 03
 */
@Getter
@Setter
public class GetWarehouseLocationDTO {

    /**
     * 页码
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * 每页条数，最大1000
     */
    @JsonProperty("pageSize")
    private Integer pageSize;

    /**
     * 是否被锁 :0否，1是
     */
    @JsonProperty("lcLock")
    private Integer lcLock;

    /**
     * 是否空库位：2否，1是
     */
    @JsonProperty("lcEmpty")
    private Integer lcEmpty;

    /**
     * 冻结状态：0否，1是
     */
    @JsonProperty("lcHold")
    private Integer lcHold;

    /**
     * 库位代码模糊
     */
    @JsonProperty("lcCodeLike")
    private String lcCodeLike;

    /**
     * 库位代码可查多个，格式["A","B"]
     */
    @JsonProperty("lcCodes")
    private Object lcCodes;

    /**
     * 仓库ID
     */
    @JsonProperty("warehouseId")
    private Integer warehouseId;

    /**
     * 库位类型代码
     */
    @JsonProperty("ltCode")
    private String ltCode;

    /**
     * 分区代码
     */
    @JsonProperty("waCode")
    private String waCode;
}
