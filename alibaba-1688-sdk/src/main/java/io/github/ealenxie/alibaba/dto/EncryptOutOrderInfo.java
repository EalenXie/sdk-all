package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 无敌暴龙战士
 * @since 2022/12/16 9:51
 */
@Setter
@Getter
public class EncryptOutOrderInfo {
    /**
     * 批发团instanceId,从alibaba.pifatuan.product.list获取
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("encryptOrder")
    private Boolean encryptOrder;
    /**
     * 下游平台订单号
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("outPlatformOrderNo")
    private String outPlatformOrderNo;
    /**
     * 淘宝-thyny，天猫-tm，淘特-taote，阿里巴巴C2M-c2m，京东-jingdong，
     * 拼多多-pinduoduo，微信-weixin，跨境-kuajing，快手-kuaishou，有赞-youzan，
     * 抖音-douyin，寺库-siku，美团团好货-meituan，小红书-xiaohongshu，
     * 当当-dangdang，苏宁-suning，大V店-davdian，行云-xingyun，蜜芽-miya，菠萝派商城-boluo，其他-other
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("outPlatformCode")
    private String outPlatformCode;
    /**
     * 下游平台获取订单的appkey
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("outPlatformAppkey")
    private String outPlatformAppkey;
    /**
     * 淘宝oaid
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("oaid")
    private String oaid;
    /**
     * 下游平台其他扩展信息
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("outPatformExtraInfo")
    private String outPatformExtraInfo;
    /**
     * 下游加密收货人姓名
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("encryptReceiverName")
    private String encryptReceiverName;
    /**
     * 下游加密收货人电话
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("encryptReceiverMobile")
    private String encryptReceiverMobile;
    /**
     * 下游加密收货人地址
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("encryptReceiverAddress")
    private String encryptReceiverAddress;


}
