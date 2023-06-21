package io.github.ealenxie.kaufland.v2.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/10/31 13:53
 */
@Getter
@Setter
public class UploadInvoiceDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("original_name")
    private String originalName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mime_type")
    private String mimeType = "application/pdf";

    private String data;
}
