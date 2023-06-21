package io.github.ealenxie.worldfirst.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2023/6/6 10:33
 */
@Getter
@Setter
public class UserName {
    /**
     * 名字
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：32
     */
    private String firstName;
    /**
     * 中间名
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：32
     */
    private String middleName;
    /**
     * 姓氏
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：32
     */
    private String lastName;
    /**
     * 全名
     * <p>
     * 更多信息：
     * <p>
     * 字段最大长度：96
     */
    private String fullName;
}
