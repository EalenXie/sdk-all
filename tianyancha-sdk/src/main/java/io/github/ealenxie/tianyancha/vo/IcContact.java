package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/8/9 14:01
 */
@Getter
@Setter
public class IcContact {
    /**
     * 电话
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    /**
     * 注册地址
     */
    @JsonProperty("regLocation")
    private String regLocation;

    /**
     * 公司id
     */
    @JsonProperty("id")
    private Long id;

    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;

    /**
     * 网址
     */
    @JsonProperty("websiteList")
    private String websiteList;

    /**
     * 全部电话
     */
    @JsonProperty("allCalls")
    private List<CallInfo> allCalls;
}
