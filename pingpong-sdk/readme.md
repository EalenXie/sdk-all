pingpong-sdk
======

主要是封装了 [PingPong 跨境收款](http://192.168.180.10:4999/web/#/59/502)  接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>pingpong-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [PingPongClient](https://github.com/EalenXie/sdk-all/blob/main/pingpong-sdk/src/main/java/io/github/ealenxie/pingpong/v1/PingPongClient.java) 已支持的接口列表

| 接口名                 | 方法名               | 官方文档地址 | 状态  |
|:--------------------|:------------------|:-------|:----|
| 分页查询一个客户名下所有店铺的店铺信息 | storeInfoList     | 暂无     | ✔️  |
| 查询店铺信息接口            | accountInfo       | 暂无     | ✔️  |
| 查询余额接口              | accountBalance    | 暂无     | ✔️  |
| 查询流水接口              | accountStatement  | 暂无     | ✔️  |
| 查询提现明细接口            | withdrawDetail    | 暂无     | ✔️  |
| 查询资金归集记录接口          | collectionRecords | 暂无     | ✔️  |

#### [PingPongClientV2](https://github.com/EalenXie/sdk-all/blob/main/pingpong-sdk/src/main/java/io/github/ealenxie/pingpong/v2/PingPongClient.java) 已支持的接口列表

| 接口名                | 方法名                        | 官方文档地址 | 状态  |
|:-------------------|:---------------------------|:-------|:----|
| 获取访问令牌             | getAccessToken             | 暂无     | ✔️  |
| 获取开发者关联的clientId信息 | getStoreClientId           | 暂无     | ✔️  |
| 获取平台列表             | getPlatforms               | 暂无     | ✔️  |
| 查询店铺信息             | getStoreInfo               | 暂无     | ✔️  |
| 查询余额               | getAccountBalance          | 暂无     | ✔️  |
| 查询流水               | getAccountStatement        | 暂无     | ✔️  |
| 查询提现记录             | getWithdrawRecords         | 暂无     | ✔️  |
| 查询提现明细             | getWithdrawDetail          | 暂无     | ✔️  |
| 查询付款记录             | getPayoutRecords           | 暂无     | ✔️  |
| 查询付款明细             | getPayoutDetail            | 暂无     | ✔️  |
| 查询归集记录             | getCollectionRecords       | 暂无     | ✔️  |
| 查询专用账户流水           | getSpecialAccountStatement | 暂无     | ✔️  |
