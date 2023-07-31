package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/7/29 17:02
 */
@Getter
@Setter
public class CopyRegWorks {
    /**
     * 发布日期
     */
    @JsonProperty("publishTime")
    private String publishTime;
    /**
     * 创作完成日期
     */
    @JsonProperty("finishTime")
    private String finishTime;
    /**
     * 登记日期
     */
    @JsonProperty("regTime")
    private String regTime;
    /**
     * 登记号
     */
    @JsonProperty("regNum")
    private String regNum;
    /**
     * 作品名称
     */
    @JsonProperty("fullName")
    private String fullName;
    /**
     * 著作权人姓名/名称
     */
    @JsonProperty("authorNationality")
    private String authorNationality;
    /**
     * 作品类别
     */
    @JsonProperty("type")
    private String type;
}
