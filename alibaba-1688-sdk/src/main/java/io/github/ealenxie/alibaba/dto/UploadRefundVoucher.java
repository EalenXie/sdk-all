package io.github.ealenxie.alibaba.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhs
 * @since 2022年12月16日 0016 14 03
 */
@Getter
@Setter
public class UploadRefundVoucher {
    /**
     * 凭证图片数据。小于1M，jpg格式。
     */
    private byte[] imageData;
}
