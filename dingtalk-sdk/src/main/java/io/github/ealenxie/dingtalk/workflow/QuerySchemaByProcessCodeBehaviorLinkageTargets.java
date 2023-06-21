package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/4 15:02
 **/
@Getter
@Setter
public class QuerySchemaByProcessCodeBehaviorLinkageTargets {
    /**
     * 行为
     */
    private String behavior;
    /**
     * 字段 id
     */
    private String fieldId;
}

