package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * @author lanzhi
 * Created on 2023/5/4 11:37
 **/
@Getter
@Setter
public class QuerySchemaByProcessCodeItemsProps {
    /**
     * 加班套件4.0新增 加班明细名称
     */
    private String actionName;

    /**
     * textNote的样式，取值：
     * top：顶部
     * middle：中部
     * bottom：底部
     */
    private String align;

    /**
     * ISV 微应用 appId，用于ISV身份权限识别，ISV可获得相应数据
     */
    private Long appId;

    /**
     * 套件是否开启异步获取分条件规则，取值：
     * true：是
     * false：否
     */
    private Boolean asyncCondition;

    /**
     * 请假、出差、外出、加班类型标签
     */
    private String attendTypeLabel;

    /**
     * 表单关联控件列表
     */
    private List<QuerySchemaByProcessCodeBehaviorLinkage> behaviorLinkage;

    /**
     * 控件业务自定义别名
     */
    private String bizAlias;

    /**
     * 业务套件类型
     */
    private String bizType;

    /**
     * 套件内子组件可见性，取值：
     * true：是
     * false：否
     */
    private Map<String, Boolean> childFieldVisible;

    /**
     * 内部联系人choice，取值：
     * 1：多选
     * 0：单选
     */
    private Integer choice;

    /**
     * common field的commonBizType
     */
    private String commonBizType;

    /**
     * 是否可编辑，取值：
     * true：是
     * false：否
     */
    private Boolean disabled;

    /**
     * 是否自动计算时长，取值：
     * true：是
     * false：否
     */
    private Boolean duration;

    /**
     * 兼容字段
     */
    private String durationLabel;

    /**
     * e签宝专用标识
     */
    private Boolean eSign;

    /**
     * 套件值是否打平，取值：
     * true：是
     * false：否
     */
    private Boolean extract;

    /**
     * 关联表单中的fields存储
     */
    private String fieldsInfo;

    /**
     * 时间格式(DDDateField和DDDateRangeField)
     */
    private String format;

    /**
     * 公式
     */
    private String formula;

    /**
     * 加班套件4.0新增 加班明细是否隐藏，取值：
     * true：是
     * false：否
     */
    private Boolean hidden;

    /**
     * textnote在详情页是否隐藏，取值：
     * true：是
     * false：否
     */
    private Boolean hiddenInApprovalDetail;

    /**
     * 加班套件4.0新增，加班明细是否隐藏标签，取值：
     * true：是
     * false：否
     */
    private Boolean hideLabel;

    /**
     * 兼容出勤套件类型
     */
    private List<Map<String, String>> holidayOptions;

    /**
     * 控件 id
     */
    private String id;

    /**
     * 控件名称
     */
    private String label;

    /**
     * label是否可修改，取值：
     * true：不可修改
     * false：可修改
     */
    private Boolean labelEditableFreeze;

    /**
     * 说明文案的链接地址
     */
    private String link;

    /**
     * 加班套件4.0新增 加班明细描述
     */
    private String mainTitle;

    /**
     * 是否参与打印，取值：
     * 1：不打印
     * 0：打印
     */
    private String notPrint;

    /**
     * 是否需要大写，默认是需要，取值：
     * 1：不需要
     * 0 或空：需要
     */
    private String notUpper;


    /**
     * 选项内容列表，提供给业务方更多的选择器操作
     */
    private List<QuerySchemaByProcessCodeObjOptions> objOptions;

    /**
     * 单选框选项值
     */
    private List<String> options;

    /**
     * 是否有支付属性，取值：
     * true：是
     * false：否
     */
    private Boolean payEnable;

    /**
     * 占位符
     */
    private String placeholder;

    /**
     * 同步到考勤, 表示是否设置为员工状态
     */
    private QuerySchemaByProcessCodeItemsPropsPush push;

    /**
     * 是否推送到考勤, 子类型(DDSelectField)，取值：
     * true：是
     * false：否
     */
    private Boolean pushToAttendance;

    /**
     * 是否推送管理日历(DDDateRangeField, 该属性为兼容保留)，取值：
     * 1：推送
     * 0：不推送
     */
    private Integer pushToCalendar;

    /**
     * 是否必填，取值：
     * true：是
     * false：否
     */
    private Boolean required;

    /**
     * 必填是否可修改，取值：
     * true：不可修改
     * false：可修改
     */
    private Boolean requiredEditableFreeze;

    /**
     * 兼容出勤套件类型
     */
    private Boolean showAttendOptions;

    /**
     * 是否开启员工状态，取值：
     * true：是
     * false：否
     */
    private Boolean staffStatusEnabled;

    /**
     * 需要计算总和的明细组件
     */
    private List<QuerySchemaByProcessCodeStatField> statField;

    /**
     * 数字组件/日期区间组件单位属性
     */
    private String unit;

    /**
     * 是否使用考勤日历，取值：
     * true：是
     * false：否
     */
    private Boolean useCalendar;

    /**
     * 明细打印排版方式，取值：
     * true：纵向
     * false：横向
     */
    private Boolean verticalPrint;
}

