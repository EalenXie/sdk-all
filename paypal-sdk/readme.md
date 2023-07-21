paypal-sdk
======

主要是封装了 跨境电商 [PayPal Developer](https://developer.paypal.com/api/rest/) 接口


<img src="https://www.paypalobjects.com/digitalassets/c/website/logo/full-text/pp_fc_hl.svg" alt="PayPal Logo" width="200">

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
