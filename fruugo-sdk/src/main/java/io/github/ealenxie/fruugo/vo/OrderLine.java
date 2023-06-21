package io.github.ealenxie.fruugo.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/08/10 12:27
 */
@Getter
@Setter
public class OrderLine {
    /**
     * 产品 ID
     */
    private String productId;
    /**
     * skuId
     */
    private String skuId;
    /**
     * sku名称
     */
    private String skuName;
    /**
     * Fruugo 的内部产品ID
     */
    private String fruugoProductId;
    /**
     * Fruugo 的内部 Sku id
     */
    private String fruugoSkuId;
    /**
     * 货币代码
     */
    private String currencyCode;
    /**
     * 商品价格(含增值锐)
     */
    private String itemPriceInclVat;
    /**
     * 增值锐
     */
    private String itemVat;
    /**
     * 总价(含增值锐)
     */
    private String totalPriceInclVat;
    /**
     * 总增值锐
     */
    private String totalVat;
    /**
     * customer
     */
    private Customer customer;
    /**
     * 向客户收取的增值税百分比
     */
    private String vatPercentage;
    /**
     * 此Sku的订购商品总数
     */
    private String totalNumberOfItems;
    /**
     * 待处理的项目数
     */
    private String pendingItems;
    /**
     * 确认的项目数
     */
    private String confirmedItems;
    /**
     * 运送的物品数量
     */
    private String shippedItems;
    /**
     * 取消项目的数量
     */
    private String cancelledItems;
    /**
     * 客户将退回的商品数量
     */
    private String returnAnnouncedItems;
    /**
     * 客户退回的商品数量
     */
    private String returnedItems;
    /**
     * 处于错误状态或已手动更正的项目数
     */
    private String itemsWithException;
}
