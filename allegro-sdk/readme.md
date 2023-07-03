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

| 方法名            | 📚 官方文档地址                                                                                                                                        | 状态  |
|:---------------|:-------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| searchOffers   | [Get seller's offers](https://developer.allegro.pl/documentation/#operation/searchOffersUsingGET)                                                | ✔️  |
| ~~
getOffer~~   | ~~[Get all fields of the particular offer](https://developer.allegro.pl/documentation/#operation/getOfferUsingGET)~~                             | ✔️  |
| getSmartOffer  | [Get Smart! classification report of the particular offer](https://developer.allegro.pl/documentation/#operation/getOfferSmartClassificationGET) | ✔️  |
| getOfferEvents | [Get events about the seller's offers](https://developer.allegro.pl/documentation/#operation/getOfferEvents)                                     | ✔️  |

#### Offer management

| 方法名                           | 📚 官方文档地址                                                                                                                                       | 状态  |
|:------------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| modifyOfferPrice              | [Modify the Buy Now price in an offer](https://developer.allegro.pl/documentation/#operation/createChangePriceCommandUsingPUT)                  | ✔️  |
| ~~
createDraftOffer~~          | ~~[Create a draft offer ](https://developer.allegro.pl/documentation/#operation/createOfferUsingPOST)~~                                         | ✔️  |
| ~~
updateDraftOffer~~          | ~~[Complete a draft offer or edit an offer](https://developer.allegro.pl/documentation/#operation/updateOfferUsingPUT)~~                        | ✔️  |
| deleteDraftOffer              | [Delete a draft offer](https://developer.allegro.pl/documentation/#operation/deleteOfferUsingDELETE)                                            | ✔️  |
| changePublishStatus           | [Batch offer publish / unpublished](https://developer.allegro.pl/documentation/#operation/changePublicationStatusUsingPUT)                      | ✔️  |
| getPublish                    | [Publish command summary](https://developer.allegro.pl/documentation/#operation/getPublicationReportUsingGET)                                   | ✔️  |
| getPublicationTasks           | [Publish command detailed report](https://developer.allegro.pl/documentation/#operation/getPublicationTasksUsingGET)                            | ✔️  |
| getAvailablePromotionPackages | [Get all available offer promotion packages](https://developer.allegro.pl/documentation/#operation/getAvailableOfferPromotionPackages)          | ✔️  |
| modifyOfferPromoOptions       | [Modify offer promotion packages](https://developer.allegro.pl/documentation/#operation/modifyOfferPromoOptionsUsingPOST)                       | ✔️  |
| getOfferPromoOptions          | [Get offer promotion packages](https://developer.allegro.pl/documentation/#operation/getOfferPromoOptionsUsingGET)                              | ✔️  |
| getSellerOffersPromoOptions   | [Get promo options for seller's offers](https://developer.allegro.pl/documentation/#operation/getPromoOptionsForSellerOffersUsingGET)           | ✔️  |
| promoModify                   | [Batch offer promotion package modification](https://developer.allegro.pl/documentation/#operation/promoModificationCommandUsingPUT)            | ✔️  |
| getPromoModify                | [Modification command summary](https://developer.allegro.pl/documentation/#operation/getPromoModificationCommandResultUsingGET)                 | ✔️  |
| getPromoModifyDetail          | [Modification command detailed result](https://developer.allegro.pl/documentation/#operation/getPromoModificationCommandDetailedResultUsingGET) | ✔️  |

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

### FULFILLMENT

#### Advance Ship Notices

| 方法名                                | 📚 官方文档地址                                                                                                                                                    | 状态  |
|:-----------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| getAdvanceShipNotices              | [Get list of Advance Ship Notices](https://developer.allegro.pl/documentation/#operation/getAdvanceShipNotices)                                              | ✔️  |
| createAdvanceShipNotice            | [Create an Advance Ship Notice](https://developer.allegro.pl/documentation/#operation/createAdvanceShipNotice)                                               | ✔️  |
| getAdvanceShipNotice               | [Get single Advance Ship Notice](https://developer.allegro.pl/documentation/#operation/getAdvanceShipNotice)                                                 | ✔️  |
| updateAdvanceShipNotice            | [Update Advance Ship Notice](https://developer.allegro.pl/documentation/#operation/updateAdvanceShipNotice)                                                  | ✔️  |
| deleteAdvanceShipNotice            | [Delete Advance Ship Notice](https://developer.allegro.pl/documentation/#operation/deleteAdvanceShipNotice)                                                  | ✔️  |
| getAdvanceShipNoticeLabels         | [Get labels for Advance Ship Notice](https://developer.allegro.pl/documentation/#operation/getAdvanceShipNoticeLabels)                                       | ✔️  |
| createLabelsCommand                | [Create labels](https://developer.allegro.pl/documentation/#operation/createLabelsCommand)                                                                   | ✔️  |
| getLabelCommand                    | [Get labels](https://developer.allegro.pl/documentation/#operation/getLabelCommand)                                                                          | ✔️  |
| submitCommand                      | [Submit the Advance Ship Notice](https://developer.allegro.pl/documentation/#operation/submitCommand)                                                        | ✔️  |
| getSubmitCommand                   | [Get submit status](https://developer.allegro.pl/documentation/#operation/getSubmitCommand)                                                                  | ✔️  |
| getAdvanceShipNoticeReceivingState | [Check current state and details of Advance Ship Notice receiving](https://developer.allegro.pl/documentation/#operation/getAdvanceShipNoticeReceivingState) | ✔️  |

#### Fulfillment Stock

| 方法名                 | 📚 官方文档地址                                                                                        | 状态  |
|:--------------------|:-------------------------------------------------------------------------------------------------|:----|
| getFulfillmentStock | [Get available stock](https://developer.allegro.pl/documentation/#operation/getFulfillmentStock) | ✔️  |

#### Fulfillment Parcels

| 方法名                   | 📚 官方文档地址                                                                                          | 状态  |
|:----------------------|:---------------------------------------------------------------------------------------------------|:----|
| getFulfillmentParcels | [Get list of shipped parcels](https://developer.allegro.pl/documentation/#tag/Fulfillment-Parcels) | ✔️  |

#### Fulfillment Products

| 方法名                  | 📚 官方文档地址                                                                                                    | 状态  |
|:---------------------|:-------------------------------------------------------------------------------------------------------------|:----|
| getAvailableProducts | [Get list of available products](https://developer.allegro.pl/documentation/#operation/getAvailableProducts) | ✔️  |

### OTHERS

#### Information about user

| 方法名                          | 📚 官方文档地址                                                                                                                                 | 状态  |
|:-----------------------------|:------------------------------------------------------------------------------------------------------------------------------------------|:----|
| getUserRatings               | [Get the user's ratings](https://developer.allegro.pl/documentation/#operation/getUserRatingsUsingGET)                                    | ✔️  |
| answerUserRating             | [Answer for user's rating](https://developer.allegro.pl/documentation/#operation/answerUserRatingUsingPUT)                                | ✔️  |
| userRatingRemoval            | [Request removal of user's rating](https://developer.allegro.pl/documentation/#operation/userRatingRemovalUsingPUT)                       | ✔️  |
| me                           | [Get basic information about user](https://developer.allegro.pl/documentation/#operation/meGET)                                           | ✔️  |
| getListOfAdditionalEmails    | [Get user's additional emails](https://developer.allegro.pl/documentation/#operation/getListOfAdditionalEmailsUsingGET)                   | ✔️  |
| addAdditionalEmail           | [Add a new additional email address to user's account](https://developer.allegro.pl/documentation/#operation/addAdditionalEmailUsingPOST) | ✔️  |
| getAdditionalEmail           | [Get information about a particular additional email](https://developer.allegro.pl/documentation/#operation/getAdditionalEmailUsingGET)   | ✔️  |
| deleteAdditionalEmail        | [Delete an additional email address](https://developer.allegro.pl/documentation/#operation/deleteAdditionalEmailUsingDELETE)              | ✔️  |
| getSellerSmartClassification | [Get Smart! seller classification report](https://developer.allegro.pl/documentation/#operation/getSellerSmartClassificationGET)          | ✔️  |

#### Information about marketplaces

| 方法名          | 📚 官方文档地址                                                                                                | 状态  |
|:-------------|:---------------------------------------------------------------------------------------------------------|:----|
| marketplaces     | [Get details for all marketplaces in allegro](https://developer.allegro.pl/documentation/#operation/marketplacesGET) | ✔️  |

#### Message Center

| 方法名          | 📚 官方文档地址                                                                                                | 状态  |
|:-------------|:---------------------------------------------------------------------------------------------------------|:----|
| listThreads     | [List user threads](https://developer.allegro.pl/documentation/#operation/listThreadsGET) | ✔️  |
| getThread     | [Get user thread](https://developer.allegro.pl/documentation/#operation/getThreadGET) | ✔️  |
| changeReadFlagOnThread     | [Mark a particular thread as read](https://developer.allegro.pl/documentation/#operation/changeReadFlagOnThreadPUT) | ✔️  |
| newMessage     | [Write a new message](https://developer.allegro.pl/documentation/#operation/newMessagePOST) | ✔️  |
| listMessages     | [List messages in thread](https://developer.allegro.pl/documentation/#operation/listMessagesGET) | ✔️  |
| newMessageInThread     | [Write a new message in thread](https://developer.allegro.pl/documentation/#operation/newMessageInThreadPOST) | ✔️  |
| getMessage     | [Get single message](https://developer.allegro.pl/documentation/#operation/getMessageGET) | ✔️  |
| deleteMessage     | [Delete single message](https://developer.allegro.pl/documentation/#operation/deleteMessageDELETE) | ✔️  |
| newAttachmentDeclaration     | [Add attachment declaration](https://developer.allegro.pl/documentation/#operation/newAttachmentDeclarationPOST) | ✔️  |
| uploadAttachment     | [Upload attachment binary data](https://developer.allegro.pl/documentation/#operation/uploadAttachmentPUT) | ✔️  |
| downloadAttachment     | [Download attachment](https://developer.allegro.pl/documentation/#operation/downloadAttachmentGET) | ✔️  |

#### Auctions and Bidding

| 方法名               | 📚 官方文档地址                                                                                                | 状态  |
|:------------------|:---------------------------------------------------------------------------------------------------------|:----|
| placeBid | [Place a bid in an auction](https://developer.allegro.pl/documentation/#operation/placeBid) | ✔️  |
| getBid   | [Get current user's bid information](https://developer.allegro.pl/documentation/#operation/getBid)     | ✔️  |

#### Charity

| 方法名               | 📚 官方文档地址                                                                                                | 状态  |
|:------------------|:---------------------------------------------------------------------------------------------------------|:----|
| searchFundraisingCampaigns | [Search fundraising campaigns](https://developer.allegro.pl/documentation/#operation/searchFundraisingCampaigns) | ✔️  |


#### Public user information

| 方法名               | 📚 官方文档地址                                                                                                | 状态  |
|:------------------|:---------------------------------------------------------------------------------------------------------|:----|
| getUserSummary | [Get any user's ratings summary](https://developer.allegro.pl/documentation/#operation/getUserSummaryUsingGET) | ✔️  |

#### Public offer information

| 方法名               | 📚 官方文档地址                                                                                                | 状态  |
|:------------------|:---------------------------------------------------------------------------------------------------------|:----|
| getListing | [Search offers](https://developer.allegro.pl/documentation/#operation/getListing) | ✔️  |


#### Billing

| 方法名               | 📚 官方文档地址                                                                                                | 状态  |
|:------------------|:---------------------------------------------------------------------------------------------------------|:----|
| getBillingEntries | [Get a list of billing entries](https://developer.allegro.pl/documentation/#operation/getBillingEntries) | ✔️  |
| getBillingTypes   | [Get a list of billing types](https://developer.allegro.pl/documentation/#operation/getBillingTypes)     | ✔️  |
