package io.github.ealenxie.pingpong.v1.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/30 10:34
 */
@Getter
@Setter
public class StoreInfo {
    /**
     * 店铺ID列表
     */
    @JsonProperty("account_id_list")
    private List<String> accountIdList;
    /**
     * 店铺名
     */
    @JsonProperty("store_name")
    private String storeName;
    /**
     * 店铺别名
     */
    @JsonProperty("alias_name")
    private String aliasName;
    /**
     * 店铺所属平台
     */
    @JsonProperty("platform")
    private String platform;
    /**
     * 店铺在第三方的id
     */
    @JsonProperty("seller_id")
    private String sellerId;
}
