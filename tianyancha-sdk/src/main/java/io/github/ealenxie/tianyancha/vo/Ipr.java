package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author EalenXie created on 2023/7/29 16:53
 */
@Getter
@Setter
public class Ipr {
    /**
     * 商标
     */
    @JsonProperty("tmList")
    private List<Tm> tmList;
    /**
     * 软件著作权
     */
    @JsonProperty("copyRegList")
    private List<CopyReg> copyRegList;
    /**
     * 作品著作权
     */
    @JsonProperty("copyRegWorksList")
    private List<CopyRegWorks> copyRegWorksList;
    /**
     * 网站备案
     */
    @JsonProperty("icpList")
    private List<Icp> icpList;
    /**
     * 专利
     */
    @JsonProperty("patentList")
    private List<Patent> patentList;
}
