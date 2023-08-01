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
| jrLawSuit         | [法律诉讼](http://open.tianyancha.com/open/842)      | ✔️  |
| icChangeInfo      | [变更记录](http://open.tianyancha.com/open/822)      | ✔️  |
| icHolder          | [企业股东](http://open.tianyancha.com/open/821)      | ✔️  |
| icBaseInfoNormal  | [企业基本信息查询](http://open.tianyancha.com/open/1116) | ✔️  |
| search            | [搜索](http://open.tianyancha.com/open/816)        | ✔️  |
| allCompanys       | [人员所有公司](http://open.tianyancha.com/open/450)    | ✔️  |
| riskInfo          | [企业天眼风险](http://open.tianyancha.com/open/425)    | ✔️  |
| icVerify          | [企业三要素验证](http://open.tianyancha.com/open/1074)  | ✔️  |
| icBaseInfoSpecial | [特殊企业基本信息](http://open.tianyancha.com/open/1117) | ✔️  |