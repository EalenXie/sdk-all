package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/4 14:46
 **/
@Getter
@Setter
public class QuerySchemaByProcessCodeBehaviorLinkage {
    /**
     * 关联控件列表
     */
    private List<QuerySchemaByProcessCodeBehaviorLinkageTargets> targets;
    /**
     * 控件值
     */
    private String value;
}

