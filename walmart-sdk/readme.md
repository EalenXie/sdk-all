walmart-sdk
======

主要是封装 [Walmart Developer Portal](https://developer.walmart.com/home/us-mp/) 接口

### 快速开始

#### `pom.xml`配置

![](https://img.shields.io/maven-central/v/io.github.ealenxie/walmart-sdk)

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>walmart-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### 代码示例

```java

import io.github.ealenxie.walmart.marketplace.MarketplaceClient;
import io.github.ealenxie.walmart.marketplace.WalmartToken;
import io.github.ealenxie.walmart.marketplace.shipping.CarriersResponse;

class MarketplaceClientTest {
    @Test
    void getCarriers() {
        String clientId = "your clientId";
        String clientSecret = "your clientSecret";
        MarketplaceClient marketplaceClient = new MarketplaceClient(clientId, clientSecret);
        // 设置为正式环境
        marketplaceClient.setSandBox(false);
        // get accessToken
        WalmartToken walmartToken = marketplaceClient.accessToken();
        String accessToken = walmartToken.getAccessToken();
        // call api
        CarriersResponse carriers = marketplaceClient.getCarriers(accessToken);
        System.out.println(carriers);
    }
}

```

#### [WalmartClient](https://github.com/EalenXie/sdk-all/blob/main/walmart-sdk/src/main/java/io/github/ealenxie/walmart/marketplace/WalmartClient.java) 已支持的接口列表

| 🏷️方法名      | 📚 官方文档地址                                                                    | 状态  |
|:------------|:-----------------------------------------------------------------------------|:----|
| accessToken | [Token API](https://developer.walmart.com/api/us/mp/auth#operation/tokenAPI) | ✔️  |

#### [MarketplaceClient](https://github.com/EalenXie/sdk-all/blob/main/walmart-sdk/src/main/java/io/github/ealenxie/walmart/marketplace/MarketplaceClient.java) 已支持的接口列表

#### Feeds

| 🏷️方法名            | 📚 官方文档地址                                                                                           | 状态  |
|:------------------|:----------------------------------------------------------------------------------------------------|:----|
| getFeeds          | [All feed statuses](https://developer.walmart.com/api/us/mp/feeds)                                  | ✔️  |
| getFeedItemStatus | [Feed item status](https://developer.walmart.com/api/us/mp/feeds#operation/getFeedItemStatus)       | ✔️  |
| itemBulkUploads   | [Get Feed Error Report](https://developer.walmart.com/api/us/mp/feeds#operation/getFeedErrorReport) | ✔️  |

#### Items

| 🏷️方法名              | 📚 官方文档地址                                                                                             | 状态  |
|:--------------------|:------------------------------------------------------------------------------------------------------|:----|
| getCatalogSearch    | [Catalog Search](https://developer.walmart.com/api/us/mp/items#operation/getCatalogSearch)            | ✔️  |
| getItemAssociations | [Get Item Associations](https://developer.walmart.com/api/us/mp/items#operation/getItemAssociations)  | ✔️  |
| getFeedErrorReport  | [Bulk Item Setup](https://developer.walmart.com/api/us/mp/items#operation/itemBulkUploads)            | ✔️  |
| getAllItems         | [All items](https://developer.walmart.com/api/us/mp/items#operation/getAllItems)                      | ✔️  |
| getItem             | [An item](https://developer.walmart.com/api/us/mp/items#operation/getAnItem)                          | ✔️  |
| getSearchResult     | [Item Search](https://developer.walmart.com/api/us/mp/items#operation/getSearchResult)                | ✔️  |
| getItemsTaxonomy    | [Taxonomy](https://developer.walmart.com/api/us/mp/items#operation/getTaxonomyResponse)               | ✔️  |
| getVariantCount     | [Get item count by groups](https://developer.walmart.com/api/us/mp/items#operation/getVariantCount)   | ✔️  |
| getCountByStatus    | [Get items count by status](https://developer.walmart.com/api/us/mp/items#operation/getCountByStatus) | ✔️  |
| retireItem          | [Retire an item](https://developer.walmart.com/api/us/mp/items#operation/retireAnItem)                | ✔️  |

#### Prices

| 🏷️方法名               | 📚 官方文档地址                                                                                                                  | 状态  |
|:---------------------|:---------------------------------------------------------------------------------------------------------------------------|:----|
| updateStrategy       | [Update Repricer Strategy](https://developer.walmart.com/api/us/mp/price#operation/updateStrategy)                         | ✔️  |
| deleteStrategy       | [Delete Repricer Strategy](https://developer.walmart.com/api/us/mp/price#operation/deleteStrategy)                         | ✔️  |
| getIncentive         | [List of Incentive Items](https://developer.walmart.com/api/us/mp/price#operation/getRepricerIncentive)                    | ✔️  |
| updateIncentive      | [Assign Incentive items to Repricer](https://developer.walmart.com/api/us/mp/price#operation/updateRepricerIncentive)      | ✔️  |
| updatePrice          | [Update a price](https://developer.walmart.com/api/us/mp/price#operation/updatePrice)                                      | ✔️  |
| repricerFeed         | [Assign/Unassign items to/from Repricer Strategy](https://developer.walmart.com/api/us/mp/price#operation/getRepricerFeed) | ✔️  |
| createStrategy       | [Create Repricer Strategy](https://developer.walmart.com/api/us/mp/price#operation/createStrategy)                         | ✔️  |
| priceBulkUploads     | [Update bulk prices (Multiple)](https://developer.walmart.com/api/us/mp/price#operation/priceBulkUploads)                  | ✔️  |
| optCapProgramInPrice | [Set up CAP SKU All](https://developer.walmart.com/api/us/mp/price#operation/optCapProgramInPrice)                         | ✔️  |
| getStrategies        | [List of Repricer Strategies](https://developer.walmart.com/api/us/mp/price#operation/getStrategies)                       | ✔️  |

#### Promotions

| 🏷️方法名                     | 📚 官方文档地址                                                                                                                 | 状态  |
|:---------------------------|:--------------------------------------------------------------------------------------------------------------------------|:----|
| updatePromotionalPrice     | [Update a promotional price](https://developer.walmart.com/api/us/mp/promotion)                                           | ✔️  |
| updateBulkPromotionalPrice | [Updates bulk promotional prices](https://developer.walmart.com/api/us/mp/promotion#operation/updateBulkPromotionalPrice) | ✔️  |
| getPromotionalPrices       | [Promotional prices](https://developer.walmart.com/api/us/mp/promotion#operation/getPromotionalPrices)                    | ✔️  |

#### Orders

| 🏷️方法名               | 📚 官方文档地址                                                                                            | 状态  |
|:---------------------|:-----------------------------------------------------------------------------------------------------|:----|
| shipOrderLines       | [Ship Order Lines](https://developer.walmart.com/api/us/mp/orders#operation/shippingUpdates)         | ✔️  |
| refundOrderLines     | [Refund Order Lines](https://developer.walmart.com/api/us/mp/orders#operation/refundOrderLines)      | ✔️  |
| cancelOrderLines     | [Cancel Order Lines](https://developer.walmart.com/api/us/mp/orders#operation/cancelOrderLines)      | ✔️  |
| acknowledgeOrders    | [Acknowledge Orders](https://developer.walmart.com/api/us/mp/orders#operation/acknowledgeOrders)     | ✔️  |
| getAllOrders         | [All orders](https://developer.walmart.com/api/us/mp/orders#operation/getAllOrders)                  | ✔️  |
| getAnOrder           | [An order](https://developer.walmart.com/api/us/mp/orders#operation/getAnOrder)                      | ✔️  |
| getAllReleasedOrders | [All released orders](https://developer.walmart.com/api/us/mp/orders#operation/getAllReleasedOrders) | ✔️  |

#### Returns

| 🏷️方法名               | 📚 官方文档地址                                                                                               | 状态  |
|:---------------------|:--------------------------------------------------------------------------------------------------------|:----|
| refund               | [Issue refund](https://developer.walmart.com/api/us/mp/orders#operation/shippingUpdates)                | ✔️  |
| bulkItemOverrideFeed | [Return Item Overrides](https://developer.walmart.com/api/us/mp/returns#operation/bulkItemOverrideFeed) | ✔️  |
| getReturns           | [Returns](https://developer.walmart.com/api/us/mp/returns#operation/getReturns)                         | ✔️  |

#### Inventory

| 🏷️方法名                   | 📚 官方文档地址                                                                                                                                               | 状态  |
|:-------------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| getInventory             | [Inventory](https://developer.walmart.com/api/us/mp/inventory#operation/getInventory)                                                                   | ✔️  |
| updateInventory          | [Update inventory](https://developer.walmart.com/api/us/mp/inventory#operation/updateInventoryForAnItem)                                                | ✔️  |
| getMultiNodeInventory    | [Single Item Inventory by Ship Node](https://developer.walmart.com/api/us/mp/inventory#operation/getMultiNodeInventoryForSkuAndAllShipnodes)            | ✔️  |
| updateMultiNodeInventory | [Update Item Inventory per Ship Node](https://developer.walmart.com/api/us/mp/inventory#operation/updateMultiNodeInventory)                             | ✔️  |
| updateBulkInventory      | [Bulk Item Inventory Update](https://developer.walmart.com/api/us/mp/inventory#operation/updateBulkInventory)                                           | ✔️  |
| getMultiNodeInventories  | [Multiple Item Inventory for All Ship Nodes](https://developer.walmart.com/api/us/mp/inventory#operation/getMultiNodeInventoryForAllSkuAndAllShipNodes) | ✔️  |
| getWFSInventory          | [WFS Inventory](https://developer.walmart.com/api/us/mp/inventory#operation/getWFSInventory)                                                            | ✔️  |

#### Lag Time

| 🏷️方法名        | 📚 官方文档地址                                                                        | 状态  |
|:--------------|:---------------------------------------------------------------------------------|:----|
| updateLagTime | [Update lag time](https://developer.walmart.com/api/us/mp/lagtime)               | ⚠️️ |
| getLagTime    | [Lag Time](https://developer.walmart.com/api/us/mp/lagtime#operation/getLagTime) | ✔️  |

#### Settings

| 🏷️方法名                    | 📚 官方文档地址                                                                                                                                 | 状态  |
|:--------------------------|:------------------------------------------------------------------------------------------------------------------------------------------|:----|
| getTemplateDetails        | [Get Shipping Template Details](https://developer.walmart.com/api/us/mp/settings#operation/getShippingTemplateDetails)                    | ✔️  |
| updateTemplates           | [Update Shipping Templates](https://developer.walmart.com/api/us/mp/settings#operation/updateShippingTemplates)                           | ✔️  |
| deleteTemplateDetails     | [Delete Shipping Template](https://developer.walmart.com/api/us/mp/settings#operation/deleteShippingTemplateDetails)                      | ✔️  |
| getShipNodes              | [Get all fulfillment centers](https://developer.walmart.com/api/us/mp/settings#operation/getAllFulfillmentCenters)                        | ✔️  |
| updateShipNodes           | [Update fulfillment center](https://developer.walmart.com/api/us/mp/settings#operation/updateFulfillmentCenter)                           | ✔️  |
| createShipNodes           | [Create fulfillment center](https://developer.walmart.com/api/us/mp/settings#operation/createFulfillmentCenter)                           | ✔️  |
| getShippingTemplates      | [Get All Shipping Templates](https://developer.walmart.com/api/us/mp/settings#operation/getAllShippingTemplates)                          | ✔️  |
| createShippingTemplates   | [Create Shipping Templates](https://developer.walmart.com/api/us/mp/settings#operation/createShippingTemplates)                           | ✔️  |
| thirdPartyShipNodes       | [Third party fulfillment center association](https://developer.walmart.com/api/us/mp/settings#operation/associate3PFulfillmentCenter)     | ✔️  |
| getShippingConfigurations | [Get Shipping Configurations](https://developer.walmart.com/api/us/mp/settings#operation/getShippingConfigurations)                       | ✔️  |
| activationStatus          | [Get Shipping Template Activation Status](https://developer.walmart.com/api/us/mp/settings#operation/getShippingTemplateActivationStatus) | ✔️  |
| getShipNodesCoverage      | [Get coverage for fulfillment centers](https://developer.walmart.com/api/us/mp/settings#operation/getCoverageForFulfillmentCenters)       | ✔️  |
| getCarrierMethods         | [Get carrier methods](https://developer.walmart.com/api/us/mp/settings#operation/getCarrierMethods)                                       | ✔️  |
| get3PFulfillmentProviders | [Get all third party fulfillment providers](https://developer.walmart.com/api/us/mp/settings#operation/get3PFulfillmentProviders)         | ✔️  |
| getPartnerConfigurations  | [Get Partner Configurations](https://developer.walmart.com/api/us/mp/settings#operation/getPartnerConfigurations)                         | ✔️  |

#### Rules

| 🏷️方法名                   | 📚 官方文档地址                                                                                                         | 状态  |
|:-------------------------|:------------------------------------------------------------------------------------------------------------------|:----|
| inactivateRule           | [Inactivate rule](https://developer.walmart.com/api/us/mp/rules#operation/inactivateRule)                         | ✔️  |
| getAllExceptions         | [Gets all exceptions](https://developer.walmart.com/api/us/mp/rules#operation/getAllExceptions)                   | ✔️  |
| deleteExceptions         | [Delete exceptions](https://developer.walmart.com/api/us/mp/rules#operation/deleteExceptions)                     | ✔️  |
| createExceptions         | [Create override exceptions](https://developer.walmart.com/api/us/mp/rules#operation/createOverrideExceptions)    | ✔️  |
| changeAssortmentType     | [Change assortment type](https://developer.walmart.com/api/us/mp/rules#operation/changeAssortmentType)            | ✔️  |
| activateRule             | [Activate rule](https://developer.walmart.com/api/us/mp/rules#operation/activateRule)                             | ✔️  |
| updateShippingAreaToRule | [Update shipping area to rules](https://developer.walmart.com/api/us/mp/rules#operation/updateShippingAreaToRule) | ✔️  |
| getAllRules              | [Get all rules](https://developer.walmart.com/api/us/mp/rules#operation/getAllRules)                              | ✔️  |
| updateRule               | [Update rule](https://developer.walmart.com/api/us/mp/rules#operation/updateRule)                                 | ✔️  |
| ruleCreate               | [Create a new Rule](https://developer.walmart.com/api/us/mp/rules#operation/createItemRule)                       | ✔️  |
| getRule                  | [Get a rule](https://developer.walmart.com/api/us/mp/rules#operation/getARule)                                    | ✔️  |
| getSimulationResult      | [Get simulation result](https://developer.walmart.com/api/us/mp/rules#operation/getSimulationResult)              | ✔️  |
| downloadSimulationResult | [Download simulation result](https://developer.walmart.com/api/us/mp/rules#operation/downloadSimulationResult)    | ✔️  |
| getAllSubCategories      | [Get all sub-categories](https://developer.walmart.com/api/us/mp/rules#operation/getAllSubCategories)             | ✔️  |
| downloadExceptions       | [Download exceptions](https://developer.walmart.com/api/us/mp/rules#operation/downloadExceptions)                 | ✔️  |
| getAllAreas              | [Get all areas](https://developer.walmart.com/api/us/mp/rules#operation/getAllAreas)                              | ✔️  |
| deleteRule               | [Delete rule](https://developer.walmart.com/api/us/mp/rules#operation/deleteRule)                                 | ✔️  |

#### Reports

| 🏷️方法名                | 📚 官方文档地址                                                                                                                           | 状态  |
|:----------------------|:------------------------------------------------------------------------------------------------------------------------------------|:----|
| reconReport           | [Recon report / (Legacy)](https://developer.walmart.com/api/us/mp/reports#operation/getReconReportV1)                               | ✔️  |
| availableReconFiles   | [Available recon report dates / (Legacy)](https://developer.walmart.com/api/us/mp/reports#operation/getAvailableV1ReconReportDates) | ✔️  |
| getPartnerStatement   | [Payment Statement Report](https://developer.walmart.com/api/us/mp/reports#operation/getPartnerStatement)                           | ✔️  |
| getPartnerPerformance | [Performance Report](https://developer.walmart.com/api/us/mp/reports#operation/getPartnerPerformance)                               | ✔️  |

#### On-Request Report

| 🏷️方法名            | 📚 官方文档地址                                                                                                            | 状态  |
|:------------------|:---------------------------------------------------------------------------------------------------------------------|:----|
| getReportRequests | [Get All Report Requests](https://developer.walmart.com/api/us/mp/onrequestreports#operation/getRequestsStatus)      | ✔️  |
| generateReport    | [Create Report Request](https://developer.walmart.com/api/us/mp/onrequestreports#operation/generateReport)           | ✔️  |
| getSingleRequest  | [Get All Report Requests](https://developer.walmart.com/api/us/mp/onrequestreports#operation/getSingleRequestStatus) | ✔️  |
| downloadReport    | [Get All Report Requests](https://developer.walmart.com/api/us/mp/onrequestreports#operation/downloadReport)         | ✔️  |

#### Walmart Fulfillment Services

| 🏷️方法名                       | 📚 官方文档地址                                                                                                                                  | 状态  |
|:-----------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------|:----|
| updateShipmentQuantity       | [Update Shipment Quantities](https://developer.walmart.com/api/us/mp/fulfillment#operation/updateShipmentQuantity)                         | ✔️  |
| onholdSearch                 | [Hazmat Items On hold](https://developer.walmart.com/api/us/mp/fulfillment#operation/wercsFeedback)                                        | ✔️  |
| shipmentTracking             | [Update Shipment Tracking](https://developer.walmart.com/api/us/mp/fulfillment#operation/updateShipmentTrackingDetails)                    | ✔️  |
| shipmentLabel                | [Create Inbound Shipment label](https://developer.walmart.com/api/us/mp/fulfillment#operation/createInboundShipmentLabelV2)                | ✔️  |
| createFulfillment            | [Create Customer Order](https://developer.walmart.com/api/us/mp/fulfillment#operation/createFulfillment)                                   | ✔️  |
| fetchOrderPromiseOptions     | [Fetch Delivery Promise Details](https://developer.walmart.com/api/us/mp/fulfillment#operation/promiseFulfillments)                        | ✔️  |
| cancelFulfillment            | [Cancel Customer Order](https://developer.walmart.com/api/us/mp/fulfillment#operation/cancelFulfillment)                                   | ✔️  |
| getInboundShipments          | [Get Shipments](https://developer.walmart.com/api/us/mp/fulfillment#operation/getInboundShipments)                                         | ✔️  |
| createShipment               | [Create Inbound Shipment](https://developer.walmart.com/api/us/mp/fulfillment#operation/createShipment)                                    | ✔️  |
| inboundPreview               | [Fetch Inbound Preview](https://developer.walmart.com/api/us/mp/fulfillment#operation/inboundPreview)                                      | ✔️  |
| getCarrierRateQuote          | [Get Carrier Rate Quote](https://developer.walmart.com/api/us/mp/fulfillment#operation/getCarrierRateQuote)                                | ✔️  |
| createCarrierRateQuotes      | [Create Carrier Rate Quote](https://developer.walmart.com/api/us/mp/fulfillment#operation/createCarrierRateQuotes)                         | ✔️  |
| confirmCarrierRateQuote      | [Confirm Carrier Rate Quote](https://developer.walmart.com/api/us/mp/fulfillment#operation/confirmCarrierRateQuote)                        | ✔️  |
| printCarrierLabel            | [Print Carrier Label](https://developer.walmart.com/api/us/mp/fulfillment#operation/printCarrierLabel)                                     | ✔️  |
| convertItemForWfs            | [Convert items for WFS](https://developer.walmart.com/api/us/mp/fulfillment#operation/convertItemForWfs)                                   | ✔️  |
| getInventoryHealthReport     | [Get WFS Inventory Health Report](https://developer.walmart.com/api/us/mp/fulfillment#operation/getInventoryHealthReport)                  | ✔️  |
| getFulfillmentOrdersStatus   | [Get fulfillment orders status](https://developer.walmart.com/api/us/mp/fulfillment#operation/getFulfillmentOrdersStatus)                  | ✔️  |
| ~~                           |                                                                                                                                            |     |
| createInboundShipmentLabel~~ | ~~[Create Inbound Shipment label (deprecated)](https://developer.walmart.com/api/us/mp/fulfillment#operation/createInboundShipmentLabel)~~ | ✔️  |
| getWFSInventoryLog           | [Get Inventory Log for a WFS item](https://developer.walmart.com/api/us/mp/fulfillment#operation/getWFSInventoryLog)                       | ✔️  |
| getInboundShipmentItems      | [Get Inbound Shipment Items](https://developer.walmart.com/api/us/mp/fulfillment#operation/getInboundShipmentItems)                        | ✔️  |
| getInboundOrderErrors        | [Get Inbound Shipment errors](https://developer.walmart.com/api/us/mp/fulfillment#operation/getInboundOrderErrors)                         | ✔️  |
| cancelShipment               | [Cancel Inbound Shipment](https://developer.walmart.com/api/us/mp/fulfillment#operation/cancelShipment)                                    | ✔️  |
| cancelCarrierRateQuote       | [Cancel Carrier Rate Quote](https://developer.walmart.com/api/us/mp/fulfillment#operation/voidCarrierRateQuote)                            | ✔️  |

#### Notifications

| 🏷️方法名              | 📚 官方文档地址                                                                                                 | 状态  |
|:--------------------|:----------------------------------------------------------------------------------------------------------|:----|
| testNotification    | [Test Notification](https://developer.walmart.com/api/us/mp/notifications#operation/testNotification)     | ✔️  |
| getAllSubscriptions | [All subscriptions](https://developer.walmart.com/api/us/mp/notifications#operation/getAllSubscriptions)  | ✔️  |
| createSubscription  | [Create subscription](https://developer.walmart.com/api/us/mp/notifications#operation/createSubscription) | ✔️  |
| deleteSubscription  | [Delete Subscription](https://developer.walmart.com/api/us/mp/notifications#operation/deleteSubscription) | ✔️  |
| updateSubscription  | [Update Subscription](https://developer.walmart.com/api/us/mp/notifications#operation/updateSubscription) | ✔️  |
| getEventTypes       | [Event Types](https://developer.walmart.com/api/us/mp/notifications#operation/getEventTypes)              | ✔️  |

#### Utilities

| 🏷️方法名               | 📚 官方文档地址                                                                                               | 状态  |
|:---------------------|:--------------------------------------------------------------------------------------------------------|:----|
| getUtilityTaxonomy   | [Taxonomy by spec](https://developer.walmart.com/api/us/mp/utilities#operation/getTaxonomyResponse)     | ✔️  |
| getDepartmentList    | [All Departments](https://developer.walmart.com/api/us/mp/utilities#operation/getDepartmentList)        | ✔️  |
| getCategories        | [All Categories](https://developer.walmart.com/api/us/mp/utilities#operation/getCategories)             | ✔️  |
| getApiPlatformStatus | [API Platform Status](https://developer.walmart.com/api/us/mp/utilities#operation/getApiPlatformStatus) | ✔️  |

#### Insights

| 🏷️方法名                  | 📚 官方文档地址                                                                                                              | 状态  |
|:------------------------|:-----------------------------------------------------------------------------------------------------------------------|:----|
| itemListingDetails      | [Item Listing Quality Details](https://developer.walmart.com/api/us/mp/insights#operation/itemsDetailsForListing)      | ✔️  |
| getProSellerBadgeInfo   | [Pro Seller Badge Status](https://developer.walmart.com/api/us/mp/insights#operation/getProSellerBadgeInfo)            | ✔️  |
| getUnpublishedItems     | [Unpublished Items](https://developer.walmart.com/api/us/mp/insights#operation/getUnpublishedItems)                    | ✔️  |
| getUnpublishedItemCount | [Unpublished Item Counts](https://developer.walmart.com/api/us/mp/insights#operation/getUnpublishedItemCount)          | ✔️  |
| getTrendingItems        | [Top Trending Items](https://developer.walmart.com/api/us/mp/insights#operation/getTrendingResult)                     | ✔️  |
| listingQualityScore     | [Seller Listing Quality Score](https://developer.walmart.com/api/us/mp/insights#operation/getListingQualityScore)      | ✔️  |
| listingQualityCount     | [Item count with listing quality issues](https://developer.walmart.com/api/us/mp/insights#operation/getCategoriesList) | ✔️  |

#### Reviews

| 🏷️方法名               | 📚 官方文档地址                                                                                                 | 状态  |
|:---------------------|:----------------------------------------------------------------------------------------------------------|:----|
| bulkUpdateItemStatus | [Bulk update item status](https://developer.walmart.com/api/us/mp/reviews#operation/bulkUpdateItemStatus) | ✔️  |
| getIrpItems          | [Get RAP post-purchase items](https://developer.walmart.com/api/us/mp/reviews#operation/getIrpItems)      | ✔️  |
| getIrpCategories     | [Get categories](https://developer.walmart.com/api/us/mp/reviews#operation/getIrpCategories)              | ✔️  |

#### Assortment Recommendations

| 🏷️方法名                  | 📚 官方文档地址                                                                                                                                             | 状态  |
|:------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| rejectRecommendations   | [Reject Recommendations](https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/rejectAssortmentRecommendations)                 | ✔️  |
| getRecommendations      | [Get Recommendations](https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/getAssortmentRecommendations)                       | ✔️  |
| downloadRecommendations | [Download Recommendations](https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/createFileOnRequest)                           | ✔️  |
| getCategorization       | [Get Categorization](https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/getCategorizationDetailsOfAssortmentRecommendations) | ✔️  |
| getFileOnRequestStatus  | [Get Download Request Status](https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/getFileOnRequestStatus)                     | ✔️  |
| getDownloadUrl          | [Get Download URL](https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/downloadFileAsPerTheRequestId)                         | ✔️  |

#### Shipping

| 🏷️方法名                 | 📚 官方文档地址                                                                                                       | 状态  |
|:-----------------------|:----------------------------------------------------------------------------------------------------------------|:----|
| createLabel            | [Create label](https://developer.walmart.com/api/us/mp/sww#operation/createLabel)                               | ✔️  |
| getShippingEstimate    | [Shipping estimates](https://developer.walmart.com/api/us/mp/sww#operation/getShippingEstimate)                 | ✔️  |
| getLabel               | [Labels detail by purchase order id](https://developer.walmart.com/api/us/mp/sww#operation/getLabel)            | ✔️  |
| getCarriers            | [Supported carriers](https://developer.walmart.com/api/us/mp/sww#operation/getCarriers)                         | ✔️  |
| downloadLabel          | [Download label](https://developer.walmart.com/api/us/mp/sww#operation/getLabelByTrackingAndCarrier)            | ✔️  |
| discardLabel           | [Discard label](https://developer.walmart.com/api/us/mp/sww#operation/discardLabel)                             | ✔️  |
| getCarrierPackageTypes | [Supported carrier package types](https://developer.walmart.com/api/us/mp/sww#operation/getCarrierPackageTypes) | ✔️  |
