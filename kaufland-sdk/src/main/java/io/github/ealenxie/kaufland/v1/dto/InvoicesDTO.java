package io.github.ealenxie.kaufland.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Real上传发票参数
 */
@Getter
@Setter
public class InvoicesDTO {

    @JsonProperty("id_order")
    private String idOrder;

    @JsonProperty("original_name")
    private String originalName = "Rechnung.pdf";

    @JsonProperty("mime_type")
    private String mimeType = "application/pdf";

    @JsonProperty("data")
    private String data;

}
