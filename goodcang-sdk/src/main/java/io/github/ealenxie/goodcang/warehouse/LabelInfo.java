package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/8/18 17:16
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LabelInfo {

    /**
     * 面单格式
     */
    @JsonProperty("label_image_type")
    private Integer labelImageType;
    /**
     * 面单URL数组
     */
    @JsonProperty("label_url_list")
    private List<String> labelUrlList;

    /**
     * 附件ID列表
     */
    @JsonProperty("label_id_list")
    private List<Integer> labelIdList;
}
