package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author jadechiang
 * @since 2022/12/15 14:02
 */
@Setter
@Getter
public class NativeLogistics {
    /**
     * 详细地址
     */
    private String address;
    /**
     * 县，区
     */
    private String area;
    /**
     * 省市区编码
     */
    private String areaCode;
    /**
     * 城市
     */
    private String city;
    /**
     * 联系人姓名
     */
    private String contactPerson;
    /**
     * 传真
     */
    private String fax;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 省份
     */
    private String province;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 邮编
     */
    private String zip;
    /**
     * 运单明细
     */
    private List<LogisticsItem> logisticsItems;
    /**
     * 镇，街道地址码
     */
    private String townCode;
    /**
     * 镇，街道
     */
    private String town;
}
