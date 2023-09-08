package io.github.ealenxie.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author lanzhi
 * Created on 2023/9/1 11:03
 **/
@Getter
@Setter
public class Badge implements Serializable {

    /**
     * Best Seller 标识
     */
    private String bestSeller;
    /**
     * amazon choice 标识
     */
    private String amazonChoice;
    /**
     * release 标识
     */
    private String newRelease;
    /**
     * A+页面
     */
    private String ebc;
    /**
     * 视频介绍
     */
    private String video;
}

