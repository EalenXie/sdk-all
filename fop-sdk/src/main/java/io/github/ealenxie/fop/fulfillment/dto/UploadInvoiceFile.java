package io.github.ealenxie.fop.fulfillment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 上传箱单发票
 */
@Setter
@Getter
public class UploadInvoiceFile {
    /**
     * 入库委托单号， 多个请使用“,”逗号分开(英文)。*注：委托单号不能超过10个。
     */
    @JsonProperty("consignment_no")
    private String consignmentNo;
    /**
     * 是否整柜。可选值：Y（整柜）；N（非整柜）
     */
    @JsonProperty("cabinet_flag")
    private String cabinetFlag;
    /**
     * 箱单发票文件URL,文件URL必须有效，可支持下载。*注：只支持zip,rar格式压缩文件下载，可下载文件最大支持30MB。
     */
    @JsonProperty("invoice_file_url")
    private String invoiceFileUrl;
}
