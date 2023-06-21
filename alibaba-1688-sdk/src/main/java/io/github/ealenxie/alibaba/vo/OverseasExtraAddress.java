package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/15 14:07
 */
@Setter
@Getter
public class OverseasExtraAddress {
    /**
     * 路线名称
     */
    private String channelName;
    /**
     * 路线id
     */
    private String channelId;
    /**
     * 货代公司id
     */
    private String shippingCompanyId;
    /**
     * 货代公司名称
     */
    private String shippingCompanyName;
    /**
     * 国家code
     */
    private String countryCode;
    /**
     * 国家
     */
    private String country;
    /**
     * 买家邮箱
     */
    private String email;
}
