package io.github.ealenxie.fop.direct;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/25 15:15
 */
@Getter
@Setter
public class PcsOrderResp {
    /**
     * 4px单号
     */
    @JsonProperty("fpxTrackingNo")
    private String fpxTrackingNo;

    /**
     * 入库状态：
     * <p>
     * 00:待入库,01:已签收,02:已拒收,03:已入库,04:已取消,05:取消失败,13:取消中 出库状态：14:待出库,06:合箱完成,07:组包,08:已出库,09:出库失败,10:已拦截,11:拦截失败,15:拦截中,12:已发运
     */
    @JsonProperty("status")
    private String status;

    /**
     * 备注
     */
    @JsonProperty("msg")
    private String msg;

    /**
     * 订单发生时间
     */
    @JsonProperty("at")
    private String at;

    /**
     * 扩展信息
     */
    @JsonProperty("ext")
    private Ext ext;
}
