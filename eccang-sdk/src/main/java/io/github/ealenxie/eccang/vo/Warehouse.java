package io.github.ealenxie.eccang.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/3/17 13:04
 */
@Getter
@Setter
public class Warehouse {
    /**
     * 仓库ID
     */
    private String warehouseId;
    /**
     * 仓库代码
     */
    private String warehouseCode;
    /**
     * 仓库名称
     */
    private String warehouseDesc;
    /**
     * 仓库类型：0 标准，1中转
     */
    private Integer warehouseType;
    /**
     * 状态：
     * -1已废弃,
     * 0不可用,
     * 1可用
     */
    private Integer warehouseStatus;
    /**
     * 运营方式：
     * 0 自营,
     * 1 第三方
     */
    private Integer warehouseVirtual;
    /**
     * 第三方仓储服务
     */
    private String warehouseService;
    /**
     * 是否需要头程（应用于库存成本是否包含头程费用）:
     * 0 否,
     * 1是
     */
    private Integer isTransfer;
    /**
     * 国家二字码
     */
    private String countryCode;
    /**
     * 国家ID
     */
    private Integer countryId;
    /**
     * 省份
     */
    private String state;
    /**
     * 城市
     */
    private String city;
    /**
     * 联系人
     */
    private String contacter;
    /**
     * 公司名称
     */
    private String company;
    /**
     * 电话
     */
    private String phoneNo;
    /**
     * 地址1
     */
    private String streetAddress1;
    /**
     * 地址2
     */
    private String streetAddress2;
    /**
     * 邮编
     */
    private String postcode;
    /**
     * 门牌号
     */
    private String streetNumber;

    /**
     * 添加时间
     */
    private String warehouseAddTime;
    /**
     * 最后更新时间
     */
    private String warehouseUpdateTime;

}
