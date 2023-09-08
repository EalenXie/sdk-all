package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author lanzhi
 * Created on 2023/9/5 11:34
 **/
@Getter
@Setter
public class SearchDepartment implements Serializable {
    /**
     * 类目代码
     */
    private String code;
    /**
     * 类目名称
     */
    private String label;
    /**
     * 类目总计
     */
    private Integer total;
    /**
     * 类目占比
     */
    private BigDecimal ratio;
}

