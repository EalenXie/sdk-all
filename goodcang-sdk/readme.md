goodcang-sdk
======

主要是封装了 跨境电商 谷仓[ERP对外API开放文档](https://open.goodcang.com/docs_api/glance) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>goodcang-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [GoodCangClient](https://github.com/EalenXie/sdk-all/blob/main/goodcang-sdk/src/main/java/io/github/ealenxie/goodcang/GoodCangClient.java) 已支持的接口列表

| 方法名                 | 官方文档地址                                                                              | 状态  |
|:--------------------|:------------------------------------------------------------------------------------|:----|
| orderList           | [获取订单列表](https://open.goodcang.com/default/open/api-call/#getOrderList)             | ✔️  |
| getOrderByRefCode   | [根据参考号获取单票订单信息](https://open.goodcang.com/default/open/api-call/#getOrderByRefCode) | ✔️  |
| createOrder         | [新增订单](https://open.goodcang.com/default/open/api-call/#createOrder)                | ✔️  |
| cancelOrder         | [取消订单](https://open.goodcang.com/default/open/api-call/#cancelOrder)                | ✔️  |
| uploadOrderLabel    | [上传订单面单](https://open.goodcang.com/default/open/api-call/#upload_order_label)       | ✔️  |
| addProduct          | [新建商品](https://open.goodcang.com/docs_api/product/add_product)                      | ✔️  |
| getProductSkuList   | [获取商品列表](https://open.goodcang.com/docs_api/product/get_product_sku_list)           | ✔️  |
| getProductInventory | [获取库存](https://open.goodcang.com/docs_api/inventory/get_product_inventory)          | ✔️  |
| getInventoryLog     | [获取库存动态列表](https://open.goodcang.com/docs_api/inventory/get_inventory_log)          | ✔️  |
| inventoryAgeList    | [获取库龄列表](https://open.goodcang.com/docs_api/inventory/inventory_age_list)           | ✔️  |
| setInventoryWarning | [设置库龄预警](https://open.goodcang.com/docs_api/inventory/set_inventory_warning)        | ✔️  |
