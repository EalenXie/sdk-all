package io.github.ealenxie.transfer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/1 12:40
 */
@Getter
@Setter
public class Part {
    @JsonProperty("code")
    private String code;
    @JsonProperty("partNameCh")
    private String partNameCh;
    @JsonProperty("partNameEn")
    private String partNameEn;
    @JsonProperty("partQty")
    private String partQty;
    @JsonProperty("partImageUrl")
    private String partImageUrl;
}
