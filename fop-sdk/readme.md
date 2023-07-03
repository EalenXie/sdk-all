fop-sdk
======

<img src="http://open.4px.com/images/4PX_OPEN_blue.png" alt="4PX Logo" width="200">

主要是封装了 跨境物流 [4PX 开放平台](http://open.4px.com/apiInfo/api) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>fop-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### 代码示例

```java


import io.github.ealenxie.fop.FopResp;
import io.github.ealenxie.fop.PublicClient;
import io.github.ealenxie.fop.common.MeasureUnit;

import java.util.List;

class PublicClientTest {
    @Test
    void measureUnitList() {
        String appKey = "your appKey";
        String appSecret = "your appSecret";
        PublicClient publicClient = new PublicClient(appKey, appSecret);
        // 通过OAuth授权方式获得，要求平台服务商、第三方软件商必须传入，4PX客户（B类客户）可不传
        publicClient.setAccessToken(null);
        publicClient.setSandBox(false);
        FopResp<List<MeasureUnit>> measureUnitList = publicClient.measureUnitList();
        System.out.println(measureUnitList);
    }
}
```

### [4PX 服务列表](http://open.4px.com/apiInfo/api)

#### 直发服务  [DirectClient](https://github.com/EalenXie/sdk-all/blob/main/fop-sdk/src/main/java/io/github/ealenxie/fop/DirectClient.java) 已支持的接口列表

| 接口名               | 🏷️方法名                  | 官方文档地址                                                                                        | 状态  |
|:------------------|:------------------------|:----------------------------------------------------------------------------------------------|:----|
| 创建直发委托单           | createXmsOrder          | [ds.xms.order.create](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=96)               | ✔️  |
| 查询直发委托单           | getXmsOrder             | [ds.xms.order.get](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=98)                  | ✔️  |
| 取消直发委托单           | cancelXmsOrder          | [ds.xms.order.cancel](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=99)               | ✔️  |
| 申请/取消拦截订单         | holdXmsOrder            | [ds.xms.order.hold](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=100)                | ✔️  |
| 获取标签              | getXmsLabel             | [ds.xms.label.get](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=102)                 | ✔️  |
| 直发授权-出库预报(收费)     | creatBatchOutbound      | [ds.xms.batch_outbound.create](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=134)     | ✔️  |
| 直发授权-袋标签(收费)      | getBagLabel             | [ds.xms.bag_label.get](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=136)             | ✔️  |
| 直发授权-批量单票出库预报(收费) | departureMailItem       | [ds.xms.departure.mailitem](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=163)        | ✔️  |
| 直发授权-完成装袋         | createXmsBag            | [ds.xms.bag.create](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=164)                | ✔️  |
| 批量获取标签            | getXmsLabelList         | [ds.xms.label.getlist](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=165)             | ✔️  |
| 单票交航              | createOrderAirline      | [ds.xms.order_airline.create](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=166)      | ✔️  |
| 物流产品查询            | getLogisticsProductList | [ds.xms.logistics_product.getlist](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=167) | ✔️  |
| 单票入库              | createOrderInbound      | [ds.xms.order_inbound.create](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=168)      | ✔️  |
| 更新预报重             | updateXmsOrderWeight    | [ds.xms.order.updateweight](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=169)        | ✔️  |
| 单票出库(收费)          | createOrderOutbound     | [ds.xms.order_outbound.create](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=174)     | ✔️  |
| 预估费用查询/运费试算       | getEstimatedCost        | [ds.xms.estimated_cost.get](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=181)        | ✔️  |
| 新增预约组包            | createCollectBig        | [ds.xms.api.collect.create.big](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=183)    | ✔️  |
| 取消预约组包            | cancelCollectBig        | [ds.xms.api.collect.cancel.big](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=184)    | ✔️  |
| 打印组包面单            | printCollectBig         | [ds.xms.api.collect.print.big](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=185)     | ✔️  |
| 创建揽收预约单           | createCollectOrder      | [ds.xms.api.collect.create.order](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=186)  | ✔️  |
| 取消揽收预约单           | cancelCollectOrder      | [ds.xms.api.collect.cancel.order](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=187)  | ✔️  |
| 打印预约单             | printCollectOrder       | [ds.xms.api.collect.print.order](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=188)   | ✔️  |
| 商家工作台-获取袋标        | getPackageLabel         | [bws.package.getLabel](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=189)             | ✔️  |
| 商家工作台-取消组包        | cancelPackage           | [bws.package.cancelPackage](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=190)        | ✔️  |
| 商家工作台-组包          | packageGroup            | [bws.package.group](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=191)                | ✔️  |
| 商家工作台-批量获取标签接口    | getLabelList            | [bws.label.getList](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=192)                | ✔️  |
| 商家工作台-称重接口        | orderWeigh              | [bws.order.weigh](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=193)                  | ✔️  |
| 商家工作台-订单分拣        | sorting                 | [bws.sorting.sorting](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=194)              | ✔️  |
| 异常件查询接口           | abnormalList            | [ds.xms.order_abnormal.getlist](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=195)    | ✔️  |
| 集运一段包裹入库预报        | pcsInboundCreate        | [pcs.order.inbound.create](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=206)         | ✔️  |
| 集运二段包裹入库预报        | pcsOutboundCreate       | [pcs.order.outbound.create](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=207)        | ✔️  |
| 集运一段包裹取消          | pcsInboundCancel        | [pcs.order.inbound.cancel](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=208)         | ✔️  |
| 集运二段包裹取消          | pcsOutboundCancel       | [pcs.order.outbound.cancel](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=209)        | ✔️  |
| 集运订单查询            | pcsOrderQuery           | [pcs.order.query](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=210)                  | ✔️  |
| 查询订单费用信息          | getFreight              | [ds.xms.order.getFreight](http://open.4px.com/apiInfo/apiDetail?itemId=2&mainId=214)          | ✔️  |

#### 订单履约服务 [FulfillmentClient](https://github.com/EalenXie/sdk-all/blob/main/fop-sdk/src/main/java/io/github/ealenxie/fop/FulfillmentClient.java) 已支持的接口列表

| 接口名            | 🏷️方法名            | 官方文档地址                                                                                        | 状态  |
|:---------------|:------------------|:----------------------------------------------------------------------------------------------|:----|
| 创建SKU          | skuCreate         | [fu.wms.sku.newcreate](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=106)             | ✔️  |
| 创建入库委托         | inboundCreate     | [fu.wms.inbound.create](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=107)            | ✔️  |
| 批量查询SKU        | getSkuList        | [fu.wms.sku.getlist](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=108)               | ✔️  |
| 取消入库委托         | inboundCancel     | [fu.wms.inbound.cancel](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=109)            | ✔️  |
| 批量查询入库委托       | inboundList       | [fu.wms.inbound.getlist](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=110)           | ✔️  |
| 创建出库委托         | outboundCreate    | [fu.wms.outbound.create](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=111)           | ✔️  |
| 取消出库委托         | outboundCancel    | [fu.wms.outbound.cancel](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=112)           | ✔️  |
| 批量查询出库委托       | outboundList      | [fu.wms.outbound.getlist](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=113)          | ✔️  |
| 库存查询           | inventoryList     | [fu.wms.inventory.get](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=114)             | ✔️  |
| 查询库存流水         | inventoryLog      | [fu.wms.inventory.getlog](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=115)          | ✔️  |
| 查询库存库龄         | inventoryDetail   | [fu.wms.inventory.getdetail](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=116)       | ✔️  |
| 修改sku图片        | editPicture       | [fu.wms.sku.editpicture](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=117)           | ✔️  |
| 查询出库委托费用       | outboundBilling   | [fu.wms.outbound.getbilling](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=118)       | ✔️  |
| 获取入库委托标签文件     | getInboundLabel   | [fu.wms.inbound.getinboundlabel](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=119)   | ✔️  |
| 上传箱单发票         | uploadInvoiceFile | [fu.wms.inbound.uploadinvoicefile](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=120) | ✔️  |
| 创建派送委托         | createShipment    | [com.basis.external.create](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=176)        | ✔️  |
| 获取派送委托发货面单     | getLabelShipment  | [com.basis.external.getLabel](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=177)      | ✔️  |
| 取消派送委托         | cancelShipment    | [com.basis.external.cancelLabel](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=178)   | ✔️  |
| 创建SKU (新参数对接)  | skuNewCreate      | [fu.wms.sku.newcreate](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=182)             | ✔️  |
| 修改SKU信息/添加国家信息 | skuEdit           | [fu.wms.sku.edit](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=195)                  | ✔️  |
| 批量查询物流计划       | planCodeList      | [fu.wms.plancode.getlist](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=198)          | ❌   |
| 创建LMA订单        | externalCreate    | [com.basis.external.create](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=200)        | ️✔️ |
| 获取LMA面单        | getLabelShipment  | [com.basis.external.getLabel](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=177)      | ️✔️ |
| 取消LMA订单        | cancelShipment    | [com.basis.external.cancelLabel](http://open.4px.com/apiInfo/apiDetail?itemId=1&mainId=202)   | ️✔️ |

#### 转运服务 [TransferClient](https://github.com/EalenXie/sdk-all/blob/main/fop-sdk/src/main/java/io/github/ealenxie/fop/TransferClient.java) 已支持的接口列表

| 接口名          | 🏷️方法名                   | 官方文档地址                                                                                         | 状态  |
|:-------------|:-------------------------|:-----------------------------------------------------------------------------------------------|:----|
| 创建集货入库委托     | inboundCreate            | [cs.trs.inbound.create](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=48)              | ✔️  |
| 创建集运出库委托     | outboundCreate           | [cs.trs.outbound.create](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=49)             | ✔️  |
| 取消入库委托       | inboundCancel            | [cs.trs.inbound.cancel](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=50)              | ✔️  |
| 查询出库委托       | getOutbound              | [cs.trs.outbound.get](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=51)                | ✔️  |
| 集货入库节点推送     | inboundCallback          | [cs.trs.inbound.callback](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=129)           | ❌ ️ |
| 集货出库节点推送     | outboundCallback         | [cs.trs.outbound.callback](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=130)          | ❌ ️ |
| 会员注册         | memberRegister           | [cs.trs.member.register](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=143)            | ✔️  |
| 入库异常解决方案     | inboundExceptionHandle   | [cs.trs.inbound.exception.handle](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=157)   | ✔️  |
| 入库异常解决方案节点推送 | inboundExceptionCallback | [cs.trs.inbound.exception.callback](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=160) | ❌   |
| 创建直运委托       | directShipCreate         | [cs.trs.directship.create](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=162)          | ✔️  |
| 仓库推送无预报回传    | nonPrealertCallback      | [cs.trs.nonPrealert.callback](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=175)       | ❌   |
| 轨迹节点查询       | queryOrderNode           | [cs.trs.query.orderNode](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=196)            | ✔️  |

#### 退件服务  [GrsClient](https://github.com/EalenXie/sdk-all/blob/main/fop-sdk/src/main/java/io/github/ealenxie/fop/GrsClient.java) 已支持的接口列表

| 接口名       | 🏷️方法名        | 官方文档地址                                                                             | 状态  |
|:----------|:--------------|:-----------------------------------------------------------------------------------|:----|
| 批量查询退货单信息 | rmaInfoList   | [re.grs.rmainfo.list](http://open.4px.com/apiInfo/apiDetail?itemId=4&mainId=138)   | ✔️  |
| 查询退货单信息   | rmaInfoGet    | [re.grs.rmainfo.get](http://open.4px.com/apiInfo/apiDetail?itemId=4&mainId=139)    | ✔️  |
| 创建退货预报单   | rmaInfoCreate | [re.grs.rma.create](http://open.4px.com/apiInfo/apiDetail?itemId=4&mainId=148)     | ✔️  |
| 购买预付款标签   | prepaymentBuy | [re.grs.prepayment.buy](http://open.4px.com/apiInfo/apiDetail?itemId=4&mainId=149) | ✔️  |

#### 末端网络服务 [PdsClient](https://github.com/EalenXie/sdk-all/blob/main/fop-sdk/src/main/java/io/github/ealenxie/fop/PdsClient.java) 已支持的接口列表

| 接口名      | 🏷️方法名         | 官方文档地址                                                                           | 状态  |
|:---------|:---------------|:---------------------------------------------------------------------------------|:----|
| 末端派送下单   | pdsOrderCreate | [lm.pds.order.create](http://open.4px.com/apiInfo/apiDetail?itemId=5&mainId=179) | ✔️  |
| 末端派送订单取消 | pdsOrderCancel | [lm.pds.order.cancel](http://open.4px.com/apiInfo/apiDetail?itemId=5&mainId=180) | ✔️  |

#### 轨迹服务 [TrackClient](https://github.com/EalenXie/sdk-all/blob/main/fop-sdk/src/main/java/io/github/ealenxie/fop/TrackClient.java) 已支持的接口列表

| 接口名           | 🏷️方法名           | 官方文档地址                                                                                       | 状态  |
|:--------------|:-----------------|:---------------------------------------------------------------------------------------------|:----|
| 物流轨迹查询        | getTrackingOrder | [tr.order.tracking.get](http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=25)            | ✔️  |
| 添加轨迹数据        | createTrack      | [com.track.track.create](http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=170)          | ✔️  |
| 添加业务数据        | createBusiness   | [com.track.business.create](http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=171)       | ✔️  |
| 通过递四方单号添加轨迹数据 | createByTrackNo  | [com.track.track.createByTrackNo](http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=172) | ✔️  |

#### 公共服务 [PublicClient](https://github.com/EalenXie/sdk-all/blob/main/fop-sdk/src/main/java/io/github/ealenxie/fop/PublicClient.java) 已支持的接口列表

| 接口名       | 🏷️方法名               | 官方文档地址                                                                                              | 状态  |
|:----------|:---------------------|:----------------------------------------------------------------------------------------------------|:----|
| 创建申报产品    | declareCreate        | [com.basis.declare.create](http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=121)               | ✔️  |
| 批量查询申报产品  | declareList          | [com.basis.declare.getlist](http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=122)              | ✔️  |
| 申报产品关联SKU | skuBindDeclare       | [com.basis.declare.skubinddeclare](http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=123)       | ✔️  |
| 修改申报产品    | declareEdit          | [com.basis.declare.edit](http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=124)                 | ✔️  |
| 查询计量单位    | measureUnitList      | [com.basis.measureunit.getlist](http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=125)          | ✔️  |
| 查询物流产品信息  | logisticsProductList | [com.basis.logistics_product.getlist](http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=127)    | ✔️  |
| 查询申报产品种类  | getCategory          | [com.basis.declare.getcategory](http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=128)          | ✔️  |
| 费用试算      | priceCalculator      | [com.css.price_calculator](http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=144)               | ✔️  |
| 查询仓库信息    | warehouseList        | [com.basis.warehouse.getlist](http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=153)            | ✔️  |
| 费用查询      | billing              | [com.basis.billing.getbilling](http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=159)           | ✔️  |
| 申报产品绑定国家  | countryBindDeclare   | [com.basis.declare.counterrevolutionary](http://open.4px.com/apiInfo/apiDetail?itemId=8&mainId=161) | ✔️  |

  