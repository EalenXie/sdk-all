package io.github.ealenxie.fop.track.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/27 16:15
 * <p>
 * 通过递四方单号添加轨迹数据
 */
@Getter
@Setter
public class CreateByTrackNo {

    /**
     * 递四方单号
     */
    @JsonProperty("fpxTrackNo")
    private String fpxTrackNo;

    /**
     * 轨迹发生时间
     * <p>
     * 格式：yyyy-MM-dd HH:mm:ss
     */
    @JsonProperty("trk_occurdate")
    private String trkOccurdate;

    /**
     * 轨迹代码
     */
    @JsonProperty("tk_code")
    private String tkCode;

    /**
     * 轨迹描述
     */
    @JsonProperty("trk_servicedescription")
    private String trkServicedescription;

    /**
     * 是否需要标准化
     */
    @JsonProperty("needToStandard")
    private Boolean needToStandard;

    /**
     * 轨迹发生地点
     */
    @JsonProperty("trk_areadescription")
    private String trkAreadescription;

    /**
     * 轨迹发生时区
     */
    @JsonProperty("spTrackTimezone")
    private String spTrackTimezone;

    /**
     * 对接业务系统
     */
    @JsonProperty("system")
    private String system;

    /**
     * 原始轨迹代码（暂未使用）
     */
    @JsonProperty("spTkcode")
    private String spTkcode;

    /**
     * 服务商单号
     */
    @JsonProperty("serveHawbCode")
    private String serveHawbCode;

    /**
     * 签收人
     */
    @JsonProperty("trk_signatory")
    private String trkSignatory;

    /**
     * 轨迹创建人
     */
    @JsonProperty("trk_createperson")
    private String trkCreateperson;

    /**
     * 扫描站点名称
     */
    @JsonProperty("siteName")
    private String siteName;

    /**
     * 扫描站点类型
     */
    @JsonProperty("siteType")
    private String siteType;

    /**
     * 扫描站点编码
     */
    @JsonProperty("siteCode")
    private String siteCode;

    /**
     * 下一站点名称
     */
    @JsonProperty("nextSiteName")
    private String nextSiteName;

    /**
     * 下一站点类型
     */
    @JsonProperty("nextSiteType")
    private String nextSiteType;

    /**
     * 下一站点编码
     */
    @JsonProperty("nextSiteCode")
    private String nextSiteCode;

    /**
     * 清关类型
     */
    @JsonProperty("clearanceType")
    private String clearanceType;

    /**
     * 派件人名称
     */
    @JsonProperty("postManName")
    private String postManName;

    /**
     * 派件人电话
     */
    @JsonProperty("postManPhone")
    private String postManPhone;

    /**
     * 签收人姓名
     */
    @JsonProperty("signName")
    private String signName;

    /**
     * 轨迹城市
     */
    @JsonProperty("spTrackCity")
    private String spTrackCity;

    /**
     * 轨迹州省
     */
    @JsonProperty("spTrackProvince")
    private String spTrackProvince;

    /**
     * 轨迹国家
     */
    @JsonProperty("spTrackCountry")
    private String spTrackCountry;

}
