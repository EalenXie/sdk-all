package io.github.ealenxie.alibaba.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 11 04
 */
@Getter
@Setter
public class LogisticsStep {

    /**
     * 物流跟踪单该步骤的时间
     */
    @JsonProperty("acceptTime")
    private String acceptTime;
    /**
     * 备注，如：“在浙江浦江县公司进行下级地点扫描，即将发往：广东深圳公司”
     */
    @JsonProperty("remark")
    private String remark;

}
