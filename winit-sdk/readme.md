winit-sdk
======

<img src="https://developer.winit.com.cn/static/images/api_logo.png" alt="winit Logo" width="200">

主要是封装了 跨境电商 [万邑通 开放平台](https://developer.winit.com.cn/document/detail/id/14.html) 接口

### 快速开始

#### `pom.xml`配置

![](https://img.shields.io/maven-central/v/io.github.ealenxie/winit-sdk)

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>winit-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### 海外仓API(OSWH) [OswhClient](https://github.com/EalenXie/sdk-all/blob/main/winit-sdk/src/main/java/io/github/ealenxie/winit/oswh/OswhClient.java) 已支持的接口列表

##### 商品

| 方法                               | 官方文档地址                                                                          | 状态  |
|:---------------------------------|:--------------------------------------------------------------------------------|:----|
| registerProduct                  | [注册/编辑商品](https://developer.winit.com.cn/document/detail/id/15.html)            | ✔️  |
| getCommodityInfo                 | [查询商品信息](https://developer.winit.com.cn/document/detail/id/17.html)             | ✔️  |
| getProductAuditStatus            | [查询商品审核状态](https://developer.winit.com.cn/document/detail/id/226.html)          | ✔️  |
| printProductLabelControlItemInfo | [打印商品条码标签-返回带有单品信息](https://developer.winit.com.cn/document/detail/id/135.html) | ✔️  |
| printProductLabel                | [打印商品条码标签](https://developer.winit.com.cn/document/detail/id/19.html)           | ✔️  |
| getProductLabelInfo              | [打印商品条码标签](https://developer.winit.com.cn/document/detail/id/241.html)          | ✔️  |

| 方法                             | 官方文档地址                                                                   | 状态  |
|:-------------------------------|:-------------------------------------------------------------------------|:----|
| queryWarehouseStorage          | [查询总库存](https://developer.winit.com.cn/document/detail/id/44.html)       | ✔️  |
| queryWinItInventoryType        | [查询分类库存](https://developer.winit.com.cn/document/detail/id/297.html)     | ✔️  |
| queryProductInventoryList4Page | [查询总库存（含DOI）](https://developer.winit.com.cn/document/detail/id/58.html) | ✔️  |
| queryWarehouseReceiptDetails   | [查询仓租单明细](https://developer.winit.com.cn/document/detail/id/231.html)    | ✔️  |
| queryInventoryStatement        | [库存流水查询](https://developer.winit.com.cn/document/detail/id/254.html)     | ✔️  |
| queryWarehouse                 | [查询仓库代码](https://developer.winit.com.cn/document/detail/id/43.html)      | ✔️  |
| createOrder                    | [创建入库单](https://developer.winit.com.cn/document/detail/id/141.html)      | ✔️  |
| getWinItProducts               | [查询头程服务](https://developer.winit.com.cn/document/detail/id/28.html)      | ✔️  |
| cancelOrder                    | [作废入库单](https://developer.winit.com.cn/document/detail/id/285.html)      | ✔️  |
| getOrderDetail                 | [查询入库单详情](https://developer.winit.com.cn/document/detail/id/39.html)     | ✔️  |
| printPackageLabel              | [打印包裹标签](https://developer.winit.com.cn/document/detail/id/31.html)      | ✔️  |
| confirmShipment                | [直发入库-确认发货](https://developer.winit.com.cn/document/detail/id/300.html)  | ✔️  |
| createSubmittedOrder           | [创建出库单-新](https://developer.winit.com.cn/document/detail/id/247.html)    | ✔️  |
| calcDeliveryFee                | [预估派送运费-3](https://developer.winit.com.cn/document/detail/id/96.html)    | ✔️  |
| uploadLabel                    | [出库上传附件](https://developer.winit.com.cn/document/detail/id/299.html)     | ✔️  |
| queryOutboundOrderList         | [查询出库单（列表）](https://developer.winit.com.cn/document/detail/id/54.htm)    | ✔️  |
| queryOutboundOrder             | [查询出库单](https://developer.winit.com.cn/document/detail/id/55.html)       | ✔️  |
| queryOutboundOrderFee          | [查询派送费用](https://developer.winit.com.cn/document/detail/id/145.html)     | ✔️  |
| cancelOutboundOrder            | [作废出库单](https://developer.winit.com.cn/document/detail/id/276.html)      | ✔️  |

#### 海外仓API(LAM) [LamClient](https://github.com/EalenXie/sdk-all/blob/main/winit-sdk/src/main/java/io/github/ealenxie/winit/lam/LamClient.java) 已支持的接口列表

| 方法               | 官方文档地址                                                                     | 状态  |
|:-----------------|:---------------------------------------------------------------------------|:----|
| createOrder      | [创建LMA订单](https://developer.winit.com.cn/document/detail/id/201.html)      | ✔️  |
| createOrderSync  | [创建LMA订单-sync](https://developer.winit.com.cn/document/detail/id/309.html) | ✔️  |
| printShipment    | [获取面单](https://developer.winit.com.cn/document/detail/id/202.html)         | ✔️  |
| queryTrackingNos | [批量获取LMA运单号](https://developer.winit.com.cn/document/detail/id/205.html)   | ✔️  |
| updateWeight     | [更新订单尺重](https://developer.winit.com.cn/document/detail/id/303.html)       | ✔️  |
| confirm          | [确认发货](https://developer.winit.com.cn/document/detail/id/169.html)         | ✔️  |
| calDeliveryFee   | [预估LMA订单费用](https://developer.winit.com.cn/document/detail/id/259.html)    | ✔️  |
| getOrderInfo     | [查询LMA订单详情](https://developer.winit.com.cn/document/detail/id/167.html)    | ✔️  |
| cancelShipment   | [取消LMA订单](https://developer.winit.com.cn/document/detail/id/170.html)      | ✔️  |
| batchPrint       | [批量获取面单](https://developer.winit.com.cn/document/detail/id/203.html)       | ✔️  |
| manifestPrint    | [获取发货单](https://developer.winit.com.cn/document/detail/id/173.html)        | ✔️  |
