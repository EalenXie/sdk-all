package io.github.ealenxie.alyunwms.dto.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author create by sch  2023/3/15 13:58
 * @version 1.0
 */
@Getter
@Setter
public class ProductPdfDTO {
    /**
     * 产品明细
     */
    @JsonProperty("product_sku_arr")
    private List<ProductSkuArr> productSkuArr;
    /**
     * 字体大小, 15-50之间的数字
     */
    @JsonProperty("font_size")
    private Integer fontSize;
    /**
     * 操作类型,
     * 0：表示PDF（条形码）；
     * 1：表示PDF（二维码）；
     */
    @JsonProperty("operate_type")
    private Integer operateType;
    /**
     * 打印尺寸,
     * 1、100*100；
     * 2、100*30；
     * 3、100*60；
     * 4、50*30；
     * 5、70*30；
     * 6、A4（3）；
     * 7、A4(4)；
     * 8、90*30；
     * 9、A4（3*9new）
     * 10、A4（3*8）
     * 11、US_Letter(3)
     * 12、US_Letter(4)
     * 说明：不传，默认传1
     */
    @JsonProperty("print_size")
    private Integer printSize;
    /**
     * 打印编码,
     * 1、产品条码
     * 2、产品SKU
     * 3、自定义编码
     * 4、库内编码
     * 5、产品条码+库内编码
     */
    @JsonProperty("print_code_type")
    private String printCodeType;
    /**
     * 附加信息,
     * 1、产品名称
     * 2、客户编码
     * 3、产品条码
     * 4、产品SKU
     * 5、自定义编码
     * 6、Made in china
     * 7、日期
     * 8、分隔符
     * （支持传多个值，中间以英文逗号隔开）
     */
    @JsonProperty("extra_print_info")
    private String extraPrintInfo;
}
