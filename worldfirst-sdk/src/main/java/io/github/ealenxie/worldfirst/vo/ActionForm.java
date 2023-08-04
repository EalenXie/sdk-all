package io.github.ealenxie.worldfirst.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/31 15:05
 **/
@Getter
@Setter
public class ActionForm {
    /**
     * 动作类型。此字段赋值固定为RedirectActionForm
     */
    private String actionFormType;
    /**
     * HTTP 请求方式，可取值如：GET、POST
     */
    private String method;
    /**
     * 用户在支付后跳转的地址。
     */
    private String redirectUrl;
}

