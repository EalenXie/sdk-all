package io.github.ealenxie.armlogi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/3/28 15:47
 **/
@Getter
@Setter
public class QueryProductInventory {

    /**
     * 创建时间[结束],示例值(1946-04-14 00:00:00)
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createEndTime;
    /**
     * 创建时间[开始],示例值(1946-04-14 00:00:00)
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createStartTime;
    /**
     * 是否模糊搜索，[true:是][用于productBarcode、skuCode以及productTitle]
     */
    private Boolean like;
    /**
     * 当前页码,示例值(1)
     */
    private Integer pageIndex;
    /**
     * 每页条数,最大50,示例值(10)
     */
    private Integer pageSize = 50;
    /**
     * 产品条码搜索
     */
    private String productBarcode;
    /**
     * 产品条码批量[数组]
     */
    private List<String> productBarcodeList;
    /**
     * 产品名称搜索
     */
    private String productTitle;
    /**
     * SKU搜索
     */
    private String skuCode;
    /**
     * SKU批量搜索[数组]
     */
    private List<String> skuCodeList;
    /**
     * 修改时间[结束],示例值(1946-04-14 00:00:00)
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateStartTime;
    /**
     * 修改时间[开始],示例值(1946-04-14 00:00:00)
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateEndTime;
    /**
     * 仓库代码搜索
     */
    private String warehouseCode;
    /**
     * 仓库代码批量[数组]
     */
    private List<String> warehouseCodeList;

}

