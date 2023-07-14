package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 16:08
 * @version 1.0
 */
@Getter
@Setter
public class InboundOrderQueryParams {

    /**
     * destinationWareHouseCode
     */
    @JsonProperty("destinationWareHouseCode")
    private String destinationWareHouseCode;
    /**
     * orderType
     */
    @JsonProperty("orderType")
    private String orderType;
    /**
     * inspectionWareHouseCode
     */
    @JsonProperty("inspectionWareHouseCode")
    private String inspectionWareHouseCode;
    /**
     * orderCreateDateEnd
     */
    @JsonProperty("orderCreateDateEnd")
    private String orderCreateDateEnd;
    /**
     * orderCreateDateStart
     */
    @JsonProperty("orderCreateDateStart")
    private String orderCreateDateStart;
    /**
     * pageParams
     */
    @JsonProperty("pageParams")
    private PageParams pageParams;
    /**
     * winitProductCode
     */
    @JsonProperty("winitProductCode")
    private String winitProductCode;
}
