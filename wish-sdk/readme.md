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

| 方法名                       | 官方文档地址                                                                                                                                          | 状态  |
|:--------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| updateEuResponsiblePerson | [Update an EU Responsible Person](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateEUResponsiblePerson)           | ✔️  |
| getEuResponsiblePerson    | [Get an EU Responsible Person](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getEUResponsiblePerson)                 | ✔️  |
| deleteEuResponsiblePerson | [Delete an EU Responsible Person](https://china-merchant.wish.com/documentation/api/v3/reference#operation/deleteEUResponsiblePerson)           | ✔️  |
| bulkUpdateProducts        | [Bulk Update EU Product Compliance Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/BulkUpdateProducts)         | ✔️  |
| getBulkUpdateStatus       | [Get Bulk Update Job Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetBulkUpdateStatus)                      | ✔️  |
| updateEuComplianceStatus  | [Update EU Product Compliance Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateEUProductComplianceStatus) | ✔️  |
| getEuComplianceStatus     | [Get EU Product Compliance Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getEUProductComplianceStatus)       | ✔️  |
| createEuResponsiblePerson | [Update an EU Responsible Person](https://china-merchant.wish.com/documentation/api/v3/reference#operation/createEUResponsiblePerson)           | ✔️  |
| listEuResponsiblePerson   | [List EU Responsible Persons](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listEUResponsiblePerson)                 | ✔️  |

##### FBS

| 方法名                | 官方文档地址                                                                                                                                  | 状态  |
|:-------------------|:----------------------------------------------------------------------------------------------------------------------------------------|:----|
| fbsVariation       | [Get FBS related data for a variation](https://china-merchant.wish.com/documentation/api/v3/reference#operation/fbsVariation)           | ✔️  |
| fbsRecommendations | [Get FBS inbound shipping recommendations](https://china-merchant.wish.com/documentation/api/v3/reference#operation/fbsRecommendations) | ✔️  |

##### France EPR Compliance

| 方法名                       | 官方文档地址                                                                                                                                                                         | 状态  |
|:--------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| updateFraComplianceStatus | [Bulk update France EPR Product Compliance Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateFranceEPRProductComplianceStatus)            | ✔️  |
| getFraComplianceStatus    | [Get France EPR Product Compliance Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getFranceEPRProductComplianceStatus)                       | ✔️  |
| createFraUniqueIdNumber   | [Create a France Product Unique Identification Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/createFranceProductUniqueIdentificationNumber) | ✔️  |
| listFraUniqueIdNumber     | [List France Product Unique Identification Numbers](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listFranceProductUniqueIdentificationNumber)      | ✔️  |
| updateFraUniqueIdNumber   | [Update a France Product Unique Identification Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateFranceProductUniqueIdentificationNumber) | ✔️  |
| getFraUniqueIdNumber      | [Get a France Product Unique Identification Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getFranceProductUniqueIdentificationNumber)       | ✔️  |
| deleteFraUniqueIdNumber   | [Delete a France Product Unique Identification Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/deleteFranceProductUniqueIdentificationNumber) | ✔️  |

##### Germany EPR Compliance

| 方法名                         | 官方文档地址                                                                                                                                                                 | 状态  |
|:----------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| createGerRegistrationNumber | [Create a Germany Product EPR Registration Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/createGermanyProductEprRegistrationNumber) | ✔️  |
| listGerRegistrationNumbers  | [List Germany EPR Registration Numbers](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listGermanyProductEprRegistrationNumbers)             | ✔️  |
| updateGerComplianceStatus   | [Bulk update Germany EPR Product Compliance Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateGermanyEPRProductComplianceStatus)  | ✔️  |
| getGerComplianceStatus      | [Get Germany EPR Product Compliance Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getGermanyEPRProductComplianceStatus)             | ✔️  |
| updateGerRegistrationNumber | [Update a Germany Product EPR Registration Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateGermanyProductEprRegistrationNumber) | ✔️  |
| getGerRegistrationNumber    | [Get a Germany Product EPR Registration Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getGermanyProductEprRegistrationNumber)       | ✔️  |
| deleteGerRegistrationNumber | [Delete a Germany Product EPR Registration Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/deleteGermanyProductEprRegistrationNumber) | ✔️  |

##### Merchant

| 方法名                      | 官方文档地址                                                                                                                            | 状态  |
|:-------------------------|:----------------------------------------------------------------------------------------------------------------------------------|:----|
| getCurrencySettings      | [Get merchant currency settings](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getCurrencySettings)    | ✔️  |
| updateWarehouse          | [Update warehouse information](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateWarehouse)          | ✔️  |
| getSettings              | [Get merchant settings](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getSettings)                     | ✔️  |
| createWarehouse          | [Create a warehouse](https://china-merchant.wish.com/documentation/api/v3/reference#operation/createWarehouse)                    | ✔️  |
| listWarehouses           | [Create a warehouse](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listWarehouses)                     | ✔️  |
| updateShippingSettings   | [Update shipping settings](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateShippingSettings)       | ✔️  |
| listShippingSettings     | [Get shipping settings](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listShippingSettings)            | ✔️  |
| getMerchantAccountDetail | [Get merchant account details](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getMerchantAccountDetail) | ✔️  |

##### Orders

| 方法名                 | 官方文档地址                                                                                                                         | 状态  |
|:--------------------|:-------------------------------------------------------------------------------------------------------------------------------|:----|
| getOrder            | [Get an order](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetOrder)                              | ✔️  |
| getMultipleOrders   | [List orders](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetMultipleOrders)                      | ✔️  |
| shippingCarriers    | [Get accepted shipping carriers](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetShippingCarriers) | ✔️  |
| batchDownloadOrders | [Batch download orders](https://china-merchant.wish.com/documentation/api/v3/reference#operation/downloadOrders)               | ✔️  |
| shipOrder           | [Ship or update tracking](https://china-merchant.wish.com/documentation/api/v3/reference#operation/ShipOrder)                  | ✔️  |
| refundReasons       | [Get valid refund reasons](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetValidRefundReasons)     | ✔️  |
| refund              | [Refund/Cancel an order](https://china-merchant.wish.com/documentation/api/v3/reference#operation/RefundOrder)                 | ✔️  |
| updateOrder         | [Update an LTL order](https://china-merchant.wish.com/documentation/api/v3/reference#operation/UpdateOrder)                    | ✔️  |
| modifyAddress       | [Modify shipping address](https://china-merchant.wish.com/documentation/api/v3/reference#operation/ModifyAddress)              | ✔️  |

##### Payments

| 方法名                     | 官方文档地址                                                                                                                                          | 状态  |
|:------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| downloadPaymentInvoices | [Batch download invoices](https://china-merchant.wish.com/documentation/api/v3/reference#operation/downloadPaymentInvoices)                     | ✔️  |
| getPaymentInvoices      | [Get batch invoice download job status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getPaymentInvoicesDownloadJob) | ✔️  |
| getEarlyPayment         | [Get merchant early payment info](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getEarlyPayment)                     | ✔️  |


##### Webhook

| 方法名                | 官方文档地址                                                                                                             | 状态  |
|:-------------------|:-------------------------------------------------------------------------------------------------------------------|:----|
| createSubscription | [Create a Subscription](https://www.merchant.wish.com/documentation/api/v3/reference#operation/createSubscription) | ✔️  |
| getSubscriptions   | [List Subscriptions](https://www.merchant.wish.com/documentation/api/v3/reference#operation/listSubscriptions)     | ✔️  |
| updateSubscription | [Update a Subscription](https://www.merchant.wish.com/documentation/api/v3/reference#operation/updateSubscription) | ✔️  |
| getSubscription    | [Get a Subscription](https://www.merchant.wish.com/documentation/api/v3/reference#operation/getSubscription)       | ✔️  |
| deleteSubscription | [Delete a Subscription](https://www.merchant.wish.com/documentation/api/v3/reference#operation/deleteSubscription) | ✔️  |
| getTopics          | [List Topics](https://www.merchant.wish.com/documentation/api/v3/reference#operation/getTopics)                    | ✔️  |


##### Wish Parcel

| 方法名                | 官方文档地址                                                                                                                         | 状态  |
|:-------------------|:-------------------------------------------------------------------------------------------------------------------------------|:----|
| createShipment     | [Create a Wish Parcel shipment](https://www.merchant.wish.com/documentation/api/v3/reference#operation/wpsCreateShipment)      | ✔️  |
| getShipments       | [List Wish Parcel shipments](https://www.merchant.wish.com/documentation/api/v3/reference#operation/wpsListShipments)          | ✔️  |
| modifyShipment     | [Modify a paid Wish Parcel shipment](https://www.merchant.wish.com/documentation/api/v3/reference#operation/wpsModifyShipment) | ✔️  |
| getShippingOptions | [Get Wish Parcel shipping options](https://www.merchant.wish.com/documentation/api/v3/reference#operation/wpsShippingOptions)  | ✔️  |
