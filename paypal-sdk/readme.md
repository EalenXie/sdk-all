paypal-sdk
======

主要是封装了 跨境电商 [PayPal Developer](https://developer.paypal.com/api/rest/) 接口


<img src="https://www.paypalobjects.com/digitalassets/c/website/logo/full-text/pp_fc_hl.svg" alt="PayPal Logo" width="200">

## 快速开始

#### [Maven Central](https://mvnrepository.com/artifact/io.github.ealenxie/paypal-sdk)

引入依赖, 可在`pom.xml` 的 `<dependencies>`选项中配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>paypal-sdk</artifactId>
    <version>${latest.version}</version>
</dependency>
```

> `${latest.version}`
>
> ![](https://img.shields.io/maven-central/v/io.github.ealenxie/paypal-sdk)

## 代码示例

```java



import io.github.ealenxie.paypal.PayPalClient;
import io.github.ealenxie.paypal.authentication.PayPalAccessToken;
import io.github.ealenxie.paypal.transaction.BalancesQueryParams;
import io.github.ealenxie.paypal.transaction.BalancesResponse;

import java.util.List;

class PayPalClientTest {
    @Test
    void balances() {
        PayPalClient payPalClient = new PayPalClient();
        // 设置为正式环境
        goodCangClient.setSandBox(false);
        // 获取令牌
        String clientId = "your clientId";
        String clientSecret = "your clientSecret";
        PayPalAccessToken accessToken = payPalClient.accessToken(clientId, clientSecret);
        // Call api
        BalancesQueryParams queryParams = new BalancesQueryParams();
        queryParams.setCurrencyCode("ALL");
        BalancesResponse balances = payPalClient.balances(accessToken, queryParams);
        System.out.println(balances);
    }
}
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

##### Disputes

| 方法名                    | 官方文档地址                                                                                                                                     | 状态  |
|:-----------------------|:-------------------------------------------------------------------------------------------------------------------------------------------|:----|
| listDisputes           | [List disputes](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_list)                                                 | ✔️  |
| disputeDetails         | [Show dispute details](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_get)                                           | ✔️  |
| partiallyUpdateDispute | [Partially update dispute](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_patch)                                     | ✔️  |
| provideEvidence        | [Provide evidence](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_provide-evidence)                                  | ✔️  |
| appealDispute          | [Appeal dispute](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_appeal)                                              | ✔️  |
| acceptClaim            | [Accept claim](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_accept-claim)                                          | ✔️  |
| settleDispute          | [Settle dispute](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_adjudicate)                                          | ✔️  |
| updateDisputeStatus    | [Update dispute status](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_require-evidence)                             | ✔️  |
| escalateDispute        | [Escalate dispute to claim](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_escalate)                                 | ✔️  |
| disputesSendMessage    | [Send message about dispute to other party](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_send-message)             | ✔️  |
| disputesMakeOffer      | [Make offer to resolve dispute](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_make-offer)                           | ✔️  |
| disputesAcceptOffer    | [Accept offer to resolve dispute](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_accept-offer)                       | ✔️  |
| disputesDenyOffer      | [Deny offer to resolve dispute](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_deny-offer)                           | ✔️  |
| acknowledgeReturnItem  | [Acknowledge returned item](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_acknowledge-return-item)                  | ✔️  |
| provideSupportingInfo  | [Provide supporting information for dispute](https://developer.paypal.com/docs/api/customer-disputes/v1/#disputes_provide-supporting-info) | ✔️  |

##### Identity

| 方法名         | 官方文档地址                                                                              | 状态  |
|:------------|:------------------------------------------------------------------------------------|:----|
| getUserInfo | [Show user profile information](https://developer.paypal.com/docs/api/identity/v1/) | ✔️  |

##### Invoices

| 方法名                   | 官方文档地址                                                                                                                | 状态  |
|:----------------------|:----------------------------------------------------------------------------------------------------------------------|:----|
| createDraftInvoice    | [Create draft invoice](https://developer.paypal.com/docs/api/invoicing/v2/#invoices_create)                           | ✔️  |
| invoicesList          | [List invoices](https://developer.paypal.com/docs/api/invoicing/v2/#invoices_list)                                    | ✔️  |
| sendInvoice           | [Send invoice](https://developer.paypal.com/docs/api/invoicing/v2/#invoices_send)                                     | ✔️  |
| sendInvoiceReminder   | [Send invoice reminder](https://developer.paypal.com/docs/api/invoicing/v2/#invoices_remind)                          | ✔️  |
| cancelSentInvoice     | [Cancel sent invoice](https://developer.paypal.com/docs/api/invoicing/v2/#invoices_cancel)                            | ✔️  |
| invoicesPayments      | [Record payment for invoice](https://developer.paypal.com/docs/api/invoicing/v2/#invoices_payments)                   | ✔️  |
| deleteExternalPayment | [Delete external payment](https://developer.paypal.com/docs/api/invoicing/v2/#invoices_payments-delete)               | ✔️  |
| invoicesRefunds       | [Record refund for invoice](https://developer.paypal.com/docs/api/invoicing/v2/#invoices_refunds)                     | ✔️  |
| deleteExternalRefund  | [Delete external refund](https://developer.paypal.com/docs/api/invoicing/v2/#invoices_refunds-delete)                 | ✔️  |
| generateQrCode        | [Generate QR code](https://developer.paypal.com/docs/api/invoicing/v2/#invoices_generate-qr-code)                     | ✔️  |
| generateInvoiceNumber | [Generate invoice number](https://developer.paypal.com/docs/api/invoicing/v2/#invoicing_generate-next-invoice-number) | ✔️  |
| invoiceDetails        | [Show invoice details](https://developer.paypal.com/docs/api/invoicing/v2/#invoices_get)                              | ✔️  |
| updateInvoice         | [Fully update invoice](https://developer.paypal.com/docs/api/invoicing/v2/#invoices_update)                           | ✔️  |
| deleteInvoice         | [Delete invoice](https://developer.paypal.com/docs/api/invoicing/v2/invoices_delete)                                  | ✔️  |
| searchInvoices        | [Search for invoices](https://developer.paypal.com/docs/api/invoicing/v2/#invoices_search-invoices)                   | ✔️  |
| listTemplates         | [List templates](https://developer.paypal.com/docs/api/invoicing/v2/#templates_list)                                  | ✔️  |
| createTemplate        | [Create template](https://developer.paypal.com/docs/api/invoicing/v2/#templates_create)                               | ✔️  |
| templateDetails       | [Show template details](https://developer.paypal.com/docs/api/invoicing/v2/#templates_get)                            | ✔️  |
| updateTemplate        | [Fully update template](https://developer.paypal.com/docs/api/invoicing/v2/#templates_update)                         | ✔️  |
| deleteTemplate        | [Delete template](https://developer.paypal.com/docs/api/invoicing/v2/templates_delete)                                | ✔️  |

##### Orders

| 方法名                   | 官方文档地址                                                                                           | 状态  |
|:----------------------|:-------------------------------------------------------------------------------------------------|:----|
| createOrder           | [Create order](https://developer.paypal.com/docs/api/orders/v2/#orders_create)                   | ✔️  |
| orderDetails          | [Show order details](https://developer.paypal.com/docs/api/orders/v2/#orders_get)                | ✔️  |
| updateOrder           | [Update order](https://developer.paypal.com/docs/api/orders/v2/#orders_patch)                    | ✔️  |
| confirmOrder          | [Confirm the Order](https://developer.paypal.com/docs/api/orders/v2/#orders_confirm)             | ✔️  |
| authorizePaymentOrder | [Authorize payment for order](https://developer.paypal.com/docs/api/orders/v2/#orders_authorize) | ✔️  |
| capturePaymentOrder   | [Capture payment for order](https://developer.paypal.com/docs/api/orders/v2/#orders_capture)     | ✔️  |

##### Partner Referrals

| 方法名            | 官方文档地址                                                                                                          | 状态  |
|:---------------|:----------------------------------------------------------------------------------------------------------------|:----|
| createReferral | [Create partner referral](https://developer.paypal.com/docs/api/partner-referrals/v2/#partner-referrals_create) | ✔️  |
| getReferral    | [Show referral data](https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts-items_get) | ✔️  |

##### Payment Experience

| 方法名                     | 官方文档地址                                                                                                                             | 状态  |
|:------------------------|:-----------------------------------------------------------------------------------------------------------------------------------|:----|
| createWebProfile        | [Create web experience profile](https://developer.paypal.com/docs/api/payment-experience/v1/#web-profile_create)                   | ✔️  |
| listWebProfiles         | [List web experience profiles](https://developer.paypal.com/docs/api/payment-experience/v1/#web-profile_get-list)                  | ✔️  |
| updateWebProfile        | [Create web experience profile](https://developer.paypal.com/docs/api/payment-experience/v1/#web-profile_create)                   | ✔️  |
| partialUpdateWebProfile | [Partially update web experience profile](https://developer.paypal.com/docs/api/payment-experience/v1/#web-profile_partial-update) | ✔️  |
| getWebProfile           | [Show web experience profile details by ID](https://developer.paypal.com/docs/api/payment-experience/v1/#web-profile_get)          | ✔️  |
| deleteWebProfile        | [Delete web experience profile](https://developer.paypal.com/docs/api/payment-experience/v1/#web-profile_delete)                   | ✔️  |

##### Payment Method Tokens

| 方法名                      | 官方文档地址                                                                                                                            | 状态  |
|:-------------------------|:----------------------------------------------------------------------------------------------------------------------------------|:----|
| createPaymentToken       | [Create payment token for a given payment source](https://developer.paypal.com/docs/api/payment-tokens/v3/#payment-tokens_create) | ✔️  |
| getCustomerPaymentTokens | [List all payment tokens](https://developer.paypal.com/docs/api/payment-tokens/v3/#customer_payment-tokens_get)                   | ✔️  |
| getPaymentToken          | [Retrieve a payment token](https://developer.paypal.com/docs/api/payment-tokens/v3/#payment-tokens_get)                           | ✔️  |
| deletePaymentToken       | [Delete payment token](https://developer.paypal.com/docs/api/payment-tokens/v3/#payment-tokens_delete)                            | ✔️  |
| createSetUpToken         | [Create a setup token](https://developer.paypal.com/docs/api/payment-tokens/v3/#setup-tokens_create)                              | ✔️  |
| getSetUpToken            | [Retrieve a setup token](https://developer.paypal.com/docs/api/payment-tokens/v3/#setup-tokens_get)                               | ✔️  |

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

##### Payouts

| 方法名                       | 官方文档地址                                                                                                               | 状态  |
|:--------------------------|:---------------------------------------------------------------------------------------------------------------------|:----|
| batchCreatePayout         | [Create batch payout](https://developer.paypal.com/docs/api/payments.payouts-batch/v1/#payouts_post)                 | ✔️  |
| payoutBatchDetails        | [Show payout batch details](https://developer.paypal.com/docs/api/payments.payouts-batch/v1/#payouts_get)            | ✔️  |
| payoutItemDetails         | [Show payout item details](https://developer.paypal.com/docs/api/payments.payouts-batch/v1/#payouts-item_get)        | ✔️  |
| cancelUnclaimedPayoutItem | [Cancel unclaimed payout item](https://developer.paypal.com/docs/api/payments.payouts-batch/v1/#payouts-item_cancel) | ✔️  |

##### Referenced Payouts

| 方法名                         | 官方文档地址                                                                                                                                     | 状态  |
|:----------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------|:----|
| batchCreateReferencedPayout | [Create referenced batch payout](https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts_create_batch)             | ✔️  |
| referencedPayoutsItems      | [Show referenced payout item details](https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts-items_get)           | ✔️  |
| createReferencedPayoutItem  | [Create referenced payout item](https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts-items_create)              | ✔️  |
| referencedPayouts           | [List items in referenced batch payout](https://developer.paypal.com/docs/api/referenced-payouts/v1/#referenced-payouts_get_batch_details) | ✔️  |

##### Subscriptions

| 方法名                         | 官方文档地址                                                                                                                      | 状态  |
|:----------------------------|:----------------------------------------------------------------------------------------------------------------------------|:----|
| createPlan                  | [Create plan](https://developer.paypal.com/docs/api/subscriptions/v1/#plans_create)                                         | ✔️  |
| getPlans                    | [List plans](https://developer.paypal.com/docs/api/subscriptions/v1/#plans_list)                                            | ✔️  |
| getPlanDetails              | [Show plan details](https://developer.paypal.com/docs/api/subscriptions/v1/#plans_get)                                      | ✔️  |
| updatePlan                  | [Update plan](https://developer.paypal.com/docs/api/subscriptions/v1/#plans_patch)                                          | ✔️  |
| activatePlan                | [Activate plan](https://developer.paypal.com/docs/api/subscriptions/v1/#plans_activate)                                     | ✔️  |
| deactivatePlan              | [Deactivate plan](https://developer.paypal.com/docs/api/subscriptions/v1/#plans_deactivate)                                 | ✔️  |
| updatePricing               | [Update pricing](https://developer.paypal.com/docs/api/subscriptions/v1/#plans_update-pricing-schemes)                      | ✔️  |
| createSubscription          | [Create subscription](https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_create)                         | ✔️  |
| getSubscriptions            | [Show subscription details](https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_get)                      | ✔️  |
| updateSubscription          | [Update subscription](https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_patch)                          | ✔️  |
| reviseSubscription          | [Revise plan or quantity of subscription](https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_revise)     | ✔️  |
| suspendSubscription         | [Suspend subscription](https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_suspend)                       | ✔️  |
| cancelSubscription          | [Cancel subscription](https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_cancel)                         | ✔️  |
| activateSubscription        | [Activate subscription](https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_activate)                     | ✔️  |
| captureSubscription         | [Capture authorized payment on subscription](https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_capture) | ✔️  |
| getSubscriptionTransactions | [List transactions for subscription](https://developer.paypal.com/docs/api/subscriptions/v1/#subscriptions_transactions)    | ✔️  |

##### Transaction Search

| 方法名          | 官方文档地址                                                                                             | 状态  |
|:-------------|:---------------------------------------------------------------------------------------------------|:----|
| transactions | [List transactions](https://developer.paypal.com/docs/api/transaction-search/v1/#transactions_get) | ✔️  |
| balances     | [List all balances](https://developer.paypal.com/docs/api/transaction-search/v1/#balances_get)     | ✔️  |

##### Webhooks Management

| 方法名                       | 官方文档地址                                                                                                       | 状态  |
|:--------------------------|:-------------------------------------------------------------------------------------------------------------|:----|
| createWebhook             | [Create webhook](https://developer.paypal.com/docs/api/webhooks/v1/#webhooks_post)                           | ✔️  |
| webhookList               | [List webhooks](https://developer.paypal.com/docs/api/webhooks/v1/#webhooks_list)                            | ✔️  |
| webhookDetails            | [Show webhook details](https://developer.paypal.com/docs/api/webhooks/v1/#webhooks_get)                      | ✔️  |
| updateWebhook             | [Update webhook](https://developer.paypal.com/docs/api/webhooks/v1/#webhooks_update)                         | ✔️  |
| deleteWebhook             | [Delete webhook](https://developer.paypal.com/docs/api/webhooks/v1/#webhooks_delete)                         | ✔️  |
| eventTypesList            | [List event subscriptions for webhook](https://developer.paypal.com/docs/api/webhooks/v1/#event-types_list)  | ✔️  |
| createWebhookLookup       | [Create webhook lookup](https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-lookup_post)             | ✔️  |
| webhookLookupList         | [List webhook lookups](https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-lookup_list)              | ✔️  |
| webhookLookupDetails      | [Show webhook lookup details](https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-lookup_get)        | ✔️  |
| deleteWebhookLookup       | [Delete webhook lookup](https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-lookup_delete)           | ✔️  |
| verifyWebhookSignature    | [Verify webhook signature](https://developer.paypal.com/docs/api/webhooks/v1/#verify-webhook-signature_post) | ✔️  |
| availableEventsList       | [List available events](https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-event-types_list)        | ✔️  |
| eventNotificationsList    | [List event notifications](https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-events_list)          | ✔️  |
| eventNotificationsDetails | [Show event notification details](https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-events_get)    | ✔️  |
| resendEventNotification   | [Resend event notification](https://developer.paypal.com/docs/api/webhooks/v1/#webhooks-events_resend)       | ✔️  |
| simulateEvent             | [Simulate webhook event](https://developer.paypal.com/docs/api/webhooks/v1/#simulate-event_post)             | ✔️  |
