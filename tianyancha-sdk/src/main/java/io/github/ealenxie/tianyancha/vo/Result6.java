package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author 无敌暴龙战士
 * @since 2023/6/14 15:15
 */
@Setter
@Getter
public class Result6 {
    /**
     * 基金会英文名称
     */
    @JsonProperty("englishName")
    private String englishName;
    /**
     * 经营状态
     */
    @JsonProperty("regStatus")
    private String regStatus;
    /**
     * 业务主管单位
     */
    @JsonProperty("businessUnit")
    private String businessUnit;
    /**
     * 注册资本
     */
    @JsonProperty("regCapital")
    private String regCapital;
    /**
     * 宗旨
     */
    @JsonProperty("purpose")
    private String purpose;
    /**
     *
     */
    @JsonProperty("emailList")
    private List<String> emailList;
    /**
     * 历史名
     */
    @JsonProperty("historyName")
    private String historyName;
    /**
     * 负责人中担任过省部级工作人员数
     */
    @JsonProperty("provinceWorkerNumber")
    private String provinceWorkerNumber;
    /**
     * 企业联系方式列表
     */
    @JsonProperty("phoneList")
    private List<String> phoneList;
    /**
     * 理事长类型，1 人 2 公司
     */
    @JsonProperty("type")
    private Integer type;
    /**
     * 全职员工数量
     */
    @JsonProperty("employeeNumber")
    private String employeeNumber;
    /**
     * 专项基金数
     */
    @JsonProperty("specialFundNumber")
    private String specialFundNumber;
    /**
     * 理事长名称
     */
    @JsonProperty("legalPersonName")
    private String legalPersonName;
    /**
     * 负责人中国家工作人员数
     */
    @JsonProperty("nationalWorkerNumber")
    private String nationalWorkerNumber;
    /**
     * 统一社会信用代码
     */
    @JsonProperty("creditCode")
    private String creditCode;
    /**
     * 秘书长
     */
    @JsonProperty("secretary")
    private String secretary;
    /**
     * 成立时间
     */
    @JsonProperty("establishTime")
    private Long establishTime;
    /**
     * 组织机构代码
     */
    @JsonProperty("orgCode")
    private String orgCode;
    /**
     * 基金会范围
     */
    @JsonProperty("scope")
    private String scope;
    /**
     * 志愿者数量
     */
    @JsonProperty("volunteerNumber")
    private String volunteerNumber;
    /**
     * logo
     */
    @JsonProperty("logo")
    private String logo;
    /**
     * 基金会id
     */
    @JsonProperty("id")
    private Long id;
    /**
     * 传真
     */
    @JsonProperty("fax")
    private String fax;
    /**
     * 登记部门
     */
    @JsonProperty("department")
    private String department;
    /**
     * 邮箱
     */
    @JsonProperty("email")
    private String email;
    /**
     * 网址
     */
    @JsonProperty("website")
    private String website;
    /**
     * 成立日期
     */
    @JsonProperty("estiblishTime")
    private Long estiblishTime;
    /**
     * 地址
     */
    @JsonProperty("address")
    private String address;
    /**
     * 基金会
     */
    @JsonProperty("entityType")
    private Integer entityType;
    /**
     * 邮政编码
     */
    @JsonProperty("postcode")
    private String postcode;
    /**
     * 是否有年报
     */
    @JsonProperty("haveReport")
    private Boolean haveReport;
    /**
     * 业务范围
     */
    @JsonProperty("businessScope")
    private String businessScope;
    /**
     * 电话
     */
    @JsonProperty("telephone")
    private String telephone;
    /**
     * 地址
     */
    @JsonProperty("regLocation")
    private String regLocation;
    /**
     * 企业网站
     */
    @JsonProperty("websiteList")
    private String websiteList;
    /**
     * 理事长id
     */
    @JsonProperty("legalPersonId")
    private Integer legalPersonId;
    /**
     * 企业联系方式
     */
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    /**
     * 关注领域
     */
    @JsonProperty("field")
    private String field;
    /**
     * 创建时间
     */
    @JsonProperty("createTime")
    private Long createTime;
    /**
     * 评估等级
     */
    @JsonProperty("grade")
    private String grade;
    /**
     * 基金名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 优惠资格类型
     */
    @JsonProperty("preferentialQualificationType")
    private String preferentialQualificationType;
    /**
     * 数据来源
     */
    @JsonProperty("dataSource")
    private String dataSource;
    /**
     * 对外联系人姓名
     */
    @JsonProperty("contacts")
    private String contacts;
    /**
     * 联系人职务
     */
    @JsonProperty("contactDuty")
    private String contactDuty;

}
