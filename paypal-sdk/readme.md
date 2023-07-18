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

##### Authentication

| 方法名         | 官方文档地址                                                                  | 状态  |
|:------------|:------------------------------------------------------------------------|:----|
| accessToken | [Authentication](https://developer.paypal.com/api/rest/authentication/) | ✔️  |

##### Add Tracking

| 方法名           | 官方文档地址                                                                                                                              | 状态  |
|:--------------|:------------------------------------------------------------------------------------------------------------------------------------|:----|
| trackersBatch | [Add tracking information for multiple PayPal transactions](https://developer.paypal.com/docs/api/tracking/v1/#trackers-batch_post) | ✔️  |
| trackers      | [Add tracking information for PayPal transaction](https://developer.paypal.com/docs/api/tracking/v1/#trackers_post)                 | ✔️  |
| trackersInfo  | [List tracking information](https://developer.paypal.com/docs/api/tracking/v1/#trackers-batch_get)                                  | ✔️  |
| updateTracker | [Update or cancel tracking information for PayPal transaction](https://developer.paypal.com/docs/api/tracking/v1/#trackers_put)     | ✔️  |
| trackerInfo   | [Show tracking information](https://developer.paypal.com/docs/api/tracking/v1/#trackers_get)                                        | ✔️  |

##### Catalog Products

| 方法名           | 官方文档地址                                                                                          | 状态  |
|:--------------|:------------------------------------------------------------------------------------------------|:----|
| createProduct | [Create product](https://developer.paypal.com/docs/api/catalog-products/v1/#products_create)    | ✔️  |
| productList   | [List products](https://developer.paypal.com/docs/api/catalog-products/v1/#products_list)       | ✔️  |
| productDetail | [Show product details](https://developer.paypal.com/docs/api/catalog-products/v1/#products_get) | ✔️  |
| updateProduct | [Update product](https://developer.paypal.com/docs/api/catalog-products/v1/#products_patch)     | ✔️  |

##### Identity

| 方法名         | 官方文档地址                                                                              | 状态  |
|:------------|:------------------------------------------------------------------------------------|:----|
| getUserInfo | [Show user profile information](https://developer.paypal.com/docs/api/identity/v1/) | ✔️  |

##### Payments

| 方法名                          | 官方文档地址                                                                                                          | 状态  |
|:-----------------------------|:----------------------------------------------------------------------------------------------------------------|:----|
| showAuthorizedPaymentDetails | [Show details for authorized payment](https://developer.paypal.com/docs/api/payments/v2/#authorizations_get)    | ✔️  |
| captureAuthorizedPayment     | [Capture authorized payment](https://developer.paypal.com/docs/api/payments/v2/#authorizations_capture)         | ✔️  |
| capturedPaymentDetails       | [Show captured payment details](https://developer.paypal.com/docs/api/payments/v2/#captures_get)                | ✔️  |
| reauthorizePayment           | [Reauthorize authorized payment](https://developer.paypal.com/docs/api/payments/v2/#authorizations_reauthorize) | ✔️  |
| voidAuthorizedPayment        | [Void authorized payment](https://developer.paypal.com/docs/api/payments/v2/#authorizations_void)               | ✔️  |
| refundCapturedPayment        | [Refund captured payment](https://developer.paypal.com/docs/api/payments/v2/#captures_refund)                   | ✔️  |
| showRefundDetails            | [Show refund details](https://developer.paypal.com/docs/api/payments/v2/#refunds_get)                           | ✔️  |

##### Referenced Payouts

| 方法名                    | 官方文档地址                                                                                                                                     | 状态  |
|:-----------------------|:-------------------------------------------------------------------------------------------------------------------------------------------|:----|
| referencedPayoutsItems | [Show referenced payout item details](https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts-items_get)           | ✔️  |
| referencedPayouts      | [List items in referenced batch payout](https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts_get_batch_details) | ✔️  |


##### Subscriptions

| 方法名                | 官方文档地址                                                                                                 | 状态  |
|:-------------------|:-------------------------------------------------------------------------------------------------------|:----|
| createPlan         | [Create plan](https://developer.paypal.com/docs/api/subscriptions/v1/#plans_create)                    | ✔️  |
| getPlans           | [List plans](https://developer.paypal.com/docs/api/subscriptions/v1/#plans_list)                       | ✔️  |
| getPlanDetails     | [Show plan details](https://developer.paypal.com/docs/api/subscriptions/v1/#plans_get)                 | ✔️  |
| updatePlan         | [Update plan](https://developer.paypal.com/docs/api/subscriptions/v1/#plans_patch)                     | ✔️  |
| activatePlan       | [Activate plan](https://developer.paypal.com/docs/api/subscriptions/v1/#plans_activate)                | ✔️  |
| deactivatePlan     | [Deactivate plan](https://developer.paypal.com/docs/api/subscriptions/v1/#plans_deactivate)            | ✔️  |
| updatePricing      | [Update pricing](https://developer.paypal.com/docs/api/subscriptions/v1/#plans_update-pricing-schemes) | ✔️  |
| createSubscription | [Create subscription](https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_create)    | ✔️  |

##### Transaction Search

| 方法名          | 官方文档地址                                                                                             | 状态  |
|:-------------|:---------------------------------------------------------------------------------------------------|:----|
| transactions | [List transactions](https://developer.paypal.com/docs/api/transaction-search/v1/#transactions_get) | ✔️  |
| balances     | [List all balances](https://developer.paypal.com/docs/api/transaction-search/v1/#balances_get)     | ✔️  |

