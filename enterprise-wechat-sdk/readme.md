enterprise-wechat-sdk
======

主要是封装了[企业微信机器人](https://developer.work.weixin.qq.com/document/path/91770)

### 快速开始

#### `pom.xml`配置

```xml

<dependency>
    <groupId>io.github.ealenxie</groupId>
    <artifactId>enterprise-wechat-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

##### 发送text类型

```java

class WeChatClientTest {
    @Test
    void text() {
        WeChatClient wechatClient = new WeChatClient();
        Text text = new Text();
        text.setContent("我就是我,是不一样的烟火");
        TextMessage textMessage = new TextMessage(text);
        wechatClient.sendMessage(textMessage, "key************");
    }
}
```

##### 发送markdown类型

```java

class WeChatClientTest {
    @Test
    void markdown() {
        WeChatClient wechatClient = new WeChatClient();
        Markdown markdown = new Markdown();
        markdown.setContent("杭州天气", "#### 杭州天气 @150XXXXXXXX \\n> 9度，西北风1级，空气良89，相对温度73%\\n> ![screenshot](https://img.alicdn.com/tfs/TB1NwmBEL9TBuNjy1zbXXXpepXa-2400-1218.png)\\n> ###### 10点20分发布 [天气](https://www.dingalk.com) \\n");
        MarkdownMessage markdownMessage = new MarkdownMessage(markdown);
        wechatClient.sendMessage(markdownMessage, "Key************");
    }
}
```

##### 设置@人

```java

class WeChatClientTest {
    @Test
    void mentionedMobileList() {
        WeChatClient wechatClient = new WeChatClient();
        Markdown markdown = new Markdown();
        markdown.setContent("杭州天气", "#### 杭州天气 @150XXXXXXXX \\n> 9度，西北风1级，空气良89，相对温度73%\\n> ![screenshot](https://img.alicdn.com/tfs/TB1NwmBEL9TBuNjy1zbXXXpepXa-2400-1218.png)\\n> ###### 10点20分发布 [天气](https://www.dingalk.com) \\n");
        markdown.setMentionedMobileList(Arrays.asList("135******09", "136******59"));
        MarkdownMessage markdownMessage = new MarkdownMessage(markdown);
        wechatClient.sendMessage(markdownMessage, "Key************");
    }
}
```
