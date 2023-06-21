package io.github.ealenxie.eccang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月23日 0023 17 08
 */
@Getter
@Setter
public class GetWarehouseLocationVO {

    /**
     * 库位代码
     */
    @JsonProperty("lcCode")
    private String lcCode;

    /**
     * 库位描述
     */
    @JsonProperty("lcNote")
    private String lcNote;

    /**
     * 状态：-1已废弃,0不可用,1可用
     */
    @JsonProperty("lcStatus")
    private Integer lcStatus;

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
     * 上架优先级
     */
    @JsonProperty("lcSort")
    private Integer lcSort;

    /**
     * 库位ID
     */
    @JsonProperty("lcId")
    private Integer lcId;

    /**
     * 拣货顺序
     */
    @JsonProperty("pickingSort")
    private Integer pickingSort;

    /**
     * 通道
     */
    @JsonProperty("poIntegereger")
    private Integer poIntegereger;

    /**
     * 库位锁 ：0无,1锁
     */
    @JsonProperty("lcLock")
    private Integer lcLock;

    /**
     * 冻结:0无,1冻结
     */
    @JsonProperty("lcHold")
    private Integer lcHold;

    /**
     * 分区代码
     */
    @JsonProperty("waCode")
    private String waCode;

    /**
     * 仓库分区名称
     */
    @JsonProperty("waName")
    private String waName;

    /**
     * 仓库分区英文名称
     */
    @JsonProperty("waNameEn")
    private String waNameEn;

    /**
     * 分区类型：1标准,2不良品,3退货区,4中转区
     */
    @JsonProperty("waType")
    private Integer waType;

    /**
     * 产品品类ID
     */
    @JsonProperty("pcId")
    private Integer pcId;

    /**
     * 最后更新时间
     */
    @JsonProperty("lcUpdateTime")
    private String lcUpdateTime;
}
