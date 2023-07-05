allegro-sdk
===========

<img src="https://assets.allegrostatic.com/metrum/metrum-brand/allegro-347440b030.svg" alt="Goodcang Logo" width="200">

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

#### 代码示例

```java

import io.github.ealenxie.allegro.AllegroOrdersClient;
import io.github.ealenxie.allegro.order.EventStats;

class AllegroOrdersClientTest {
    @Test
    void eventStats() {
        String accessToken = "your accessToken";
        AllegroOrdersClient allegroOrdersClient = new AllegroOrdersClient();
        allegroOrdersClient.setSandBox(false);
        EventStats eventStats = allegroOrdersClient.eventStats(accessToken);
        System.out.println(eventStats);
    }
}

```

#### [AllegroClient](https://github.com/EalenXie/sdk-all/blob/main/allegro-sdk/src/main/java/io/github/ealenxie/allegro/AllegroClient.java) 已支持的接口列表

| 🏷️方法名       | 📚 官方文档地址                                                                                                           | 状态  |
|:-------------|:--------------------------------------------------------------------------------------------------------------------|:----|
| authorize    | [Autoryzacja użytkownika](https://developer.allegro.pl/auth/#autoryzacja-u%c5%bcytkownika)                          | ✔️  |
| accessToken  | [Autoryzacja użytkownika](https://developer.allegro.pl/auth/#autoryzacja-u%c5%bcytkownika)                          | ✔️  |
| refreshToken | [Przedłużenie ważności tokena](https://developer.allegro.pl/auth/#przed%c5%82u%c5%bcenie-wa%c5%bcno%c5%9bci-tokena) | ✔️  |

### OFFER

[AllegroOfferClient](https://github.com/EalenXie/sdk-all/blob/main/allegro-sdk/src/main/java/io/github/ealenxie/allegro/AllegroOfferClient.java)
已支持的接口列表

#### User's offer information

| 🏷️方法名            | 📚 官方文档地址                                                                                                                                        | 状态  |
|:------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| searchOffers      | [Get seller's offers](https://developer.allegro.pl/documentation/#operation/searchOffersUsingGET)                                                | ✔️  |
| ~~getDraftOffer~~ | ~~[Get all fields of the particular offer](https://developer.allegro.pl/documentation/#operation/getOfferUsingGET)~~                             | ✔️  |
| getSmartOffer     | [Get Smart! classification report of the particular offer](https://developer.allegro.pl/documentation/#operation/getOfferSmartClassificationGET) | ✔️  |
| getOfferEvents    | [Get events about the seller's offers](https://developer.allegro.pl/documentation/#operation/getOfferEvents)                                     | ✔️  |

#### Offer management

| 🏷️方法名                        | 📚 官方文档地址                                                                                                                                       | 状态  |
|:------------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| modifyOfferPrice              | [Modify the Buy Now price in an offer](https://developer.allegro.pl/documentation/#operation/createChangePriceCommandUsingPUT)                  | ✔️  |
| ~~createDraftOffer~~          | ~~[Create a draft offer ](https://developer.allegro.pl/documentation/#operation/createOfferUsingPOST)~~                                         | ✔️  |
| ~~updateDraftOffer~~          | ~~[Complete a draft offer or edit an offer](https://developer.allegro.pl/documentation/#operation/updateOfferUsingPUT)~~                        | ✔️  |
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
| createOffer                   | [Create offer based on product](https://developer.allegro.pl/documentation/#operation/createProductOffers)                                      | ✔️  |
| editOffer                     | [Edit an offer](https://developer.allegro.pl/documentation/#operation/editProductOffers)                                                        | ✔️  |
| getOffer                      | [Get all data of the particular product-offer](https://developer.allegro.pl/documentation/#operation/getProductOffer)                           | ✔️  |
| getOfferProcessingStatus      | [Check the processing status of a POST or PATCH request](https://developer.allegro.pl/documentation/#operation/getProductOfferProcessingStatus) | ✔️  |
| getOffersUnfilledParameters   | [Get offers with missing parameters](https://developer.allegro.pl/documentation/#operation/getOffersUnfilledParametersUsingGET_1)               | ✔️  |

#### Offer translations

| 🏷️方法名                  | 📚 官方文档地址                                                                                                            | 状态  |
|:------------------------|:---------------------------------------------------------------------------------------------------------------------|:----|
| getOfferTranslation     | [Get offer translations](https://developer.allegro.pl/documentation/#operation/getOfferTranslationUsingGET)          | ✔️  |
| updateOfferTranslation  | [Update offer translation](https://developer.allegro.pl/documentation/#operation/updateOfferTranslationUsingPATCH)   | ✔️  |
| deleteManualTranslation | [Delete offer translation](https://developer.allegro.pl/documentation/#operation/deleteManualTranslationUsingDELETE) | ✔️  |

#### Categories and parameters

| 🏷️方法名                      | 📚 官方文档地址                                                                                                                                           | 状态  |
|:----------------------------|:----------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| getCategories               | [Get IDs of Allegro categories](https://developer.allegro.pl/documentation/#operation/getCategoriesUsingGET)                                        | ✔️  |
| getCategory                 | [Get a category by ID](https://developer.allegro.pl/documentation/#operation/getCategoryUsingGET_1)                                                 | ✔️  |
| getCategoryParameters       | [Get parameters supported by a category](https://developer.allegro.pl/documentation/#operation/getFlatParametersUsingGET_2)                         | ✔️  |
| getCategoryScheduledChanges | [Get planned changes in category parameters](https://developer.allegro.pl/documentation/#operation/getCategoryParametersScheduledChangesUsingGET_1) | ✔️  |
| getCategoryEvents           | [Get changes in categories](https://developer.allegro.pl/documentation/#operation/getCategoryEventsUsingGET_1)                                      | ✔️  |
| categorySuggestion          | [Get categories suggestions](https://developer.allegro.pl/documentation/#operation/categorySuggestionUsingGET)                                      | ✔️  |

#### Images and attachments

| 🏷️方法名                | 📚 官方文档地址                                                                                                          | 状态  |
|:----------------------|:-------------------------------------------------------------------------------------------------------------------|:----|
| uploadOfferImage      | [Upload an offer image](https://developer.allegro.pl/documentation/#operation/uploadOfferImageUsingPOST)           | ✔️  |
| createOfferAttachment | [Create an offer attachment](https://developer.allegro.pl/documentation/#operation/createOfferAttachmentUsingPOST) | ✔️  |
| uploadOfferAttachment | [Upload an offer attachment](https://developer.allegro.pl/documentation/#operation/uploadOfferAttachmentUsingPUT)  | ✔️  |

#### Products

| 🏷️方法名                   | 📚 官方文档地址                                                                                                                                    | 状态  |
|:-------------------------|:---------------------------------------------------------------------------------------------------------------------------------------------|:----|
| getProductParameters     | [Get product parameters available in given category](https://developer.allegro.pl/documentation/#operation/getFlatProductParametersUsingGET) | ✔️  |
| getSaleProducts          | [Get search products results](https://developer.allegro.pl/documentation/#operation/getSaleProducts)                                         | ✔️  |
| getSaleProduct           | [Get all data of the particular product](https://developer.allegro.pl/documentation/#operation/getSaleProduct)                               | ✔️  |
| proposeSaleProduct       | [Propose a product](https://developer.allegro.pl/documentation/#operation/proposeSaleProduct)                                                | ✔️  |
| productChangeProposal    | [Propose changes in product](https://developer.allegro.pl/documentation/#operation/productChangeProposal)                                    | ✔️  |
| getProductChangeProposal | [Get all data of the particular product changes proposal](https://developer.allegro.pl/documentation/#operation/getProductChangeProposal)    | ✔️  |

#### Selection insights

| 🏷️方法名                   | 📚 官方文档地址                                                                                                       | 状态  |
|:-------------------------|:----------------------------------------------------------------------------------------------------------------|:----|
| getSaleSelectionInsights | [[BETA] Get selection insights](https://developer.allegro.pl/documentation/#operation/getSaleSelectionInsights) | ✔️  |

#### Batch offer modification

| 🏷️方法名                         | 📚 官方文档地址                                                                                                                                            | 状态  |
|:-------------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| batchOfferModify               | [Batch offer modification](https://developer.allegro.pl/documentation/#operation/modificationCommandUsingPUT)                                        | ✔️  |
| getModifySummary               | [Modification command summary](https://developer.allegro.pl/documentation/#operation/getGeneralReportUsingGET)                                       | ✔️  |
| getTasks                       | [Modification command detailed report](https://developer.allegro.pl/documentation/#operation/getTasksUsingGET)                                       | ✔️  |
| batchOfferPriceModify          | [Batch offer price modification](https://developer.allegro.pl/documentation/#operation/priceModificationCommandUsingPUT)                             | ✔️  |
| getPriceModifyStatus           | [Change price command summary](https://developer.allegro.pl/documentation/#operation/getPriceModificationCommandStatusUsingGET)                      | ✔️  |
| getPriceModifyTasksStatuses    | [Change price command detailed report](https://developer.allegro.pl/documentation/#operation/getPriceModificationCommandTasksStatusesUsingGET)       | ✔️  |
| batchOfferQuantityModify       | [Batch offer quantity modification](https://developer.allegro.pl/documentation/#operation/quantityModificationCommandUsingPUT)                       | ✔️  |
| getQuantityModifyStatus        | [Change quantity command summary](https://developer.allegro.pl/documentation/#operation/getQuantityModificationCommandStatusUsingGET)                | ✔️  |
| getQuantityModifyTasksStatuses | [Change quantity command detailed report](https://developer.allegro.pl/documentation/#operation/getQuantityModificationCommandTasksStatusesUsingGET) | ✔️  |

#### Classifieds

| 🏷️方法名                   | 📚 官方文档地址                                                                                                                                     | 状态  |
|:-------------------------|:----------------------------------------------------------------------------------------------------------------------------------------------|:----|
| getSellerOffersStats     | [Get the seller's advertisements daily statistics](https://developer.allegro.pl/documentation/#operation/classifiedSellerOfferStatsGET)       | ✔️  |
| getOffersStats           | [Get the advertisements daily statistics](https://developer.allegro.pl/documentation/#operation/classifiedOffersStatsGET)                     | ✔️  |
| getClassifiedPackages    | [Get classified packages assigned to an offer](https://developer.allegro.pl/documentation/#operation/getClassifiedPackagesUsingGET)           | ✔️  |
| assignClassifiedPackages | [Assign packages to a classified](https://developer.allegro.pl/documentation/#operation/assignClassifiedPackagesUsingPUT)                     | ✔️  |
| getPackageConfigurations | [Get configurations of packages](https://developer.allegro.pl/documentation/#operation/getClassifiedPackageConfigurationsForCategoryUsingGET) | ✔️  |
| getPackageConfiguration  | [Get the configuration of a package](https://developer.allegro.pl/documentation/#operation/getClassifiedPackageConfigurationUsingGET)         | ✔️  |

#### Pricing

| 🏷️方法名              | 📚 官方文档地址                                                                                                                       | 状态  |
|:--------------------|:--------------------------------------------------------------------------------------------------------------------------------|:----|
| calculateFeePreview | [Calculate fee and commission for an offer](https://developer.allegro.pl/documentation/#operation/calculateFeePreviewUsingPOST) | ✔️  |
| getOfferQuotes      | [Get the user's current offer quotes](https://developer.allegro.pl/documentation/#operation/offerQuotesPublicUsingGET)          | ✔️  |

### ORDERS

[AllegroOrdersClient](https://github.com/EalenXie/sdk-all/blob/main/allegro-sdk/src/main/java/io/github/ealenxie/allegro/AllegroOrdersClient.java)
已支持的接口列表

#### Order Management

| 🏷️方法名              | 📚 官方文档地址                                                                                                                    | 状态  |
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

| 🏷️方法名              | 📚 官方文档地址                                                                                                      | 状态  |
|:--------------------|:---------------------------------------------------------------------------------------------------------------|:----|
| paymentOperations   | [Payment operations history](https://developer.allegro.pl/documentation#operation/getPaymentsOperationHistory) | ✔️  |
| initiateRefund      | [Initiate a refund of a payment](https://developer.allegro.pl/documentation/#operation/initiateRefund)         | ✔️  |
| getRefundedPayments | [Get a list of refunded payments](https://developer.allegro.pl/documentation/#operation/getRefundedPayments)   | ✔️  |

#### Disputes

| 🏷️方法名                  | 📚 官方文档地址                                                                                                                    | 状态  |
|:------------------------|:-----------------------------------------------------------------------------------------------------------------------------|:----|
| disputes                | [Get the user's disputes](https://developer.allegro.pl/documentation/#tag/getListOfDisputesUsingGET)                         | ✔️  |
| dispute                 | [Get a single dispute](https://developer.allegro.pl/documentation/#tag/getDisputeUsingGET)                                   | ✔️  |
| getDisputeMessages      | [Get the messages within a dispute](https://developer.allegro.pl/documentation/#operation/getMessagesFromDisputeUsingGET)    | ✔️  |
| addMessageToDispute     | [Add a message to a dispute](https://developer.allegro.pl/documentation/#operation/addMessageToDisputeUsingPOST)             | ✔️  |
| createAnAttachment      | [Create an attachment declaration](https://developer.allegro.pl/documentation/#operation/createAnAttachmentUsingPOST)        | ✔️  |
| uploadDisputeAttachment | [Upload a dispute message attachment](https://developer.allegro.pl/documentation/#operation/uploadDisputeAttachmentUsingPUT) | ✔️  |
| getAttachment           | [Get an attachment](https://developer.allegro.pl/documentation/#operation/getAttachmentUsingGET)                             | ✔️  |

#### Parcel Management

| 🏷️方法名                        | 📚 官方文档地址                                                                                                                | 状态  |
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

#### Customer returns

| 🏷️方法名                     | 📚 官方文档地址                                                                                                                            | 状态  |
|:---------------------------|:-------------------------------------------------------------------------------------------------------------------------------------|:----|
| getCustomerReturns         | [[BETA] Get customer returns by provided query parameters](https://developer.allegro.pl/documentation/#operation/getCustomerReturns) | ✔️  |
| getCustomerReturnById      | [[BETA] Get customer return by id](https://developer.allegro.pl/documentation/#operation/getCustomerReturnById)                      | ✔️  |
| rejectCustomerReturnRefund | [[BETA] Reject customer return refund](https://developer.allegro.pl/documentation/#operation/rejectCustomerReturnRefund)             | ✔️  |

#### Commission refunds

| 🏷️方法名                       | 📚 官方文档地址                                                                                                        | 状态  |
|:-----------------------------|:-----------------------------------------------------------------------------------------------------------------|:----|
| getAvailableDeliveryServices | [Get available delivery services](https://developer.allegro.pl/documentation/#operation/getRefundApplication)    | ✔️  |
| cancelRefundApplication      | [Cancel a refund application](https://developer.allegro.pl/documentation/#operation/cancelRefundApplication)     | ✔️  |
| getRefundApplications        | [Get a list of refund applications](https://developer.allegro.pl/documentation/#operation/getRefundApplications) | ✔️  |
| createRefundApplication      | [Create a refund application](https://developer.allegro.pl/documentation/#operation/createRefundApplication)     | ✔️  |

#### Blacklist management

| 🏷️方法名      | 📚 官方文档地址                                                                                                      | 状态  |
|:------------|:---------------------------------------------------------------------------------------------------------------|:----|
| addBlack    | [Add a users to the blacklist](https://developer.allegro.pl/documentation/#operation/doAddToBlackList)         | ✔️  |
| removeBlack | [Remove users from the blacklist](https://developer.allegro.pl/documentation/#operation/doRemoveFromBlackList) | ✔️  |

### SALE SETTINGS

[AllegroSaleSettingClient](https://github.com/EalenXie/sdk-all/blob/main/allegro-sdk/src/main/java/io/github/ealenxie/allegro/AllegroSaleSettingClient.java)
已支持的接口列表

#### After sale services

| 🏷️方法名                  | 📚 官方文档地址                                                                                                                                           | 状态  |
|:------------------------|:----------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| getPolicies             | [Get the user's return policies](https://developer.allegro.pl/documentation/#operation/getPublicSellerListingUsingGET_1)                            | ✔️  |
| createPolicy            | [Create new user's return policy](https://developer.allegro.pl/documentation/#operation/createAfterSalesServiceReturnPolicyUsingPOST)               | ✔️  |
| getPolicyById           | [Get the user's return policy](https://developer.allegro.pl/documentation/#operation/getAfterSalesServiceReturnPolicyUsingGET)                      | ✔️  |
| updatePolicy            | [Change the user's return policy](https://developer.allegro.pl/documentation/#operation/updateAfterSalesServiceReturnPolicyUsingPUT)                | ✔️  |
| getImpliedWarranties    | [Get the user's implied warranties](https://developer.allegro.pl/documentation/#operation/getPublicSellerListingUsingGET)                           | ✔️  |
| createImpliedWarranties | [Create new user's implied warranty](https://developer.allegro.pl/documentation/#operation/createAfterSalesServiceImpliedWarrantyUsingPOST)         | ✔️  |
| getImpliedWarrantyById  | [Get the user's implied warranty](https://developer.allegro.pl/documentation/#operation/getAfterSalesServiceImpliedWarrantyUsingGET)                | ✔️  |
| updateImpliedWarranty   | [Change the user's implied warranty](https://developer.allegro.pl/documentation/#operation/updateAfterSalesServiceImpliedWarrantyUsingPUT)          | ✔️  |
| getWarranties           | [Get the user's warranties](https://developer.allegro.pl/documentation/#operation/getPublicSellerListingUsingGET_2)                                 | ✔️  |
| createWarranty          | [Create new user's warranty](https://developer.allegro.pl/documentation/#operation/createAfterSalesServiceWarrantyUsingPOST)                        | ✔️  |
| getWarrantyById         | [Get the user's warranty](https://developer.allegro.pl/documentation/#operation/getAfterSalesServiceWarrantyUsingGET)                               | ✔️  |
| updateWarranty          | [Change the user's warranty](https://developer.allegro.pl/documentation/#operation/updateAfterSalesServiceWarrantyUsingPUT)                         | ✔️  |
| createAttachment        | [Create a warranty attachment metadata](https://developer.allegro.pl/documentation/#operation/createAfterSalesServiceConditionsAttachmentUsingPOST) | ✔️  |
| getAttachment           | [Upload an warranty attachment](https://developer.allegro.pl/documentation/#operation/uploadAfterSalesServiceConditionsAttachmentUsingPUT)          | ✔️  |

#### Delivery

| 🏷️方法名                     | 📚 官方文档地址                                                                                                                    | 状态  |
|:---------------------------|------------------------------------------------------------------------------------------------------------------------------|:----|
| getSaleShippingRates       | [Get the user's shipping rates](https://developer.allegro.pl/documentation/#operation/getListOfShippingRatestUsingGET)       | ✔️  |
| createShippingRates        | [Create a new shipping rates set](https://developer.allegro.pl/documentation/#operation/createShippingRatesSetUsingPOST)     | ✔️  |
| getShippingRateById        | [Get the details of a shipping rates set](https://developer.allegro.pl/documentation/#operation/getShippingRatesSetUsingGET) | ✔️  |
| updateShippingRates        | [Edit a user's shipping rates set](https://developer.allegro.pl/documentation/#operation/modifyShippingRatesSetUsingPUT)     | ✔️  |
| getSaleDeliverySettings    | [Get the user's delivery settings](https://developer.allegro.pl/documentation/#operation/getSaleDeliverySettings)            | ✔️  |
| updateSaleDeliverySettings | [Modify the user's delivery settings](https://developer.allegro.pl/documentation/#operation/putSaleDeliverySettings)         | ✔️  |
| getDeliveryMethods         | [Get the list of delivery methods](https://developer.allegro.pl/documentation/#operation/getListOfDeliveryMethodsUsingGET)   | ✔️  |

#### Additional services

| 🏷️方法名                        | 📚 官方文档地址                                                                                                                                                               | 状态  |
|:------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| createAdditionalServiceGroups | [Create additional services group](https://developer.allegro.pl/documentation/#operation/createAdditionalServicesGroupUsingPOST)                                        | ✔️  |
| getAdditionalServiceGroups    | [Get the user's additional services groups](https://developer.allegro.pl/documentation/#operation/getListOfAdditionalServicesGroupsUsingGET)                            | ✔️  |
| getCategories                 | [Get the additional services definitions by categories](https://developer.allegro.pl/documentation/#operation/getListOfAdditionalServicesDefinitionsCategoriesUsingGET) | ✔️  |
| getAdditionalServiceGroupById | [Get the details of an additional services group](https://developer.allegro.pl/documentation/#operation/getAdditionalServicesGroupUsingGET)                             | ✔️  |
| updateAdditionalServiceGroups | [Modify an additional services group](https://developer.allegro.pl/documentation/#operation/modifyAdditionalServicesGroupUsingPUT)                                      | ✔️  |

#### Additional services translations

| 🏷️方法名                     | 📚 官方文档地址                                                                                                                                                    | 状态  |
|:---------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| getTranslations            | [Get translations for specified group](https://developer.allegro.pl/documentation/#operation/getAdditionalServiceGroupTranslations)                          | ✔️  |
| createOrUpdateTranslations | [Create/Update translations for specified group and language](https://developer.allegro.pl/documentation/#operation/updateAdditionalServiceGroupTranslation) | ✔️  |
| deleteTransaction          | [Delete a translation for a specified group and language](https://developer.allegro.pl/documentation/#operation/deleteAdditionalServiceGroupTranslation)     | ✔️  |

#### Size tables

| 🏷️方法名                  | 📚 官方文档地址                                                                                                         | 状态  |
|:------------------------|-------------------------------------------------------------------------------------------------------------------|:----|
| getTableUsing           | [Get a size table](https://developer.allegro.pl/documentation/#operation/getTableUsingGET)                        | ✔️  |
| modifyTableUsing        | [Update a size table](https://developer.allegro.pl/documentation/#operation/modifyTableUsingPUT)                  | ✔️  |
| getTablesUsing          | [Get the user's size tables](https://developer.allegro.pl/documentation/#operation/getTablesUsingGET)             | ✔️  |
| createTablesUsing       | [Create a size table](https://developer.allegro.pl/documentation/#operation/createTableUsingPOST)                 | ✔️  |
| getTablesTemplatesUsing | [Get the size tables templates](https://developer.allegro.pl/documentation/#operation/getTablesTemplatesUsingGET) | ✔️  |

#### Points of service

| 🏷️方法名          | 📚 官方文档地址                                                                                                         | 状态  |
|:----------------|-------------------------------------------------------------------------------------------------------------------|:----|
| createPoint     | [Create a point of service](https://developer.allegro.pl/documentation/#operation/createPOSUsingPOST)             | ✔️  |
| getPoints       | [Get the user's points of service](https://developer.allegro.pl/documentation/#operation/getPOSListUsingGET)      | ✔️  |
| getPointById    | [Get the details of a point of service](https://developer.allegro.pl/documentation/#operation/getPOSDataUsingGET) | ✔️  |
| modifyPoint     | [Modify a point of service](https://developer.allegro.pl/documentation/#operation/modifyPOSUsingPUT)              | ✔️  |
| deletePointById | [Delete a point of service](https://developer.allegro.pl/documentation/#operation/deletePOSUsingDELETE)           | ✔️  |

#### Contacts

| 🏷️方法名        | 📚 官方文档地址                                                                                                  | 状态  |
|:--------------|------------------------------------------------------------------------------------------------------------|:----|
| createContact | [Create a new contact](https://developer.allegro.pl/documentation/#operation/createContactUsingPOST)       | ✔️  |
| getContacts   | [Get the user's contacts](https://developer.allegro.pl/documentation/#operation/getListOfContactsUsingGET) | ✔️  |
| getContact    | [Get contact details](https://developer.allegro.pl/documentation/#operation/getContactUsingGET)            | ✔️  |
| modifyContact | [Modify contact details](https://developer.allegro.pl/documentation/#operation/modifyContactUsingPUT)      | ✔️  |

### ONE FULFILLMENT

[AllegroFulfillmentClient](https://github.com/EalenXie/sdk-all/blob/main/allegro-sdk/src/main/java/io/github/ealenxie/allegro/AllegroFulfillmentClient.java)
已支持的接口列表

#### Advance Ship Notices

| 🏷️方法名                             | 📚 官方文档地址                                                                                                                                                    | 状态  |
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

| 🏷️方法名              | 📚 官方文档地址                                                                                        | 状态  |
|:--------------------|:-------------------------------------------------------------------------------------------------|:----|
| getFulfillmentStock | [Get available stock](https://developer.allegro.pl/documentation/#operation/getFulfillmentStock) | ✔️  |

#### Fulfillment Parcels

| 🏷️方法名                | 📚 官方文档地址                                                                                          | 状态  |
|:----------------------|:---------------------------------------------------------------------------------------------------|:----|
| getFulfillmentParcels | [Get list of shipped parcels](https://developer.allegro.pl/documentation/#tag/Fulfillment-Parcels) | ✔️  |

#### Fulfillment Products

| 🏷️方法名               | 📚 官方文档地址                                                                                                    | 状态  |
|:---------------------|:-------------------------------------------------------------------------------------------------------------|:----|
| getAvailableProducts | [Get list of available products](https://developer.allegro.pl/documentation/#operation/getAvailableProducts) | ✔️  |

### OTHERS

[AllegroOthersClient](https://github.com/EalenXie/sdk-all/blob/main/allegro-sdk/src/main/java/io/github/ealenxie/allegro/AllegroOthersClient.java)
已支持的接口列表

#### Information about user

| 🏷️方法名                       | 📚 官方文档地址                                                                                                                                 | 状态  |
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

| 🏷️方法名       | 📚 官方文档地址                                                                                                            | 状态  |
|:-------------|:---------------------------------------------------------------------------------------------------------------------|:----|
| marketplaces | [Get details for all marketplaces in allegro](https://developer.allegro.pl/documentation/#operation/marketplacesGET) | ✔️  |

#### Message Center

| 🏷️方法名                   | 📚 官方文档地址                                                                                                           | 状态  |
|:-------------------------|:--------------------------------------------------------------------------------------------------------------------|:----|
| listThreads              | [List user threads](https://developer.allegro.pl/documentation/#operation/listThreadsGET)                           | ✔️  |
| getThread                | [Get user thread](https://developer.allegro.pl/documentation/#operation/getThreadGET)                               | ✔️  |
| changeReadFlagOnThread   | [Mark a particular thread as read](https://developer.allegro.pl/documentation/#operation/changeReadFlagOnThreadPUT) | ✔️  |
| newMessage               | [Write a new message](https://developer.allegro.pl/documentation/#operation/newMessagePOST)                         | ✔️  |
| listMessages             | [List messages in thread](https://developer.allegro.pl/documentation/#operation/listMessagesGET)                    | ✔️  |
| newMessageInThread       | [Write a new message in thread](https://developer.allegro.pl/documentation/#operation/newMessageInThreadPOST)       | ✔️  |
| getMessage               | [Get single message](https://developer.allegro.pl/documentation/#operation/getMessageGET)                           | ✔️  |
| deleteMessage            | [Delete single message](https://developer.allegro.pl/documentation/#operation/deleteMessageDELETE)                  | ✔️  |
| newAttachmentDeclaration | [Add attachment declaration](https://developer.allegro.pl/documentation/#operation/newAttachmentDeclarationPOST)    | ✔️  |
| uploadAttachment         | [Upload attachment binary data](https://developer.allegro.pl/documentation/#operation/uploadAttachmentPUT)          | ✔️  |
| downloadAttachment       | [Download attachment](https://developer.allegro.pl/documentation/#operation/downloadAttachmentGET)                  | ✔️  |

#### Billing

| 🏷️方法名            | 📚 官方文档地址                                                                                                | 状态  |
|:------------------|:---------------------------------------------------------------------------------------------------------|:----|
| getBillingEntries | [Get a list of billing entries](https://developer.allegro.pl/documentation/#operation/getBillingEntries) | ✔️  |
| getBillingTypes   | [Get a list of billing types](https://developer.allegro.pl/documentation/#operation/getBillingTypes)     | ✔️  |

#### Auctions and Bidding

| 🏷️方法名   | 📚 官方文档地址                                                                                          | 状态  |
|:---------|:---------------------------------------------------------------------------------------------------|:----|
| placeBid | [Place a bid in an auction](https://developer.allegro.pl/documentation/#operation/placeBid)        | ✔️  |
| getBid   | [Get current user's bid information](https://developer.allegro.pl/documentation/#operation/getBid) | ✔️  |

#### Charity

| 🏷️方法名                     | 📚 官方文档地址                                                                                                        | 状态  |
|:---------------------------|:-----------------------------------------------------------------------------------------------------------------|:----|
| searchFundraisingCampaigns | [Search fundraising campaigns](https://developer.allegro.pl/documentation/#operation/searchFundraisingCampaigns) | ✔️  |

#### Public user information

| 🏷️方法名         | 📚 官方文档地址                                                                                                      | 状态  |
|:---------------|:---------------------------------------------------------------------------------------------------------------|:----|
| getUserSummary | [Get any user's ratings summary](https://developer.allegro.pl/documentation/#operation/getUserSummaryUsingGET) | ✔️  |

#### Public offer information

| 🏷️方法名     | 📚 官方文档地址                                                                         | 状态  |
|:-----------|:----------------------------------------------------------------------------------|:----|
| getListing | [Search offers](https://developer.allegro.pl/documentation/#operation/getListing) | ✔️  |

