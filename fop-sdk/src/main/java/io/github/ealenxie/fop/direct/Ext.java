package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/25 15:15
 */
@Getter
@Setter
public class Ext {

    /**
     * 重量
     */
    @JsonProperty("weight")
    private Integer weight;

    /**
     * 长
     */
    @JsonProperty("length")
    private Integer length;

    /**
     * 宽
     */
    @JsonProperty("width")
    private Integer width;

    /**
     * 高
     */
    @JsonProperty("height")
    private Integer height;

    /**
     * 货架号
     */
    @JsonProperty("shelfNumber")
    private String shelfNumber;

    /**
     * 末端服务商单号
     */
    @JsonProperty("logisticsChannelNo")
    private String logisticsChannelNo;

    /**
     * 面单url
     */
    @JsonProperty("logisticsLabel")
    private String logisticsLabel;

    /**
     * 运输方式中文名称
     */
    @JsonProperty("logisticsProductNameCN")
    private String logisticsProductNameCN;

    /**
     * 运输方式英文名称
     */
    @JsonProperty("logisticsProductNameEN")
    private String logisticsProductNameEN;

    /**
     * 运输方式代码
     */
    @JsonProperty("logisticsProductCode")
    private String logisticsProductCode;
}
