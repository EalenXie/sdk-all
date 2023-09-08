package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/9/4 17:17
 **/
@Getter
@Setter
public class GoogleTrendsItem {
    /**
     * 时间戳
     */
    private Long time;
    /**
     * 值
     */
    private Integer value;
}

