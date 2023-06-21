package io.github.ealenxie.alibaba.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/15 14:15
 */
@Setter
@Getter
public class GetTradeInfo {

    /**
     * 站点信息，指定调用的API是属于国际站（alibaba）还是1688网站（1688）
     */
    private String webSite;
    /**
     * 交易的订单id
     */
    private Long orderId;
    /**
     * 查询结果中包含的域，GuaranteesTerms：保障条款，NativeLogistics：物流信息，RateDetail：评价详情，OrderInvoice：发票信息。默认返回GuaranteesTerms、NativeLogistics、OrderInvoice。
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String includeFields;
    /**
     * 垂直表中的attributeKeys
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String[] attributeKeys;
}
