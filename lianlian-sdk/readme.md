lianlian-sdk
======

主要是封装了 跨境收款 [LianLian Global](https://developer.lianlianglobal.com)  接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>lianlian-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [LianLianClient](https://github.com/EalenXie/sdk-all/blob/main/lianlian-sdk/src/main/java/io/github/ealenxie/lianlian/LianLianClient.java) 已支持的接口列表

| 方法名              | 官方文档地址                                                                         | 状态  |
|:-----------------|:-------------------------------------------------------------------------------|:----|
| accountBalance   | [查询用户收款账户余额](https://developer.lianlianglobal.com/docs/llp-api/6e3c95aa7b658-) | ✔️  |
| account          | [用户账户详情查询](https://developer.lianlianglobal.com/docs/llp-api/5f2e875a7a8d2-)   | ✔️  |
| transactions     | [资金流水查询](https://developer.lianlianglobal.com/docs/llp-api/9250a1f8d5c54-)     | ✔️  |
| transactionEntry | [入账交易查询](https://developer.lianlianglobal.com/docs/llp-api/e361747518aa8-)     | ✔️  |
| withdrawRecord   | [提现交易查询](https://developer.lianlianglobal.com/docs/llp-api/3f7ebd879c7c2-)     | ✔️  |
