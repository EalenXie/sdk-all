package io.github.ealenxie.armlogi.dto.inbound;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/3/30 13:43
 **/
@Getter
@Setter
public class Detail {

    /**
     * 箱号
     */
    private Integer boxNumber;
    /**
     * 是否自带包装[0:无包装,1:自带包装,2:发泡袋]
     */
    private Integer packType;
    /**
     * 产品条码
     */
    private String productBarcode;
    /**
     * 送货数量
     */
    private Integer receivingQty;
}

