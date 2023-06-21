package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/8 17:11
 **/
@Getter
@Setter
public class SaveProcessRequestConfigFeatures {

    /**
     * 网关回调配置，runType选ORIGIN类型时该参数必填。
     * 网关回调钉钉外数据接口需要统一在“数据源管理”中注册成网关，详细的使用说明请参考创建数据源
     */
    private SaveProcessRequestCallback callback;

    /**
     * 三方自定义的手机端跳转链接
     */
    private String mobileUrl;

    /**
     * 支持三方进行自定义配置的功能模块名称，当前支持：
     * TASK_EXECUTE：任务执行模块，即详情页的同意、拒绝按钮
     */
    private String name;

    /**
     * 三方自定义的pc端跳转链接
     */
    private String pcUrl;

    /**
     * 运行方式。
     * ORIGIN：原生运行，即在官方审批内运行对应功能，将会回调callback中配置的回调接口
     * REDIRECT：外部跳转运行，需要跳转到三方地址运行对应功能，将会跳转到pcUrl、mobileUrl中配置的地址
     */
    private String runType;
}

