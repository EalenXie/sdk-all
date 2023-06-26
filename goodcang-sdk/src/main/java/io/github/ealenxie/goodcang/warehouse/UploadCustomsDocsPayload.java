package io.github.ealenxie.goodcang.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/6/26 13:22
 */
@Getter
@Setter
public class UploadCustomsDocsPayload {

    /**
     * 入库单号
     */
    @JsonProperty("inbound_order_code")
    private String inboundOrderCode;
    /**
     * 文件地址
     */
    @JsonProperty("doc_url")
    private String docUrl;
    /**
     * 文件后缀名
     */
    @JsonProperty("ext")
    private String ext;
}
