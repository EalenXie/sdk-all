package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author lanzhi
 * Created on 2023/9/1 17:07
 **/
@Getter
@Setter
public class Department implements Serializable {
    /**
     * 类目代码
     */
    private String code;
    /**
     * 名称
     */
    private String label;
}

