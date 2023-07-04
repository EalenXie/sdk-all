walmart-sdk
======

主要是封装了 跨境电商 [walmart 商户平台](https://developer.walmart.com/api/us/mp/orders) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>walmart-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [WalmartClient](https://github.com/EalenXie/sdk-all/blob/main/walmart-sdk/src/main/java/io/github/ealenxie/walmart/marketplace/WalmartClient.java) 已支持的接口列表

| 接口名           | 方法名         | 官方文档地址                                                                       | 状态  |
|:--------------|:------------|:-----------------------------------------------------------------------------|:----|
| 获取accessToken | accessToken | [Token API](https://developer.walmart.com/api/us/mp/auth#operation/tokenAPI) | ✔️  |

#### [WalmartOrderClient](https://github.com/EalenXie/sdk-all/blob/main/walmart-sdk/src/main/java/io/github/ealenxie/walmart/marketplace/WalmartOrderClient.java) 已支持的接口列表

| 接口名         | 方法名            | 官方文档地址                                                                                                                   | 状态  |
|:------------|:---------------|:-------------------------------------------------------------------------------------------------------------------------|:----|
| 获取订单        | orders         | [All released orders](https://developer.walmart.com/api/us/mp/orders#operation/getAllReleasedOrders)                     | ✔️  |
| 获取订单下一页     | orders         | [All released orders](https://developer.walmart.com/api/us/mp/orders#operation/getAllReleasedOrders)                     | ✔️  |
| 根据订单号获取订单详情 | order          | [An order](https://developer.walmart.com/api/us/mp/orders#operation/getAnOrder)                                          | ✔️  |
| 获取所有已下达的订单  | releasedOrders | [All released orders](https://developer.walmart.com/api/us/mp/orders#operation/getAllReleasedOrders)                     | ✔️  |
| 退款          | refund         | [Refund Order Lines](https://developer.walmart.com/api/us/mp/orders#operation/refundOrderLines)                          | ✔️  |
| 标记发货        | shipment       | [Ship Order Lines](https://developer.walmart.com/api/us/mp/orders#operation/shippingUpdates)                             | ✔️  |
| 确认订单        | acknowledge    | [Acknowledge Orders](https://developer.walmart.com/api/us/mp/orders#operation/acknowledgeOrders)                         | ✔️  |
| 取消订单        | cancel         | [Cancel Order Lines](https://developer.walmart.com/api/us/mp/orders#operation/cancelOrderLines)                          | ✔️  |
| 获取对账报告日期    | getReportDate  | [Available recon report dates](https://developer.walmart.com/api/us/mp/reports#operation/getAvailableV1ReconReportDates) | ✔️  |
| 下载结算报告(ZIP) | downloadReport | [Recon report](https://developer.walmart.com/api/us/mp/reports#operation/getReconReportV1)                               | ✔️  |
