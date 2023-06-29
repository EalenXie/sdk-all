package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 11:30
 */
@Getter
@Setter
public class XmsLabelInfo {

    /**
     * 面单条码(①普通客户返回面单号(可能是4PX单号，也可能是服务商单号)；②特定客户且特定产品，直接返回物流服务商单号)
     */
    @JsonProperty("label_barcode")
    private String labelBarcode;

    /**
     * 标签链接信息
     */
    @JsonProperty("label_url_info")
    private LabelUrlInfo labelUrlInfo;
}
