package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 10 40
 */
@Getter
@Setter
public class ReceiveAddress {
    /**
     * 街道地址，不包括省市编码
     */
    @JsonProperty("address")
    private String address;
    /**
     * 地址区域编码
     */
    @JsonProperty("addressCode")
    private String addressCode;
    /**
     * 地址区域编码对应的文本（包括国家，省，城市）
     */
    @JsonProperty("addressCodeText")
    private String addressCodeText;
    /**
     * addressId
     */
    @JsonProperty("addressId")
    private Long addressId;
    /**
     * 记录收货地址的业务类型
     */
    @JsonProperty("bizType")
    private String bizType;
    /**
     * 是否为默认
     */
    @JsonProperty("isDefault")
    private boolean isDefault;
    /**
     * 收货人姓名
     */
    @JsonProperty("fullName")
    private String fullName;
    /**
     * 是否是最后选择的收货地址
     */
    @JsonProperty("latest")
    private boolean latest;
    /**
     * 手机号
     */
    @JsonProperty("mobile")
    private String mobile;
    /**
     * 电话
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 邮编
     */
    @JsonProperty("postCode")
    private String postCode;
}
