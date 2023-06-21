package io.github.ealenxie.armlogi.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author create by sch  2023/3/31 10:54
 * @version 1.0
 */
@Getter
@Setter
public class DetailVO {
    /**
     * 箱序号
     */
    @JsonProperty("boxNumber")
    private Integer boxNumber;
    /**
     * 异常处理方式[0:无 1:多收入库 2:少收入库 3:暂存 4:销毁 5:不良品上架 6:换标上架 7:重新包装 8:变更产品]
     */
    @JsonProperty("exceptionProcessWay")
    private Integer exceptionProcessWay;
    /**
     * 首次到货[0:否 1:是]
     */
    @JsonProperty("firstArrival")
    private Boolean firstArrival;
    /**
     * 到仓是否测量[0:否 1:是]
     */
    @JsonProperty("gauge")
    private Boolean gauge;
    /**
     * 包装类型[0无包装 1自带包装 2发泡袋]
     */
    @JsonProperty("packType")
    private Integer packType;
    /**
     * 长CM
     */
    @JsonProperty("prdLength")
    private Integer prdLength;
    /**
     * 宽CM
     */
    @JsonProperty("prdWidth")
    private Integer prdWidth;
    /**
     * 高CM
     */
    @JsonProperty("prdHeight")
    private Integer prdHeight;
    /**
     * 重量KG
     */
    @JsonProperty("prdWeight")
    private Integer prdWeight;
    /**
     * 产品条码
     */
    @JsonProperty("productBarcode")
    private String productBarcode;
    /**
     * 产品单位EA(单个) KG(公斤) MT(米) CASE(盒) PC(件) SET(套)
     */
    @JsonProperty("productUnit")
    private String productUnit;
    /**
     * 不良品数量
     */
    @JsonProperty("ptDefectiveQty")
    private Integer ptDefectiveQty;
    /**
     * 暂存数量
     */
    @JsonProperty("ptLcQty")
    private Integer ptLcQty;
    /**
     * 上架数量
     */
    @JsonProperty("putawayQty")
    private Integer putAwayQty;
    /**
     * 收货数量
     */
    @JsonProperty("receivedQty")
    private Integer receivedQty;
    /**
     * 收货异常[0:无异常 1:数量差异 2:货损异常]
     */
    @JsonProperty("receivingException")
    private Integer receivingException;
    /**
     * 送货数量
     */
    @JsonProperty("receivingQty")
    private Integer receivingQty;
    /**
     * 收货状态[0:未收货 1:已收货 2:收货异常]
     */
    @JsonProperty("receivingType")
    private Integer receivingType;
}
