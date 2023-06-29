package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/21 12:50
 */
@Getter
@Setter
public class ReturnInfo {
    /**
     * 境内/国内异常处理策略
     * <p>
     * <p>
     * Y：退件--实际是否支持退件，以及退件策略、费用，参考报价表；
     * <p>
     * N：销毁；
     * <p>
     * U：其他--等待客户指令)
     * <p>
     * 默认值：N；
     */
    @JsonProperty("is_return_on_domestic")
    private String isReturnOnDomestic;

    /**
     * 境内/国内退件接收地址信息（退件地址非必填；若填写，则姓名/电话/邮编/国家/城市/详细地址均需填写）
     */
    @JsonProperty("domestic_return_addr")
    private AddressInfo domesticReturnAddr;

    /**
     * 境内/国内异常处理策略
     * <p>
     * <p>
     * Y：退件--实际是否支持退件，以及退件策略、费用，参考报价表；
     * <p>
     * N：销毁；
     * <p>
     * U：其他--等待客户指令)
     * <p>
     * 默认值：N；
     */
    @JsonProperty("is_return_on_oversea")
    private String isReturnOnOversea;

    /**
     * 境外/国外退件接收地址信息（退件地址非必填；若填写，则姓名/电话/邮编/国家/城市/详细地址均需填写）
     */
    @JsonProperty("oversea_return_addr")
    private AddressInfo overseaReturnAddr;
}
