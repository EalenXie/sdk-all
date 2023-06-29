package io.github.ealenxie.fop.grs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/3/2 12:39
 */

@Getter
@Setter
public class ReceivedListInfo {

    /**
     * 客户退到grs收货仓库商品的物流跟踪单号
     */
    @JsonProperty("received_shipping_no")
    private String receivedShippingNo;

    /**
     * grs收货时间
     * <p>
     * 格式：yyyy-MM-dd HH:mm:ss
     */
    @JsonProperty("received_time")
    private String receivedTime;

    /**
     * grs实收重量（kg），精确到3位小数
     */
    @JsonProperty("received_weight")
    private String receivedWeight;

    /**
     * grs单号
     */
    @JsonProperty("reference_no")
    private String referenceNo;

    /**
     * 退货单（退货预报单）
     */
    @JsonProperty("rma_no")
    private String rmaNo;

    /**
     * 退货单状态每个业务状态都是一个固定值，详
     * <p>
     * <p>
     * WAIT_RECEIVER 待收货
     * <p>
     * WAIT_CHECK 待清点
     * <p>
     * WAIT_PUT_AWAY 待上架
     * <p>
     * PUT_AWAY_SUCCESS 已上架
     * <p>
     * DESTROY_SUCCESS 已销毁
     * <p>
     * FINISHING 完结中
     * <p>
     * CANCEL_SUCCESS 已取消
     * <p>
     * RECEIVER_COMPLETE 已收货
     * <p>
     * EXPIRE_DESTRUCTION 超期销毁
     */
    @JsonProperty("status")
    private String status;

    /**
     * 仓库代码
     */
    @JsonProperty("warehouse")
    private String warehouse;
}
