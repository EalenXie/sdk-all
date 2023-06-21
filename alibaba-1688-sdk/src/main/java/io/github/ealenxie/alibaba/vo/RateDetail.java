package io.github.ealenxie.alibaba.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/15 14:06
 */
@Setter
@Getter
public class RateDetail {
    /**
     * 评价星级
     */
    private Integer starLevel;
    /**
     * 评价详情
     */
    private String content;
    /**
     * 收到评价的用户昵称
     */
    private String receiverNick;
    /**
     * 发送评价的用户昵称
     */
    private String posterNick;
    /**
     * 评价上线时间
     */
    private String publishTime;
}
