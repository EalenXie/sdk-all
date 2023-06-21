ebay-sdk
======

主要是封装了 跨境电商 [ebay 商户平台](https://developer.ebay.com/api-docs) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>ebay-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### 已支持的接口列表

| 接口名    | 方法名                | 官方文档地址                                                                                                                                  | 状态  |
|:-------|:-------------------|:----------------------------------------------------------------------------------------------------------------------------------------|:----|
| 获取访问令牌 | accessToken        | [The client credentials grant flow](https://developer.ebay.com/api-docs/static/oauth-client-credentials-grant.html)                     | ✔️  |
| 查询交易   | transaction        | [getTransactions](https://developer.ebay.com/api-docs/sell/finances/resources/transaction/methods/getTransactions)                      | ✔️  |
| 查询支出   | payout             | [getPayout](https://developer.ebay.com/api-docs/sell/finances/resources/payout/methods/getPayout)                                       | ✔️  |
| 查询支出   | payouts            | [getPayouts](https://developer.ebay.com/api-docs/sell/finances/resources/payout/methods/getPayouts)                                     | ✔️  |
| 资金查询   | sellerFundsSummary | [getSellerFundsSummary](https://developer.ebay.com/api-docs/sell/finances/resources/seller_funds_summary/methods/getSellerFundsSummary) | ✔️  |
| 查询订单   | orders             | [getOrders](https://developer.ebay.com/api-docs/sell/fulfillment/resources/order/methods/getOrders)                                     | ✔️  |
| 查询订单   | order              | [getOrder](https://developer.ebay.com/api-docs/sell/fulfillment/resources/order/methods/getOrder)                                       | ✔️  |
