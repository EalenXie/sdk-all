package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/2/2 15:55
 **/
@Getter
@Setter
public class DirectForecastInfo {

    /**
     * 预计离港时间(即预计起航时间)
     * 格式：yyyy-MM-dd HH:mm:ss
     */
    @JsonProperty("preparedOffPortDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String preparedOffPortDate;
    /**
     * 预计到港时间
     * 格式：yyyy-MM-dd HH:mm:ss
     */
    @JsonProperty("preparedArrivePortDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String preparedArrivePortDate;
    /**
     * 预计送仓时间
     * 格式：yyyy-MM-dd HH:mm:ss
     */
    @JsonProperty("expectedSendWarehouseTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String expectedSendWarehouseTime;
    /**
     * 预计送仓方式：
     * 整柜 - FCL
     * 散货 - LCL
     * 快递 - Express
     */
    @JsonProperty("expectedSendWarehouseWay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String expectedSendWarehouseWay;
    /**
     * 快递公司(当预计送仓方式为[快递]时，填写,非必填)
     * UPS取值编码：UPS
     * DHL取值编码：LG_DHL
     * TNT取值编码：LG_TNT
     * FEDEX取值编码：DIRECT007
     */
    @JsonProperty("transportAgent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String transportAgent;
}

