package io.github.ealenxie.alyunwms;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.alyunwms.dto.QueryProductDTO;
import io.github.ealenxie.alyunwms.dto.asn.*;
import io.github.ealenxie.alyunwms.dto.inventory.QueryInventoryDTO;
import io.github.ealenxie.alyunwms.dto.product.ProductDTO;
import io.github.ealenxie.alyunwms.dto.product.ProductPdfDTO;
import io.github.ealenxie.alyunwms.vo.*;
import io.github.ealenxie.alyunwms.vo.asn.*;
import io.github.ealenxie.alyunwms.vo.inventory.InventoryVO;
import io.github.ealenxie.alyunwms.vo.product.ProductPageResponse;
import io.github.ealenxie.alyunwms.vo.product.ProductPdfResponse;
import io.github.ealenxie.alyunwms.vo.product.ProductResponse;
import io.github.ealenxie.alyunwms.vo.product.ProductVO;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * 大方广 API
 *
 * @author create by sch  2023/1/29 9:44
 * @version 1.0
 */
public class AlYunWmsClient {
    //沙箱 service
    private static final String WMS_HOST_SANDBOX = "http://al.yunwms.com/";
    //正式 service
    private static final String WMS_HOST = "";

    private static final String WEBSERVICE_URL = "/default/svc/web-service";

    private final ObjectMapper objectMapper;

    private final RestOperations restOperations;

    /**
     * 当前是否沙箱环境
     */
    private boolean sandBox = true;

    public boolean isSandBox() {
        return sandBox;
    }

    public AlYunWmsClient(RestOperations restOperations) {
        this(new ObjectMapper(), restOperations);
    }

    public AlYunWmsClient(ObjectMapper objectMapper, RestOperations restOperations) {
        this.objectMapper = objectMapper;
        this.restOperations = restOperations;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }


    public static String getSoapString(String appKey, String appToken, String service, String jsonBody) {
        return "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns1=\"http://www.example.org/Ec/\"><SOAP-ENV:Body><ns1:callService>" +
                String.format("<paramsJson>%s</paramsJson>", jsonBody) +
                String.format("<appToken>%s</appToken>", appToken) +
                String.format("<appKey>%s</appKey>", appKey) +
                String.format("<service>%s</service>", service) +
                "</ns1:callService></SOAP-ENV:Body></SOAP-ENV:Envelope>";
    }

    /**
     * <a href="http://al.yunwms.com/api-doc/index.php">创建产品</a>
     */
    public ProductResponse createProduct(String appKey, String appToken, ProductDTO dto) {
        ResponseBody resp = callWmsSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, appKey, appToken, "createProduct", dto);
        return getResponse(resp, new TypeReference<ProductResponse>() {
        });
    }

    /**
     * <a href="http://al.yunwms.com/api-doc/index.php">编辑产品</a>
     */
    public ProductResponse modifyProduct(String appKey, String appToken, ProductDTO dto) {
        ResponseBody resp = callWmsSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, appKey, appToken, "modifyProduct", dto);
        return getResponse(resp, new TypeReference<ProductResponse>() {
        });
    }

    /**
     * <a href="http://al.yunwms.com/api-doc/index.php">获取产品列表</a>
     */
    public ProductPageResponse<List<ProductVO>> getProductList(String appKey, String appToken, QueryProductDTO dto) {
        ResponseBody resp = callWmsSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, appKey, appToken, "getProductList", dto);
        return getProductPageResponse(resp, new TypeReference<ProductPageResponse<List<ProductVO>>>() {
        });
    }

    /**
     * <a href="http://al.yunwms.com/api-doc/index.php">获取产品库存</a>
     */
    public PageResponse<List<InventoryVO>> getProductInventory(String appKey, String appToken, QueryInventoryDTO dto) {
        String host = isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST;
        ResponseBody resp = callWmsSoap(host, appKey, appToken, "getProductInventory", dto);
        return getPageResponse(resp, new TypeReference<PageResponse<List<InventoryVO>>>() {
        });
    }

    /**
     * <a href="http://al.yunwms.com/api-doc/index.php">获取入库单</a>
     *
     * @param appKey   秘钥
     * @param appToken 授权
     * @param dto      查询入库单参数
     */
    public PageResponse<List<AsnVO>> getAsnList(String appKey, String appToken, QueryAsnDTO dto) {
        ResponseBody resp = callWmsSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, appKey, appToken, "getAsnList", dto);
        return getPageResponse(resp, new TypeReference<PageResponse<List<AsnVO>>>() {
        });
    }

    /**
     * <a href="http://al.yunwms.com/api-doc/index.php">创建入库单</a>
     *
     * @param appKey   秘钥
     * @param appToken 授权
     * @param dto      创建入库单参数
     */
    public Response<ReceivingCodeVO> createAsn(String appKey, String appToken, CreateAsnDTO dto) {
        ResponseBody resp = callWmsSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, appKey, appToken, "createAsn", dto);
        return getResponse(resp, new TypeReference<Response<ReceivingCodeVO>>() {
        });
    }

    /**
     * <a href="http://al.yunwms.com/api-doc/index.php">修改入库单</a>
     *
     * @param appKey   秘钥
     * @param appToken 授权
     * @param dto      修改入库单参数
     */
    public AsnResponse<ReceivingCodeVO> modifyAsn(String appKey, String appToken, ModifyAsnDTO dto) {
        ResponseBody resp = callWmsSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, appKey, appToken, "modifyAsn", dto);
        return getResponse(resp, new TypeReference<AsnResponse<ReceivingCodeVO>>() {
        });
    }

    /**
     * <a href="http://al.yunwms.com/api-doc/index.php">取消入库单</a>
     *
     * @param appKey   秘钥
     * @param appToken 授权
     * @param dto      取消入库单参数
     */
    public AsnResponse<ReceivingCodeVO> cancelAsn(String appKey, String appToken, CancelAsnDTO dto) {
        ResponseBody resp = callWmsSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, appKey, appToken, "cancelAsn", dto);
        return getResponse(resp, new TypeReference<AsnResponse<ReceivingCodeVO>>() {
        });
    }

    /**
     * <a href="http://al.yunwms.com/api-doc/index.php">获取入库单PDF文件</a>
     *
     * @param appKey   秘钥
     * @param appToken 授权
     * @param dto      获取入库单参数
     */
    public PdfResponse getReceivingBoxPdfByCode(String appKey, String appToken, GetPdfDTO dto) {
        ResponseBody resp = callWmsSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, appKey, appToken, "getReceivingBoxPdfByCode", dto);
        return getResponse(resp, new TypeReference<PdfResponse>() {
        });
    }

    /**
     * <a href="http://al.yunwms.com/api-doc/index.php">更新入库单跟踪号</a>
     *
     * @param appKey   秘钥
     * @param appToken 授权
     * @param dto      更新入库单参数
     */
    public Response<Void> updateAsnTracking(String appKey, String appToken, UpdateAsnTrackingDTO dto) {
        ResponseBody resp = callWmsSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, appKey, appToken, "updateAsnTracking", dto);
        return getResponse(resp, new TypeReference<Response<Void>>() {
        });
    }

    /**
     * <a href="http://al.yunwms.com/api-doc/index.php">获取产品pdf文件</a>
     *
     * @param appKey   秘钥
     * @param appToken 授权
     * @param dto      请求参数
     */
    public ProductPdfResponse getProductPdf(String appKey, String appToken, ProductPdfDTO dto) {
        ResponseBody resp = callWmsSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, appKey, appToken, "getProductPdf", dto);
        return getResponse(resp, new TypeReference<ProductPdfResponse>() {
        });
    }

    /**
     * <a href="http://al.yunwms.com/api-doc/index.php">获取仓库</a>
     *
     * @param appKey   秘钥
     * @param appToken 授权
     */
    public Response<PageResponse<List<WarehouseVO>>> getWarehouse(String appKey, String appToken, QueryProductDTO dto) {
        ResponseBody resp = callWmsSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, appKey, appToken, "getWarehouse", dto);
        return getResponse(resp, new TypeReference<Response<PageResponse<List<WarehouseVO>>>>() {
        });
    }

    /**
     * 从 soapResponse中提取响应结果
     */
    public <T> ProductPageResponse<T> getProductPageResponse(ResponseBody soapResponse, TypeReference<ProductPageResponse<T>> typeReference) {
        Body body = soapResponse.getBody();
        CallServiceResponse callServiceResponse = body.getCallServiceResponse();
        String response = callServiceResponse.getResponse();
        try {
            return objectMapper.readValue(response, typeReference);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /**
     * 从 soapResponse中提取响应结果
     */
    public <T> PageResponse<T> getPageResponse(ResponseBody soapResponse, TypeReference<PageResponse<T>> typeReference) {
        Body body = soapResponse.getBody();
        CallServiceResponse callServiceResponse = body.getCallServiceResponse();
        String response = callServiceResponse.getResponse();
        try {
            return objectMapper.readValue(response, typeReference);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /**
     * 从 soapResponse中提取响应结果
     */
    public <T> T getResponse(ResponseBody soapResponse, TypeReference<T> typeReference) {
        Body body = soapResponse.getBody();
        CallServiceResponse callServiceResponse = body.getCallServiceResponse();
        String response = callServiceResponse.getResponse();
        try {
            return objectMapper.readValue(response, typeReference);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /**
     * 请求易仓 soap接口
     *
     * @param host     地址
     * @param appKey   用户名
     * @param appToken 密码
     * @param service  webservice服务
     * @param obj      请求参数
     */
    public ResponseBody callWmsSoap(String host, String appKey, String appToken, String service, Object obj) {
        try {
            UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s%s", host, WEBSERVICE_URL));
            URI uri = builder.build().toUri();
            String soapString = getSoapString(appKey, appToken, service, obj == null ? "{}" : objectMapper.writeValueAsString(obj));
            HttpHeaders headers = getSoapHeader(service);
            return getRestOperations().exchange(uri, HttpMethod.POST, new HttpEntity<>(soapString, headers), ResponseBody.class).getBody();
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @SuppressWarnings("all")
    public HttpHeaders getSoapHeader(String service) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/xml; charset=utf-8");
        headers.add("callService", service);
        return headers;
    }


}
