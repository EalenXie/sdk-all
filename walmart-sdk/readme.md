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

#### [WalmartFeedClient](https://github.com/EalenXie/sdk-all/blob/main/walmart-sdk/src/main/java/io/github/ealenxie/walmart/marketplace/WalmartFeedClient.java) 已支持的接口列表

| 方法名                | 官方文档地址                                                                                              | 状态  |
|:-------------------|:----------------------------------------------------------------------------------------------------|:----|
| getFeeds           | [All feed statuses](https://developer.walmart.com/api/us/mp/feeds)                                  | ✔️  |
| getFeedItemStatus  | [Feed item status](https://developer.walmart.com/api/us/mp/feeds#operation/getFeedItemStatus)       | ✔️  |
| getFeedErrorReport | [Get Feed Error Report](https://developer.walmart.com/api/us/mp/feeds#operation/getFeedErrorReport) | ✔️  |


#### [WalmartClient](https://github.com/EalenXie/sdk-all/blob/main/walmart-sdk/src/main/java/io/github/ealenxie/walmart/marketplace/WalmartClient.java) 已支持的接口列表

| 接口名           | 方法名         | 官方文档地址                                                                       | 状态  |
|:--------------|:------------|:-----------------------------------------------------------------------------|:----|
| 获取accessToken | accessToken | [Token API](https://developer.walmart.com/api/us/mp/auth#operation/tokenAPI) | ✔️  |

#### [WalmartOrderClient](https://github.com/EalenXie/sdk-all/blob/main/walmart-sdk/src/main/java/io/github/ealenxie/walmart/marketplace/WalmartOrderClient.java) 已支持的接口列表

| 方法名                  | 官方文档地址                                                                                               | 状态  |
|:---------------------|:-----------------------------------------------------------------------------------------------------|:----|
| shipOrderLines       | [Ship Order Lines](https://developer.walmart.com/api/us/mp/orders#operation/shippingUpdates)         | ✔️  |
| refundOrderLines     | [Refund Order Lines](https://developer.walmart.com/api/us/mp/orders#operation/refundOrderLines)      | ✔️  |
| cancelOrderLines     | [Cancel Order Lines](https://developer.walmart.com/api/us/mp/orders#operation/cancelOrderLines)      | ✔️  |
| acknowledgeOrders    | [Acknowledge Orders](https://developer.walmart.com/api/us/mp/orders#operation/acknowledgeOrders)     | ✔️  |
| getAllOrders         | [All orders](https://developer.walmart.com/api/us/mp/orders#operation/getAllOrders)                  | ✔️  |
| getAnOrder           | [An order](https://developer.walmart.com/api/us/mp/orders#operation/getAnOrder)                      | ✔️  |
| getAllReleasedOrders | [All released orders](https://developer.walmart.com/api/us/mp/orders#operation/getAllReleasedOrders) | ✔️  |
