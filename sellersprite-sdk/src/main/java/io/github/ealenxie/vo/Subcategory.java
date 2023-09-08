package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author lanzhi
 * Created on 2023/9/1 14:21
 **/
@Getter
@Setter
public class Subcategory implements Serializable {
    /**
     * 类目code
     */
    private String code;
    /**
     * 排名
     */
    private Integer rank;
    /**
     * 名称
     */
    private String label;

}

