package io.github.ealenxie.winit.isp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/14 16:54
 */
@Getter
@Setter
public class IspOrderPackageData {
    /**
     * 长(CM)
     */
    @JsonProperty("length")
    private String length;
    /**
     * 宽(CM)
     */
    @JsonProperty("width")
    private String width;
    /**
     * 高(CM)
     */
    @JsonProperty("height")
    private String height;
    /**
     * 总重量（KG）
     */
    @JsonProperty("weight")
    private String weight;
    /**
     * 商品列表(配货单明细)
     */
    @JsonProperty("merchandiseList")
    private List<IspOrderMerchandiseData> merchandiseList;
}
