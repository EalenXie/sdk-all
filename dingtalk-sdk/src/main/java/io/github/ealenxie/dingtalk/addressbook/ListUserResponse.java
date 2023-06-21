package io.github.ealenxie.dingtalk.addressbook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/10 16:57
 **/
@Getter
@Setter
public class ListUserResponse {

    /**
     * 是否激活了钉钉：
     * true：已激活
     * false：未激活
     */
    @JsonProperty("active")
    private Boolean active;
    /**
     * 是否为企业的管理员：
     * true：是
     * false：不是
     */
    @JsonProperty("admin")
    private Boolean admin;
    /**
     * 头像地址
     */
    @JsonProperty("avatar")
    private String avatar;
    /**
     * 是否为企业的老板：
     * true：是
     * false：不是
     */
    @JsonProperty("boss")
    private Boolean boss;
    /**
     * 所属部门id列表
     */
    @JsonProperty("dept_id_list")
    private List<Long> deptIdList;
    /**
     * 员工在部门中的排序
     */
    @JsonProperty("dept_order")
    private Long deptOrder;
    /**
     * 员工邮箱
     */
    @JsonProperty("email")
    private String email;
    /**
     * 是否专属帐号：
     * true：是
     * false：不是
     */
    @JsonProperty("exclusive_account")
    private Boolean exclusiveAccount;
    /**
     *
     */
    @JsonProperty("exclusive_account_type")
    private String exclusiveAccountType;
    /**
     * 扩展属性
     */
    @JsonProperty("extension")
    private String extension;
    /**
     * 是否号码隐藏：
     * true：隐藏
     * 隐藏手机号后，手机号在个人资料页隐藏，但仍可对其发DING、发起钉钉免费商务电话。
     * false：不隐藏
     */
    @JsonProperty("hide_mobile")
    private Boolean hideMobile;
    /**
     * 入职时间，Unix时间戳，单位毫秒
     */
    @JsonProperty("hired_date")
    private Long hiredDate;
    /**
     * 员工工号
     */
    @JsonProperty("job_number")
    private String jobNumber;
    /**
     * 是否是部门的主管：
     * true：是
     * false：不是
     */
    @JsonProperty("leader")
    private Boolean leader;
    /**
     *
     */
    @JsonProperty("login_id")
    private String loginId;
    /**
     * 手机号码
     */
    @JsonProperty("mobile")
    private String mobile;
    /**
     * 用户姓名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 员工的企业邮箱
     */
    @JsonProperty("org_email")
    private String orgEmail;
    /**
     * 备注
     */
    @JsonProperty("remark")
    private String remark;
    /**
     * 国际电话区号
     */
    @JsonProperty("state_code")
    private String stateCode;
    /**
     * 分机号
     */
    @JsonProperty("telephone")
    private String telephone;
    /**
     * 职位
     */
    @JsonProperty("title")
    private String title;
    /**
     * 用户在当前开发者企业帐号范围内的唯一标识
     */
    @JsonProperty("unionid")
    private String unionid;
    /**
     * 用户的userId
     */
    @JsonProperty("userid")
    private String userid;
    /**
     * 办公地点
     */
    @JsonProperty("work_place")
    private String workPlace;
}

