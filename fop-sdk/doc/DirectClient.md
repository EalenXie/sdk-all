### 直发服务

#### [DirectClient](https://github.com/EalenXie/sdk-all/-/blob/master/4px-sdk/src/main/java/com/kte/fop/DirectClient.java) 已支持的接口列表

| 接口名               | 方法                      | 官方文档地址                                                                                        | 状态  |
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