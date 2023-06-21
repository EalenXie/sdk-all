package io.github.ealenxie.alyunwms.dto.asn;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/2/24 16:10
 * @version 1.0
 */
@Getter
@Setter
public class GetPdfDTO {

    /**
     * 入库单号
     */
    @JsonProperty("receiving_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String receivingCode;
    /**
     * list清单, box箱唛, box-qr热敏纸(100x100) 箱唛
     */
    @JsonProperty("pdf_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pdfType;

    /**
     * pdf_type等于list可选值:A4、216*279、A4-SKU;
     */
    @JsonProperty("pdf_size")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pdfSize;
    /**
     * 箱唛要显示SKU条形码时传1,
     * pdf_size传以下值时该参数有效:
     * 100*100-WPT
     * 100*150-WPT
     * 100*100-PT
     * 100*150-PT
     * A4-SKU
     */
    @JsonProperty("sku_barcode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer skuBarcode;
    /**
     * 箱唛显示报关类型和目的仓名称时传1,
     * pdf_size传以下值时该参数有效:
     * 100*100-WPT
     * 100*150-WPT
     * 100*100-PT
     * 100*150-PT
     */
    @JsonProperty("warehouse_show")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer warehouseShow;
    /**
     * PDF返回类型，可选值 url、base64，默认为 base64
     */
    @JsonProperty("content_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String contentType;
    /**
     * 是否显示 made in china；0：不显示，1：显示
     * pdf_size传以下值时该参数有效:
     * 100*100-WPT(代表100*100(无产品名称))
     * 100*150-WPT(代表100*150(无产品名称))
     * 100*100-PT(代表100*100(有产品名称))
     * 100*150-PT(代表100*150(有产品名称))
     * 100*100-QC(代表100*100(二维码))
     */
    @JsonProperty("made_in_china")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer madeInChina;
}
