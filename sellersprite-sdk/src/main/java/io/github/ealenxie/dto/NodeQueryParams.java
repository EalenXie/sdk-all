package io.github.ealenxie.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/9/1 15:16
 **/
@Getter
@Setter
public class NodeQueryParams {

    /**
     * 市场标志
     */
    private String marketplace;

    /**
     * 类目选择
     */
    private String nodeIdPath;

    /**
     * 关键字
     */
    private String keyword;
}

