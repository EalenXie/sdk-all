### 轨迹服务

#### [TrackClient](https://github.com/EalenXie/sdk-all/blob/main/fop-sdk/src/main/java/io/github/ealenxie/fop/TrackClient.java) 已支持的接口列表

| 接口名           | 方法               | 官方文档地址                                                                                       | 状态  |
|:--------------|:-----------------|:---------------------------------------------------------------------------------------------|:----|
| 物流轨迹查询        | getTrackingOrder | [tr.order.tracking.get](http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=25)            | ✔️  |
| 添加轨迹数据        | createTrack      | [com.track.track.create](http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=170)          | ✔️  |
| 添加业务数据        | createBusiness   | [com.track.business.create](http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=171)       | ✔️  |
| 通过递四方单号添加轨迹数据 | createByTrackNo  | [com.track.track.createByTrackNo](http://open.4px.com/apiInfo/apiDetail?itemId=6&mainId=172) | ✔️  |
  