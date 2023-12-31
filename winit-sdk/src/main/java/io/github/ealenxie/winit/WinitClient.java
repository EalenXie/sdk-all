package io.github.ealenxie.winit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.winit.oswh.ChargeDetail;
import io.github.ealenxie.winit.oswh.ChargeDetailsPageData;
import io.github.ealenxie.winit.oswh.TransactionCharge;
import io.github.ealenxie.winit.oswh.TransactionChargeGetData;
import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.BeanUtils;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;

/**
 * Created by EalenXie on 2023/1/20 10:43
 * <p>
 * <a href="https://developer.winit.com.cn/document/detail/id/14.html">万邑通开放平台</a>
 */
public abstract class WinitClient {

    private final ObjectMapper objectMapper;
    private final RestOperations restOperations;
    private final WinitConfig winitConfig;
    /**
     * 是否沙箱环境
     */
    private boolean sandBox = true;
    /**
     * 沙箱环境接口地址
     */
    protected static final String HOST_SANDBOX = "https://sandboxopenapi.winit.com.cn/openapi/service";
    /**
     * 正式环境接口地址
     */
    protected static final String HOST = "https://openapi.winit.com.cn/openapi/service";

    protected WinitClient(WinitConfig winitConfig) {
        this(winitConfig, new RestTemplate());
    }

    protected WinitClient(WinitConfig winitConfig, RestOperations restOperations) {
        this.winitConfig = winitConfig;
        this.objectMapper = new ObjectMapper();
        this.objectMapper.setConfig(this.objectMapper.getSerializationConfig().with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY));
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        this.restOperations = restOperations;
    }


    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }


    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/6.html">签名认证</a>
     *
     * @return 获取 sign 或者 client_sign
     */
    public static <T> String getSign(String clientSecretOrToken, String dataStr, WinitRequest<T> request) {
        try {
            String signStr = String.format("%saction%sapp_key%sdata%sformat%splatform%ssign_method%stimestamp%sversion%s%s",
                    clientSecretOrToken, request.getAction(), request.getAppKey(), dataStr, request.getFormat(), request.getPlatform(), request.getSignMethod(), request.getTimestamp(), request.getVersion(), clientSecretOrToken);
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            return Hex.encodeHexString(md5.digest(signStr.getBytes())).toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            throw new UnsupportedOperationException(e);
        }
    }


    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/204.html">查询单据费用</a>
     */
    public WinitResponse<PageCurrentTotalListResponse<TransactionCharge>> getTransactionCharge(TransactionChargeGetData data) {
        return postWinit("sms.incomeSettlement.getTransactionCharge", data, new ParameterizedTypeReference<WinitResponse<PageCurrentTotalListResponse<TransactionCharge>>>() {
        });
    }

    /**
     * <a href="https://developer.winit.com.cn/document/detail/id/255.html">查询费用-新</a>
     */
    public WinitResponse<PageCurrentTotalListResponse<ChargeDetail>> pageChargeDetails(ChargeDetailsPageData data) {
        return postWinit("sms.incomeSettlement.pageChargeDetails", data, new ParameterizedTypeReference<WinitResponse<PageCurrentTotalListResponse<ChargeDetail>>>() {
        });
    }

    /**
     * 构建万邑通请求参数
     *
     * @param require 必要请求参数
     * @param data    请求的data数据
     */
    protected WinitRequest<Object> getRequest(RequireArgs require, @Nullable Object data) {
        WinitRequest<Object> request = new WinitRequest<>(require.getAction(), require.getAppKey(), require.getClientId(), require.getPlatform());
        request.setData(data);
        try {
            String dataStr = data == null ? "" : objectMapper.writeValueAsString(request.getData());
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            request.setTimestamp(timestamp);
            // 1. 构建用户签名
            request.setSign(getSign(require.getToken(), dataStr, request));
            // 2. 获取应用签名
            request.setClientSign(getSign(require.getClientSecret(), dataStr, request));
            return request;
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /**
     * POST 调用万邑通接口请求
     *
     * @param action       系统级别必要请求参数
     * @param data         请求的data数据
     * @param responseType 响应类型
     */
    protected <R, D> R postWinit(String action, @Nullable D data, ParameterizedTypeReference<R> responseType) {
        RequireArgs requireArgs = new RequireArgs(action);
        BeanUtils.copyProperties(winitConfig, requireArgs);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s", sandBox ? HOST_SANDBOX : HOST));
        URI uri = builder.build().encode().toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        return restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(getRequest(requireArgs, data), headers), responseType).getBody();
    }
}
