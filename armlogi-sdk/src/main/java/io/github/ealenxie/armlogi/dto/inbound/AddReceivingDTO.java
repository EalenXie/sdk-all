package io.github.ealenxie.armlogi.dto.inbound;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/3/30 13:28
 **/
@Getter
@Setter
public class AddReceivingDTO {


    /**
     * 货柜类型 [0:20GP, 1:40GP 2:40HQ 3:45GP 4:45HQ]
     */
    private Integer containerType;
    /**
     * 客户说明
     */
    private String custRemark;
    /**
     * 产品明细
     */
    private List<Detail> detailList;
    /**
     * 附件,base
     */
    private List<File> files;
    /**
     * 交货方式 0:自送 (目前仅支持自送)
     */
    private Integer incomeType;
    /**
     * 托数量
     */
    private Integer palletNum;
    /**
     * 提货Email
     */
    private String pickEmail;
    /**
     * 上架方式 [0:SKU上架,1:按箱上架]
     */
    private Integer putawayType;
    /**
     * 入库类型：0:标准入库 (目前仅支持标准入库)
     */
    private Integer recType;
    /**
     * 参考编号
     */
    private String referenceNo;
    /**
     * 销售组
     */
    private String saleGroup;
    /**
     * 运输类型：[0:整柜, 1:托盘, 2:散货]
     */
    private Integer shipType;
    /**
     * 库存类型：0:标准,1:暂存
     */
    private Integer stockType;
    /**
     * 跟踪号/柜号
     */
    private String trackingNumber;
    /**
     * 收货仓库代码
     */
    private String warehouseCode;

}

