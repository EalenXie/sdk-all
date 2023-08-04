worldfirst-sdk
======

主要是封装了
[worldfirst 商户平台](https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/overview)
接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>worldfirst-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [WorldFirstClient](https://github.com/EalenXie/sdk-all/tree/main/worldfirst-sdk/src/main/java/io/github/ealenxie/worldfirst/TransferClient.java) 已支持的接口列表

| 接口名            | 方法名             | 官方文档地址                                                                                                                                              | 状态  |
|:---------------|:----------------|:------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| 查询转账到户相关信息        | consultTransfer | [consultTransfer](https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/consult_fund_transfer)            | ✔️  |
| 资金的转账代发             | createTransfer  | [createTransfer](https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/create_fund_transfer)              | ✔️  |
| 接口查询转账代发结果        | inquiryTransfer | [inquiryTransfer](https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/inquiry_fund_transfer)            | ✔️  |
| 集成商查询转账到卡相关信息   | consultPayout   | [consultPayout](https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/consult_fund_payout?pageVersion=5)  | ✔️  |
| 集成商调用本接口完成转账到卡 | createPayout    | [createPayout](https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/create_fund_payout?pageVersion=21)   | ✔️  |
| 查询转账到卡结果           | inquiryPayout   | [inquiryPayout](https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/inquiry_fund_payout?pageVersion=15) | ✔️  |
| 创建单据                  | createInvoice   | [createInvoice](https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/create_invoice)                     | ✔️  |
| 查询单据支付结果           | queryInvoice    | [queryInvoice](https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/query_invoice)                       | ✔️  |
