package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/2/3 10:45
 **/
@Getter
@Setter
public class QueryWinItProducts {
    /**
     * 产品类型：必填
     * OW0101-标准海外仓入库
     * OW0102-直发国内验入库
     * OW0103-直发海外验入库
     */
    @JsonProperty("productType")
    private String productType;
}

