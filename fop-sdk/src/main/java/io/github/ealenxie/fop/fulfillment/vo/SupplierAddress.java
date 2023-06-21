package io.github.ealenxie.fop.fulfillment.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月28日 0028 13 59
 */
@Getter
@Setter
public class SupplierAddress {
    /**
     * 国家;国家二字码，详细参考国际二字码。如：CN（中国）
     */
    @JsonProperty("country")
    private String country;

    /**
     * 州/省 ; 如 ：广东省
     */
    @JsonProperty("state")
    private String state;

    /**
     * 城市 ; 如 ：深圳市
     */
    @JsonProperty("city")
    private String city;

    /**
     * 区/县 ; 如 ：宝安区
     */
    @JsonProperty("district")
    private String district;

    /**
     * 邮编 ; 如 ：518000
     */
    @JsonProperty("post_code")
    private String postCode;

    /**
     * 街道/详细地址 ; 如：西乡街道西乡宝源路
     */
    @JsonProperty("street")
    private String street;

    /**
     * 门牌号; 如 ：138
     */
    @JsonProperty("house_number")
    private String houseNumber;

    /**
     * 公司; 如 ：4PX
     */
    @JsonProperty("company")
    private String company;

    /**
     * 联系人; 如 ：阿斯顿
     */
    @JsonProperty("contack_name")
    private String contackName;

    /**
     * 手机/电话; 如 ：0755-29771100
     */
    @JsonProperty("phone")
    private String phone;

    /**
     * 上门提货的时间。 *注：时间格式：传入时间值需要转换为long类型格式。
     */
    @JsonProperty("pickup_time")
    private Long pickupTime;

    /**
     * 预计送货到仓时间。*注：时间格式：传入时间值需要转换为long类型格式。
     */
    @JsonProperty("plan_arrive_time")
    private Long planArriveTime;

    /**
     * 装柜时间。*注：时间格式：传入时间值需要转换为long类型格式。
     */
    @JsonProperty("loading_time")
    private Long loadingTime;
}
