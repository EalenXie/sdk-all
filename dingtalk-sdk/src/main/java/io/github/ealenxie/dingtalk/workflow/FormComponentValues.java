package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/4 16:02
 **/
@Getter
@Setter
public class FormComponentValues {

    /**
     * 控件别名
     */
    private String bizAlias;

    /**
     * 控件类型，取值：
     * TextField：单行输入框
     * TextareaField：多行输入框
     * NumberField：数字输入框
     * DDSelectField：单选框
     * DDMultiSelectField：多选框
     * DDDateField：日期控件
     * DDDateRangeField：时间区间控件
     * TextNote：文字说明控件
     * PhoneField：电话控件
     * DDPhotoField：图片控件
     * MoneyField：金额控件
     * TableField：明细控件
     * DDAttachment：附件
     * InnerContactField：联系人控件
     * RelateField：关联审批单
     * FormRelateField：关联控件
     */
    private String componentType;

    /**
     * 子控件列表，最大列表长度150
     */
    private List<FormComponentValuesDetails> details;

    /**
     * 控件扩展值
     */
    private String extValue;

    /**
     * 控件id
     */
    private String id;

    /**
     * 控件名称
     */
    private String name;

    /**
     * 控件值
     */
    private String value;

}

