package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Invoice {
    @JsonProperty("id")
    private String id;
    /**
     * 发票号
     */
    @JsonProperty("invoiceNumber")
    private String invoiceNumber;
    /**
     * 创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("file")
    private InvoiceFile file;
    @JsonProperty("eptVerification")
    private EptVerification eptVerification;


}