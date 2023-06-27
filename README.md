SDK ALL
=======
此项目为个人研发并总结所有对接第三方请求接口SDK封装整合项目

> 💾 设计目的和场景
>
> - 节省接口对接成本,根据场景与业务按需引入即用
> - 让开发使用者更加专注于业务开发,底层SDK与业务代码解耦
> - 开源此项目,希望能得到社区关注支持,让行业开发者共同维护与营造,实现项目可持续迭代发展
> - 本项目源码中的函数都附上了接口的官方文档地址,使用时请对照官方文档说明

### Release Version

鉴于**第三方接口本身都会无法预测的进行迭代更新**,本SDK遵循以下基本发布原则,各位使用开发者请务必注意

> - _**本项目维护者会尽最大努力维护所有SDK的基本稳定性,但不承诺sdk中所有接口,所有文档注释都百分之百稳定和正确**_
> - 所有的sdk都约定采用**快照版本**进行迭代与发布
> - 会定期对main分支上的代码打包并deploy中央maven库

### Contributing

欢迎参与项目贡献,比如提交PR,修复bug,或者新建Issue讨论新的或者变更。

> - 🔁 项目同步地址：[Github](https://github.com/EalenXie/sdk-all)
> - 📖 代码贡献指南: [CONTRIBUTING.md](https://github.com/EalenXie/sdk-all//blob/main/CONTRIBUTING.md)

#### SDK 列表

| SDK名                                                                                         | 描述                   | 官方文档地址                                                                                                             |                       大概完善度                       |
|:---------------------------------------------------------------------------------------------|:---------------------|:-------------------------------------------------------------------------------------------------------------------|:-------------------------------------------------:|
| [goodcang-sdk](https://github.com/EalenXie/sdk-all/tree/main/goodcang-sdk)                   | 谷仓海外仓                | [谷仓海外仓 调用API](https://open.goodcang.com/docs_api/practice)                                                         | ![](https://img.shields.io/badge/-98%25-blue.svg) |
| [fop-sdk](https://github.com/EalenXie/sdk-all/tree/main/fop-sdk)                             | 4PX 开放平台接口整合SDK      | [4PX 开放平台 OPEN PLATFORM ](http://open.4px.com/apiInfo/api)                                                         | ![](https://img.shields.io/badge/-95%25-blue.svg) |
| [aliyun-ocr-sdk](https://github.com/EalenXie/sdk-all/tree/main/aliyun-ocr-sdk)               | 阿里云 文字识别（OCR）        | [阿里云 文字识别](https://help.aliyun.com/product/252763.html)                                                            | ![](https://img.shields.io/badge/-78%25-blue.svg) |
| [allegro-sdk](https://github.com/EalenXie/sdk-all/tree/main/allegro-sdk)                     | Allegro 开发者门户接口整合SDK | [Allegro Developer Portal](https://developer.allegro.pl/documentation)                                             | ![](https://img.shields.io/badge/-20%25-red.svg)  |
| [amazon-sdk](https://github.com/EalenXie/sdk-all/tree/main/amazon-sdk)                       | amazon               | [amazon sp-api](https://developer-docs.amazon.com/sp-api)                                                          |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [wish-sdk](https://github.com/EalenXie/sdk-all/tree/main/wish-sdk)                           | wish 合作伙伴开发          | [Wish API Explorer](https://china-merchant.wish.com/documentation/api/v3/explorer)                                 | ![](https://img.shields.io/badge/-10%25-red.svg)  |
| [ebay-sdk](https://github.com/EalenXie/sdk-all/tree/main/ebay-sdk)                           | ebay                 | [Ebay Developers Program](https://developer.ebay.com/develop/apis/restful-apis)                                    |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [walmart-sdk](https://github.com/EalenXie/sdk-all/tree/main/walmart-sdk)                     | walmart 开发者门户接口整合SDK | [Walmart Developer Portal](https://developer.walmart.com)                                                          |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [fruugo-sdk](https://github.com/EalenXie/sdk-all/tree/main/fruugo-sdk)                       | fruugo               | [Retailer Support & Documentation]( https://fruugo.atlassian.net/wiki/spaces/RR/overview)                          |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [kaufland-sdk](https://github.com/EalenXie/sdk-all/tree/main/kaufland-sdk)                   | Kaufland(原德国Real)    | [Marketplace Seller API Overview](https://sellerapi.kaufland.com/?page=overview)                                   |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [lianlian-sdk](https://github.com/EalenXie/sdk-all/tree/main/lianlian-sdk)                   | LianLian(连连跨境)       | [LianLian Global](https://developer.lianlianglobal.com)                                                            |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [manomano-sdk](https://github.com/EalenXie/sdk-all/tree/main/manomano-sdk)                   | ManoMano             | [ManoMano Partners API](https://documenter.getpostman.com/view/6076660/TzCJf9gc#intro)                             |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [payoneer-sdk](https://github.com/EalenXie/sdk-all/tree/main/payoneer-sdk)                   | Payoneer(派安盈)        | [Payoneer APIs](https://developer.payoneer.com/docs/mass-payouts-and-services.html#/ec64bbcc26bbf-overview)        |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [paypal-sdk](https://github.com/EalenXie/sdk-all/tree/main/paypal-sdk)                       | PayPal               | [PayPal Developer](https://developer.paypal.com)                                                                   |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [pingpong-sdk](https://github.com/EalenXie/sdk-all/tree/main/pingpong-sdk)                   | PingPong 跨境收款        | 暂无收录                                                                                                               |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [shopify-sdk](https://github.com/EalenXie/sdk-all/tree/main/shopify-sdk)                     | shopify              | [shopify API Reference docs](https://shopify.dev/api)                                                              |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [cne-sdk](https://github.com/EalenXie/sdk-all/tree/main/cne-sdk)                             | 递一国际物流有限公司(简称CNE)    | [递一国际接口文档](https://docs.qq.com/pdf/DRmhmeW5uSWJxc3Fu?)                                                             |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [eccang-sdk](https://github.com/EalenXie/sdk-all/tree/main/eccang-sdk)                       | 易仓跨境电商ERP            | [ERP对外API开放文档](https://eccang.yuque.com/gko3h7/sw0gov)                                                             |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [alibaba-1688-sdk](https://github.com/EalenXie/sdk-all/tree/main/alibaba-1688-sdk)           | 阿里1688电商平台           | [阿里巴巴开放平台](https://open.1688.com/api/apidoclist.htm?id=624392)                                                     |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [edayun-sdk](https://github.com/EalenXie/sdk-all/tree/main/edayun-sdk)                       | 易达云 海外仓              | 暂无收录                                                                                                               |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [winit-sdk](https://github.com/EalenXie/sdk-all/tree/main/winit-sdk)                         | 万邑通 海外仓              | [万邑通 开放平台](https://developer.winit.com.cn/document/detail/id/14.html)                                              |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [alyunwms-sdk](https://github.com/EalenXie/sdk-all/tree/main/alyunwms-sdk)                   | 大方广 海外仓              | [大方广 开放平台](http://al.yunwms.com/api-doc/index.php)                                                                 |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [worldfirst-sdk](https://github.com/EalenXie/sdk-all/tree/main/worldfirst-sdk)               | 万里汇转账                | [万里汇 开放平台](https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/overview) |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [dingtalk-sdk](https://github.com/EalenXie/sdk-all/tree/main/dingding-sdk)                   | 钉钉机器人                | [钉钉开放平台](https://open.dingtalk.com/document/robots/custom-robot-access)                                            |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [feishu-sdk](https://github.com/EalenXie/sdk-all/tree/main/feishu-sdk)                       | 飞书机器人                | [飞书开放平台](https://open.feishu.cn/document/ukTMukTMukTM/ucTM5YjL3ETO24yNxkjN)                                        |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [enterprise-wechat-sdk](https://github.com/EalenXie/sdk-all/tree/main/enterprise-wechat-sdk) | 企业微信机器人              | [企业微信-开发者中心](https://developer.work.weixin.qq.com/document/path/91770)                                             |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [tianyancha-sdk](https://github.com/EalenXie/sdk-all/tree/main/tianyancha-sdk)               | 天眼查 接口目录             | [天眼查 接口目录](https://open.tianyancha.com/api_list)                                                                   |  ![](https://img.shields.io/badge/-1%25-red.svg)  |

持续更新中...