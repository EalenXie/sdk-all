package io.github.ealenxie.fop.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 修改sku图片
 */
@Setter
@Getter
public class EditPicture {

    /**
     * SKU编码
     */
    @JsonProperty("sku_code")
    private String skuCode;
    /**
     * 图片地址.(绝对地址,格式:http://host/image_path); url所对应的图片必须要属于当前用户。注：图片路径必须有效，如图片路径有问题导致下载失败会影响入库下单审核失败。
     */
    @JsonProperty("picture_url")
    private List<String> pictureUrl;
    /**
     * 客户操作帐号
     */
    @JsonProperty("customer_code")
    private String customerCode;
}
