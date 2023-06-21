package io.github.ealenxie.pingpong.v1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.pingpong.v1.dto.*;
import io.github.ealenxie.pingpong.v1.vo.*;
import org.apache.commons.codec.binary.Hex;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Map;
import java.util.SortedMap;

/**
 * Created by EalenXie on 2022/3/29 11:36
 */
public class PingPongClient {

    private final RestOperations restOperations;

    private final ObjectMapper mapper;
    /**
     * 是否沙箱环境
     */
    private boolean sandBox = true;
    /**
     * 沙箱环境接口地址
     */
    private static final String HOST_SANDBOX = "https://test-dataapi.pingpongx.com";
    /**
     * 正式环境接口地址
     */
    private static final String HOST = "https://dataapi.pingpongx.com";

    public PingPongClient() {
        this(new ObjectMapper(), new RestTemplate());
    }

    public PingPongClient(ObjectMapper mapper, RestOperations restOperations) {
        this.restOperations = restOperations;
        this.mapper = mapper;
    }

    /**
     * PingPong 的所有请求接口Content-type 都为 APPLICATION_FORM_URLENCODED
     */
    private static final HttpHeaders HEADERS;

    static {
        HEADERS = new HttpHeaders();
        HEADERS.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
    }


    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }


    /**
     * 获取包含请求参数的PingPong URI对象
     *
     * @param apiUrl 接口路径地址
     * @param dto    请求参数DTO
     */
    public URI getPingPongURI(String apiUrl, PingPongDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s%s", sandBox ? HOST_SANDBOX : HOST, apiUrl));
        builder.queryParams(getQueryParams(dto));
        return builder.build().encode().toUri();
    }


    /**
     * 分页查询一个客户名下所有店铺的店铺信息
     */
    public StoreInfoList storeInfoList(StoreInfoListDTO dto) {
        ResponseEntity<PingPongResp<StoreInfoList>> exchange = restOperations.exchange(getPingPongURI("/store/info", dto),
                HttpMethod.POST, new HttpEntity<>(null, HEADERS), new ParameterizedTypeReference<PingPongResp<StoreInfoList>>() {
                });
        return getPingPongOkRespBody(exchange);
    }


    /**
     * 查询店铺信息接口
     */
    public AccountInfo accountInfo(AccountInfoDTO dto) {
        ResponseEntity<PingPongResp<AccountInfo>> exchange = restOperations.exchange(getPingPongURI("/account/info", dto),
                HttpMethod.POST, new HttpEntity<>(null, HEADERS), new ParameterizedTypeReference<PingPongResp<AccountInfo>>() {
                });
        return getPingPongOkRespBody(exchange);
    }


    /**
     * 查询余额接口
     */
    public AccountBalance accountBalance(AccountBalanceDTO dto) {
        ResponseEntity<PingPongResp<AccountBalance>> exchange = restOperations.exchange(getPingPongURI("/account/balance", dto),
                HttpMethod.POST, new HttpEntity<>(null, HEADERS), new ParameterizedTypeReference<PingPongResp<AccountBalance>>() {
                });
        return getPingPongOkRespBody(exchange);
    }

    /**
     * 查询流水接口(时间范围不超过1个月零一天)
     */
    public AccountStatement accountStatement(AccountStatementDTO dto) {
        ResponseEntity<PingPongResp<AccountStatement>> exchange = restOperations.exchange(getPingPongURI("/account/statement", dto),
                HttpMethod.POST, new HttpEntity<>(null, HEADERS), new ParameterizedTypeReference<PingPongResp<AccountStatement>>() {
                });
        return getPingPongOkRespBody(exchange);
    }


    /**
     * 查询提现明细接口
     */
    public WithdrawDetail withdrawDetail(WithdrawDetailDTO dto) {
        ResponseEntity<PingPongResp<WithdrawDetail>> exchange = restOperations.exchange(getPingPongURI("/withdraw/detail", dto), HttpMethod.POST, new HttpEntity<>(null, HEADERS), new ParameterizedTypeReference<PingPongResp<WithdrawDetail>>() {
        });
        return getPingPongOkRespBody(exchange);
    }


    /**
     * 查询资金归集记录接口
     */
    public CollectionRecords collectionRecords(CollectionRecordsDTO dto) {
        ResponseEntity<PingPongResp<CollectionRecords>> exchange = restOperations.exchange(getPingPongURI("/collection/records", dto), HttpMethod.POST, new HttpEntity<>(null, HEADERS), new ParameterizedTypeReference<PingPongResp<CollectionRecords>>() {
        });
        return getPingPongOkRespBody(exchange);
    }

    /**
     * 获取PingPong 包含正常状态码0000的接口返回消息体
     */
    public <T> T getPingPongOkRespBody(ResponseEntity<PingPongResp<T>> response) {
        PingPongResp<T> body = response.getBody();
        if (body == null) {
            throw new UnsupportedOperationException("call PingPong is null");
        }
        if (body.isOk()) {
            return body.getData();
        }
        throw new UnsupportedOperationException("call PingPong is not ok :" + body.getMessage());
    }

    /**
     * 获取包含签名的完整URL参数
     *
     * @param dto 请求DTO
     */
    public LinkedMultiValueMap<String, String> getQueryParams(PingPongDTO dto) {
        // 1. 将请求参数按指定排序生成url参数
        SortedMap<String, Object> args = mapper.convertValue(dto, new TypeReference<SortedMap<String, Object>>() {
        });
        // 2. 进行签名
        args.put("sign", getSign(args, dto.getAppSecret()));
        // 3. 得到RestTemplate 请求参数
        LinkedMultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        SortedMap<String, String> treeMap = mapper.convertValue(args, new TypeReference<SortedMap<String, String>>() {
        });
        queryParams.setAll(treeMap);
        return queryParams;
    }


    /**
     * 获取PingPong签名字符串
     *
     * @param params    请求传参
     * @param appSecret 签名秘钥
     * @return 签名字符串
     */
    public static String getSignString(SortedMap<String, Object> params, String appSecret) {
        StringBuilder signStr = new StringBuilder();
        for (Map.Entry<String, ?> entry : params.entrySet()) {
            if (!entry.getKey().equals("sign") && entry.getValue() != null) {
                if (!(entry.getValue() instanceof String)) {
                    params.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                signStr.append(entry.getKey().trim()).append("=").append(entry.getValue()).append("&");
            }
        }
        signStr = new StringBuilder(signStr.substring(0, signStr.length() - 1));
        signStr.append(appSecret);
        return signStr.toString();
    }


    public static String getSign(SortedMap<String, Object> params, String appSecret) {
        return getSign(getSignString(params, appSecret));
    }


    /**
     * PingPong 签名算法   先sha1 再 base64编码 再 MD5编码转大写
     *
     * @param signStr 签名字符串
     * @return 返回签名
     */
    public static String getSign(String signStr) {
        try {
            MessageDigest sha1 = MessageDigest.getInstance("sha1");
            // sha1 计算
            String sha1String = Hex.encodeHexString(sha1.digest(signStr.getBytes()));
            // base64
            String base64String = new String(Base64.getEncoder().encode(sha1String.getBytes()));
            // MD5
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            return Hex.encodeHexString(md5.digest(base64String.getBytes())).toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            throw new UnsupportedOperationException(e);
        }
    }

}
