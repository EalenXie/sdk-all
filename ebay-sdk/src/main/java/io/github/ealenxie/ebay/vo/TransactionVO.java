package io.github.ealenxie.ebay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by EalenXie on 2022/5/31 10:30
 */
@Getter
@Setter
public class TransactionVO {

    @JsonProperty("href")
    private String href;
    @JsonProperty("next")
    private String next;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("transactions")
    private List<Transaction> transactions;
    @JsonProperty("total")
    private Integer total;
}
