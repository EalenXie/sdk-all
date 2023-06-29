package io.github.ealenxie.fop.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by EalenXie on 2023/2/28 23:15
 */
@Getter
@Setter
public class Certificate {
    /**
     * 申报产品证书类型。
     * <p>
     * 可选值：
     * UL:(UL认证); CE:(CE认证); RCM:(RCM认证); USB:(USB认证);
     * LVD:(LVD检测报告); TGA:(TGA认证); HDM:(HDMI认证); EMC:(EMC检测报告);
     * SGS:(SGS检测报告); BI:(蓝牙认证); ROH:(ROHS检测报告); ICI:(IC认证);
     * EPA:(EPA认证); EN7:(EN71); CPS:(CPSC认证); CSA:(CSA认证);
     * EN6:(EN62115); DOT:(DOT认证); ERP:(ERP认证); BP:(滴珠证明);
     * MC:(医药证明); FDA:(FDA认证); PS:(产品合格声明); MSD:(MSDS);
     * PSE:(PSE认证); UN3:(UN38.3); TEL:(TELEC认证); IC:(成分证明);
     * JAT:(JATE认证); BA:(品牌授权书); E:(其他);
     */
    @JsonProperty("certificate_type")
    private String certificateType;
    /**
     * 申报产品清关资料URL。
     * <p>
     * 上传文件资料限定格式，文件格式可选值：rar、zip、Excel(xls和xlsx）、word文档(doc和docx)、pdf。
     */
    @JsonProperty("certificate_url")
    private String certificateUrl;
}
