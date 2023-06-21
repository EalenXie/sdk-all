eccang-sdk
======

主要是封装了 跨境电商 易仓[ERP对外API开放文档](https://eccang.yuque.com/gko3h7/sw0gov) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>eccang-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [EcCangClient](https://github.com/EalenXie/sdk-all/blob/main/eccang-sdk/src/main/java/io/github/ealenxie/eccang/EcCangClient.java) 已支持的接口列表

| 方法名                | 官方文档地址                                                                                      | 状态  |
|:-------------------|:--------------------------------------------------------------------------------------------|:----|
| getOrderList       | [eb-订单列表](https://eccang.yuque.com/books/share/df2ca396-46f5-4a51-a33e-73794059bb1d/gkgh0f) | ✔️  |
| syncProduct        | [wms-创建/编辑产品](https://eccang.yuque.com/gko3h7/sw0gov/awcvxt)                                | ✔️  |
| getProductBySku    | [wms-批量创建、编辑产品](https://eccang.yuque.com/gko3h7/sw0gov/ggty07)                              | ✔️  |
| getOrder           | [wms-获取单个产品信息](https://eccang.yuque.com/gko3h7/sw0gov/sp22vh)                               | ✔️  |
| getProductList     | [wms-获取批量产品信息](https://eccang.yuque.com/gko3h7/sw0gov/gn6ry3)                               | ✔️  |
| getProductSell     | [wms-获取产品销售状态 ](https://eccang.yuque.com/gko3h7/sw0gov/hce5ln)                              | ✔️  |
| getSupplier        | [wms-获取供应商](https://eccang.yuque.com/gko3h7/sw0gov/zva03g)                                  | ✔️  |
| getUser            | [wms-获取用户列表](https://eccang.yuque.com/gko3h7/sw0gov/wwy2hd)                                 | ✔️  |
| syncPurchaseOrders | [wms-创建采购单](https://eccang.yuque.com/gko3h7/sw0gov/ilbxzu)                                  | ✔️  |
| getCountry         | [wms-获取国家列表](https://eccang.yuque.com/gko3h7/sw0gov/ivtlrv)                                 | ✔️  |
| getSupplierList    | [wms-根据条件查询供应商](https://eccang.yuque.com/gko3h7/sw0gov/ugu0fr)                              | ✔️  |
| getPurchaseOrders  | [wms-查询采购单信息](https://eccang.yuque.com/gko3h7/sw0gov/kqw3v8)                                | ✔️  |
| syncSupplierInfo   | [wms-用于创建和修改供应商](https://eccang.yuque.com/gko3h7/sw0gov/gndus3)                             | ✔️  |
