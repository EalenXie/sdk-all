package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/2/3 13:53
 **/
@Getter
@Setter
public class PackageListResponse {
    /**
     * 卖家箱号
     */
    @JsonProperty("sellerCaseNo")
    private String sellerCaseNo;
    /**
     * 预估包裹高(CM)
     */
    @JsonProperty("sellerHeight")
    private BigDecimal sellerHeight;
    /**
     * 预估包裹长(CM)
     */
    @JsonProperty("sellerLength")
    private BigDecimal sellerLength;
    /**
     * 预估包裹重量(KG)
     */
    @JsonProperty("sellerWeight")
    private BigDecimal sellerWeight;
    /**
     * 预估包裹宽(CM)
     */
    @JsonProperty("sellerWidth")
    private BigDecimal sellerWidth;
    /**
     * 包裹条码
     */
    @JsonProperty("packageNo")
    private String packageNo;
    /**
     * 第三方包裹编号
     */
    @JsonProperty("thirdPartyCaseNo")
    private String thirdPartyCaseNo;
    /**
     * 包裹状态
     * DR：草稿
     * PI：已下单
     * RE：已收货
     * IS：已验货
     * VC：核验完成
     * TS：运输中
     * UD：已卸货
     * PS：部分上架
     * SCP：已上架
     * STOP：终止
     * Lost：已丢失
     * Abnormal：异常
     */
    @JsonProperty("status")
    private String status;
    /**
     * 包裹卸货时间
     */
    @JsonProperty("unloadingTime")
    private String unloadingTime;
    /**
     * 包裹上架时间
     */
    @JsonProperty("shelvesTime")
    private String shelvesTime;
    /**
     * 实际包裹高(CM)
     */
    @JsonProperty("height")
    private BigDecimal height;
    /**
     * 实际包裹长(CM)
     */
    @JsonProperty("length")
    private BigDecimal length;
    /**
     * 实际包裹重量(KG)
     */
    @JsonProperty("weight")
    private BigDecimal weight;
    /**
     * 实际包裹宽(CM)
     */
    @JsonProperty("width")
    private BigDecimal width;
    /**
     * 包裹中的商品信息
     */
    @JsonProperty("merchandiseList")
    private List<MerchandisePayload> merchandiseList;
}

