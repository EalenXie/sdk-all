package io.github.ealenxie.pingpong.v2.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/6/8 15:39
 * @version 1.0
 */
@Getter
@Setter
public class StoreInfoVO {

    /**
     * 平台CODE
     */
    @JsonProperty("platform")
    private String platform;
    /**
     * 客户ID
     */
    @JsonProperty("clientId")
    private String clientId;
    /**
     * 平台描述
     */
    @JsonProperty("platformDesc")
    private String platformDesc;
    /**
     * 店铺名称
     */
    @JsonProperty("storeName")
    private String storeName;
    /**
     * 店铺别名
     */
    @JsonProperty("storeAlias")
    private String storeAlias;
    /**
     * 店铺在平台的唯⼀ID
     */
    @JsonProperty("sellerId")
    private String sellerId;
    /**
     * 是否已经托管
     */
    @JsonProperty("trusteeship")
    private String trusteeship;
    /**
     * 托管接收⽅clientId
     */
    @JsonProperty("trusteeshipToClientId")
    private String trusteeshipToClientId;
    /**
     * VA信息列表
     */
    @JsonProperty("accountList")
    private List<AccountVO> accountList;
}
