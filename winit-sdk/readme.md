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

#### 代码示例

```java



import io.github.ealenxie.winit.OswhClient;
import io.github.ealenxie.winit.WinitConfig;
import io.github.ealenxie.winit.WinitResponse;
import io.github.ealenxie.winit.oswh.WarehousePayload;
import io.github.ealenxie.winit.oswh.WarehouseResponse;

import java.util.List;

class OswhClientTest {
    @Test
    void queryWarehouse() {
        WinitConfig config = new WinitConfig();
        config.setClientId("your clientId");
        config.setClientSecret("your clientSecret");
        config.setPlatform("your platform");
        config.setAppKey("your appKey");
        config.setToken("your token");
        OswhClient oswhClient = new OswhClient(config);
        // call api
        WinitResponse<List<WarehousePayload>> response = oswhClient.queryWarehouse();
        List<WarehousePayload> data = response.getData();
        System.out.println(data);
    }
}

```

#### 海外仓API(OSWH) [OswhClient](https://github.com/EalenXie/sdk-all/blob/main/winit-sdk/src/main/java/io/github/ealenxie/winit/OswhClient.java) 已支持的接口列表

##### 商品

| 🏷️方法名                           | 📚 官方文档地址                                                                       | 状态  |
|:---------------------------------|:--------------------------------------------------------------------------------|:----|
| registerProduct                  | [注册/编辑商品](https://developer.winit.com.cn/document/detail/id/15.html)            | ✔️  |
| getCommodityInfo                 | [查询商品信息](https://developer.winit.com.cn/document/detail/id/17.html)             | ✔️  |
| getProductAuditStatus            | [查询商品审核状态](https://developer.winit.com.cn/document/detail/id/226.html)          | ✔️  |
| printProductLabelControlItemInfo | [打印商品条码标签-返回带有单品信息](https://developer.winit.com.cn/document/detail/id/135.html) | ✔️  |
| printProductLabel                | [打印商品条码标签](https://developer.winit.com.cn/document/detail/id/19.html)           | ✔️  |
| getProductLabelInfo              | [打印商品条码标签](https://developer.winit.com.cn/document/detail/id/241.html)          | ✔️  |

##### 库存

| 🏷️方法名                         | 📚 官方文档地址                                                                | 状态  |
|:-------------------------------|:-------------------------------------------------------------------------|:----|
| queryWarehouseStorage          | [查询总库存](https://developer.winit.com.cn/document/detail/id/44.html)       | ✔️  |
| queryProductInventoryList4Page | [查询总库存（含DOI）](https://developer.winit.com.cn/document/detail/id/58.html) | ✔️  |
| queryWinItInventoryType        | [查询分类库存](https://developer.winit.com.cn/document/detail/id/297.html)     | ✔️  |
| queryInventoryStatement        | [库存流水查询](https://developer.winit.com.cn/document/detail/id/254.html)     | ✔️  |
| queryWarehouseReceiptDetails   | [查询仓租单明细](https://developer.winit.com.cn/document/detail/id/231.html)    | ✔️  |
| createInventoryAdjustment      | [创建库存调整单](https://developer.winit.com.cn/document/detail/id/308.html)    | ✔️  |

##### 入库

| 🏷️方法名                    | 📚 官方文档地址                                                                  | 状态  |
|:--------------------------|:---------------------------------------------------------------------------|:----|
| createOrder               | [创建入库单](https://developer.winit.com.cn/document/detail/id/141.html)        | ✔️  |
| printPackageLabel         | [打印包裹标签](https://developer.winit.com.cn/document/detail/id/31.html)        | ✔️  |
| estimateOrderFee          | [预估入库费用](https://developer.winit.com.cn/document/detail/id/36.html)        | ✔️  |
| getInBoundOrders          | [预估入库费用](https://developer.winit.com.cn/document/detail/id/38.html)        | ✔️  |
| getOrderDetail            | [查询入库单详情](https://developer.winit.com.cn/document/detail/id/39.html)       | ✔️  |
| getOrderTracking          | [查询入库轨迹](https://developer.winit.com.cn/document/detail/id/94.html)        | ✔️  |
| getInboundOrderFee        | [查询入库单费用](https://developer.winit.com.cn/document/detail/id/138.html)      | ✔️  |
| generateSubPackageBarcode | [新增子包裹条码](https://developer.winit.com.cn/document/detail/id/306.html)      | ✔️  |
| importPacking             | [自验货数据导入](https://developer.winit.com.cn/document/detail/id/304.html)      | ✔️  |
| importPackingConfirm      | [自验货确认完成](https://developer.winit.com.cn/document/detail/id/305.html)      | ✔️  |
| uploadExpressNo           | [直发入库-上传快递单号](https://developer.winit.com.cn/document/detail/id/301.html)  | ✔️  |
| confirmShipment           | [直发入库-确认发货](https://developer.winit.com.cn/document/detail/id/300.html)    | ✔️  |
| cancelOrder               | [作废入库单](https://developer.winit.com.cn/document/detail/id/285.html)        | ✔️  |
| getWinItProducts          | [查询头程服务](https://developer.winit.com.cn/document/detail/id/28.html)        | ✔️  |
| getWarehouse              | [查询验货/目的仓](https://developer.winit.com.cn/document/detail/id/29.html)      | ✔️  |
| getAvailableMerchandise   | [查询入库可选商品](https://developer.winit.com.cn/document/detail/id/30.html)      | ✔️  |
| queryEorList              | [查询出口报关-EOR类型](https://developer.winit.com.cn/document/detail/id/140.html) | ✔️  |
| declarationRuleList       | [查询进口报关-IOR规则](https://developer.winit.com.cn/document/detail/id/139.html) | ✔️  |
| getPickupAddress          | [查询提货地址](https://developer.winit.com.cn/document/detail/id/35.html)        | ✔️  |
| getCarriers               | [查询发货供应商](https://developer.winit.com.cn/document/detail/id/34.html)       | ✔️  |
| getVendorInfo             | [查询进/出口供应商](https://developer.winit.com.cn/document/detail/id/33.html)     | ✔️  |
| getLogisticsPlan          | [查询物流计划](https://developer.winit.com.cn/document/detail/id/32.html)        | ✔️  |

##### 出库

| 🏷️方法名                   | 📚 官方文档地址                                                                | 状态  |
|:-------------------------|:-------------------------------------------------------------------------|:----|
| createSubmittedOrder     | [创建出库单-新](https://developer.winit.com.cn/document/detail/id/247.html)    | ✔️  |
| createOutboundOrder      | [创建出库单](https://developer.winit.com.cn/document/detail/id/49.html)       | ✔️  |
| calcDeliveryFee          | [预估派送运费-3](https://developer.winit.com.cn/document/detail/id/96.html)    | ✔️  |
| uploadLabel              | [出库上传附件](https://developer.winit.com.cn/document/detail/id/299.html)     | ✔️  |
| queryOutboundOrderList   | [查询出库单（列表）](https://developer.winit.com.cn/document/detail/id/54.htm)    | ✔️  |
| queryOutboundOrder       | [查询出库单](https://developer.winit.com.cn/document/detail/id/55.html)       | ✔️  |
| queryOutboundOrderFee    | [查询派送费用](https://developer.winit.com.cn/document/detail/id/145.html)     | ✔️  |
| queryTrack               | [查询轨迹（库内）](https://developer.winit.com.cn/document/detail/id/57.html)    | ✔️  |
| getOrderVerdorTracking   | [查询轨迹（库内+派送）](https://developer.winit.com.cn/document/detail/id/56.html) | ✔️  |
| cancelOutboundOrder      | [作废出库单](https://developer.winit.com.cn/document/detail/id/276.html)      | ✔️  |
| batchCancelOutboundOrder | [批量作废出库单](https://developer.winit.com.cn/document/detail/id/248.html)    | ✔️  |
| queryDeliveryWay         | [查询派送方式](https://developer.winit.com.cn/document/detail/id/45.html)      | ✔️  |
| queryWarehouse           | [查询仓库代码](https://developer.winit.com.cn/document/detail/id/43.html)      | ✔️  |

##### 退货

| 🏷️方法名                 | 📚 官方文档地址                                                                     | 状态  |
|:-----------------------|:------------------------------------------------------------------------------|:----|
| createReturnGoodsOrder | [创建退货订单](https://developer.winit.com.cn/document/detail/id/151.html)          | ✔️  |
| updateMerchandise      | [更新退货单商品信息](https://developer.winit.com.cn/document/detail/id/265.html)       | ✔️  |
| queryReturnLabel       | [查询Returnlabel面单](https://developer.winit.com.cn/document/detail/id/310.html) | ✔️  |
| queryReturnOrderList   | [查询退货订单](https://developer.winit.com.cn/document/detail/id/146.html)          | ✔️  |
| voidReturnOrder        | [取消退货订单](https://developer.winit.com.cn/document/detail/id/152.htm)           | ✔️  |
| queryPSCList           | [查询退货派送方式](https://developer.winit.com.cn/document/detail/id/282.html)        | ✔️  |
| returnItemList         | [查询退货商品](https://developer.winit.com.cn/document/detail/id/137.html)          | ✔️  |

##### 辅助接口

| 🏷️方法名           | 📚 官方文档地址                                                              | 状态  |
|:-----------------|:-----------------------------------------------------------------------|:----|
| addressIsValid   | [德国地址校验](https://developer.winit.com.cn/document/detail/id/48.html)    | ✔️  |
| productRecommend | [订单EGD担保校验](https://developer.winit.com.cn/document/detail/id/97.html) | ✔️  |

#### 全球直发API（ISP) [IspClient](https://github.com/EalenXie/sdk-all/blob/main/winit-sdk/src/main/java/io/github/ealenxie/winit/IspClient.java) 已支持的接口列表

| 🏷️方法名              | 📚 官方文档地址                                                                 | 状态  |
|:--------------------|:--------------------------------------------------------------------------|:----|
| createOrder         | [创建国内直发小包订单](https://developer.winit.com.cn/document/detail/id/65.html)   | ✔️  |
| getPackingList      | [预分拣-获取装箱面单](https://developer.winit.com.cn/document/detail/id/316.html)  | ✔️  |
| getBigPackageNumber | [预分拣-获取装箱面单号](https://developer.winit.com.cn/document/detail/id/315.html) | ✔️  |
| invoiceQuery        | [打印发票](https://developer.winit.com.cn/document/detail/id/73.html)         | ✔️  |
| labelQuery          | [打印面单](https://developer.winit.com.cn/document/detail/id/67.html)         | ✔️  |
| deliveryConfirm     | [确认发货](https://developer.winit.com.cn/document/detail/id/68.html)         | ✔️  |
| orderQuery          | [查询ISP订单详情](https://developer.winit.com.cn/document/detail/id/70.html)    | ✔️  |
| getOrderRevenue     | [查询物流费用](https://developer.winit.com.cn/document/detail/id/72.html)       | ✔️  |
| getOrderTracking    | [查询轨迹](https://developer.winit.com.cn/document/detail/id/71.html)         | ✔️  |
| orderDisable        | [作废订单](https://developer.winit.com.cn/document/detail/id/69.html)         | ✔️  |
| feeCalcEstimate     | [预估物流费用](https://developer.winit.com.cn/document/detail/id/66.html)       | ✔️  |
| getIspWarehouseList | [查询国内验货仓](https://developer.winit.com.cn/document/detail/id/64.html)      | ✔️  |
| productList         | [查询小包物流产品/渠道](https://developer.winit.com.cn/document/detail/id/62.html)  | ✔️  |
| getUmsPickupAddress | [查询提货地址](https://developer.winit.com.cn/document/detail/id/63.html)       | ✔️  |
| addUmsPickupAddress | [新增提货地址](https://developer.winit.com.cn/document/detail/id/61.html)       | ✔️  |

#### 海外仓API(LAM) [LamClient](https://github.com/EalenXie/sdk-all/blob/main/winit-sdk/src/main/java/io/github/ealenxie/winit/LamClient.java) 已支持的接口列表

| 🏷️方法名           | 📚 官方文档地址                                                                  | 状态  |
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

#### 查询费用

| 🏷️方法名               | 📚 官方文档地址                                                            | 状态  |
|:---------------------|:---------------------------------------------------------------------|:----|
| getTransactionCharge | [查询单据费用](https://developer.winit.com.cn/document/detail/id/204.html) | ✔️  |
| pageChargeDetails    | [查询费用-新](https://developer.winit.com.cn/document/detail/id/255.html) | ✔️  |