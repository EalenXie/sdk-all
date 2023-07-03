fop-sdk
======

主要是封装了 跨境物流 [4PX 开放平台](http://open.4px.com/apiInfo/api) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>fop-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```
#### 代码示例

```java


import io.github.ealenxie.fop.FopResp;
import io.github.ealenxie.fop.PublicClient;
import io.github.ealenxie.fop.common.MeasureUnit;

import java.util.List;

class PublicClientTest {
    @Test
    void measureUnitList() {
        String appKey = "your appKey";
        String appSecret = "your appSecret";
        PublicClient publicClient = new PublicClient(appKey, appSecret);
        // 通过OAuth授权方式获得，要求平台服务商、第三方软件商必须传入，4PX客户（B类客户）可不传
        publicClient.setAccessToken(null);
        publicClient.setSandBox(false);
        FopResp<List<MeasureUnit>> measureUnitList = publicClient.measureUnitList();
        System.out.println(measureUnitList);
    }
}
```

### [4PX 服务列表](http://open.4px.com/apiInfo/api)

| 服务名    | Client名称                                                                                            |                                                                             
|:-------|:----------------------------------------------------------------------------------------------------|
| 直发服务   | [DirectClient](https://github.com/EalenXie/sdk-all/tree/main/fop-sdk/doc/DirectClient.md)           |
| 订单履约服务 | [FulfillmentClient](https://github.com/EalenXie/sdk-all/tree/main/fop-sdk/doc/FulfillmentClient.md) |
| 转运服务   | [TransferClient](https://github.com/EalenXie/sdk-all/tree/main/fop-sdk/doc/TransferClient.md)       |
| 退件服务   | [GrsClient](https://github.com/EalenXie/sdk-all/tree/main/fop-sdk/doc/GrsClient.md)                 |
| 末端网络服务 | [PdsClient](https://github.com/EalenXie/sdk-all/tree/main/fop-sdk/doc/PdsClient.md)                 |
| 轨迹服务   | [TrackClient](https://github.com/EalenXie/sdk-all/tree/main/fop-sdk/doc/TrackClient.md)             |
| 公共服务   | [PublicClient](https://github.com/EalenXie/sdk-all/tree/main/fop-sdk/doc/PublicClient.md)           |
