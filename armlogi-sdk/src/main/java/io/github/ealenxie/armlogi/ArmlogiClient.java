package io.github.ealenxie.armlogi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.armlogi.dto.*;
import io.github.ealenxie.armlogi.dto.inbound.AddReceivingDTO;
import io.github.ealenxie.armlogi.dto.inbound.ModifyReceivingDTO;
import io.github.ealenxie.armlogi.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * 大方广 新API
 **/
public class ArmlogiClient {

    //沙箱 service
    private static final String HOST_SANDBOX = "http://apisandbox.armlogi.com";
    //正式 service
    private static final String HOST = "https://openapi.armlogi.com";

    /**
     * 当前是否沙箱环境
     */
    private boolean sandBox = true;

    public boolean isSandBox() {
        return sandBox;
    }

    public void setSandBox(boolean sandBox) {
        this.sandBox = sandBox;
    }

    private final RestOperations restOperations;

    private final ObjectMapper objectMapper;

    public ArmlogiClient() {
        this(new ObjectMapper(), new RestTemplate());
    }

    public ArmlogiClient(ObjectMapper objectMapper, RestOperations restOperations) {
        this.objectMapper = objectMapper;
        this.restOperations = restOperations;

    }

    public HttpHeaders getArmlogiHeader(String apiSecret, MediaType mediaType) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("apiSecret", apiSecret);
        headers.setContentType(mediaType);
        return headers;
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E4%BA%A7%E5%93%81/listsSkuStockUsingPOST">获取产品库存</a>
     */
    public Response<Page<ProductInventory>> getProductInventory(String apiSecret, QueryProductInventory dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/prodcut/listsSkuStock", isSandBox() ? HOST_SANDBOX : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<Page<ProductInventory>>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getArmlogiHeader(apiSecret, MediaType.APPLICATION_JSON)), new ParameterizedTypeReference<Response<Page<ProductInventory>>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%85%A5%E5%BA%93%E5%8D%95/getDetailUsingGET">获取入库单详情</a>
     */
    public Response<AsnInfoVO> getAsnInfo(String apiSecret, AsnDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/asn/detail", isSandBox() ? HOST_SANDBOX : HOST));
        LinkedMultiValueMap<String, String> req = getQueryParams(dto);
        builder.queryParams(req);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<AsnInfoVO>> exchange = restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, getArmlogiHeader(apiSecret, MediaType.APPLICATION_FORM_URLENCODED)), new ParameterizedTypeReference<Response<AsnInfoVO>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%85%A5%E5%BA%93%E5%8D%95/abolishUsingPOST">作废入库单</a>
     */
    public Response<Boolean> cancelAsn(String apiSecret, AsnDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/asn/abolish", isSandBox() ? HOST_SANDBOX : HOST));
        URI uri = builder.build().encode().toUri();
        LinkedMultiValueMap<String, String> params = getQueryParams(dto);
        ResponseEntity<Response<Boolean>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(params, getArmlogiHeader(apiSecret, MediaType.APPLICATION_FORM_URLENCODED)), new ParameterizedTypeReference<Response<Boolean>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%85%A5%E5%BA%93%E5%8D%95/downloadPDFUsingPOST">获取入库单PDF</a>
     */
    public byte[] getAsnInBoundPdf(String apiSecret, AsnInBoundPdfDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/asn/orderPDF", isSandBox() ? HOST_SANDBOX : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<byte[]> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getArmlogiHeader(apiSecret, MediaType.APPLICATION_JSON)), new ParameterizedTypeReference<byte[]>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E4%BA%A7%E5%93%81/printUsingPOST">打印产品条码PDF</a>
     */
    public byte[] getProductPDF(String apiSecret, ProductPdfDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/prodcut/print", isSandBox() ? HOST_SANDBOX : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<byte[]> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getArmlogiHeader(apiSecret, MediaType.APPLICATION_JSON)), new ParameterizedTypeReference<byte[]>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%85%A5%E5%BA%93%E5%8D%95/downloadPDFUsingPOST">获取箱唛PDF</a>
     */
    public byte[] getAsnBoxBarcodePDF(String apiSecret, AsnInBoundPdfDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/asn/boxBarcodePDF", isSandBox() ? HOST_SANDBOX : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<byte[]> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getArmlogiHeader(apiSecret, MediaType.APPLICATION_JSON)), new ParameterizedTypeReference<byte[]>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%85%A5%E5%BA%93%E5%8D%95/createUsingPOST">创建入库单</a>
     */
    public Response<String> createInboundOrder(String apiSecret, AddReceivingDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/asn/create", isSandBox() ? HOST_SANDBOX : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<String>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getArmlogiHeader(apiSecret, MediaType.APPLICATION_JSON)), new ParameterizedTypeReference<Response<String>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%85%A5%E5%BA%93%E5%8D%95/adjustUsingPOST">编辑入库单</a>
     */
    public Response<String> updateInboundOrder(String apiSecret, ModifyReceivingDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/asn/adjust", isSandBox() ? HOST_SANDBOX : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<String>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getArmlogiHeader(apiSecret, MediaType.APPLICATION_JSON)), new ParameterizedTypeReference<Response<String>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%85%A5%E5%BA%93%E5%8D%95/approveUsingPOST">预约入库</a>
     */
    public Response<Integer> approveInbound(String apiSecret, ApproveInboundDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/asn/approve", isSandBox() ? HOST_SANDBOX : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<Integer>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getArmlogiHeader(apiSecret, MediaType.APPLICATION_JSON)), new ParameterizedTypeReference<Response<Integer>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E5%9F%BA%E7%A1%80%E6%95%B0%E6%8D%AE/listsUsingPOST">仓库分页列表</a>
     */
    public Response<Page<Warehouse>> warehouseLists(String apiSecret, PageDTO dto) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/basic/warehouseLists", isSandBox() ? HOST_SANDBOX : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<Page<Warehouse>>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getArmlogiHeader(apiSecret, MediaType.APPLICATION_JSON)), new ParameterizedTypeReference<Response<Page<Warehouse>>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/saveUsingPOST">创建订单</a>
     */
    public Response<CreateOrderVO> createOrder(String apiSecret, CreateOrderDTO createOrderDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/order/create", isSandBox() ? HOST_SANDBOX : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<CreateOrderVO>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(createOrderDTO, getArmlogiHeader(apiSecret, MediaType.APPLICATION_JSON)), new ParameterizedTypeReference<Response<CreateOrderVO>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/UploadAttachUsingPOST">审核订单</a>
     */
    public Response<Boolean> auditOrder(String apiSecret, OrderCodeDTO orderCodeDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/order/audit", isSandBox() ? HOST_SANDBOX : HOST));
        return callRespBoolean(builder, apiSecret, orderCodeDTO);
    }


    /**
     * 调用接口响应类型为 Boolean
     */
    public Response<Boolean> callRespBoolean(UriComponentsBuilder builder, String apiSecret, Object requestBody) {
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<Boolean>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(requestBody, getArmlogiHeader(apiSecret, MediaType.APPLICATION_JSON)), new ParameterizedTypeReference<Response<Boolean>>() {
        });
        return exchange.getBody();
    }


    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/UploadAttachUsingPOST">上传订单附件</a>
     */
    public Response<Boolean> updateAttach(String apiSecret, UpdateAttachDTO updateAttachDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/order/UploadAttach", isSandBox() ? HOST_SANDBOX : HOST));
        return callRespBoolean(builder, apiSecret, updateAttachDTO);
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/interceptUsingPOST">截单</a>
     */
    public Response<Boolean> interceptOrder(String apiSecret, InterceptOrderDTO interceptOrderDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/order/intercept", isSandBox() ? HOST_SANDBOX : HOST));
        return callRespBoolean(builder, apiSecret, interceptOrderDTO);
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/cancelInterceptUsingPOST">取消截单</a>
     */
    public Response<Boolean> cancelInterceptOrder(String apiSecret, OrderCodeDTO orderCodeDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/order/cancelIntercept", isSandBox() ? HOST_SANDBOX : HOST));
        return callRespBoolean(builder, apiSecret, orderCodeDTO);
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/invalidUsingPOST">作废订单</a>
     */
    public Response<Boolean> invalidOrder(String apiSecret, OrderCodeDTO orderCodeDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/order/invalid", isSandBox() ? HOST_SANDBOX : HOST));
        return callRespBoolean(builder, apiSecret, orderCodeDTO);
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/forwardToAuditUsingPOST">异常或问题单转至待发货审核</a>
     */
    public Response<Boolean> forwardToAuditOrder(String apiSecret, OrderCodeDTO orderCodeDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/order/forwardToAudit", isSandBox() ? HOST_SANDBOX : HOST));
        return callRespBoolean(builder, apiSecret, orderCodeDTO);
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/trialFreightUsingPOST">运费试算（估算金额）</a>
     */
    public Response<List<TrialFreightVO>> trialFreightOrder(String apiSecret, TrialFreightDTO trialFreightDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/order/trialFreight", isSandBox() ? HOST_SANDBOX : HOST));
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<List<TrialFreightVO>>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(trialFreightDTO, getArmlogiHeader(apiSecret, MediaType.APPLICATION_JSON)), new ParameterizedTypeReference<Response<List<TrialFreightVO>>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="http://apisandbox.armlogi.com/doc.html#/0-%E5%85%A8%E9%83%A8%E5%88%86%E7%BB%84/%E8%AE%A2%E5%8D%95%E5%88%9B%E5%BB%BA/auditUsingPOST">修改订单信息</a>
     */
    public Response<Boolean> updateOrder(String apiSecret, UpdateOrderDTO updateOrderDTO) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/api/v1/order/update", isSandBox() ? HOST_SANDBOX : HOST));
        return callRespBoolean(builder, apiSecret, updateOrderDTO);
    }


    @SuppressWarnings("all")
    public LinkedMultiValueMap<String, String> getQueryParams(Object dto) {
        Map<String, String> args = objectMapper.convertValue(dto, new TypeReference<Map<String, String>>() {
        });
        LinkedMultiValueMap<String, String> req = new LinkedMultiValueMap<>();
        req.setAll(args);
        return req;
    }
}

