package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/8 17:23
 **/
@Getter
@Setter
public class SaveProcessRequestCallback {
    /**
     * 网关apiKey，runType选ORIGIN类型时该参数必填。通过创建数据源内容获取
     */
    private String apiKey;
    /**
     * 网关appUuid，runType选ORIGIN类型时该参数必填
     * 传创建数据源时所属企业corpId值
     */
    private String appUuid;
    /**
     * 网关apiKey，runType选ORIGIN类型时该参数必填。通过创建数据源内容获取
     */
    private String version;
}

