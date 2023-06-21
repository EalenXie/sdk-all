wish-sdk
======

主要是封装了 跨境电商 [PayPal Developer](https://developer.paypal.com/api/rest/) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>paypal-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [PayPalClient](https://github.com/EalenXie/sdk-all/blob/main/paypal-sdk/src/main/java/io/github/ealenxie/paypal/PayPalClient.java) 已支持的接口列表

| 接口名                    | 方法名                          | 官方文档地址                                                                                                                                     | 状态  |
|:-----------------------|:-----------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------|:----|
| 客户端模式获取令牌              | accessToken                  | [Authentication](https://developer.paypal.com/api/rest/authentication/)                                                                    | ✔️  |
| 获取用户信息                 | getUserInfo                  | [Show user profile information](https://developer.paypal.com/docs/api/identity/v1/)                                                        | ✔️  |
| 为多个PayPal交易添加跟踪信息      | trackersBatch                | [Add tracking information for multiple PayPal transactions](https://developer.paypal.com/docs/api/tracking/v1/#trackers-batch_post)        | ✔️  |
| 添加PayPal交易跟踪信息         | trackers                     | [Add tracking information for PayPal transaction](https://developer.paypal.com/docs/api/tracking/v1/#trackers_post)                        | ✔️  |
| 跟踪信息列表                 | trackersInfo                 | [List tracking information](https://developer.paypal.com/docs/api/tracking/v1/#trackers-batch_get)                                         | ✔️  |
| 更新或取消PayPal交易的跟踪信息     | updateTracker                | [Update or cancel tracking information for PayPal transaction](https://developer.paypal.com/docs/api/tracking/v1/#trackers_put)            | ✔️  |
| 显示跟踪信息                 | trackerInfo                  | [Show tracking information](https://developer.paypal.com/docs/api/tracking/v1/#trackers_get)                                               | ✔️  |
| 创建产品                   | createProduct                | [Create product](https://developer.paypal.com/docs/api/catalog-products/v1/#products_create)                                               | ✔️  |
| 列出交易                   | transactions                 | [List transactions](https://developer.paypal.com/docs/api/transaction-search/v1/#transactions_get)                                         | ✔️  |
| 显示付款项目的详细信息            | referencedPayoutsItems       | [Show referenced payout item details](https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts-items_get)           | ✔️  |
| 列出所有余额                 | balances                     | [List all balances](https://developer.paypal.com/docs/api/transaction-search/v1/#balances_get)                                             | ✔️  |
| 列出参考批次付款中的项目           | referencedPayouts            | [List items in referenced batch payout](https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts_get_batch_details) | ✔️  |
| 显示授权付款的详细信息            | showAuthorizedPaymentDetails | [Show details for authorized payment](https://developer.paypal.com/docs/api/payments/v2/#authorizations_get)                               | ✔️  |
| 捕获授权支付                 | captureAuthorizedPayment     | [Capture authorized payment](https://developer.paypal.com/docs/api/payments/v2/#authorizations_capture)                                    | ✔️  |
| 显示捕获付款的详细信息            | capturedPaymentDetails       | [Show captured payment details](https://developer.paypal.com/docs/api/payments/v2/#captures_get)                                           | ✔️  |
| 通过ID重新授权已授权的PayPal账户支付 | reauthorizePayment           | [Reauthorize authorized payment](https://developer.paypal.com/docs/api/payments/v2/#authorizations_reauthorize)                            | ✔️  |
| 通过ID取消或取消已授权的付款        | voidAuthorizedPayment        | [Void authorized payment](https://developer.paypal.com/docs/api/payments/v2/#authorizations_void)                                          | ✔️  |
| 退还捕获的付款                | refundCapturedPayment        | [Refund captured payment](https://developer.paypal.com/docs/api/payments/v2/#captures_refund)                                              | ✔️  |
| 按ID显示退款的详细信息           | showRefundDetails            | [Show refund details](https://developer.paypal.com/docs/api/payments/v2/#refunds_get)                                                      | ✔️  |

