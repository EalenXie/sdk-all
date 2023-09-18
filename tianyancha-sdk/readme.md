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

##### 常用接口(10)

| 🏷️方法名           | 📚 官方文档地址                                        | 状态  |
|:-----------------|:-------------------------------------------------|:----|
| cbIpr            | [知识产权](http://open.tianyancha.com/open/1139)     | ✔️  |
| cbJudicial       | [司法风险](http://open.tianyancha.com/open/1002)     | ✔️  |
| cbIc             | [工商信息](http://open.tianyancha.com/open/1001)     | ✔️  |
| lawSuit2         | [法律诉讼](http://open.tianyancha.com/open/842)      | ✔️  |
| icChangeInfo     | [变更记录](http://open.tianyancha.com/open/822)      | ✔️  |
| icHolder         | [企业股东](http://open.tianyancha.com/open/821)      | ✔️  |
| icBaseInfoNormal | [企业基本信息查询](http://open.tianyancha.com/open/1116) | ✔️  |
| search           | [搜索](http://open.tianyancha.com/open/816)        | ✔️  |
| allCompanys      | [人员所有公司](http://open.tianyancha.com/open/450)    | ✔️  |
| riskInfo         | [企业天眼风险](http://open.tianyancha.com/open/425)    | ✔️  |

##### 工商信息(21)

| 🏷️方法名            | 📚 官方文档地址                                              | 状态  |
|:------------------|:-------------------------------------------------------|:----|
| icVerify          | [企业三要素验证](http://open.tianyancha.com/open/1074)        | ✔️  |
| icBaseInfoNormal  | [企业基本信息查询](http://open.tianyancha.com/open/1116)       | ✔️  |
| icBaseInfoSpecial | [特殊企业基本信息](http://open.tianyancha.com/open/1117)       | ✔️  |
| icBaseInfoV2      | [企业基本信息（含企业联系方式）](http://open.tianyancha.com/open/818) | ✔️  |
| icBaseInfoV3      | [企业基本信息（含主要人员）](http://open.tianyancha.com/open/819)   | ✔️  |
| icSnapshot        | [工商快照](http://open.tianyancha.com/open/1045)           | ✔️  |
| icCompanyType     | [企业类型](http://open.tianyancha.com/open/1047)           | ✔️  |
| icContact         | [企业联系方式](http://open.tianyancha.com/open/1046)         | ✔️  |
| icStaff           | [主要人员](http://open.tianyancha.com/open/820)            | ✔️  |
| hiMembers         | [历史主要人员](http://open.tianyancha.com/open/1050)         | ✔️  |
| icHolder          | [企业股东](http://open.tianyancha.com/open/821)            | ✔️  |
| hiHolder          | [历史股东信息](http://open.tianyancha.com/open/877)          | ✔️  |
| icHolderList      | [公司公示-股东出资](http://open.tianyancha.com/open/997)       | ✔️  |
| icHolderChange    | [公司公示-股权变更](http://open.tianyancha.com/open/998)       | ✔️  |
| icInverst         | [对外投资](http://open.tianyancha.com/open/823)            | ✔️  |
| hiInvest          | [历史对外投资](http://open.tianyancha.com/open/876)          | ✔️  |
| icBranch          | [分支机构](http://open.tianyancha.com/open/824)            | ✔️  |
| icParentCompany   | [总公司](http://open.tianyancha.com/open/963)             | ✔️  |
| icAnnualReport    | [企业年报](http://open.tianyancha.com/open/825)            | ✔️  |
| icChangeInfo      | [变更记录](http://open.tianyancha.com/open/822)            | ✔️  |
| hiIc              | [历史工商信息](http://open.tianyancha.com/open/878)          | ✔️  |

##### 司法风险(22)

| 🏷️方法名                 | 📚 官方文档地址                                        | 状态  |
|:-----------------------|:-------------------------------------------------|:----|
| lawSuit3               | [法律诉讼(V3)](http://open.tianyancha.com/open/1114) | ✔️  |
| hiLawSuit3             | [历史法律诉讼](http://open.tianyancha.com/open/1115)   | ✔️  |
| hiAnnouncement         | [历史开庭公告](http://open.tianyancha.com/open/875)    | ✔️  |
| jrCourtAnnouncement    | [法院公告](http://open.tianyancha.com/open/841)      | ✔️  |
| hiCourt                | [历史法院公告](http://open.tianyancha.com/open/873)    | ✔️  |
| sendAnnouncement       | [送达公告](http://open.tianyancha.com/open/962)      | ✔️  |
| courtRegister          | [立案信息](http://open.tianyancha.com/open/961)      | ✔️  |
| judicialV4             | [司法协助](http://open.tianyancha.com/open/756)      | ✔️  |
| getJudicialDetail      | [司法协助详情](http://open.tianyancha.com/open/757)    | ✔️  |
| hiJudicial             | [历史司法协助](http://open.tianyancha.com/open/1015)   | ✔️  |
| hiJudicialDetail       | [历史司法协助详情](http://open.tianyancha.com/open/1016) | ✔️  |
| bankruptcy             | [破产重整](http://open.tianyancha.com/open/1036)     | ✔️  |
| bankruptcyDetail       | [破产重整详情](http://open.tianyancha.com/open/1037)   | ✔️  |
| zhixinginfo            | [被执行人](http://open.tianyancha.com/open/839)      | ✔️  |
| hiZhixing              | [历史被执行人](http://open.tianyancha.com/open/871)    | ✔️  |
| dishonest              | [失信人](http://open.tianyancha.com/open/843)       | ✔️  |
| hiDishonest            | [历史失信人](http://open.tianyancha.com/open/872)     | ✔️  |
| consumptionRestriction | [限制消费令](http://open.tianyancha.com/open/1014)    | ✔️  |
