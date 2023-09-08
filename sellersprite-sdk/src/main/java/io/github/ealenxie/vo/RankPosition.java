package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author lanzhi
 * Created on 2023/9/4 10:07
 **/
@Getter
@Setter
public class RankPosition implements Serializable {
    /**
     * 第几页
     */
    private Integer page;
    /**
     * 每页多少条数据
     */
    private Integer size;
    /**
     * 总结果中排第几
     */
    private Integer position;
    /**
     * 排名时间
     */
    private Long updatedTime;

}

