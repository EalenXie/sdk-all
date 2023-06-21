package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/6 10:35
 */
@Getter
@Setter
public class Address {
    /**
     * 代表所在国家/地区的二字母ISO-3166 代码
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：2
     */
    private String region;
    /**
     * 省/州/郡
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：8
     */
    private String state;
    /**
     * 城市/地区/郊/镇/村
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：32
     */
    private String city;
    /**
     * 地址第一行，具体街道、邮政信箱、公司名
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：128
     */
    private String address1;
    /**
     * 地址第二行，楼栋、单元、门牌号
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：128
     */
    private String address2;
    /**
     * 邮编
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：32
     */
    private String zipCode;

}
