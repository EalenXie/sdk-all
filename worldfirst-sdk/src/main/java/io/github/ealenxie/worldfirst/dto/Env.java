package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/5 15:08
 */
@Getter
@Setter
public class Env {
    /**
     * 客户端IP地址
     *
     * <p>
     * 字段最大长度：64
     */
    private String clientIp;
    /**
     * 会话ID
     *
     * <p>
     * 字段最大长度：64
     */
    private String sessionId;
    /**
     * 设备令牌ID，用于查询所有apdid sdk的设备数据
     *
     * <p>
     * 字段最大长度：128
     */
    private String deviceTokenId;
    /**
     * 终端类型，可取值为：WEB、WAP、APP
     */
    private String terminalType;
    /**
     * 用户正在使用的界面语言
     *
     * <p>
     * 字段最大长度：8
     */
    private String language;
    /**
     * 阿里巴巴集团的umid sdk生成的deviceId。
     *
     * <p>
     * 字段最大长度：128
     */
    private String clientUmid;
    /**
     * 用于关联集团umid上报数据的token。
     *
     * <p>
     * 字段最大长度：64
     */
    private String umidTokenId;
    /**
     * 用户代理
     *
     * <p>
     * 字段最大长度：1024
     */
    private String userAgent;
    /**
     * 用户上网跟踪记录ID
     *
     * <p>
     * 字段最大长度：64
     */
    private String cookieId;
    /**
     * 系统运行操作系统
     * <p>
     * 使用条件：
     * <p>
     * 当 terminalType = APP，字段为必填
     * 更多信息：
     * <p>
     * 字段最大长度：32
     */
    private String osType;
    /**
     * 系统运行操作系统版本
     * <p>
     * 使用条件：
     * <p>
     * 当 terminalType = APP，字段为必填
     * 更多信息：
     * <p>
     * 字段最大长度：32
     */
    private String osVersion;
    /**
     * 设备信息
     *
     * <p>
     * 字段最大长度：32
     */
    private String deviceModel;
    /**
     * 设备品牌及型号
     *
     * <p>
     * 字段最大长度：32
     */
    private String deviceVersion;
    /**
     * 软件版本
     *
     * <p>
     * 字段最大长度：32
     */
    private String appVersion;
    /**
     * 浏览器版本
     * <p>
     * 使用条件：
     * <p>
     * 当 terminalType = WEB or WAP，字段为必填
     * 更多信息：
     * <p>
     * 字段最大长度：32
     */
    private String browserVersion;
    /**
     * 浏览器类型
     * <p>
     * 使用条件：
     * <p>
     * 当 terminalType = WEB or WAP，字段为必填
     * 更多信息：
     * <p>
     * 字段最大长度：32
     */
    private String browserType;
    /**
     * 浏览器时区，取值为设备所在时区时间和格林威治时间差的分钟值，如东八区GMT+8，则取值为 480 。
     * <p>
     * 使用条件：
     * <p>
     * 当 terminalType = WEB or WAP，字段为必填
     * 获取方法（以东八区为例）：
     * <p>
     * 在浏览器上执行 getTimezoneOffset，得出 -480，取反为480；或
     * GMT +8，8*60计算时间差分钟值为 480
     * 更多信息：
     * <p>
     * 字段最大长度：32
     */
    private String browserTimeZone;
    /**
     * 请求操作入口，可用于区分如商户直接请求和第三方小程序请求，例如LZD场景下区分小程序入口operateEntrance:对于GCash，标记值为"GCash-Mini", 对于TNG，值为"TNG-Mini"
     *
     * <p>
     * 字段最大长度：64
     */
    private String operateEntrance;
    /**
     * 支付中用户是否采用复制粘贴的方式输入卡号信息
     */
    private Boolean isPastedCard;
}
