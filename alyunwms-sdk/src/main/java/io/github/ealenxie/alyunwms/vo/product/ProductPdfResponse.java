package io.github.ealenxie.alyunwms.vo.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * @author create by sch  2023/3/15 14:22
 * @version 1.0
 */
@Getter
@Setter
public class ProductPdfResponse {
    @JsonProperty("ask")
    private String ask;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private List<PdfVO> data;

    public boolean isOk() {
        return ObjectUtils.nullSafeEquals("Success", ask);
    }
}
