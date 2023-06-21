钉钉机器人
==========

主要是封装了[自定义钉钉机器人接入的接口](https://open.dingtalk.com/document/robots/custom-robot-access) ,
支持钉钉自定义机器人[所有消息类型](https://open.dingtalk.com/document/robots/message-types-and-data-format)

#### [DingRobotClient](https://github.com/EalenXie/sdk-all/blob/main/dingding-sdk/src/main/java/io/github/ealenxie/dingtalk/DingRobotClient.java) 已支持的接口列表

| 方法名         | 官方文档地址                                                                          | 状态  |
|:------------|:--------------------------------------------------------------------------------|:----|
| sendMessage | [发送消息](https://open.dingtalk.com/document/robots/message-types-and-data-format) | ✔️  |

##### 发送text类型

```java

class DingRobotClientTest {
    @Test
    void text() {
        DingRobotClient dingRobotClient = new DingRobotClient();
        Text text = new Text("我就是我,是不一样的烟火");
        TextMessage textMessage = new TextMessage(text);
        dingRobotClient.sendMessage(textMessage, "accessToken**********", "signKey************");
    }
}
```

##### 发送markdown类型

```java
class DingRobotClientTest {
    @Test
    void markdown() {
        DingRobotClient dingRobotClient = new DingRobotClient();
        Markdown markdown = new Markdown("杭州天气", "#### 杭州天气 @150XXXXXXXX \\n> 9度，西北风1级，空气良89，相对温度73%\\n> ![screenshot](https://img.alicdn.com/tfs/TB1NwmBEL9TBuNjy1zbXXXpepXa-2400-1218.png)\\n> ###### 10点20分发布 [天气](https://www.dingalk.com) \\n");
        MarkdownMessage markdownMessage = new MarkdownMessage(markdown);
        dingRobotClient.sendMessage(markdownMessage, "accessToken**********", "signKey************");
    }
}
```

##### 设置@人

```java

class DingRobotClientTest {
    @Test
    void atMobiles() {
        DingRobotClient dingRobotClient = new DingRobotClient();
        Markdown markdown = new Markdown("杭州天气", "#### 杭州天气 @150XXXXXXXX \\n> 9度，西北风1级，空气良89，相对温度73%\\n> ![screenshot](https://img.alicdn.com/tfs/TB1NwmBEL9TBuNjy1zbXXXpepXa-2400-1218.png)\\n> ###### 10点20分发布 [天气](https://www.dingalk.com) \\n");
        MarkdownMessage markdownMessage = new MarkdownMessage(markdown);
        DingRobotAt at = new DingRobotAt();
        // 是否@所有人
        at.setAtAll(Boolean.FALSE);
        // @某些人
        at.setAtMobiles(Arrays.asList("135******09", "136******59"));
        markdownMessage.setAt(at);
        dingRobotClient.sendMessage(markdownMessage, "accessToken**********", "signKey************");
    }
}
```
