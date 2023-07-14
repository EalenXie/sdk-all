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
     * bigPackageNo
     */
    @JsonProperty("bigPackageNo")
    private String bigPackageNo;
    /**
     * depotCode
     */
    @JsonProperty("depotCode")
    private String depotCode;
    /**
     * packageType
     */
    @JsonProperty("packageType")
    private String packageType;
    /**
     * vendorCode
     */
    @JsonProperty("vendorCode")
    private String vendorCode;
    /**
     * totalWeight
     */
    @JsonProperty("totalWeight")
    private String totalWeight;
    /**
     * refNo
     */
    @JsonProperty("refNo")
    private String refNo;
}
