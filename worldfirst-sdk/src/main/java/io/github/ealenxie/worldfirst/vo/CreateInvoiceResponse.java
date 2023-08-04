package io.github.ealenxie.worldfirst.vo;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/7/31 14:58
 **/
@NoArgsConstructor
@Data
@Getter
@Setter
public class CreateInvoiceResponse {


    /**
     * 由集成商定义的唯一单据号，用于标识每笔单据
     */
    private String requestId;
    /**
     * 由万里汇定义的唯一单据号，用于标识每笔单据
     */
    private String bizOrderId;
    /**
     * API 调用结果
     */
    private Result result;
    /**
     * 下一步动作
     */
    private ActionForm actionForm;
    /**
     * 其他信息
     */
    private String extendInfo;

}

