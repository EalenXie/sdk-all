Allegro
===========
<p>Allegro波兰电商平台是东欧最大拍卖网站.成立于1999年，于2020年在华沙证券交易所(WSE)上市。作为波兰认知度最高的品牌之Allegro是波兰最受欢迎的在线购物平台，同时也是波兰本土最大电商平台。Allegro目前主要面向消费者，但现已开通面向所有欧盟消费者的销售业务，并将持续扩张中东欧市场。平台以超高的月访问量跻身全球十大电商平台排名，是欧洲市场主要的蓝海平台之一。</p>

Allegro开发平台: https://developer.allegro.pl/documentation/

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>allegro-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [AllegroClient](https://github.com/EalenXie/sdk-all/blob/main/allegro-sdk/src/main/java/io/github/ealenxie/allegro/AllegroClient.java) 已支持的接口列表

| 方法名          | 📚 官方文档地址                                                                                                           | 状态  |
|:-------------|:--------------------------------------------------------------------------------------------------------------------|:----|
| authorize    | [Autoryzacja użytkownika](https://developer.allegro.pl/auth/#autoryzacja-u%c5%bcytkownika)                          | ✔️  |
| accessToken  | [Autoryzacja użytkownika](https://developer.allegro.pl/auth/#autoryzacja-u%c5%bcytkownika)                          | ✔️  |
| refreshToken | [Przedłużenie ważności tokena](https://developer.allegro.pl/auth/#przed%c5%82u%c5%bcenie-wa%c5%bcno%c5%9bci-tokena) | ✔️  |


### OFFER

#### User's offer information

| 方法名           | 📚 官方文档地址                                                                                                                                        | 状态  |
|:--------------|:-------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| searchOffers  | [Get seller's offers](https://developer.allegro.pl/documentation/#operation/searchOffersUsingGET)                                                | ✔️  |
| ~~getOffer~~  | ~~[Get all fields of the particular offer](https://developer.allegro.pl/documentation/#operation/getOfferUsingGET)~~                             | ✔️  |
| getSmartOffer | [Get Smart! classification report of the particular offer](https://developer.allegro.pl/documentation/#operation/getOfferSmartClassificationGET) | ✔️  |


### ORDERS

[AllegroOrderClient](https://github.com/EalenXie/sdk-all/blob/main/allegro-sdk/src/main/java/io/github/ealenxie/allegro/AllegroOrdersClient.java)
已支持的接口列表

#### Order Management

| 方法名                 | 📚 官方文档地址                                                                                                                    | 状态  |
|:--------------------|:-----------------------------------------------------------------------------------------------------------------------------|:----|
| events              | [Get order events](https://developer.allegro.pl/documentation/#operation/getOrderEventsUsingGET)                             | ✔️  |
| eventStats          | [Get order events statistics](https://developer.allegro.pl/documentation/#operation/getOrderEventsStatisticsUsingGET)        | ✔️  |
| userOrders          | [Get the user's orders](https://developer.allegro.pl/documentation/#operation/getListOfOrdersUsingGET)                       | ✔️  |
| ordersDetails       | [Get an order's details](https://developer.allegro.pl/documentation/#operation/getOrdersDetailsUsingGET)                     | ✔️  |
| orderCarriers       | [Get a list of available shipping carriers](https://developer.allegro.pl/documentation/#operation/getOrdersCarriersUsingGET) | ✔️  |
| getShipment         | [Get a list of parcel tracking numbers](https://developer.allegro.pl/documentation/#operation/getOrderShipmentsUsingGET)     | ✔️  |
| shipments           | [Add a parcel tracking number](https://developer.allegro.pl/documentation/#operation/createOrderShipmentsUsingPOST)          | ✔️  |
| fulfillment         | [Set seller order status](https://developer.allegro.pl/documentation/#operation/setOrderFulfillmentUsingPUT)                 | ✔️  |
| invoices            | [Get order invoices details](https://developer.allegro.pl/documentation/#operation/getOrderInvoicesDetails)                  | ✔️  |
| newInvoice          | [Post new invoice](https://developer.allegro.pl/documentation/#operation/addOrderInvoicesMetadata)                           | ✔️  |
| uploadInvoiceFile   | [Upload invoice file](https://developer.allegro.pl/documentation/#operation/uploadOrderInvoiceFile)                          | ✔️  |
| orderCarriersPoints | [Get Allegro pickup drop off points](https://developer.allegro.pl/documentation/#operation/getAllegroPickupDropOffPointsGET) | ✔️  |
| carriersTracking    | [Get carrier parcel tracking history](https://developer.allegro.pl/documentation/#operation/getParcelTrackingUsingGET)       | ✔️  |

#### Payments

| 方法名                 | 📚 官方文档地址                                                                                                      | 状态  |
|:--------------------|:---------------------------------------------------------------------------------------------------------------|:----|
| paymentOperations   | [Payment operations history](https://developer.allegro.pl/documentation#operation/getPaymentsOperationHistory) | ✔️  |
| initiateRefund      | [Initiate a refund of a payment](https://developer.allegro.pl/documentation/#operation/initiateRefund)         | ✔️  |
| getRefundedPayments | [Get a list of refunded payments](https://developer.allegro.pl/documentation/#operation/getRefundedPayments)   | ✔️  |

#### Disputes

| 方法名                     | 📚 官方文档地址                                                                                                                    | 状态  |
|:------------------------|:-----------------------------------------------------------------------------------------------------------------------------|:----|
| disputes                | [Get the user's disputes](https://developer.allegro.pl/documentation/#tag/getListOfDisputesUsingGET)                         | ✔️  |
| dispute                 | [Get a single dispute](https://developer.allegro.pl/documentation/#tag/getDisputeUsingGET)                                   | ✔️  |
| getDisputeMessages      | [Get the messages within a dispute](https://developer.allegro.pl/documentation/#operation/getMessagesFromDisputeUsingGET)    | ✔️  |
| addMessageToDispute     | [Add a message to a dispute](https://developer.allegro.pl/documentation/#operation/addMessageToDisputeUsingPOST)             | ✔️  |
| createAnAttachment      | [Create an attachment declaration](https://developer.allegro.pl/documentation/#operation/createAnAttachmentUsingPOST)        | ✔️  |
| uploadDisputeAttachment | [Upload a dispute message attachment](https://developer.allegro.pl/documentation/#operation/uploadDisputeAttachmentUsingPUT) | ✔️  |
| getAttachment           | [Get an attachment](https://developer.allegro.pl/documentation/#operation/getAttachmentUsingGET)                             | ✔️  |

#### Parcel Management

| 方法名                           | 📚 官方文档地址                                                                                                                | 状态  |
|:------------------------------|:-------------------------------------------------------------------------------------------------------------------------|:----|
| getAvailableDeliveryServices  | [Get available delivery services](https://developer.allegro.pl/documentation/#operation/getAvailableDeliveryServices)    | ✔️  |
| createNewParcel               | [Create a new parcel](https://developer.allegro.pl/documentation/#operation/createNewParcel)                             | ✔️  |
| getParcelCreationStatus       | [Get parcel creation status](https://developer.allegro.pl/documentation/#operation/getParcelCreationStatus)              | ✔️  |
| getParcelDetails              | [Get parcel details](https://developer.allegro.pl/documentation/#operation/getParcelDetails)                             | ✔️  |
| getParcelsPickupDateProposals | [Get parcels pickup date proposals](https://developer.allegro.pl/documentation/#operation/getParcelsPickupDateProposals) | ✔️  |
| requestParcelPickup           | [Request parcel pickup](https://developer.allegro.pl/documentation/#operation/requestParcelPickup)                       | ✔️  |
| getParcelPickupStatus         | [Get parcel pickup status](https://developer.allegro.pl/documentation/#operation/getParcelPickupStatus)                  | ✔️  |
| getParcelLabel                | [Get parcel label](https://developer.allegro.pl/documentation/#operation/getParcelLabel)                                 | ✔️  |
| getParcelsProtocol            | [Get parcels protocol](https://developer.allegro.pl/documentation/#operation/getParcelsProtocol)                         | ✔️  |
| cancelParcel                  | [Cancel parcel](https://developer.allegro.pl/documentation/#operation/cancelParcel)                                      | ✔️  |
| getParcelCancellationStatus   | [Get parcel cancellation status](https://developer.allegro.pl/documentation/#operation/getParcelCancellationStatus)      | ✔️  |

### OTHERS

#### Billing

| 方法名          | 📚 官方文档地址                                                                                                | 状态  |
|:-------------|:---------------------------------------------------------------------------------------------------------|:----|
| billings     | [Get a list of billing entries](https://developer.allegro.pl/documentation/#operation/getBillingEntries) | ✔️  |
| billingsType | [Get a list of billing types](https://developer.allegro.pl/documentation/#operation/getBillingTypes)     | ✔️  |
