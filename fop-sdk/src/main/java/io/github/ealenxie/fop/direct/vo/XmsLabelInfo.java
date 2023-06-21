package io.github.ealenxie.fop.direct.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 11:30
 */
@Getter
@Setter
public class XmsLabelInfo {


    @JsonProperty("label_barcode")
    private String labelBarcode;
    @JsonProperty("label_url_info")
    private LabelUrlInfo labelUrlInfo;
}
