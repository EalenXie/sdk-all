package io.github.ealenxie.allegro.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.allegro.NamePayload;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/18 15:17
 */
@Getter
@Setter
public class InvoicesPayload {

    /**
     * 文件
     */
    @JsonProperty("file")
    private NamePayload file;
    /**
     * 发票号码
     */
    @JsonProperty("invoiceNumber")
    private String invoiceNumber;

}
