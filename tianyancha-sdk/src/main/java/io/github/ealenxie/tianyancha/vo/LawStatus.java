package io.github.ealenxie.tianyancha.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/31 9:33
 */
@Getter
@Setter
public class LawStatus {


    /**
     * 法律状态公告日
     */
    private String date;
    /**
     * 法律状态
     */

    private String status;
    /**
     * 法律状态信息
     */

    private String detail;


}
