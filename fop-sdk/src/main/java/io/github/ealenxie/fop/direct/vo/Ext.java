package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/25 15:15
 */
@Getter
@Setter
public class Ext {
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("length")
    private Integer length;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("shelfNumber")
    private String shelfNumber;
    @JsonProperty("logisticsChannelNo")
    private String logisticsChannelNo;
    @JsonProperty("logisticsLabel")
    private String logisticsLabel;
    @JsonProperty("logisticsProductNameCN")
    private String logisticsProductNameCN;
    @JsonProperty("logisticsProductNameEN")
    private String logisticsProductNameEN;
    @JsonProperty("logisticsProductCode")
    private String logisticsProductCode;
}
