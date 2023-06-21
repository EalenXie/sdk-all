package io.github.ealenxie.goodcang.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/8/18 17:16
 */
@Getter
@Setter
@AllArgsConstructor
public class LabelInfo {
    @JsonProperty("label_image_type")
    private Integer labelImageType;
    @JsonProperty("label_url_list")
    private List<String> labelUrlList;
}
