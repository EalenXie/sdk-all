package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/9/5 17:10
 **/
@Getter
@Setter
public class BadgeCount {
    /**
     * 自然搜索词数量
     */
    private Integer ns;
    /**
     * AC推荐词数量
     */
    private Integer ac;
    /**
     * ER推荐词数量
     */
    private Integer er;
    /**
     * 4星推荐词数量
     */
    private Integer fs;
    /**
     * HR广告词数量
     */
    private Integer hr;
    /**
     * 品牌广告词数量
     */
    private Integer sb;
    /**
     * 视频广告词数量
     */
    private Integer sv;
    /**
     * SP广告词数量
     */
    private Integer ad;
}

