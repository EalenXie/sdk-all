wish-sdk
======
<img src="https://d2ujdsqe3ri19m.cloudfront.net/77b19223edb1/dist/js/5fae4ff29cf989507838ee0e55a17490.svg" alt="Goodcang Logo" width="200">

主要是封装了 [wish 商户平台](https://china-merchant.wish.com/documentation/api/v3/explorer) 接口

### 快速开始

#### [Maven Central](https://mvnrepository.com/artifact/io.github.ealenxie/wish-sdk)

引入依赖, 可在`pom.xml` 的 `<dependencies>`选项中配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>wish-sdk</artifactId>
    <version>${latest.version}</version>
</dependency>
```

> `${latest.version}`
>
> ![](https://img.shields.io/maven-central/v/io.github.ealenxie/wish-sdk)

#### 代码示例

```java

import io.github.ealenxie.wish.AccessTokenPayload;
import io.github.ealenxie.wish.WishData;
import io.github.ealenxie.wish.WishMerchantClient;
import io.github.ealenxie.wish.WishToken;
import io.github.ealenxie.wish.taxonomy.CategoryPayload;

class WishMerchantClientTest {
    @Test
    void getCategories() {
        WishMerchantClient wishMerchantClient = new WishMerchantClient();
        // 设置为正式环境
        wishMerchantClient.setSandbox(false);
        // get accessToken
        AccessTokenPayload payload = new AccessTokenPayload();
        payload.setClientId("your clientId");
        payload.setClientSecret("your clientSecret");
        payload.setCode("your code");
        payload.setRedirectUri("your redirectUri");
        WishData<WishToken> response = wishMerchantClient.accessToken(payload);
        WishToken token = response.getData();
        String accessToken = token.getAccessToken();
        // call api
        WishData<CategoryPayload> categories = wishMerchantClient.getCategories(accessToken);
        System.out.println(categories);
    }
}

```

#### [WishClient](https://github.com/EalenXie/sdk-all/blob/main/wish-sdk/src/main/java/io/github/ealenxie/wish/WishClient.java) 已支持的接口列表

| 🏷️方法名       | 📚 官方文档地址                                                                                                              | 状态  |
|:-------------|:-----------------------------------------------------------------------------------------------------------------------|:----|
| authorize    | [Authorization URL](https://china-merchant.wish.com/documentation/api/v3/reference#section/Authentication)             | ✔️  |
| accessToken  | [Retrieve an access token](https://china-merchant.wish.com/documentation/api/v3/reference#section/Authentication)      | ✔️  |
| refreshToken | [Obtain a new token](https://www.merchant.wish.com/documentation/api/v3/reference#operation/oauthRefreshToken)         | ✔️  |
| oauthTest    | [Test if an access token is valid](https://china-merchant.wish.com/documentation/api/v3/reference#operation/oauthTest) | ✔️  |

#### [WishMerchantClient](https://github.com/EalenXie/sdk-all/blob/main/wish-sdk/src/main/java/io/github/ealenxie/wish/WishMerchantClient.java) 已支持的接口列表

##### Brands

| 🏷️方法名     | 📚 官方文档地址                                                                                                                              | 状态  |
|:-----------|:---------------------------------------------------------------------------------------------------------------------------------------|:----|
| listBrands | [Get a list of brands from a particular ID range](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listBrands) | ✔️  |

##### Bulk Products

| 🏷️方法名                  | 📚 官方文档地址                                                                                                                              | 状态  |
|:------------------------|:---------------------------------------------------------------------------------------------------------------------------------------|:----|
| getProducts             | [Get products](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getProducts)                                   | ✔️  |
| getUpdateProductsStatus | [Get the update products job status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getUpdateProductsStatus) | ✔️  |
| updateProducts          | [Update products](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateProducts)                             | ✔️  |
| getGetProductsStatus    | [Get the get products job status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getGetProductsStatus)       | ✔️  |

##### Currencies

| 🏷️方法名        | 📚 官方文档地址                                                                                                             | 状态  |
|:--------------|:----------------------------------------------------------------------------------------------------------------------|:----|
| getCurrencies | [Get supported currency list](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getCurrencies) | ✔️  |

##### EU Product Compliance

| 🏷️方法名                    | 📚 官方文档地址                                                                                                                                       | 状态  |
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

| 🏷️方法名             | 📚 官方文档地址                                                                                                                               | 状态  |
|:-------------------|:----------------------------------------------------------------------------------------------------------------------------------------|:----|
| fbsVariation       | [Get FBS related data for a variation](https://china-merchant.wish.com/documentation/api/v3/reference#operation/fbsVariation)           | ✔️  |
| fbsRecommendations | [Get FBS inbound shipping recommendations](https://china-merchant.wish.com/documentation/api/v3/reference#operation/fbsRecommendations) | ✔️  |

##### France EPR Compliance

| 🏷️方法名                    | 📚 官方文档地址                                                                                                                                                                      | 状态  |
|:--------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| updateFraComplianceStatus | [Bulk update France EPR Product Compliance Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateFranceEPRProductComplianceStatus)            | ✔️  |
| getFraComplianceStatus    | [Get France EPR Product Compliance Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getFranceEPRProductComplianceStatus)                       | ✔️  |
| createFraUniqueIdNumber   | [Create a France Product Unique Identification Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/createFranceProductUniqueIdentificationNumber) | ✔️  |
| listFraUniqueIdNumber     | [List France Product Unique Identification Numbers](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listFranceProductUniqueIdentificationNumber)      | ✔️  |
| updateFraUniqueIdNumber   | [Update a France Product Unique Identification Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateFranceProductUniqueIdentificationNumber) | ✔️  |
| getFraUniqueIdNumber      | [Get a France Product Unique Identification Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getFranceProductUniqueIdentificationNumber)       | ✔️  |
| deleteFraUniqueIdNumber   | [Delete a France Product Unique Identification Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/deleteFranceProductUniqueIdentificationNumber) | ✔️  |

##### Germany EPR Compliance

| 🏷️方法名                      | 📚 官方文档地址                                                                                                                                                              | 状态  |
|:----------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| createGerRegistrationNumber | [Create a Germany Product EPR Registration Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/createGermanyProductEprRegistrationNumber) | ✔️  |
| listGerRegistrationNumbers  | [List Germany EPR Registration Numbers](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listGermanyProductEprRegistrationNumbers)             | ✔️  |
| updateGerComplianceStatus   | [Bulk update Germany EPR Product Compliance Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateGermanyEPRProductComplianceStatus)  | ✔️  |
| getGerComplianceStatus      | [Get Germany EPR Product Compliance Status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getGermanyEPRProductComplianceStatus)             | ✔️  |
| updateGerRegistrationNumber | [Update a Germany Product EPR Registration Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateGermanyProductEprRegistrationNumber) | ✔️  |
| getGerRegistrationNumber    | [Get a Germany Product EPR Registration Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getGermanyProductEprRegistrationNumber)       | ✔️  |
| deleteGerRegistrationNumber | [Delete a Germany Product EPR Registration Number](https://china-merchant.wish.com/documentation/api/v3/reference#operation/deleteGermanyProductEprRegistrationNumber) | ✔️  |

##### Merchant

| 🏷️方法名                   | 📚 官方文档地址                                                                                                                         | 状态  |
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

| 🏷️方法名              | 📚 官方文档地址                                                                                                                      | 状态  |
|:--------------------|:-------------------------------------------------------------------------------------------------------------------------------|:----|
| shippingCarriers    | [Get accepted shipping carriers](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetShippingCarriers) | ✔️  |
| downloadOrders      | [Batch download orders](https://china-merchant.wish.com/documentation/api/v3/reference#operation/downloadOrders)               | ✔️  |
| getOrderDownloadJob | [Get batch download job status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getOrderDownloadJob)  | ✔️  |
| getMultipleOrders   | [List orders](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetMultipleOrders)                      | ✔️  |
| shipOrder           | [Ship or update tracking](https://china-merchant.wish.com/documentation/api/v3/reference#operation/ShipOrder)                  | ✔️  |
| refundReasons       | [Get valid refund reasons](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetValidRefundReasons)     | ✔️  |
| refund              | [Refund/Cancel an order](https://china-merchant.wish.com/documentation/api/v3/reference#operation/RefundOrder)                 | ✔️  |
| updateOrder         | [Update an LTL order](https://china-merchant.wish.com/documentation/api/v3/reference#operation/UpdateOrder)                    | ✔️  |
| getOrder            | [Get an order](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetOrder)                              | ✔️  |
| modifyAddress       | [Modify shipping address](https://china-merchant.wish.com/documentation/api/v3/reference#operation/ModifyAddress)              | ✔️  |

##### Payments

| 🏷️方法名                  | 📚 官方文档地址                                                                                                                                       | 状态  |
|:------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| downloadPaymentInvoices | [Batch download invoices](https://china-merchant.wish.com/documentation/api/v3/reference#operation/downloadPaymentInvoices)                     | ✔️  |
| getPaymentInvoices      | [Get batch invoice download job status](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getPaymentInvoicesDownloadJob) | ✔️  |
| getEarlyPayment         | [Get merchant early payment info](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getEarlyPayment)                     | ✔️  |

##### Penalties

| 🏷️方法名         | 📚 官方文档地址                                                                                                              | 状态  |
|:---------------|:-----------------------------------------------------------------------------------------------------------------------|:----|
| getPenalty     | [Get a penalty by ID](https://china-merchant.wish.com/documentation/api/v3/reference#operation/GetPenalty)             | ✔️  |
| penaltiesCount | [Count number of penalties](https://china-merchant.wish.com/documentation/api/v3/reference#operation/CountPenalties)   | ✔️  |
| listPenalties  | [Retrieve a list of penalties](https://china-merchant.wish.com/documentation/api/v3/reference#operation/ListPenalties) | ✔️  |

##### ProductBoost

| 🏷️方法名              | 📚 官方文档地址                                                                                                                                                       | 状态  |
|:--------------------|:----------------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| getKeywords         | [Get information for the given keywords or keywords that match the query](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getKeywords) | ✔️  |
| createCampaign      | [Create a ProductBoost campaign](https://china-merchant.wish.com/documentation/api/v3/reference#operation/createCampaign)                                       | ✔️  |
| listCampaigns       | [List ProductBoost campaigns](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listCampaigns)                                           | ✔️  |
| listProductFeedback | [List products' feedback in a ProductBoost campaign](https://china-merchant.wish.com/documentation/api/v3/reference#operation/ListProductFeedback)              | ✔️  |
| getBudget           | [Get the ProductBoost budget breakdown](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getBudget)                                     | ✔️  |
| updateCampaign      | [Update a ProductBoost campaign](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateCampaign)                                       | ✔️  |
| getCampaign         | [Get a single ProductBoost campaign](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getCampaign)                                      | ✔️  |
| listCampaignMetrics | [Obtain campaign metrics](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listCampaignMetrics)                                         | ✔️  |
| listBalanceUpdates  | [List ProductBoost account balance updates](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listBalanceUpdates)                        | ✔️  |

##### Products

| 🏷️方法名                     | 📚 官方文档地址                                                                                                                                                      | 状态  |
|:---------------------------|:---------------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| listProductUpdateRequests  | [List product create or update requests](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listProductUpdateRequests)                   | ✔️  |
| calculatedShipping         | [Enable/disable Calculated Shipping for the product](https://china-merchant.wish.com/documentation/api/v3/reference#operation/enableDisableCalculatedShipping) | ✔️  |
| getProductUpdateRequest    | [Get a product create or update request](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getProductUpdateRequest)                     | ✔️  |
| deleteProductUpdateRequest | [Delete a product create or update request](https://china-merchant.wish.com/documentation/api/v3/reference#operation/deleteProductUpdateRequest)               | ✔️  |
| createProduct              | [Get a product create or update request](https://china-merchant.wish.com/documentation/api/v3/reference#operation/createProduct)                               | ✔️  |
| listProductsSync           | [List products](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listProductsSync)                                                     | ✔️  |
| updateProduct              | [Update a product](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateProduct)                                                     | ✔️  |
| getProduct                 | [Get a product](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getProduct)                                                           | ✔️  |
| deleteProduct              | [Delete a product](https://china-merchant.wish.com/documentation/api/v3/reference#operation/deleteProduct)                                                     | ✔️  |

##### Promotions Platform

| 🏷️方法名                             | 📚 官方文档地址                                                                                                                                  | 状态  |
|:-----------------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------|:----|
| getPromotionsEligibleProducts      | [Get eligible products](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getPromotionsEligibleProducts)            | ✔️  |
| cancelPromotionsCampaign           | [Cancel a promotion campaign](https://china-merchant.wish.com/documentation/api/v3/reference#operation/cancelPromotionsCampaign)           | ✔️  |
| createPromotionsCampaign           | [Create a promotion campaign](https://china-merchant.wish.com/documentation/api/v3/reference#operation/createPromotionsCampaign)           | ✔️  |
| getPromotionsCampaigns             | [List promotion campaigns](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listPromotionsCampaigns)               | ✔️  |
| updatePromotionsCampaign           | [Update a promotion campaign](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updatePromotionsCampaign)           | ✔️  |
| getPromotionsCampaign              | [Get a single promotion campaign](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getPromotionsCampaign)          | ✔️  |
| getPromotionsEligibleProductsCount | [Get eligible products count](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getPromotionsEligibleProductsCount) | ✔️  |

##### Ratings

| 🏷️方法名            | 📚 官方文档地址                                                                                                             | 状态  |
|:------------------|:----------------------------------------------------------------------------------------------------------------------|:----|
| getProductRatings | [Fetch product ratings](https://china-merchant.wish.com/documentation/api/v3/reference#operation/FetchProductRatings) | ✔️  |

##### Taxonomy

| 🏷️方法名                | 📚 官方文档地址                                                                                                        | 状态  |
|:----------------------|:-----------------------------------------------------------------------------------------------------------------|:----|
| getCategory           | [Get a category](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getCategoryByID)       | ✔️  |
| getCategoryAttributes | [Get attributes](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getCategoryAttributes) | ✔️  |
| getCategories         | [Get root category](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getCategories)      | ✔️  |

##### Tickets

| 🏷️方法名       | 📚 官方文档地址                                                                                                 | 状态  |
|:-------------|:----------------------------------------------------------------------------------------------------------|:----|
| updateTicket | [Update a ticket](https://china-merchant.wish.com/documentation/api/v3/reference#operation/updateTicket)  | ✔️  |
| getTicket    | [Get a ticket](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getTicket)        | ✔️  |
| replyTicket  | [Reply to a ticket](https://china-merchant.wish.com/documentation/api/v3/reference#operation/replyTicket) | ✔️  |
| getTickets   | [List all tickets](https://china-merchant.wish.com/documentation/api/v3/reference#operation/listTickets)  | ✔️  |

##### Unification Initiative

| 🏷️方法名                   | 📚 官方文档地址                                                                                                       | 状态  |
|:-------------------------|:----------------------------------------------------------------------------------------------------------------|:----|
| getUnificationInitiative | [Create a variation](https://china-merchant.wish.com/documentation/api/v3/reference#tag/Unification-Initiative) | ✔️  |

##### Variations

| 🏷️方法名          | 📚 官方文档地址                                                                                                           | 状态  |
|:----------------|:--------------------------------------------------------------------------------------------------------------------|:----|
| createVariation | [Create a variation](https://china-merchant.wish.com/documentation/api/v3/reference#operation/createVariation)      | ✔️  |
| getColors       | [Get a list of accepted colors](https://china-merchant.wish.com/documentation/api/v3/reference#operation/getColors) | ✔️  |

##### Webhook

| 🏷️方法名             | 📚 官方文档地址                                                                                                          | 状态  |
|:-------------------|:-------------------------------------------------------------------------------------------------------------------|:----|
| createSubscription | [Create a Subscription](https://www.merchant.wish.com/documentation/api/v3/reference#operation/createSubscription) | ✔️  |
| getSubscriptions   | [List Subscriptions](https://www.merchant.wish.com/documentation/api/v3/reference#operation/listSubscriptions)     | ✔️  |
| updateSubscription | [Update a Subscription](https://www.merchant.wish.com/documentation/api/v3/reference#operation/updateSubscription) | ✔️  |
| getSubscription    | [Get a Subscription](https://www.merchant.wish.com/documentation/api/v3/reference#operation/getSubscription)       | ✔️  |
| deleteSubscription | [Delete a Subscription](https://www.merchant.wish.com/documentation/api/v3/reference#operation/deleteSubscription) | ✔️  |
| getTopics          | [List Topics](https://www.merchant.wish.com/documentation/api/v3/reference#operation/getTopics)                    | ✔️  |

##### Wish Parcel

| 🏷️方法名             | 📚 官方文档地址                                                                                                                      | 状态  |
|:-------------------|:-------------------------------------------------------------------------------------------------------------------------------|:----|
| createShipment     | [Create a Wish Parcel shipment](https://www.merchant.wish.com/documentation/api/v3/reference#operation/wpsCreateShipment)      | ✔️  |
| getShipments       | [List Wish Parcel shipments](https://www.merchant.wish.com/documentation/api/v3/reference#operation/wpsListShipments)          | ✔️  |
| modifyShipment     | [Modify a paid Wish Parcel shipment](https://www.merchant.wish.com/documentation/api/v3/reference#operation/wpsModifyShipment) | ✔️  |
| getShippingOptions | [Get Wish Parcel shipping options](https://www.merchant.wish.com/documentation/api/v3/reference#operation/wpsShippingOptions)  | ✔️  |
