package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/4 10:25
 **/
@Getter
@Setter
public class QuerySchemaByProcessCodeRequest {

    /**
     * 应用搭建隔离信息
     */
    private String appUuid;
    /**
     * 表单的唯一码
     */
    private String processCode;
}

