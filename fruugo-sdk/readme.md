Allegro
===========
<p>Fruugo是欧洲领先的英国平台，英国最大的支持全球销售的本土电商平台。</p>

Allegro开发平台: https://developer.allegro.pl/documentation/

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>fruugo-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [FruugoOrderClient](https://github.com/EalenXie/sdk-all/blob/main/fruugo-sdk/src/main/java/io/github/ealenxie/fruggo/FruugoOrderClient.java) 已支持的接口列表

| 接口名  | 方法名          | 官方文档地址                                                                                            | 状态  |
|:-----|:-------------|:--------------------------------------------------------------------------------------------------|:----|
| 获取订单 | orders       | [Download Orders - v2](https://fruugo.atlassian.net/wiki/spaces/RR/pages/66158675/Requests+Calls) | ✔️  |
| 确认订单 | confirmOrder | [Confirm Order](https://fruugo.atlassian.net/wiki/spaces/RR/pages/66158675/Requests+Calls)        | ✔️  |
| 履行订单 | shipOrder    | [Ship Order](https://fruugo.atlassian.net/wiki/spaces/RR/pages/66158675/Requests+Calls)           | ✔️  |
