armlogi-sdk
======

主要是封装了 海外仓 [大方广开放平台](http://apisandbox.armlogi.com/doc.html) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>armlogi-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [ArmlogiClient](https://github.com/EalenXie/sdk-all/blob/main/armlogi-sdk/src/main/java/io/github/ealenxie/armlogi/ArmlogiClient.java)  已支持的接口列表

| 接口名           | 方法名                  | 官方文档地址                                                                                                                                                       | 状态  |
|:--------------|:---------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| 获取产品库存        | getProductInventory  | [获取产品库存](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E4%BA%A7%E5%93%81/listsSkuStockUsingPOST)                           | ✔️  |
| 作废入库单         | cancelAsn            | [作废入库单](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%85%A5%E5%BA%93%E5%8D%95/abolishUsingPOST)                         | ✔️  |
| 获取入库单PDF      | getAsnInBoundPdf     | [获取入库单PDF](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%85%A5%E5%BA%93%E5%8D%95/downloadPDFUsingPOST)                  | ✔️  |
| 获取箱唛PDF       | getAsnBoxBarcodePDF  | [获取箱唛PDF](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%85%A5%E5%BA%93%E5%8D%95/downloadPDFUsingPOST)                   | ✔️  |
| 获取入库单详情       | getAsnInfo           | [获取入库单详情](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%85%A5%E5%BA%93%E5%8D%95/getDetailUsingGET)                      | ✔️  |
| 创建入库单         | createInboundOrder   | [创建入库单](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%85%A5%E5%BA%93%E5%8D%95/createUsingPOST)                          | ✔️  |
| 编辑入库单         | updateInboundOrder   | [编辑入库单](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%85%A5%E5%BA%93%E5%8D%95/adjustUsingPOST)                          | ✔️  |
| 打印产品条码PDF     | getProductPDF        | [打印产品条码PDF](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E4%BA%A7%E5%93%81/printUsingPOST)                                | ✔️  |
| 预约入库          | approveInbound       | [预约入库](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%85%A5%E5%BA%93%E5%8D%95/approveUsingPOST)                          | ✔️  |
| 仓库分页列表        | warehouseLists       | [仓库分页列表](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%9F%BA%E7%A1%80%E6%95%B0%E6%8D%AE/listsUsingPOST)                 | ✔️  |
| 创建订单          | createOrder          | [创建订单](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/saveUsingPOST)                    | ✔️  |
| 审核订单          | auditOrder           | [审核订单](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/UploadAttachUsingPOST)            | ✔️  |
| 上传订单附件        | updateAttach         | [上传订单附件](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/UploadAttachUsingPOST)          | ✔️  |
| 截单            | interceptOrder       | [截单](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/interceptUsingPOST)                 | ✔️  |
| 取消截单          | cancelInterceptOrder | [取消截单](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/cancelInterceptUsingPOST)         | ✔️  |
| 作废订单          | invalidOrder         | [作废订单](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/invalidUsingPOST)                 | ✔️  |
| 异常或问题单转至待发货审核 | forwardToAuditOrder  | [异常或问题单转至待发货审核](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/forwardToAuditUsingPOST) | ✔️  |
| 运费试算（估算金额）    | trialFreightOrder    | [运费试算（估算金额）](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/trialFreightUsingPOST)      | ✔️  |
| 修改订单信息        | updateOrder          | [修改订单信息](http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/auditUsingPOST)                 | ✔️  |


