Allegro
===========
<p>Fruugo是欧洲领先的英国平台，英国最大的支持全球销售的本土电商平台。</p>

Allegro开发平台: https://developer.allegro.pl/documentation/

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>kaufland-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [KauflandOrderClient](https://github.com/EalenXie/sdk-all/blob/main/kaufland-sdk/src/main/java/io/github/ealenxie/kaufland/v1/KauflandOrderClient.java) 已支持的接口列表

| 接口名      | 方法名                | 官方文档地址                                                                                           | 状态  |
|:---------|:-------------------|:-------------------------------------------------------------------------------------------------|:----|
| 获取批量订单详情 | getOrderUnits      | [retrieving-order-units](https://www.kaufland.de/api/v1/?page=orders#retrieving-order-units)     | ✔️  |
| 获取订单     | orders             | [获取订单](https://sellerapi.kaufland.com/?page=code-examples#adding-a-unit)                         | ✔️  |
| 获取单条订单订单 | order              | [获取单条订单订单](https://www.kaufland.de/api/v1/?page=orders#retrieving-order-units)                   | ✔️  |
| 标记发货     | sendingOrders      | [sending-orders](https://www.kaufland.de/api/v1/?page=orders#retrieving-order-units)             | ✔️  |
| 上传订单发票   | uploadOrderInvoice | [upload-order-invoice](https://www.kaufland.de/api/v1/?page=order-invoices#upload-order-invoice) | ✔️  |
| 查询订单发票   | retrieving         | [upload-order-invoice](https://www.kaufland.de/api/v1/?page=order-invoices#upload-order-invoice) | ✔️  |
| 删除发票     | deleteInvoices     | [deleting-units](https://www.kaufland.de/api/v1/?page=inventory#deleting-units)                  | ✔️  |