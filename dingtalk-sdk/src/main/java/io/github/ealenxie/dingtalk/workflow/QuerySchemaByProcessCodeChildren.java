package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/5/4 11:23
 **/
@Getter
@Setter
public class QuerySchemaByProcessCodeChildren {
    /**
     * 子控件类型，取值：
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
     * - TableField：明细内的子控件不支持明细控件类型(已删除)
     * DDAttachment：附件
     * InnerContactField：联系人控件
     * DepartmentField：部门控件
     * RelateField：关联审批单
     * AddressField：省市区控件
     * StarRatingField：评分控件
     * FormRelateField：关联控件
     */
    private String componentName;
    /**
     * 子控件属性
     */
    private QuerySchemaByProcessCodeChildrenProps props;
}

