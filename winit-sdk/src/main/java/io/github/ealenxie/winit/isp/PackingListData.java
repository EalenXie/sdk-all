package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/14 16:58
 */
@Getter
@Setter
public class PackingListData {

    /**
     * 装箱单号
     */
    @JsonProperty("bigPackageNo")
    private String bigPackageNo;
    /**
     * 分拣码
     */
    @JsonProperty("depotCode")
    private String depotCode;
    /**
     * 0，非混装
     * 1，混装
     */
    @JsonProperty("packageType")
    private String packageType;
    /**
     * 供应商编码
     */
    @JsonProperty("vendorCode")
    private String vendorCode;
    /**
     * 总重量
     */
    @JsonProperty("totalWeight")
    private String totalWeight;
    /**
     * 客户参考号
     */
    @JsonProperty("refNo")
    private String refNo;
}
