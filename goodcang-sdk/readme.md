goodcang-sdk
======

主要是封装了 跨境电商 谷仓[ERP对外API开放文档](https://open.goodcang.com/docs_api/glance) 接口

## 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>goodcang-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

## 代码示例

```java

import io.github.ealenxie.goodcang.GoodCangClient;
import io.github.ealenxie.goodcang.ResponseAsk;
import io.github.ealenxie.goodcang.base.Country;

import java.util.List;

class GoodCangClientTest {
    @Test
    void getCountry() {
        String appKey = "your appKey";
        String appToken = "your appToken";
        GoodCangClient goodCangClient = new GoodCangClient(appKey, appToken);
        goodCangClient.setSandBox(false);
        ResponseAsk<List<Country>> country = goodCangClient.getCountry();
        System.out.println(country);
    }
}
```

#### [GoodCangClient](https://github.com/EalenXie/sdk-all/blob/main/goodcang-sdk/src/main/java/io/github/ealenxie/goodcang/GoodCangClient.java) 已支持的接口列表

### 基础资料与工具

#### 基础资料的获取

| 方法名               | 官方文档地址                                                                      | 状态  |
|:------------------|:----------------------------------------------------------------------------|:----|
| getCountry        | [获取国家/地区列表](https://open.goodcang.com/docs_api/base_data/get_country)       | ✔️  |
| getWarehouse      | [获取仓库信息](https://open.goodcang.com/docs_api/base_data/get_warehouse)        | ✔️  |
| getShippingMethod | [获取物流产品](https://open.goodcang.com/docs_api/base_data/get_shipping_method)  | ✔️  |
| getAccountList    | [获取公司账户](https://open.goodcang.com/docs_api/base_data/get_account_list)     | ✔️  |
| costTypeList      | [获取物流产品](https://open.goodcang.com/docs_api/base_data/cost_type_list)       | ✔️  |
| fuelRateList      | [获取燃油费率](https://open.goodcang.com/docs_api/base_data/fuel_rate_list)       | ✔️  |
| taskStatusList    | [获取异步任务结果列表](https://open.goodcang.com/docs_api/base_data/task_status_list) | ✔️  |
| sysBaseInfo       | [获取业务基础数据信息](https://open.goodcang.com/docs_api/base_data/sys_base_info)    | ✔️  |

#### 通用工具

| 方法名                     | 官方文档地址                                                                          | 状态  |
|:------------------------|:--------------------------------------------------------------------------------|:----|
| uploadAttachment        | [上传附件](https://open.goodcang.com/docs_api/base_data/upload_attachment)          | ✔️  |
| getCalculateDeliveryFee | [运费试算](https://open.goodcang.com/docs_api/inventory/get_calculate_delivery_fee) | ✔️  |
| verifyAddressInfo       | [地址校验](https://open.goodcang.com/docs_api/base_data/verify_address_info)        | ✔️  |

### 商品信息

#### 商品管理

| 方法名                         | 官方文档地址                                                                                   | 状态  |
|:----------------------------|:-----------------------------------------------------------------------------------------|:----|
| getCategory                 | [获取商品品类](https://open.goodcang.com/docs_api/product/get_category)                        | ✔️  |
| getDeclareCommodityNameList | [获取建议中文申报品名](https://open.goodcang.com/docs_api/product/get_declare_commodity_name_list) | ✔️  |
| getMaterialList             | [获取建议材质](https://open.goodcang.com/docs_api/product/get_material_list)                   | ✔️  |
| addProduct                  | [新建商品](https://open.goodcang.com/docs_api/product/add_product)                           | ✔️  |
| editProduct                 | [修改商品](https://open.goodcang.com/docs_api/product/edit_product)                          | ✔️  |
| getProductSkuList           | [获取商品列表](https://open.goodcang.com/docs_api/product/get_product_sku_list)                | ✔️  |
| printSku                    | [获取SKU标签文件](https://open.goodcang.com/docs_api/product/print_sku)                        | ✔️  |
| addImportCountry            | [新增商品进口国数据](https://open.goodcang.com/docs_api/product/add_import_country)               | ✔️  |
| updateCustomsClearance      | [更新商品清关信息](https://open.goodcang.com/docs_api/product/update_customs_clearance)          | ✔️  |
| modifyProductStatus         | [修改商品状态](https://open.goodcang.com/docs_api/inventory/modify_product_status)             | ✔️  |
| productFreezeList           | [获取冻结商品列表](https://open.goodcang.com/docs_api/product/product_freeze_list)               | ✔️  |
| productFreezeDetail         | [获取冻结商品详情](https://open.goodcang.com/docs_api/product/product_freeze_detail)             | ✔️  |

#### 商品维护

| 方法名                 | 官方文档地址                                                                    | 状态  |
|:--------------------|:--------------------------------------------------------------------------|:----|
| createSerialNumber  | [新增序列号](https://open.goodcang.com/docs_api/product/create_serial_number)  | ✔️  |
| discardSerialNumber | [废弃序列号](https://open.goodcang.com/docs_api/product/discard_serial_number) | ✔️  |
| serialNumberList    | [获取序列号列表](https://open.goodcang.com/docs_api/product/serial_number_list)  | ✔️  |

### 海外仓配

#### 入库单管理

| 方法名                     | 官方文档地址                                                                                        | 状态  |
|:------------------------|:----------------------------------------------------------------------------------------------|:----|
| getVatList              | [进出口商列表](https://open.goodcang.com/docs_api/inbound_order/get_vat_list)                       | ✔️  |
| getSmCodeTwcToWarehouse | [获取物流产品与目的仓中转仓](https://open.goodcang.com/docs_api/inbound_order/get_smcode_twc_to_warehouse) | ✔️  |
| createGrn               | [创建入库单](https://open.goodcang.com/docs_api/inbound_order/create_grn)                          | ✔️  |
| modifyGrn               | [编辑入库单](https://open.goodcang.com/docs_api/inbound_order/modify_grn)                          | ✔️  |
| delGrn                  | [废弃入库单](https://open.goodcang.com/docs_api/inbound_order/del_grn)                             | ✔️  |
| getGrnList              | [获取入库单列表](https://open.goodcang.com/docs_api/inbound_order/get_grn_list)                      | ✔️  |
| getGrnDetail            | [获取入库单明细](https://open.goodcang.com/docs_api/inbound_order/get_grn_detail)                    | ✔️  |
| delAsnBox               | [删除入库单箱唛](https://open.goodcang.com/docs_api/inbound_order/del_asn_box)                       | ✔️  |
| printGcReceivingBox     | [打印箱唛](https://open.goodcang.com/docs_api/inbound_order/print_gc_receiving_box)               | ✔️  |
| getBatch                | [获取上架批次](https://open.goodcang.com/docs_api/inbound_order/get_batch)                          | ✔️  |
| getReceiptBatch         | [获取收货批次](https://open.goodcang.com/docs_api/inbound_order/get_receipt_batch)                  | ✔️  |
| carsModel               | [获取车型](https://open.goodcang.com/docs_api/inbound_order/cars_model)                           | ✔️  |
| uploadClearanceDocument | [上传清关文件](https://open.goodcang.com/docs_api/inbound_order/upload_clearance_document)          | ✔️  |
| getClearanceDocument    | [获取清关文件上传状态](https://open.goodcang.com/docs_api/inbound_order/get_clearance_document)         | ✔️  |
| uploadCustomsDocs       | [上传报关资料](https://open.goodcang.com/docs_api/inbound_order/upload_customs_docs)                | ✔️  |

#### 出库单管理

| 方法名                      | 官方文档地址                                                                          | 状态  |
|:-------------------------|:--------------------------------------------------------------------------------|:----|
| createOrder              | [新建出库单](https://open.goodcang.com/docs_api/order/create_order)                  | ✔️  |
| modifyOrder              | [修改出库单](https://open.goodcang.com/docs_api/order/modify_order)                  | ✔️  |
| getOrderByCode           | [根据订单号获取单票订单信息](https://open.goodcang.com/docs_api/order/get_order_by_code)     | ✔️  |
| getOrderByRefCode        | [根据参考号获取单票订单信息](https://open.goodcang.com/docs_api/order/get_order_by_ref_code) | ✔️  |
| getOrderList             | [获取订单列表](https://open.goodcang.com/docs_api/order/get_order_list)               | ✔️  |
| getDraftOrderList        | [获取草稿和暂存订单列表](https://open.goodcang.com/docs_api/order/get_draft_order_list)    | ✔️  |
| cancelOrder              | [取消订单](https://open.goodcang.com/docs_api/order/cancel_order)                   | ✔️  |
| queryTrackingStatus      | [轨迹查询](https://open.goodcang.com/docs_api/order/query_tracking_status)          | ✔️  |
| batchQueryTrackingStatus | [批量轨迹查询](https://open.goodcang.com/docs_api/order/batch_query_tracking_status)  | ✔️  |
| modifyExFulfilment       | [异常订单修改物流](https://open.goodcang.com/docs_api/order/modify_ex_fulfilment)       | ✔️  |
| uploadOrderLabel         | [上传面单](https://open.goodcang.com/docs_api/order/upload_order_label)             | ✔️  |

#### 退货单管理

| 方法名                 | 官方文档地址                                                                          | 状态  |
|:--------------------|:--------------------------------------------------------------------------------|:----|
| returnOrderCreate   | [创建退货单](https://open.goodcang.com/docs_api/return_order/create)                 | ✔️  |
| returnOrderUpdate   | [修改退货单](https://open.goodcang.com/docs_api/return_order/update)                 | ✔️  |
| returnOrderDiscard  | [废弃退货单](https://open.goodcang.com/docs_api/return_order/discard)                | ✔️  |
| returnOrderSearch   | [退货单查询](https://open.goodcang.com/docs_api/return_order/search)                 | ✔️  |
| returnOrderList     | [退货单列表](https://open.goodcang.com/docs_api/return_order/list)                   | ✔️  |
| returnOrderLabel    | [售后退件标签](https://open.goodcang.com/docs_api/return_order/label)                 | ✔️  |
| unauthorizedList    | [获取待确认退货列表](https://open.goodcang.com/docs_api/return_order/unauthorized_list)  | ✔️  |
| unauthorizedConfirm | [处理待确认退货](https://open.goodcang.com/docs_api/return_order/unauthorized_confirm) | ✔️  |
| claimOrderSave      | [退货认领](https://open.goodcang.com/docs_api/return_order/claim_order_save)        | ✔️  |
| claimOrderList      | [退货认领列表](https://open.goodcang.com/docs_api/return_order/claim_order_list)      | ✔️  |
| claimOrderDetail    | [退货认领详情](https://open.goodcang.com/docs_api/return_order/claim_order_details)   | ✔️  |
| returnOrderMessage  | [客服留言](https://open.goodcang.com/docs_api/return_order/message)                 | ✔️  |
| getServiceConfig    | [获取退货配置](https://open.goodcang.com/docs_api/return_order/get_service_config)    | ✔️  |

#### 计划单管理

| 方法名              | 官方文档地址                                                         | 状态  |
|:-----------------|:---------------------------------------------------------------|:----|
| planOrderCreate  | [新建计划单](https://open.goodcang.com/docs_api/plan_order/create)  | ✔️  |
| planOrderList    | [计划单列表](https://open.goodcang.com/docs_api/plan_order/list)    | ✔️  |
| planOrderCancel  | [取消计划单](https://open.goodcang.com/docs_api/plan_order/cancel)  | ✔️  |
| planOrderBoxList | [装箱列表](https://open.goodcang.com/docs_api/plan_order/box_list) | ✔️  |

#### 库存管理

| 方法名                 | 官方文档地址                                                                       | 状态  |
|:--------------------|:-----------------------------------------------------------------------------|:----|
| getProductInventory | [获取库存](https://open.goodcang.com/docs_api/inventory/get_product_inventory)   | ✔️  |
| getInventoryLog     | [获取库存动态列表](https://open.goodcang.com/docs_api/inventory/get_inventory_log)   | ✔️  |
| inventoryAgeList    | [获取库龄列表](https://open.goodcang.com/docs_api/inventory/inventory_age_list)    | ✔️  |
| setInventoryWarning | [设置库龄预警](https://open.goodcang.com/docs_api/inventory/set_inventory_warning) | ✔️  |

### 查件与索赔

#### 查件单管理

| 方法名                        | 官方文档地址                                                                                | 状态  |
|:---------------------------|:--------------------------------------------------------------------------------------|:----|
| logisticTicketList         | [获取查件列表](https://open.goodcang.com/docs_api/assistant/logistic_ticket_list)           | ✔️  |
| logisticTicketTypeList     | [获取查件单类型列表](https://open.goodcang.com/docs_api/assistant/logistic_ticket_type_list)   | ✔️  |
| createLogisticTicket       | [新增查件单](https://open.goodcang.com/docs_api/assistant/create_logistic_ticket)          | ✔️  |
| modifyLogisticTicket       | [编辑查件单](https://open.goodcang.com/docs_api/assistant/modify_logistic_ticket)          | ✔️  |
| logisticTicketDetail       | [获取查件单详情](https://open.goodcang.com/docs_api/assistant/logistic_ticket_detail)        | ✔️  |
| modifyLogisticTicketStatus | [查件单状态变更](https://open.goodcang.com/docs_api/assistant/modify_logistic_ticket_status) | ✔️  |
| recheckLogisticTicket      | [复查查件单](https://open.goodcang.com/docs_api/assistant/recheck_logistic_ticket)         | ✔️  |

### 财务中心

#### 账户管理

| 方法名                   | 官方文档地址                                                                        | 状态  |
|:----------------------|:------------------------------------------------------------------------------|:----|
| getWhInventoryStorage | [获取仓租信息](https://open.goodcang.com/docs_api/finance/get_wh_inventory_storage) | ✔️  |
| currencyRateList      | [获取货币列表](https://open.goodcang.com/docs_api/finance/currency_rate_list)       | ✔️  |
| myBankList            | [获取银行列表](https://open.goodcang.com/docs_api/finance/my_bank_list)             | ✔️  |

#### 费用流水

| 方法名                         | 官方文档地址                                                                               | 状态  |
|:----------------------------|:-------------------------------------------------------------------------------------|:----|
| getWhInventoryStorageDetail | [获取仓租明细](https://open.goodcang.com/docs_api/finance/get_wh_inventory_storage_detail) | ✔️  |
| costFlowList                | [获取费用流水](https://open.goodcang.com/docs_api/finance/cost_flow_list)                  | ✔️  |
| topUpRecord                 | [获取充值明细](https://open.goodcang.com/docs_api/finance/top_up_record)                   | ✔️  |

#### 账单

| 方法名           | 官方文档地址                                                              | 状态  |
|:--------------|:--------------------------------------------------------------------|:----|
| billingList   | [获取账单列表](https://open.goodcang.com/docs_api/finance/billing_list)   | ✔️  |
| billingExport | [下载账单文件](https://open.goodcang.com/docs_api/finance/billing_export) | ✔️  |
