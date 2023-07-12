wish-sdk
======

主要是封装了 跨境电商 [wish 商户平台](https://china-merchant.wish.com/documentation/api/v3/explorer) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>wish-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [WishClient](https://github.com/EalenXie/sdk-all/blob/main/wish-sdk/src/main/java/io/github/ealenxie/wish/WishClient.java) 已支持的接口列表

| 接口名              | 方法名          | 官方文档地址                                                                                                                 | 状态  |
|:-----------------|:-------------|:-----------------------------------------------------------------------------------------------------------------------|:----|
| 获取授权地址           | authorize    | [Authorization URL](https://china-merchant.wish.com/documentation/api/v3/reference#section/Authentication)             | ✔️  |
| 授权码模式accessToken | accessToken  | [Retrieve an access token](https://china-merchant.wish.com/documentation/api/v3/reference#section/Authentication)      | ✔️  |
| 刷新授权             | refreshToken | [Obtain a new token](https://www.merchant.wish.com/documentation/api/v3/reference#operation/oauthRefreshToken)         | ✔️  |
| 验证令牌是否有效         | oauthTest    | [Test if an access token is valid](https://china-merchant.wish.com/documentation/api/v3/reference#operation/oauthTest) | ✔️  |

#### [WishOrderClient](https://github.com/EalenXie/sdk-all/blob/main/wish-sdk/src/main/java/io/github/ealenxie/wish/WishOrderClient.java) 已支持的接口列表

##### Brands

| 方法名        | 官方文档地址                                                                                                                                 | 状态  |
|:-----------|:---------------------------------------------------------------------------------------------------------------------------------------|:----|
| listBrands | [Get a list of brands from a particular ID range](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listBrands) | ✔️  |

##### Bulk Products

| 方法名                     | 官方文档地址                                                                                                                                 | 状态  |
|:------------------------|:---------------------------------------------------------------------------------------------------------------------------------------|:----|
| getProducts             | [Get products](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getProducts)                                   | ✔️  |
| getUpdateProductsStatus | [Get the update products job status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getUpdateProductsStatus) | ✔️  |
| updateProducts          | [Update products](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateProducts)                             | ✔️  |
| getGetProductsStatus    | [Get the get products job status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getGetProductsStatus)       | ✔️  |

##### Currencies

| 方法名           | 官方文档地址                                                                                                                | 状态  |
|:--------------|:----------------------------------------------------------------------------------------------------------------------|:----|
| getCurrencies | [Get supported currency list](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getCurrencies) | ✔️  |

##### EU Product Compliance

| 方法名                             | 官方文档地址                                                                                                                                          | 状态  |
|:--------------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| updateEUResponsiblePerson       | [Update an EU Responsible Person](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateEUResponsiblePerson)           | ✔️  |
| getEUResponsiblePerson          | [Get an EU Responsible Person](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getEUResponsiblePerson)                 | ✔️  |
| deleteEUResponsiblePerson       | [Delete an EU Responsible Person](https://china-merchant.wish.com/documentation/api/v3/reference#operation/deleteEUResponsiblePerson)           | ✔️  |
| bulkUpdateProducts              | [Bulk Update EU Product Compliance Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/BulkUpdateProducts)         | ✔️  |
| getBulkUpdateStatus             | [Get Bulk Update Job Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetBulkUpdateStatus)                      | ✔️  |
| updateEUProductComplianceStatus | [Update EU Product Compliance Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateEUProductComplianceStatus) | ✔️  |
| getEUProductComplianceStatus    | [Get EU Product Compliance Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getEUProductComplianceStatus)       | ✔️  |
| createEUResponsiblePerson       | [Update an EU Responsible Person](https://china-merchant.wish.com/documentation/api/v3/reference#operation/createEUResponsiblePerson)           | ✔️  |
| listEUResponsiblePerson         | [List EU Responsible Persons](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listEUResponsiblePerson)                 | ✔️  |

##### FBS

| 方法名                | 官方文档地址                                                                                                                                  | 状态  |
|:-------------------|:----------------------------------------------------------------------------------------------------------------------------------------|:----|
| fbsVariation       | [Get FBS related data for a variation](https://china-merchant.wish.com/documentation/api/v3/reference#operation/fbsVariation)           | ✔️  |
| fbsRecommendations | [Get FBS inbound shipping recommendations](https://china-merchant.wish.com/documentation/api/v3/reference#operation/fbsRecommendations) | ✔️  |

| 方法名                 | 官方文档地址                                                                                                                         | 状态  |
|:--------------------|:-------------------------------------------------------------------------------------------------------------------------------|:----|
| getOrder            | [Get an order](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetOrder)                              | ✔️  |
| getOrders           | [List orders](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetMultipleOrders)                      | ✔️  |
| shippingCarriers    | [Get accepted shipping carriers](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetShippingCarriers) | ✔️  |
| batchDownloadOrders | [Batch download orders](https://china-merchant.wish.com/documentation/api/v3/reference#operation/downloadOrders)               | ✔️  |
| shipOrder           | [Ship or update tracking](https://china-merchant.wish.com/documentation/api/v3/reference#operation/ShipOrder)                  | ✔️  |
| refundReasons       | [Get valid refund reasons](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetValidRefundReasons)     | ✔️  |
| refund              | [Refund/Cancel an order](https://china-merchant.wish.com/documentation/api/v3/reference#operation/RefundOrder)                 | ✔️  |
| updateLTLOrder      | [Update an LTL order](https://china-merchant.wish.com/documentation/api/v3/reference#operation/UpdateOrder)                    | ✔️  |
| modifyAddress       | [Modify shipping address](https://china-merchant.wish.com/documentation/api/v3/reference#operation/ModifyAddress)              | ✔️  |
