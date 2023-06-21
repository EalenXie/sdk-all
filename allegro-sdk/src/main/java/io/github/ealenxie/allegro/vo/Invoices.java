package io.github.ealenxie.allegro.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/3/18 15:05
 */
@Getter
@Setter
public class Invoices {

    /**
     * 发票集合
     */
    @JsonProperty("invoices")
    private List<Invoice> invoiceList;

    /**
     * 是否已经开票
     */
    @JsonProperty("hasExternalInvoices")
    private Boolean hasExternalInvoices;

}
