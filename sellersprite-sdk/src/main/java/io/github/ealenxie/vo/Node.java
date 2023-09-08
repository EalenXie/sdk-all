package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/9/1 15:17
 **/
@Getter
@Setter
public class Node {
    /**
     * 节点 id 路径字符串
     */
    private String nodeIdPath;
    /**
     * 类目
     */
    private String nodeLabelPath;
    /**
     * 类目下产品数
     */
    private Integer products;
    /**
     * 类目节点名称中文
     */
    private String nodeLabelLocale;
    /**
     * 类目所属所有节点名称中文
     */
    private String nodeLabelPathLocale;

}

