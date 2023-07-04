package io.github.ealenxie.winit.oswh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author lanzhi
 * Created on 2023/2/2 15:59
 **/
@Getter
@Setter
public class SendPortInfo {

    /**
     * 送港类型
     * WINIT - winit送港；
     * SELF - 自送港
     */
    @JsonProperty("sendPortType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sendPortType;
    /**
     * 提柜地址编码
     * 与提货地址编号相同，通过接口《查询提货地址》获得的addressCode或者登录万邑联-个人中心-服务设置-地址管理-寄件/提货地址-提货地址编号得到；
     * 当送港类型是WINIT送港时，必填；
     * 当送港类型是自送港时，无需填，整个字段无需传入；
     */
    @JsonProperty("pickupCartonAddressCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pickupCartonAddressCode;
    /**
     * 送港时间
     * 格式yyyy-MM-dd
     * 当送港类型是WINIT送港时，非必填；
     * 当送港类型是自送港时，必填；
     */
    @JsonProperty("sendPortDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sendPortDate;
    /**
     * 柜号
     * 当送港类型是WINIT送港时，无需填，整个字段无需传入；
     * 当送港类型是自送港时，可填；
     */
    @JsonProperty("containerNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String containerNo;
    /**
     * 铅封号
     * 当送港类型是WINIT送港时，无需填，整个字段无需传入；
     * 当送港类型是自送港时，可填；
     */
    @JsonProperty("sealNo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sealNo;
}

