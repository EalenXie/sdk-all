package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2023/3/25 15:00
 */
@Getter
@Setter
public class PcsOutboundFpxTrackingNo {

    /**
     * 一段包裹4px单号
     */
    private String fpxTrackingNo;

    /**
     * 包裹申报价值
     */
    private Double parcelValue;

    /**
     * 包裹申报价值币种
     */
    private String currency;

    /**
     * 商品信息列表
     */
    @JsonProperty("goodsList")
    private List<Goods> goodsList;


}
