package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/7/14 13:52
 * @version 1.0
 */
@Getter
@Setter
public class ProductAuditStatus {
    /**
     * id
     */
    @JsonProperty("id")
    private Integer id;
    /**
     * createdby
     */
    @JsonProperty("createdby")
    private String createdby;
    /**
     * created
     */
    @JsonProperty("created")
    private String created;
    /**
     * updatedby
     */
    @JsonProperty("updatedby")
    private String updatedby;
    /**
     * updated
     */
    @JsonProperty("updated")
    private String updated;
    /**
     * isActive
     */
    @JsonProperty("isActive")
    private String isActive;
    /**
     * isDelete
     */
    @JsonProperty("isDelete")
    private String isDelete;
    /**
     * skuCode
     */
    @JsonProperty("skuCode")
    private String skuCode;
    /**
     * specification
     */
    @JsonProperty("specification")
    private String specification;
    /**
     * cnName
     */
    @JsonProperty("cnName")
    private String cnName;
    /**
     * name
     */
    @JsonProperty("name")
    private String name;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * exportCountryCode
     */
    @JsonProperty("exportCountryCode")
    private String exportCountryCode;
    /**
     * mtTime
     */
    @JsonProperty("mtTime")
    private String mtTime;
    /**
     * status
     */
    @JsonProperty("status")
    private String status;
    /**
     * mtBackReason
     */
    @JsonProperty("mtBackReason")
    private String mtBackReason;
    /**
     * mtBackResultName
     */
    @JsonProperty("mtBackResultName")
    private String mtBackResultName;
    /**
     * pageVo
     */
    @JsonProperty("pageVo")
    private String pageVo;
    /**
     * isManageSizeByCountry
     */
    @JsonProperty("isManageSizeByCountry")
    private String isManageSizeByCountry;
}
