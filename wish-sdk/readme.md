wish-sdk
======

主要是封装了 跨境电商 [wish 商户平台](https://china-merchant.wish.com/documentation/api/v3/explorer) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>wish-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [WishClient](https://github.com/EalenXie/sdk-all/blob/main/wish-sdk/src/main/java/io/github/ealenxie/wish/WishClient.java) 已支持的接口列表

| 接口名              | 方法名          | 官方文档地址                                                                                                                 | 状态  |
|:-----------------|:-------------|:-----------------------------------------------------------------------------------------------------------------------|:----|
| 获取授权地址           | authorize    | [Authorization URL](https://china-merchant.wish.com/documentation/api/v3/reference#section/Authentication)             | ✔️  |
| 授权码模式accessToken | accessToken  | [Retrieve an access token](https://china-merchant.wish.com/documentation/api/v3/reference#section/Authentication)      | ✔️  |
| 刷新授权             | refreshToken | [Obtain a new token](https://www.merchant.wish.com/documentation/api/v3/reference#operation/oauthRefreshToken)         | ✔️  |
| 验证令牌是否有效         | oauthTest    | [Test if an access token is valid](https://china-merchant.wish.com/documentation/api/v3/reference#operation/oauthTest) | ✔️  |

#### [WishOrderClient](https://github.com/EalenXie/sdk-all/blob/main/wish-sdk/src/main/java/io/github/ealenxie/wish/WishOrderClient.java) 已支持的接口列表

| 接口名       | 方法名                 | 官方文档地址                                                                                                                                 | 状态  |
|:----------|:--------------------|:---------------------------------------------------------------------------------------------------------------------------------------|:----|
| 获取订单详情    | getOrder            | [Get an order](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetOrder)                                      | ✔️  |
| 获取订单列表    | getOrders           | [List orders](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetMultipleOrders)                              | ✔️  |
| 获取货运公司    | shippingCarriers    | [Get accepted shipping carriers](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetShippingCarriers)         | ✔️  |
| 批量获取订单下载  | batchDownloadOrders | [Batch download orders](https://china-merchant.wish.com/documentation/api/v3/reference#operation/downloadOrders)                       | ✔️  |
| 发货或更新跟踪订单 | shipOrder           | [Ship or update tracking](https://china-merchant.wish.com/documentation/api/v3/reference#operation/ShipOrder)                          | ✔️  |
| 获取退货原因    | refundReasons       | [Get valid refund reasons](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetValidRefundReasons)             | ✔️  |
| 取消订单      | refund              | [Refund/Cancel an order](https://china-merchant.wish.com/documentation/api/v3/reference#operation/RefundOrder)                         | ✔️  |
| 更新订单      | updateLTLOrder      | [Update an LTL order](https://china-merchant.wish.com/documentation/api/v3/reference#operation/UpdateOrder)                            | ✔️  |
| 修改物流地址    | modifyAddress       | [Modify shipping address](https://china-merchant.wish.com/documentation/api/v3/reference#operation/ModifyAddress)                      | ✔️  |
| 修改物流地址    | brands              | [Get a list of brands from a particular ID range](https://china-merchant.wish.com/documentation/api/v3/reference#tag/Brands)           | ✔️  |
| 异步获取产品任务  | getProductsJobs     | [Get products](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getProducts)                                   | ✔️  |
| 获取产品任务状态  | getProductsJob      | [Get the update products job status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getUpdateProductsStatus) | ✔️  |
