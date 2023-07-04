package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/3/25 17:40
 * @version 1.0
 */
@Getter
@Setter
public class PackageNoPayload {
    /**
     * 包裹条码
     */
    @JsonProperty("packageNo")
    private String packageNo;
    /**
     * 卖家箱单号
     */
    @JsonProperty("sellerCaseNo")
    private String sellerCaseNo;
}
