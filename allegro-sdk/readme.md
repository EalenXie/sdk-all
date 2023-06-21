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

| 接口名                | 方法名          | 官方文档地址                                                                                                              | 状态  |
|:-------------------|:-------------|:--------------------------------------------------------------------------------------------------------------------|:----|
| 获取授权地址             | authorize    | [Autoryzacja użytkownika](https://developer.allegro.pl/auth/#autoryzacja-u%c5%bcytkownika)                          | ✔️  |
| 授权码模式获取accessToken | accessToken  | [Autoryzacja użytkownika](https://developer.allegro.pl/auth/#autoryzacja-u%c5%bcytkownika)                          | ✔️  |
| 刷新令牌               | refreshToken | [Przedłużenie ważności tokena](https://developer.allegro.pl/auth/#przed%c5%82u%c5%bcenie-wa%c5%bcno%c5%9bci-tokena) | ✔️  |

#### [AllegroOrderClient](https://github.com/EalenXie/sdk-all/blob/main/allegro-sdk/src/main/java/io/github/ealenxie/allegro/AllegroOrderClient.java) 已支持的接口列表

| 接口名        | 方法名                           | 官方文档地址                                                                                                                       | 状态  |
|:-----------|:------------------------------|:-----------------------------------------------------------------------------------------------------------------------------|:----|
| 获取用户订单     | userOrders                    | [Get the user's orders](https://developer.allegro.pl/documentation/#operation/getListOfOrdersUsingGET)                       | ✔️  |
| 获取订单详情     | ordersDetails                 | [Get an order's details](https://developer.allegro.pl/documentation/#operation/getOrdersDetailsUsingGET)                     | ✔️  |
| 获取订单发票详细信息 | invoices                      | [Get order invoices details](https://developer.allegro.pl/documentation/#operation/getOrderInvoicesDetails)                  | ✔️  |
| 创建发票       | invoices                      | [Post new invoice](https://developer.allegro.pl/documentation/#operation/addOrderInvoicesMetadata)                           | ✔️  |
| 上传发票       | putInvoices                   | [Upload invoice file](https://developer.allegro.pl/documentation/#operation/uploadOrderInvoiceFile)                          | ✔️  |
| 获取账单条目列表   | billings                      | [Get a list of billing entries](https://developer.allegro.pl/documentation/#operation/getBillingEntries)                     | ✔️  |
| 获取费用类型     | billingsType                  | [Get a list of billing types](https://developer.allegro.pl/documentation/#operation/getBillingTypes)                         | ✔️  |
| 查询支付历史     | payments                      | [Payment operations history](https://developer.allegro.pl/documentation#operation/getAllegroParcelTrackingUsingGET)          | ✔️  |
| 发起退款       | initiateRefund                | [Initiate a refund of a payment](https://developer.allegro.pl/documentation/#operation/initiateRefund)                       | ✔️  |
| 获取用户的纠纷    | disputes                      | [Get the user's disputes](https://developer.allegro.pl/documentation/#tag/Disputes)                                          | ✔️  |
| 获取争议中的消息   | getMessages                   | [Get the messages within a dispute](https://developer.allegro.pl/documentation/#tag/Disputes)                                | ✔️  |
| 上传争议邮件附件   | uploadAttachment              | [Upload a dispute message attachment](https://developer.allegro.pl/documentation/#operation/uploadDisputeAttachmentUsingPUT) | ✔️  |
| 获取争议邮件附件   | getAttachment                 | [Get an attachment](https://developer.allegro.pl/documentation/#operation/getAttachmentUsingGET)                             | ✔️  |
| 获得可用的送货服务  | getAvailableDeliveryServices  | [Get available delivery services](https://developer.allegro.pl/documentation/#operation/getAvailableDeliveryServices)        | ✔️  |
| 创建一个新的包裹   | createNewParcel               | [Create a new parcel](https://developer.allegro.pl/documentation/#operation/createNewParcel)                                 | ✔️  |
| 获取包创建状态    | getParcelCreationStatus       | [Get parcel creation status](https://developer.allegro.pl/documentation/#operation/getParcelCreationStatus)                  | ✔️  |
| 获取包裹详情     | getParcelDetails              | [Get parcel details](https://developer.allegro.pl/documentation/#operation/getParcelDetails)                                 | ✔️  |
| 获取包裹提货日期建议 | getParcelsPickupDateProposals | [Get parcels pickup date proposals](https://developer.allegro.pl/documentation/#operation/getParcelsPickupDateProposals)     | ✔️  |
| 申请取件       | requestParcelPickup           | [Request parcel pickup](https://developer.allegro.pl/documentation/#operation/requestParcelPickup)                           | ✔️  |
| 获取包裹提货状态   | getParcelPickupStatus         | [Get parcel pickup status](https://developer.allegro.pl/documentation/#operation/getParcelPickupStatus)                      | ✔️  |
| 领取包裹标签     | getParcelLabel                | [Get parcel label](https://developer.allegro.pl/documentation/#operation/getParcelLabel)                                     | ✔️  |
| 领取包裹协议     | getParcelsProtocol            | [Get parcels protocol](https://developer.allegro.pl/documentation/#operation/getParcelsProtocol)                             | ✔️  |
| 取消包裹       | cancelParcel                  | [Cancel parcel](https://developer.allegro.pl/documentation/#operation/cancelParcel)                                          | ✔️  |
| 获取包裹取消状态   | getParcelCancellationStatus   | [Get parcel cancellation status](https://developer.allegro.pl/documentation/#operation/getParcelCancellationStatus)          | ✔️  |
