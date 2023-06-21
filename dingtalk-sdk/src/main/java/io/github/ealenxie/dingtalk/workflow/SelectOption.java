package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * 可选选项
 *
 * @author lanzhi
 * Created on 2023/4/28 13:21
 **/
@Getter
@Setter
public class SelectOption {
    /**
     * 选项显示名称
     */
    private String key;
    /**
     * 控件内唯一key，非必填，系统会默认生成
     */
    private String value;
}

