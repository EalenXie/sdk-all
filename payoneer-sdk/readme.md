payonner-sdk
======

主要是封装了 跨境收款 [payonner](https://www.payoneer.com.cn/)  接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>payonner-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [PayoneerClient](https://github.com/EalenXie/sdk-all/blob/main/payoneer-sdk/src/main/java/io/github/ealenxie/payoneer/PayoneerClient.java) 已支持的接口列表

| 接口名                         | 方法名                | 官方文档地址                                                                                                                                                  | 状态  |
|:----------------------------|:-------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------|:----|
| 客户端模式 获取应用令牌                | applicationToken   | [Requesting an Application Token](https://developer.payoneer.com/docs/mass-payouts-and-services.html#/ZG9jOjM1Njc3Mzcz-requesting-an-application-token) | ✔️  |
| 授权码模式 获取访问令牌                | accessToken        | [Requesting an Application Token](https://developer.payoneer.com/docs/mass-payouts-and-services.html#/165d55c0063ef-requesting-an-access-token)         | ✔️  |
| 刷新访问令牌                      | refreshAccessToken | [Requesting an Application Token](https://developer.payoneer.com/docs/mass-payouts-and-services.html#/d568eb67b0d74-refreshing-an-access-token)         | ✔️  |
| 撤销令牌                        | revokeToken        | [Revoking a Refresh Token](https://developer.payoneer.com/docs/mass-payouts-and-services.html#/8b1ba91980ea6-revoking-a-refresh-token)                  | ✔️  |
| 获取与 account_id 关联的所有接收帐户的余额 | accountBalances    | [Get account balances](https://developer.payoneer.com/docs/mass-payouts-and-services.html#/b3A6MzU2Nzc0MjA-get-account-balances)                        | ✔️  |
| 获取与 account_id 关联的所有收款账户    | receivingAccounts  | [Get receiving accounts](https://developer.payoneer.com/docs/mass-payouts-and-services.html#/05ebea2fe666a-get-receiving-accounts)                      | ✔️  |
| 获取与 account_id 关联的流水        | transactions       | [Get Transactions](https://developer.payoneer.com/docs/get-transactions-v4.html#/b3A6MzU2Nzc0MTI-get-transactions)                                      | ✔️  |
