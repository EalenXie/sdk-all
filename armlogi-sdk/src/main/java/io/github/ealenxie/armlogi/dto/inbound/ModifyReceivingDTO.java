package io.github.ealenxie.armlogi.dto.inbound;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/3/31 10:49
 **/
@Getter
@Setter
public class ModifyReceivingDTO extends AddReceivingDTO {

    /**
     * 入库单号
     */
    private String receivingCode;
}

