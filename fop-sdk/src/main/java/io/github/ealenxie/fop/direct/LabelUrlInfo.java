package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/22 11:30
 */
@Getter
@Setter
public class LabelUrlInfo {
    /**
     * 面单链接(①普通客户：返回4PX标准物流链接；若需打印报关标签&配货标签，也在此链接中；即多标签合并成了一个文件，返回一个链接②特定客户且特定产品，返回物流服务商标签链接)
     */
    @JsonProperty("logistics_label")
    private String logisticsLabel;

    /**
     * 报关标签链接(暂时只支持特定客户且特定产品，单独返回需要找业务人员申请)
     */
    @JsonProperty("custom_label")
    private String customLabel;

    /**
     * 配货标签链接(暂时只支持特定客户且特定产品，单独返回需要找业务人员申请)
     */
    @JsonProperty("package_label")
    private String packageLabel;
}
