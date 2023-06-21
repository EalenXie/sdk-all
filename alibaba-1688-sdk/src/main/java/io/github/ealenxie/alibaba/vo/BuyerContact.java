package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/15 13:55
 */
@Setter
@Getter
public class BuyerContact {
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 传真
     */
    private String fax;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 联系人在平台的IM账号
     */
    private String imInPlatform;
    /**
     * 联系人名称
     */
    private String name;
    /**
     * 联系人手机号
     */
    private String mobile;
    /**
     * 公司名称
     */
    private String companyName;
}
