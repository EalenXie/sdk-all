package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/15 13:55
 */
@Setter
@Getter
public class ReceiverInfo {
    /**
     * 收件人
     */
    private String toFullName;
    /**
     * 收货人地址区域编码
     */
    private String toDivisionCode;
    /**
     * 收件人移动电话
     */
    private String toMobile;
    /**
     * 收件人电话
     */
    private String toPhone;
    /**
     * 邮编
     */
    private String toPost;
    /**
     * 收货人街道或镇区域编码，可能为空
     */
    private String toTownCode;
    /**
     * 收货地址
     */
    private String toArea;
}
