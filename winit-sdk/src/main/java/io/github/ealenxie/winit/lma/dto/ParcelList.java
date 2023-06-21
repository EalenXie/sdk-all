package io.github.ealenxie.winit.lma.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/4/21 14:39
 * @version 1.0
 */
@Getter
@Setter
public class ParcelList extends ParcelDTO {
    /**
     * 包裹描述
     */
    @JsonProperty("parcelDesc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String parcelDesc;
    /**
     * 包裹号
     * 唯一
     */
    @JsonProperty("parcelNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String parcelNo;
    /**
     * 商品信息列表
     */
    @JsonProperty("merchandiseList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<MerchandiseList> merchandiseList;
}
