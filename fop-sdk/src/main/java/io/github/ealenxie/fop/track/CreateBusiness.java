package io.github.ealenxie.fop.track;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 16:12
 * <p>
 * 添加业务数据
 */
@Getter
@Setter
public class CreateBusiness {

    /**
     * 开始获取数据的标志
     */
    @JsonProperty("beginTrack")
    private Boolean beginTrack;

    /**
     * 目的国二字码
     */
    @JsonProperty("ct_code")
    private String ctCode;

    /**
     * 起运国二字码
     */
    @JsonProperty("ct_code_start")
    private String ctCodeStart;

    /**
     * 系统标识
     */
    @JsonProperty("ctm_id")
    private String ctmId;

    /**
     * 产品代码
     */
    @JsonProperty("ref_code")
    private String refCode;

    /**
     * 渠道代码
     */
    @JsonProperty("sn_code")
    private String snCode;

    /**
     * 是否拆分订单
     */
    @JsonProperty("splitOrder")
    private String splitOrder;

    /**
     * 渠道转单号
     */
    @JsonProperty("tbs_channelcode")
    private String tbsChannelcode;

    /**
     * 递四方单号
     */
    @JsonProperty("tbs_referenceno")
    private String tbsReferenceno;

    /**
     * 客户代码
     */
    @JsonProperty("tbs_referenceshippercode")
    private String tbsReferenceshippercode;

    /**
     * 服务商单号
     */
    @JsonProperty("tbs_servecode")
    private String tbsServecode;

    /**
     * 递四方单号
     */
    @JsonProperty("tbs_shippercode")
    private String tbsShippercode;
}
