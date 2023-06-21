alyunwms-sdk
======

主要是封装了 海外仓 [大方广 开放平台](http://al.yunwms.com/api-doc/index.php) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>alyunwms-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [AlYunWmsClient](https://github.com/EalenXie/sdk-all/blob/main/alyunwms-sdk/src/main/java/io/github/ealenxie/alyunwms/AlYunWmsClient.java) 已支持的接口列表

| 方法                       | 官方文档地址                                               | 状态  |
|:-------------------------|:-----------------------------------------------------|:----|
| createProduct            | [创建产品](http://al.yunwms.com/api-doc/index.php)       | ✔️  |
| modifyProduct            | [编辑产品](http://al.yunwms.com/api-doc/index.php)       | ✔️  |
| getProductList           | [获取产品列表](http://al.yunwms.com/api-doc/index.php)     | ✔️  |
| getProductInventory      | [获取产品库存](http://al.yunwms.com/api-doc/index.php)     | ✔️  |
| getAsnList               | [获取入库单](http://al.yunwms.com/api-doc/index.php)      | ✔️  |
| createAsn                | [创建入库单](http://al.yunwms.com/api-doc/index.php)      | ✔️  |
| modifyAsn                | [修改入库单](http://al.yunwms.com/api-doc/index.php)      | ✔️  |
| cancelAsn                | [取消入库单](http://al.yunwms.com/api-doc/index.php)      | ✔️  |
| getReceivingBoxPdfByCode | [获取入库单PDF文件](http://al.yunwms.com/api-doc/index.php) | ✔️  |
| updateAsnTracking        | [更新入库单跟踪号](http://al.yunwms.com/api-doc/index.php)   | ✔️  |
| getProductPdf            | [获取产品pdf文件](http://al.yunwms.com/api-doc/index.php)  | ✔️  |
