package io.github.ealenxie.winit.oswh.inbound.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/2/2 15:35
 **/
@Getter
@Setter
public class PackageListDTO {
    /**
     * 卖家箱号 必填
     */
    @JsonProperty("sellerCaseNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sellerCaseNo;
    /**
     * 自定义包裹编号（第三方箱号）
     * 注意：贴在实物包裹上的非Winit箱号，需全局唯一性，保证海外仓可扫描识别。
     */
    @JsonProperty("thirdPartyCaseNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String thirdPartyCaseNo;
    /**
     * 包裹高(CM)
     */
    @JsonProperty("sellerHeight")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sellerHeight;
    /**
     * 包裹长(CM)
     */
    @JsonProperty("sellerLength")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sellerLength;
    /**
     * 包裹宽(CM)
     */
    @JsonProperty("sellerWidth")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sellerWidth;
    /**
     * 包裹重量(KG)
     */
    @JsonProperty("sellerWeight")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sellerWeight;
    /**
     * 包裹中的商品信息
     */
    @JsonProperty("merchandiseList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<MerchandiseListDTO> merchandiseList;
}

