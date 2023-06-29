package io.github.ealenxie.fop.transfer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class Part {
    /**
     * 配件编码
     */
    @JsonProperty("code")
    private String code;

    /**
     * 配件中文名称
     */
    @JsonProperty("partNameCh")
    private String partNameCh;

    /**
     * 配件英文名称
     */
    @JsonProperty("partNameEn")
    private String partNameEn;

    /**
     * 配件数量
     */
    @JsonProperty("partQty")
    private String partQty;

    /**
     * 配件图片链接
     */
    @JsonProperty("partImageUrl")
    private String partImageUrl;
}
