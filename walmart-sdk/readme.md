walmart-sdk
======

主要是封装了 跨境电商 [walmart 商户平台](https://developer.walmart.com/api/us/mp/orders) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>walmart-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [WalmartFeedClient](https://github.com/EalenXie/sdk-all/blob/main/walmart-sdk/src/main/java/io/github/ealenxie/walmart/marketplace/WalmartFeedClient.java) 已支持的接口列表

#### Feeds

| 方法名               | 官方文档地址                                                                                              | 状态  |
|:------------------|:----------------------------------------------------------------------------------------------------|:----|
| getFeeds          | [All feed statuses](https://developer.walmart.com/api/us/mp/feeds)                                  | ✔️  |
| getFeedItemStatus | [Feed item status](https://developer.walmart.com/api/us/mp/feeds#operation/getFeedItemStatus)       | ✔️  |
| itemBulkUploads   | [Get Feed Error Report](https://developer.walmart.com/api/us/mp/feeds#operation/getFeedErrorReport) | ✔️  |

#### Items

| 方法名                 | 官方文档地址                                                                                                | 状态  |
|:--------------------|:------------------------------------------------------------------------------------------------------|:----|
| getCatalogSearch    | [Catalog Search](https://developer.walmart.com/api/us/mp/items#operation/getCatalogSearch)            | ✔️  |
| getItemAssociations | [Get Item Associations](https://developer.walmart.com/api/us/mp/items#operation/getItemAssociations)  | ✔️  |
| getFeedErrorReport  | [Bulk Item Setup](https://developer.walmart.com/api/us/mp/items#operation/itemBulkUploads)            | ✔️  |
| getAllItems         | [All items](https://developer.walmart.com/api/us/mp/items#operation/getAllItems)                      | ✔️  |
| getItem             | [An item](https://developer.walmart.com/api/us/mp/items#operation/getAnItem)                          | ✔️  |
| getSearchResult     | [Item Search](https://developer.walmart.com/api/us/mp/items#operation/getSearchResult)                | ✔️  |
| getTaxonomy         | [Taxonomy](https://developer.walmart.com/api/us/mp/items#operation/getTaxonomyResponse)               | ✔️  |
| getVariantCount     | [Get item count by groups](https://developer.walmart.com/api/us/mp/items#operation/getVariantCount)   | ✔️  |
| getCountByStatus    | [Get items count by status](https://developer.walmart.com/api/us/mp/items#operation/getCountByStatus) | ✔️  |
| retireItem          | [Retire an item](https://developer.walmart.com/api/us/mp/items#operation/retireAnItem)                | ✔️  |

#### [WalmartClient](https://github.com/EalenXie/sdk-all/blob/main/walmart-sdk/src/main/java/io/github/ealenxie/walmart/marketplace/WalmartClient.java) 已支持的接口列表

| 接口名           | 方法名         | 官方文档地址                                                                       | 状态  |
|:--------------|:------------|:-----------------------------------------------------------------------------|:----|
| 获取accessToken | accessToken | [Token API](https://developer.walmart.com/api/us/mp/auth#operation/tokenAPI) | ✔️  |

#### [WalmartOrderClient](https://github.com/EalenXie/sdk-all/blob/main/walmart-sdk/src/main/java/io/github/ealenxie/walmart/marketplace/WalmartOrderClient.java) 已支持的接口列表

| 方法名                  | 官方文档地址                                                                                               | 状态  |
|:---------------------|:-----------------------------------------------------------------------------------------------------|:----|
| shipOrderLines       | [Ship Order Lines](https://developer.walmart.com/api/us/mp/orders#operation/shippingUpdates)         | ✔️  |
| refundOrderLines     | [Refund Order Lines](https://developer.walmart.com/api/us/mp/orders#operation/refundOrderLines)      | ✔️  |
| cancelOrderLines     | [Cancel Order Lines](https://developer.walmart.com/api/us/mp/orders#operation/cancelOrderLines)      | ✔️  |
| acknowledgeOrders    | [Acknowledge Orders](https://developer.walmart.com/api/us/mp/orders#operation/acknowledgeOrders)     | ✔️  |
| getAllOrders         | [All orders](https://developer.walmart.com/api/us/mp/orders#operation/getAllOrders)                  | ✔️  |
| getAnOrder           | [An order](https://developer.walmart.com/api/us/mp/orders#operation/getAnOrder)                      | ✔️  |
| getAllReleasedOrders | [All released orders](https://developer.walmart.com/api/us/mp/orders#operation/getAllReleasedOrders) | ✔️  |

#### Reports

| 方法名                   | 官方文档地址                                                                                                                              | 状态  |
|:----------------------|:------------------------------------------------------------------------------------------------------------------------------------|:----|
| reconReport           | [Recon report / (Legacy)](https://developer.walmart.com/api/us/mp/reports#operation/getReconReportV1)                               | ✔️  |
| availableReconFiles   | [Available recon report dates / (Legacy)](https://developer.walmart.com/api/us/mp/reports#operation/getAvailableV1ReconReportDates) | ✔️  |
| getPartnerStatement   | [Payment Statement Report](https://developer.walmart.com/api/us/mp/reports#operation/getPartnerStatement)                           | ✔️  |
| getPartnerPerformance | [Performance Report](https://developer.walmart.com/api/us/mp/reports#operation/getPartnerPerformance)                               | ✔️  |

#### Insights

##### Insight

| 方法名                | 官方文档地址                                                                                                            | 状态  |
|:-------------------|:------------------------------------------------------------------------------------------------------------------|:----|
| itemListingDetails | [Item Listing Quality Details](https://developer.walmart.com/api/us/mp/insights#operation/itemsDetailsForListing) | ✔️  |

#### Reviews

| 方法名                  | 官方文档地址                                                                                                    | 状态  |
|:---------------------|:----------------------------------------------------------------------------------------------------------|:----|
| bulkUpdateItemStatus | [Bulk update item status](https://developer.walmart.com/api/us/mp/reviews#operation/bulkUpdateItemStatus) | ✔️  |
| getIrpItems          | [Get RAP post-purchase items](https://developer.walmart.com/api/us/mp/reviews#operation/getIrpItems)      | ✔️  |
| getIrpCategories     | [Get categories](https://developer.walmart.com/api/us/mp/reviews#operation/getIrpCategories)              | ✔️  |

#### Assortment Recommendations

| 方法名                     | 官方文档地址                                                                                                                                                | 状态  |
|:------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| rejectRecommendations   | [Reject Recommendations](https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/rejectAssortmentRecommendations)                 | ✔️  |
| getRecommendations      | [Get Recommendations](https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/getAssortmentRecommendations)                       | ✔️  |
| downloadRecommendations | [Download Recommendations](https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/createFileOnRequest)                           | ✔️  |
| getCategorization       | [Get Categorization](https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/getCategorizationDetailsOfAssortmentRecommendations) | ✔️  |
| getFileOnRequestStatus  | [Get Download Request Status](https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/getFileOnRequestStatus)                     | ✔️  |
| getDownloadUrl          | [Get Download URL](https://developer.walmart.com/api/us/mp/assortmentrecommendations#operation/downloadFileAsPerTheRequestId)                         | ✔️  |

#### Shipping

| 方法名                    | 官方文档地址                                                                                                          | 状态  |
|:-----------------------|:----------------------------------------------------------------------------------------------------------------|:----|
| createLabel            | [Create label](https://developer.walmart.com/api/us/mp/sww#operation/createLabel)                               | ✔️  |
| getShippingEstimate    | [Shipping estimates](https://developer.walmart.com/api/us/mp/sww#operation/getShippingEstimate)                 | ✔️  |
| getLabel               | [Labels detail by purchase order id](https://developer.walmart.com/api/us/mp/sww#operation/getLabel)            | ✔️  |
| getCarriers            | [Supported carriers](https://developer.walmart.com/api/us/mp/sww#operation/getCarriers)                         | ✔️  |
| downloadLabel          | [Download label](https://developer.walmart.com/api/us/mp/sww#operation/getLabelByTrackingAndCarrier)            | ✔️  |
| discardLabel           | [Discard label](https://developer.walmart.com/api/us/mp/sww#operation/discardLabel)                             | ✔️  |
| getCarrierPackageTypes | [Supported carrier package types](https://developer.walmart.com/api/us/mp/sww#operation/getCarrierPackageTypes) | ✔️  |
