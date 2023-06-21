package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/4 10:36
 **/
@Getter
@Setter
public class QuerySchemaByProcessCodeResult {
    /**
     * 表单类型
     */
    private Integer appType;
    /**
     * 表单应用 uuid 或者 corpId
     */
    private String appUuid;
    /**
     * 代表表单业务含义的类型
     */
    private String bizType;
    /**
     * 创建人 userId
     */
    private String creatorUserId;
    /**
     * 业务自定义设置数据
     */
    private String customSetting;
    /**
     * 引擎类型，取值：
     * 1：页面
     * 0：表单
     */
    private Integer engineType;
    /**
     * 表单的唯一码
     */
    private String formCode;
    /**
     * 表单 uuid。
     */
    private String formUuid;
    /**
     * 创建时间的时间戳
     */
    private String gmtCreate;
    /**
     * 修改时间的时间戳
     */
    private String gmtModified;
    /**
     * 图标
     */
    private String icon;
    /**
     * 排序 id
     */
    private Integer listOrder;
    /**
     * 说明文案
     */
    private String memo;
    /**
     * 表单名称
     */
    private String name;
    /**
     * 数据归属者的 id 类型，取值：
     * orgId：企业
     * cid：群
     * uid：人
     */
    private String ownerIdType;
    /**
     * 目标类型，取值：
     * inner：内部
     * outer：外部
     * customer：自定义
     */
    private String procType;
    /**
     * 表单 schema 详情
     */
    private QuerySchemaByProcessCodeSchemaContent schemaContent;
    /**
     * 状态，取值：
     * PUBLISHED：启用
     * INVALID：停用
     * SAVED：草稿
     */
    private String status;
    /**
     * 可见范围类型
     */
    private String visibleRange;
}

