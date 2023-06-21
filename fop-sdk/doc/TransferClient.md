### 转运服务

#### [TransferClient](https://github.com/EalenXie/sdk-all/blob/main/fop-sdk/src/main/java/io/github/ealenxie/fop/TransferClient.java) 已支持的接口列表

| 接口名          | 方法                       | 官方文档地址                                                                                         | 状态  |
|:-------------|:-------------------------|:-----------------------------------------------------------------------------------------------|:----|
| 创建集货入库委托     | inboundCreate            | [cs.trs.inbound.create](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=48)              | ✔️  |
| 创建集运出库委托     | outboundCreate           | [cs.trs.outbound.create](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=49)             | ✔️  |
| 取消入库委托       | inboundCancel            | [cs.trs.inbound.cancel](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=50)              | ✔️  |
| 查询出库委托       | getOutbound              | [cs.trs.outbound.get](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=51)                | ✔️  |
| 集货入库节点推送     | inboundCallback          | [cs.trs.inbound.callback](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=129)           | ❌ ️ |
| 集货出库节点推送     | outboundCallback         | [cs.trs.outbound.callback](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=130)          | ❌ ️ |
| 会员注册         | memberRegister           | [cs.trs.member.register](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=143)            | ✔️  |
| 入库异常解决方案     | inboundExceptionHandle   | [cs.trs.inbound.exception.handle](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=157)   | ✔️  |
| 入库异常解决方案节点推送 | inboundExceptionCallback | [cs.trs.inbound.exception.callback](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=160) | ❌   |
| 创建直运委托       | directShipCreate         | [cs.trs.directship.create](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=162)          | ✔️  |
| 仓库推送无预报回传    | nonPrealertCallback      | [cs.trs.nonPrealert.callback](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=175)       | ❌   |
| 轨迹节点查询       | queryOrderNode           | [cs.trs.query.orderNode](http://open.4px.com/apiInfo/apiDetail?itemId=3&mainId=196)            | ✔️  |




  