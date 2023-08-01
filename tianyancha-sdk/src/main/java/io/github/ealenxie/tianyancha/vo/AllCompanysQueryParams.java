package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author EalenXie created on 2023/8/1 11:31
 */
@Getter
@Setter
public class AllCompanysQueryParams {

    /**
     * 人id（humanName和hid只需输入其中一个）
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("hid")
    private Long hid;
    /**
     * 姓名（humanName和hid只需输入其中一个）
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("humanName")
    private String humanName;
    /**
     * 公司名称（cid和name只需输入其中一个）
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("name")
    private String name;
    /**
     * 公司id（cid和name只需输入其中一个）
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("cid")
    private Long cid;

}
