package io.github.ealenxie.edayun.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 面单装箱清单
 * 当物流产品为VC/VE物流时需要
 */
@Getter
@Setter
public class Label {
    /**
     * 文件base64信息
     */
    private String fileInfo;
    /**
     * 枚举对应值
     * OrderLabel-面单
     * ORDER_PACKAGE-箱唛
     * ORDER_PALLET-托唛
     * ORDER_DELIVERY_LIST-装箱清单
     * ORDER_TAG-标签
     */
    private String fileType;
    /**
     * 文件后缀，是非标准订单的附件必须指定文件后缀，比如：pdf
     */
    private String fileSuffix;
    /**
     * 文件名称
     */
    private String fileName;
}
