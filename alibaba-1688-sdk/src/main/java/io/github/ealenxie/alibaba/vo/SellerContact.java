package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/15 13:54
 */
@Setter
@Getter
public class SellerContact {
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
    /**
     * 发件人名称，在微供等分销场景下由分销商设置
     */
    private String wgSenderName;
    /**
     * 发件人电话，在微供等分销场景下由分销商设置
     */
    private String wgSenderPhone;
}
