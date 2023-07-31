tianyancha-sdk
======

主要是封装了 天眼查 [天眼查](http://open.tianyancha.com/) 接口

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>tianyancha-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### [TianYanChaClient](https://github.com/EalenXie/sdk-all/blob/main/tianyancha-sdk/src/main/java/io/github/ealenxie/tianyancha/TianYanChaClient.java) 已支持的接口列表

| 🏷️方法名            | 📚 官方文档地址                                        | 状态  |
|:------------------|:-------------------------------------------------|:----|
| cbIpr             | [知识产权](http://open.tianyancha.com/open/1139)     | ✔️  |
| cbJudicial        | [司法风险](http://open.tianyancha.com/open/1002)     | ✔️  |
| cbIc              | [工商信息](http://open.tianyancha.com/open/1001)     | ✔️  |
| icBaseInfoNormal  | [企业基本信息查询](http://open.tianyancha.com/open/1116) | ✔️  |
| icBaseInfoSpecial | [特殊企业基本信息](http://open.tianyancha.com/open/1117) | ✔️  |