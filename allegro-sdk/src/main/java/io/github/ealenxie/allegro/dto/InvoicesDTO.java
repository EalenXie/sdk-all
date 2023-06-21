package io.github.ealenxie.allegro.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/3/18 15:17
 */
@Getter
@Setter
public class InvoicesDTO {


    /**
     * 文件
     */
    @JsonProperty("file")
    private FileDTO file;
    /**
     * 发票号码
     */
    @JsonProperty("invoiceNumber")
    private String invoiceNumber;

}
