package io.github.ealenxie.eccang;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.eccang.dto.*;
import io.github.ealenxie.eccang.vo.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * Created by EalenXie on 2022/11/2 10:21
 * <p>
 * 易仓 CLIENT
 */
public class EcCangClient {

    // eb 沙箱环境
    private static final String EB_HOST_SANDBOX = "http://demoeb.eccang.com";

    // wms 沙箱环境
    private static final String WMS_HOST_SANDBOX = "http://demo.ez-wms.com";

    // eb 正式环境
    private static final String EB_HOST = "http://dyeb.ez-wms.com";

    // wms 正式环境
    private static final String WMS_HOST = "http://dy.ez-wms.com";

    private final ObjectMapper objectMapper;

    private final RestOperations restOperations;

    private static final String WEBSERVICE_URL = "/default/svc-open/web-service-v2";

    /**
     * 当前是否沙箱环境
     */
    private boolean sandBox = true;

    public EcCangClient(RestOperations restOperations) {
        this(new ObjectMapper(), restOperations);
    }

    public EcCangClient(ObjectMapper objectMapper, RestOperations restOperations) {
        this.objectMapper = objectMapper;
        this.restOperations = restOperations;
    }

    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }

    public RestOperations getRestOperations() {
        return restOperations;
    }


    /**
     * <a href="https://eccang.yuque.com/books/share/df2ca396-46f5-4a51-a33e-73794059bb1d/gkgh0f">eb-订单列表</a>
     */
    public PageResponse<List<Order>> getOrderList(String username, String password, OrderListDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? EB_HOST_SANDBOX : EB_HOST, username, password, "getOrderList", dto);
        return getEcPageResponse(resp, new TypeReference<PageResponse<List<Order>>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/awcvxt">wms-创建/编辑产品</a>
     */
    public Response<Void> syncProduct(String username, String password, SyncProductDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "syncProduct", dto);
        return getEcResponse(resp, new TypeReference<Response<Void>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/ggty07">wms-批量创建、编辑产品</a>
     */
    public Response<Void> syncBatchProduct(String username, String password, List<SyncProductDTO> dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "syncBatchProduct", dto);
        return getEcResponse(resp, new TypeReference<Response<Void>>() {
        });
    }


    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/sp22vh">wms-获取单个产品信息</a>
     */
    public Response<List<Product>> getProductBySku(String username, String password, ProductBySkuDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "getProductBySku", dto);
        return getEcResponse(resp, new TypeReference<Response<List<Product>>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/gn6ry3">wms-获取批量产品信息</a>
     */
    public PageResponse<List<Product>> getProductList(String username, String password, GetProductListDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "getProductList", dto);
        return getEcPageResponse(resp, new TypeReference<PageResponse<List<Product>>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/hce5ln">wms-获取产品销售状态</a>
     */
    public Response<List<ProductSellVO>> getProductSell(String username, String password) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "getProductSell", null);
        return getEcResponse(resp, new TypeReference<Response<List<ProductSellVO>>>() {
        });
    }


    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/zva03g">wms-获取供应商</a>
     */
    public Response<Map<String, SupplierVO>> getSupplier(String username, String password) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "getSupplier", null);
        return getEcResponse(resp, new TypeReference<Response<Map<String, SupplierVO>>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/wwy2hd">wms-获取用户列表</a>
     */
    public PageResponse<List<UserVO>> getUser(String username, String password, Integer userStatus) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "getUser", userStatus);
        return getEcPageResponse(resp, new TypeReference<PageResponse<List<UserVO>>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/ilbxzu">wms-创建采购单</a>
     */
    public Response<SyncPurchaseOrdersVO> syncPurchaseOrders(String username, String password, SyncPurchaseOrdersDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "syncPurchaseOrders", dto);
        return getEcResponse(resp, new TypeReference<Response<SyncPurchaseOrdersVO>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/isogrq">WMS 查询库存（库位维度显示）</a>
     */
    public PageResponse<List<GetProductInventoryForLocationVO>> getProductInventoryForLocation(String username, String password, GetProductInventoryForLocationDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "getProductInventoryForLocation", dto);
        return getEcPageResponse(resp, new TypeReference<PageResponse<List<GetProductInventoryForLocationVO>>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/wypkoz">WMS 库存盘点(根据第三方盘点结果调整库存）</a>
     */
    public Response<Void> takeStockForLocation(String username, String password, TakeStockForLocationDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "takeStockForLocation", dto);
        return getEcResponse(resp, new TypeReference<Response<Void>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/tztskr">WMS 审核采购单</a>
     */
    public VerifyPurchaseResponse<VerifyPurchaseVO> verifyPurchase(String username, String password, VerifyPurchaseDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "verifyPurchase", dto);
        return getEcResponse(resp, new TypeReference<VerifyPurchaseResponse<VerifyPurchaseVO>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/sgol4g">WMS 撤销采购单</a>
     */
    public Response<List<RevocationPurchaseVO>> revocationPurchase(String username, String password, RevocationPurchaseDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "revocationPurchase", dto);
        return getEcResponse(resp, new TypeReference<Response<List<RevocationPurchaseVO>>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/ax6xx0">WMS 获取仓库库位</a>
     */
    public Response<List<GetWarehouseLocationVO>> getWarehouseLocation(String username, String password, GetWarehouseLocationDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "getWarehouseLocation", dto);
        return getEcResponse(resp, new TypeReference<Response<List<GetWarehouseLocationVO>>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/oamhno">WMS 创建/编辑出库单</a>
     */
    public Response<List<SaveCeiveVO>> saveCeive(String username, String password, SaveCeiveDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "saveCeive", dto);
        return getEcResponse(resp, new TypeReference<Response<List<SaveCeiveVO>>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/ril3ic">WMS 创建调拨单</a>
     */
    public Response<List<CreateTranferOrderVO>> createTranferOrder(String username, String password, CreateTranferOrderDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "createTranferOrder", dto);
        return getEcResponse(resp, new TypeReference<Response<List<CreateTranferOrderVO>>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/og0y4i">EB 取消订单</a>
     */
    public Response<List<CancelOrderVO>> cancelOrder(String username, String password, CancelOrderDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? EB_HOST_SANDBOX : EB_HOST, username, password, "cancelOrder", dto);
        return getEcResponse(resp, new TypeReference<Response<List<CancelOrderVO>>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/ivtlrv">WMS 获取国家列表</a>
     */
    public Response<Map<String, GetCountryVO>> getCountry(String username, String password) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "getCountry", null);
        return getEcResponse(resp, new TypeReference<Response<Map<String, GetCountryVO>>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/ugu0fr">WMS 根据条件查询供应商</a>
     */
    public PageResponse<List<GetSupplierListVO>> getSupplierList(String username, String password, Request<GetSupplierListDTO> dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "getSupplierList", dto);
        return getEcPageResponse(resp, new TypeReference<PageResponse<List<GetSupplierListVO>>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/gndus3"> WMS 用于创建和修改供应商</a>
     * <p>此易仓接口 成功时 返回对象 {@link SyncSupplierInfoVO },失败时返回空数组 请自行序列化</p>
     */
    public Response<Object> syncSupplierInfo(String username, String password, SyncSupplierInfoDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "syncSupplierInfo", dto);
        return getEcResponse(resp, new TypeReference<Response<Object>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/kqw3v8">WMS ● getPurchaseOrders(查询采购单信息)</a>
     * <p>此功能和调用API接口账号所绑定的仓库有关</p>
     * <p>接口查询的状态比系统列表页多</p>
     */
    public PageResponse<List<GetPurchaseOrdersVO>> getPurchaseOrders(String username, String password, GetPurchaseOrdersDTO dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "getPurchaseOrders", dto);
        return getEcPageResponse(resp, new TypeReference<PageResponse<List<GetPurchaseOrdersVO>>>() {
        });
    }

    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/dpghsl">WMS ● getWarehouse(获取仓库信息)</a>
     */
    public Response<Map<String, Warehouse>> getWarehouse(String username, String password, GetWarehouse dto) {
        EcSoapResponse resp = callEcSoap(isSandBox() ? WMS_HOST_SANDBOX : WMS_HOST, username, password, "getWarehouse", dto);
        return getEcResponse(resp, new TypeReference<Response<Map<String, Warehouse>>>() {
        });
    }

    /**
     * 请求易仓 soap接口
     *
     * @param host     地址
     * @param username 用户名
     * @param password 密码
     * @param service  webservice服务
     * @param obj      请求参数
     */
    public EcSoapResponse callEcSoap(String host, String username, String password, String service, Object obj) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s%s", host, WEBSERVICE_URL));
        URI uri = builder.build().toUri();
        String soapString = getSoapString(username, password, service, obj == null ? "{}" : writeValueAsString(obj));
        HttpHeaders headers = getSoapHeader(service);
        return getRestOperations().exchange(uri, HttpMethod.POST, new HttpEntity<>(soapString, headers), EcSoapResponse.class).getBody();
    }


    /**
     * 等同于 {@link  ObjectMapper#writeValueAsString(Object)}
     * 捕获 JsonProcessingException 为运行时异常
     */
    public String writeValueAsString(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new UnsupportedOperationException(e);
        }
    }

    /**
     * 从 soapResponse中提取响应结果
     */
    public <T> PageResponse<T> getEcPageResponse(EcSoapResponse soapResponse, TypeReference<PageResponse<T>> typeReference) {
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
    public <T> T getEcResponse(EcSoapResponse soapResponse, TypeReference<T> typeReference) {
        Body body = soapResponse.getBody();
        CallServiceResponse callServiceResponse = body.getCallServiceResponse();
        String response = callServiceResponse.getResponse();
        try {
            return objectMapper.readValue(response, typeReference);
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


    /**
     * <a href="https://eccang.yuque.com/gko3h7/sw0gov/gr55ws">获取 soap请求字符串</a>
     *
     * @param username 用户名
     * @param userPass 密码
     * @param service  服务名
     * @param jsonBody 请求body
     */
    public String getSoapString(String username, String userPass, String service, String jsonBody) {
        return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns1=\"http://www.example.org/Ec/\"><soapenv:Body><ns1:callService>" +
                String.format("<paramsJson><![CDATA[%s]]></paramsJson>", jsonBody) +
                String.format("<userName>%s</userName>", username) +
                String.format("<userPass>%s</userPass>", userPass) +
                String.format("<service>%s</service>", service) +
                "</ns1:callService></soapenv:Body></soapenv:Envelope>";
    }

}
