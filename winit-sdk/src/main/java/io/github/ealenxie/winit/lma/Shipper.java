package io.github.ealenxie.winit.lma;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/4/21 14:39
 * @version 1.0
 */
@Getter
@Setter
public class Shipper {
    /**
     * 虚拟仓库编码
     */
    @JsonProperty("pickupAddressCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pickupAddressCode;
    /**
     * IOSS
     */
    @JsonProperty("iossNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String iossNo;
    /**
     * 发件人VAT
     */
    @JsonProperty("senderVat")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String senderVat;
    /**
     * 发件人EORI
     */
    @JsonProperty("senderEori")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String senderEori;
}
