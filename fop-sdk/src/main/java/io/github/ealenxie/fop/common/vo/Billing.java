package io.github.ealenxie.fop.common.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2022/10/8 17:07
 */
@Getter
@Setter
public class Billing {
    /**
     * 业务单号
     */
    @JsonProperty("order_no")
    private String orderNo;
    /**
     * 费用项。
     * 如： 100(上门提货费); 101(散装卸货费); 102(超时费); 103(压夜费); 105(SKU查验费); 106(更换条码费); 107(更换包装费); 108(拍照费);
     * 109(添加附件费); 110(运费); 118(报关费); 119(查验费); 120(商检费); 121(续页费); 122(关税 123(VAT税 124(关税杂费); 125(关税代垫费);
     * 126(税号使用费); 127(卸货费); 128(仓租费); 129(下架+订单操作费); 130(更换包装费); 131(拍照费); 132(添加附件费); 133(托盘费);
     * 134(库存盘点费); 135(运费); 136(超长费); 137(超重费); 138(偏远费); 139(地址更改费); 140(特殊操作费); 141(BFPO地址费); 142(重派费);
     * 143(卷状超长费); 144(卷状超重费); 145(非规则货物费); 147(托盘费); 148(超尺寸附加费); 149(高风险地区费); 150(限运目的地费); 151(过港费);
     * 151(过港费); 152(到付手续费); 153(仓储头程杂费); 154(超长超重附加费); 155(超长超重燃油费); 156(挂号费); 157(清关使用费); 158(无退税报关);
     * 159(出口退税); 160(非出口退税); 161(单独退税自VAT); 162(DDP手续费); 163(更换条码费); 164(分箱费); 165(销毁费); 166(退货操作附加费按件);
     * 167(退货操作附加费按重量); 168(退货操作费); 169(入仓费); 170(仓储操作附加费按件); 171(仓储操作附加费按重量); 172(仓储自带包装操作费);
     * 173(保险费); 180(电池费); 181(仓储头程杂费); 182(低保-保险); 183(高保-保险); 184(6‰保险); 185(清关费); 186(提货费); 187(电池费);
     * 188(提货费); 189(操作手续费); 190(低保-保险); 191(高保-保险); 192(6‰保险); 193(挂号-快递保价); 194(平邮保价); 174(仓储入库费按票);
     * 175(仓储非自带包装操作费); 175(仓储非自带包装操作费); 176(包装费);
     */
    @JsonProperty("billing_type")
    private String billingType;
    /**
     * 扣费类型。如：CA(现金);CR(信用额度)。
     */
    @JsonProperty("deduction_type")
    private String deductionType;
    /**
     * 计费时间
     */
    @JsonProperty("billing_date")
    private Long billingDate;
    /**
     * 计费币种
     */
    @JsonProperty("currency")
    private String currency;
    /**
     * 计费金额
     */
    @JsonProperty("billing_amount")
    private String billingAmount;
}
