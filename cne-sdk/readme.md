cne-sdk
======

主要是封装了 跨境物流 [cne 递一国际](https://docs.qq.com/pdf/DRmhmeW5uSWJxc3Fu) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>cne-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [CneClient](https://github.com/EalenXie/sdk-all/blob/main/cne-sdk/src/main/java/io/github/ealenxie/cne/CneClient.java) 已支持的接口列表

| 方法名            | 官方文档地址                                            | 状态  |
|:---------------|:--------------------------------------------------|:----|
| emsKindList    | [渠道列表](https://docs.qq.com/pdf/DRmhmeW5uSWJxc3Fu) | ✔️  |
| preInputSet    | [订单预报](https://docs.qq.com/pdf/DRmhmeW5uSWJxc3Fu) | ✔️  |
| getTrackNumber | [尾程单号](https://docs.qq.com/pdf/DRmhmeW5uSWJxc3Fu) | ✔️  |
