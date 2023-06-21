package io.github.ealenxie.tianyancha.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jadechiang
 * @since 2022/12/14 15:32
 */
@Setter
@Getter
public class IndustryAllVO {
    /**
     * 国民经济行业分类中类
     */
    private String categoryMiddle;
    /**
     * 国民经济行业分类大类
     */
    private String categoryBig;
    /**
     * 国民经济行业分类门类
     */
    private String category;
    /**
     * 国民经济行业分类小类
     */
    private String categorySmall;
}
