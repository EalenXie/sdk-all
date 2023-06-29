alibaba-1688-sdk
===========

主要是封装了 [阿里1688电商平台](https://open.1688.com/?spm=a260s.26059361.0.0.736855edrAcLXQ) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>alibaba-1688-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

### [跨境ERP解决方案](https://open.1688.com/solution/solutionDetail.htm?spm=a260s.11247765.je8hk6gy.25.3fcd32baesEynz&solutionKey=1610440369288#apiAndMessageList)

#### [CrossBorderERPClient](https://github.com/EalenXie/sdk-all/blob/main/alibaba-1688-sdk/src/main/java/io/github/ealenxie/alibaba/CrossBorderERPClient.java) API及消息列表

| 方法名                                  | 📚 官方文档地址                                                                                                                                                                    | 状态  |
|:-------------------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| getTradeInfo                         | [订单详情查看(买家视角)](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.get.buyerView-1&aopApiCategory=trade_new)                                       | ✔️  |
| createCrossOrder                     | [跨境订单创建](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.createCrossOrder-1)                                                                   | ✔️  |
| createOrder                          | [创建订单前预览数据接口](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.createOrder.preview-1&aopApiCategory=trade_new)                                        | ✔️  |
| alipayUrlGet                         | [批量获取订单的支付链接](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.alipay.url.get-1)                                                                      | ✔️  |
| getProductInfo                       | [跨境场景获取商品详情](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.product:alibaba.cross.productInfo-1)                                                                  | ✔️  |
| syncProductListPushed                | [跨境场景下将商品加入铺货列表](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.product.push:alibaba.cross.syncProductListPushed-1)                                               | ✔️  |
| opQueryMarketingMixConfig            | [查询卖家混批设置](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.OpQueryMarketingMixConfig-1&aopApiCategory=trade_new)                               | ✔️  |
| addressCodeParse                     | [根据地址解析地区码](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.addresscode.parse-1&aopApiCategory=trade_new)                                      | ✔️  |
| memoAdd                              | [修改订单备忘](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.order.memoAdd-1&aopApiCategory=trade_new)                                                   | ✔️  |
| tradeCancel                          | [取消交易](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.cancel-1&aopApiCategory=trade_new)                                                      | ✔️  |
| getLogisticsInfos                    | [获取交易订单的物流信息(买家视角)](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.logistics:alibaba.trade.getLogisticsInfos.buyerView-1&aopApiCategory=Logistics_NEW)            | ✔️  |
| getLogisticsTraceInfo                | [获取交易订单的物流跟踪信息(买家视角)](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.logistics:alibaba.trade.getLogisticsTraceInfo.buyerView-1&aopApiCategory=Logistics_NEW)      | ✔️  |
| crossBorderPayUrlGet                 | [获取使用跨境宝支付的支付链接](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.crossBorderPay.url.get-1)                                                           | ✔️  |
| creditPayUrlGet                      | [获取使用诚e赊支付的支付链接](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.creditPay.url.get-1)                                                                | ✔️  |
| addFeedback                          | [买家补充订单留言接口](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.addFeedback-1&aopApiCategory=trade_new)                                           | ✔️  |
| opQueryBatchRefundByOrderIdAndStatus | [查询退款单详情-根据订单ID（买家视角）](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.refund.OpQueryBatchRefundByOrderIdAndStatus-1&aopApiCategory=trade_new) | ✔️  |
| agentBasic                           | [获取非授权用户的基本信息](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.account:alibaba.account.agent.basic-1&aopApiCategory=member)                                        | ✔️  |
| authAdd                              | [批量添加子账号授权](https://open.1688.com/api/apidocdetail.htm?id=system.oauth2:subaccount.auth.add-1)                                                                               | ✔️  |
| createRefund                         | [创建退款退货申请](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.createRefund-1)                                                                     | ✔️  |
| getRefundReasonList                  | [查询退款退货原因（用于创建退款退货）](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.getRefundReasonList-1)                                                    | ✔️  |
| uploadRefundVoucher                  | [上传退款退货凭证](https://open.1688.com/api/apidocdetail.htm?id=com.alibaba.trade:alibaba.trade.uploadRefundVoucher-1)                                                              | ✔️  |
