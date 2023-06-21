### 订单履约服务

#### [FulfillmentClient](https://github.com/EalenXie/sdk-all/-/blob/master/4px-sdk/src/main/java/com/kte/fop/FulfillmentClient.java) 已支持的接口列表

| 接口名            | 方法                | 官方文档地址                                                                                        | 状态  |
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
