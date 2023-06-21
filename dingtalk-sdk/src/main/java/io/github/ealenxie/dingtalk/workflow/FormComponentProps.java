package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * <p>
 * Created on 2023/4/28 10:34
 **/
@Getter
@Setter
public class FormComponentProps {


    /**
     * 控件id，表单内唯一，与bizAlias二选一
     */
    private String componentId;
    /**
     * 控件是否必填
     */
    private Boolean required;
    /**
     * 控件标题
     */
    private String label;
    /**
     * 输入提示
     */
    private String placeholder;
    /**
     * 控件的业务标识，表单内唯一，与componentId二选一
     */
    private String bizAlias;
    /**
     * 是否参与打印(0标识字段不参与打印、1标识字段可打印)，默认可打印
     */
    private String print;
    /**
     * 是否可编辑
     */
    private Boolean disabled;
    /**
     *
     */
    private String actionName;
    /**
     * 枚举值,city省市,district省市区,street省市区-街道
     */
    private String addressModel;
    /**
     *
     */
    private String align;
    /**
     *
     */
    private Boolean asyncCondition;
    /**
     * 可被关联的审批模板列表，为空时表示可关联所有审批模板的实例数据
     */
    private List<AvailableTemplate> availableTemplates;

    /**
     *
     */
    private String bizType;
    /**
     * 枚举值：1标识支持多选，0标识单选，默认为0
     */
    private String choice;
    /**
     *
     */
    private String commonBizType;
    /**
     * 说明文字
     */
    private String content;
    /**
     *
     */
    private FormDataSource dataSource;

    /**
     * 是否自动计算时长
     */
    private Boolean duration;
    /**
     * 日期格式，非必填，小时对应yyyy-MM-dd HH:mm，天对应yyyy-MM-dd HH:mm
     */
    private String format;
    /**
     *
     */
    private String formula;
    /**
     *
     */
    private Boolean invisible;
    /**
     * 枚举值：5分制、10分制
     */
    private Integer limit;
    /**
     * 超链接
     */
    private String link;
    /**
     *
     */
    private Integer maxLength;
    /**
     * 枚举值：phone_tel：手机和固话、phone：手机、tel：固话
     */
    private String mode;
    /**
     * 是否支持多选，true多选，false单选
     */
    private Boolean multiple;
    /**
     * 可选选项列表
     */
    private List<SelectOption> options;
    /**
     *
     */
    private Integer precision;
    /**
     * 设置对数字、金额类控件进行总数统计
     */
    private List<FormComponentPropsStatField> statField;
    /**
     * 明细填写方式，枚举值：list：列表,table：表格
     */
    private String tableViewMode;
    /**
     * 数字单位/日期格式，枚举值（小时、天）
     */
    private String unit;
    /**
     * 金额需要大写(0不大写，1需要大写)，默认需要大写
     */
    private String upper;
    /**
     * 明细打印方式，true：纵向 false：横向
     */
    private Boolean verticalPrint;
}

