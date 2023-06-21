shopify-sdk
======

主要是封装了 跨境电商 [shopify 商户平台](https://shopify.dev/api) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>shopify-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [ShopifyOrderClient](https://github.com/EalenXie/sdk-all/blob/main/shopify-sdk/src/main/java/io/github/ealenxie/shopify/ShopifyOrderClient.java) 已支持的接口列表

| 接口名            | 方法名                     | 官方文档地址                                                                                                                                         | 状态  |
|:---------------|:------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------|:----|
| 获取单个订单         | getOrder                | [Order](https://shopify.dev/api/admin-rest/2022-07/resources/order#get-orders-order-id)                                                        | ✔️  |
| 获取订单           | getOrders               | [Order](https://shopify.dev/api/admin-rest/2021-10/resources/order)                                                                            | ✔️  |
| 拉取shopify下一页   | getOrders               | [Order](https://shopify.dev/api/admin-rest/2021-10/resources/order#get-orders)                                                                 | ✔️  |
| 获取订单明细详情       | getOrderTransactionById | [Order](https://shopify.dev/docs/api/admin-rest/2023-01/resources/transaction#get-orders-order-id-transactions-transaction-id)                 | ✔️  |
| 检索订单的所有订单风险列表  | getOrdersRisks          | [Order Risk](https://shopify.dev/api/admin-rest/2021-10/resources/order-risk#get-orders-order-id-risks)                                        | ✔️  |
| 获取交易流水号        | getShopifyFinance       | [Transaction](https://shopify.dev/api/admin-rest/2021-10/resources/transaction#get-orders-order-id-transactions)                               | ✔️  |
| 获取位置           | location                | [Location](https://shopify.dev/api/admin-rest/2022-07/resources/location)                                                                      | ✔️  |
| 创建发货           | fulfillment             | [Fulfillment](https://shopify.dev/api/admin-rest/2022-07/resources/fulfillment#post-fulfillments)                                              | ✔️  |
| 检索与订单关联的发货     | fulfillments            | [Fulfillment](https://shopify.dev/api/admin-rest/2022-07/resources/fulfillment#get-fulfillment-orders-fulfillment-order-id-fulfillments)       | ✔️  |
| 检索与订单关联的发货订单列表 | fulfillmentOrders       | [FulfillmentOrder](https://shopify.dev/api/admin-rest/2022-07/resources/fulfillmentorder#get-orders-order-id-fulfillment-orders)               | ✔️  |
| 运营商服务          | carrierServices         | [CarrierService](https://shopify.dev/api/admin-rest/2022-07/resources/carrierservice#get-carrier-services)                                     | ✔️  |
| 获取单个店铺的结算单     | getPayouts              | [payout](https://shopify.dev/docs/api/admin-rest/2022-07/resources/payouts)                                                                    | ✔️  |
| 获取单个结算单的明细     | getPayouts              | [payout](https://shopify.dev/docs/api/admin-rest/2023-01/resources/transactions#get-shopify-payments-balance-transactions?payout-id=623721858) | ✔️  |
 

