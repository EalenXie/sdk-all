package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/9/6 10:13
 **/
@Getter
@Setter
public class TrafficStatItem {
    /**
     * 关联类型，见表2.2,忽略大小写
     */
    private String relation;
    /**
     * 数量
     */
    private Integer count;
}

