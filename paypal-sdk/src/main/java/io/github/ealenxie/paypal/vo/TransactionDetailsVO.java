package io.github.ealenxie.paypal.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TransactionDetailsVO {

    /**
     * 一组交易明细对象。
     */
    @JsonProperty("transaction_details")
    private List<TransactionDetails> transactionDetails;

    /**
     * 商户账号。
     */
    @JsonProperty("account_number")
    private String accountNumber;

    /**
     * 上次刷新数据的日期和时间，采用Internet 日期和时间格式。
     */
    @JsonProperty("last_refreshed_datetime")
    private String lastRefreshedDatetime;

    /**
     * 交易的零相对索引。
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 以整数形式的事务总数，page以完整结果中指定的开头，而不仅仅是在此响应中。
     */
    @JsonProperty("total_items")
    private Integer totalItems;

    /**
     * 总页数，作为integer，当total_items被划分为指定的页时page_size。
     */
    @JsonProperty("total_pages")
    private Integer totalPages;

    /**
     * 一组与请求相关的HATEOAS 链接。
     * <a href="https://developer.paypal.com/api/rest/responses/#hateoas-links">https://developer.paypal.com/api/rest/responses/#hateoas-links"</a>
     */
    @JsonProperty("links")
    private List<Link> links;
}
