package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/8 16:26
 **/
@Getter
@Setter
public class SaveProcessRequestTemplateConfig {

    /**
     * 表单创建移动端地址
     *
     * @deprecated (钉钉标记删除)
     */
    @Deprecated
    private String createInstanceMobileUrl;
    /**
     * 表单创建PC端地址
     *
     * @deprecated (钉钉标记删除)
     */
    @Deprecated
    private String createInstancePcUrl;
    /**
     * 创建流程中心待处理任务时是否禁用消息卡片通知：
     * true：禁用，将不发送消息卡片通知
     * false：默认值，不禁用，将发送消息卡片通知
     */
    private Boolean disableSendCard;
    /**
     * 是否为隐藏模板：
     * true：是隐藏模板
     * false：不是隐藏模板
     */
    private Boolean hidden;
    /**
     * 模板编辑地址
     *
     * @deprecated (钉钉标记删除)
     */
    @Deprecated
    private String templateEditUrl;

}

