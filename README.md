# SDK ALL

此项目为个人研发总结的所有第三方请求接口SDK的封装整合项目。

> 💾 设计目的和场景
>
> - 节省接口对接成本，根据场景与业务按需引入即用。
> - 让开发使用者更加专注于业务开发，将底层SDK与业务代码解耦。
> - 开源此项目，希望社区的关注与支持，与开发者共同维护，实现项目的可持续迭代发展。
> - 本项目所有源码均针对平台的官方文档编写，源码中都附有相关地址，请使用时对照官方文档说明，如有疑问，一切以官方文档为准。

## Release Version

> ⚠️ 鉴于**第三方接口本身会进行无法预测的迭代更新**，本SDK遵循以下基本发布原则，请注意：
> - _**本项目维护者将尽最大努力维护所有SDK的基本稳定性，但无法保证SDK中的所有接口和文档注释的及时性、准确性和稳定性。**_
> - _**本项目仅参考官方文档提供的样例编写接口。鉴于平台授权认证等原因，我们未对所有接口进行单元测试。**_
> - 所有的SDK版本均采用快照版本进行迭代开发。只有当SDK完成度达到80%以上时，我们才会定期发布正式版本，其他版本均为快照版本。
> - 我们会定期对主分支上的代码进行打包，并将其部署到中央Maven库。

## Contributing

欢迎参与项目贡献，例如提交PR、修复bug或者新建Issue讨论新的或者变更。

> - 🔁 项目同步地址：[https://github.com/EalenXie/sdk-all](https://github.com/EalenXie/sdk-all)
> - 📖 代码贡献指南：[CONTRIBUTING.md](https://github.com/EalenXie/sdk-all/blob/main/CONTRIBUTING.md)
> - 💬 如果你有任何问题或疑问，请在项目的[Issues](https://github.com/EalenXie/sdk-all/issues)页面提问。

## License

Copyright (c) 2023 EalenXie. All rights reserved.

Licensed under the [MIT](https://github.com/EalenXie/sdk-all/blob/main/LICENSE) license.

For inquiries and support, please contact us at [ealenxie@outlook.com](mailto:ealenxie@outlook.com)

## Copyright

本项目的源代码均基于官方接口文档编写。

项目中使用的Markdown链接仅用于非商业用途，仅用于展示、描述或表达与之相关的信息。

如果您认为本项目存在侵权内容，请及时告知，我们将积极删除相关内容。

我们尊重知识产权，如有疑问或建议，请随时联系我们。

## SDK 列表

| 📁SDK名                                                                                       | 📝描述                 | 📚 官方文档地址                                                                                                          |                       大概完善度                       |
|:---------------------------------------------------------------------------------------------|:---------------------|:-------------------------------------------------------------------------------------------------------------------|:-------------------------------------------------:|
| [goodcang-sdk](https://github.com/EalenXie/sdk-all/tree/main/goodcang-sdk)                   | 谷仓海外仓                | [谷仓海外仓 调用API](https://open.goodcang.com/docs_api/practice)                                                         | ![](https://img.shields.io/badge/-98%25-blue.svg) |
| [fop-sdk](https://github.com/EalenXie/sdk-all/tree/main/fop-sdk)                             | 4PX 开放平台接口整合SDK      | [4PX 开放平台 OPEN PLATFORM ](http://open.4px.com/apiInfo/api)                                                         | ![](https://img.shields.io/badge/-90%25-blue.svg) |
| [aliyun-ocr-sdk](https://github.com/EalenXie/sdk-all/tree/main/aliyun-ocr-sdk)               | 阿里云 文字识别（OCR）        | [阿里云 文字识别](https://help.aliyun.com/product/252763.html)                                                            | ![](https://img.shields.io/badge/-83%25-blue.svg) |
| [allegro-sdk](https://github.com/EalenXie/sdk-all/tree/main/allegro-sdk)                     | Allegro 开发者门户接口整合SDK | [Allegro Developer Portal](https://developer.allegro.pl/documentation)                                             | ![](https://img.shields.io/badge/-96%25-blue.svg) |
| [walmart-sdk](https://github.com/EalenXie/sdk-all/tree/main/walmart-sdk)                     | walmart 开发者门户接口整合SDK | [Walmart Developer Portal](https://developer.walmart.com)                                                          | ![](https://img.shields.io/badge/-90%25-blue.svg) |
| [wish-sdk](https://github.com/EalenXie/sdk-all/tree/main/wish-sdk)                           | wish 合作伙伴开发          | [Wish API Explorer](https://china-merchant.wish.com/documentation/api/v3/explorer)                                 | ![](https://img.shields.io/badge/-10%25-red.svg)  |
| [paypal-sdk](https://github.com/EalenXie/sdk-all/tree/main/paypal-sdk)                       | PayPal               | [PayPal Developer](https://developer.paypal.com)                                                                   |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [winit-sdk](https://github.com/EalenXie/sdk-all/tree/main/winit-sdk)                         | 万邑通 海外仓              | [万邑通 开放平台](https://developer.winit.com.cn/document/detail/id/14.html)                                              |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [payoneer-sdk](https://github.com/EalenXie/sdk-all/tree/main/payoneer-sdk)                   | Payoneer(派安盈)        | [Payoneer APIs](https://developer.payoneer.com/docs/mass-payouts-and-services.html#/ec64bbcc26bbf-overview)        |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [shopify-sdk](https://github.com/EalenXie/sdk-all/tree/main/shopify-sdk)                     | shopify              | [shopify API Reference docs](https://shopify.dev/api)                                                              |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [worldfirst-sdk](https://github.com/EalenXie/sdk-all/tree/main/worldfirst-sdk)               | 万里汇转账                | [万里汇 开放平台](https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/overview) |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [alibaba-1688-sdk](https://github.com/EalenXie/sdk-all/tree/main/alibaba-1688-sdk)           | 阿里1688电商平台           | [阿里巴巴开放平台](https://open.1688.com/api/apidoclist.htm?id=624392)                                                     |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [tianyancha-sdk](https://github.com/EalenXie/sdk-all/tree/main/tianyancha-sdk)               | 天眼查 接口目录             | [天眼查 接口目录](https://open.tianyancha.com/api_list)                                                                   |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [ebay-sdk](https://github.com/EalenXie/sdk-all/tree/main/ebay-sdk)                           | ebay                 | [Ebay Developers Program](https://developer.ebay.com/develop/apis/restful-apis)                                    |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [manomano-sdk](https://github.com/EalenXie/sdk-all/tree/main/manomano-sdk)                   | ManoMano             | [ManoMano Partners API](https://documenter.getpostman.com/view/6076660/TzCJf9gc#intro)                             |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [fruugo-sdk](https://github.com/EalenXie/sdk-all/tree/main/fruugo-sdk)                       | fruugo               | [Retailer Support & Documentation]( https://fruugo.atlassian.net/wiki/spaces/RR/overview)                          |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [amazon-sdk](https://github.com/EalenXie/sdk-all/tree/main/amazon-sdk)                       | amazon               | [amazon sp-api](https://developer-docs.amazon.com/sp-api)                                                          |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [kaufland-sdk](https://github.com/EalenXie/sdk-all/tree/main/kaufland-sdk)                   | Kaufland(原德国Real)    | [Marketplace Seller API Overview](https://sellerapi.kaufland.com/?page=overview)                                   |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [lianlian-sdk](https://github.com/EalenXie/sdk-all/tree/main/lianlian-sdk)                   | LianLian(连连跨境)       | [LianLian Global](https://developer.lianlianglobal.com)                                                            |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [pingpong-sdk](https://github.com/EalenXie/sdk-all/tree/main/pingpong-sdk)                   | PingPong 跨境收款        | 暂无收录                                                                                                               |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [cne-sdk](https://github.com/EalenXie/sdk-all/tree/main/cne-sdk)                             | 递一国际物流有限公司(简称CNE)    | [递一国际接口文档](https://docs.qq.com/pdf/DRmhmeW5uSWJxc3Fu?)                                                             |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [eccang-sdk](https://github.com/EalenXie/sdk-all/tree/main/eccang-sdk)                       | 易仓跨境电商ERP            | [ERP对外API开放文档](https://eccang.yuque.com/gko3h7/sw0gov)                                                             |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [alyunwms-sdk](https://github.com/EalenXie/sdk-all/tree/main/alyunwms-sdk)                   | 大方广 海外仓              | [大方广 开放平台](http://al.yunwms.com/api-doc/index.php)                                                                 |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [edayun-sdk](https://github.com/EalenXie/sdk-all/tree/main/edayun-sdk)                       | 易达云 海外仓              | 暂无收录                                                                                                               |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [dingtalk-sdk](https://github.com/EalenXie/sdk-all/tree/main/dingtalk-sdk)                   | 钉钉机器人                | [钉钉开放平台](https://open.dingtalk.com/document/robots/custom-robot-access)                                            |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [feishu-sdk](https://github.com/EalenXie/sdk-all/tree/main/feishu-sdk)                       | 飞书机器人                | [飞书开放平台](https://open.feishu.cn/document/ukTMukTMukTM/ucTM5YjL3ETO24yNxkjN)                                        |  ![](https://img.shields.io/badge/-1%25-red.svg)  |
| [enterprise-wechat-sdk](https://github.com/EalenXie/sdk-all/tree/main/enterprise-wechat-sdk) | 企业微信机器人              | [企业微信-开发者中心](https://developer.work.weixin.qq.com/document/path/91770)                                             |  ![](https://img.shields.io/badge/-1%25-red.svg)  |

持续更新中，太多了根本写不完😂...