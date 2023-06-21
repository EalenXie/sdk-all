package io.github.ealenxie.armlogi.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/4/7 11:15
 **/
@Getter
@Setter
public class Warehouse {
    /**
     * 城市
     */
    private String city;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 联系人
     */
    private String contactor;
    /**
     * 国家二字码
     */
    private String countryCode;
    /**
     * 所属国家ID
     */
    private Integer countryId;
    /**
     * 区/县
     */
    private String county;
    /**
     * 邮箱
     */
    private String mail;
    /**
     * 联系电话
     */
    private String phoneNo;
    /**
     * 邮编
     */
    private String postCode;
    /**
     * 省/州
     */
    private String state;
    /**
     * 联系地址1
     */
    private String streetAddress1;
    /**
     * 联系地址2
     */
    private String streetAddress2;
    /**
     * 门牌号
     */
    private String streetNumber;
    /**
     * 系统时区
     */
    private String systemTimezone;
    /**
     * 时差,如美国仓-8
     */
    private Integer timeDifference;
    /**
     * 体积单位
     */
    private String volumeUnit;
    /**
     * 仓库代码
     */
    private String warehouseCode;
    /**
     * 仓库描述
     */
    private String warehouseDesc;
    /**
     * 仓库截单时间
     */
    private String warehouseLocalTime;
    /**
     * 仓库时区
     */
    private String warehouseTimezone;
    /**
     * 类型：0:标准,1:中转,2:退件
     */
    private Integer warehouseType;
    /**
     * 重量单位
     */
    private String weightUnit;
}

