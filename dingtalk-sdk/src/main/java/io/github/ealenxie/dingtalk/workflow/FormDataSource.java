package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/4/28 14:23
 **/
@Getter
@Setter
public class FormDataSource {

    private FormDataSourceTarget target;
    private String type;
}

