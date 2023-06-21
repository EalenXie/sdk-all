manomano-sdk
======

主要是封装了
跨境电商 [manomano 商户平台](https://documenter.getpostman.com/view/6076660/TzCJf9gc#5227aae3-833e-4cd5-befa-ea3fc0f663d0)
接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>manomano-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [ManoManoClient](https://github.com/EalenXie/sdk-all/blob/main/manomano-sdk/src/main/java/io/github/ealenxie/manomano/ManoManoClient.java) 已支持的接口列表

| 接口名     | 方法名            | 官方文档地址                                                                                                                | 状态  |
|:--------|:---------------|:----------------------------------------------------------------------------------------------------------------------|:----|
| 查询订单    | order          | [get_order Get 1 Order](https://documenter.getpostman.com/view/6076660/TzCJf9gc#40d664c3-d4a7-422b-a9e1-873a666f68fc) | ✔️  |
| 查询订单列表  | orders         | [get_last_orders](https://documenter.getpostman.com/view/6076660/TzCJf9gc#f9d85312-cd3d-475b-bab2-061590285605)       | ✔️  |
| 订单关联运单号 | createShipping | [create_shipping](https://documenter.getpostman.com/view/6076660/TzCJf9gc#5f2547d2-0faa-445d-958e-7664250597fe)       | ✔️  |
