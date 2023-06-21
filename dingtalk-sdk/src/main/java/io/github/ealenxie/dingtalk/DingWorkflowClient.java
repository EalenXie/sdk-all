package io.github.ealenxie.dingtalk;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.dingtalk.workflow.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * OA审批
 *
 * @author lanzhi Created on 2023/4/28 10:27
 */
public class DingWorkflowClient extends DingClient {

    public DingWorkflowClient(ObjectMapper objectMapper) {
        super(objectMapper);
    }

    public DingWorkflowClient(RestOperations restOperations, ObjectMapper objectMapper) {
        super(restOperations, objectMapper);
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/create-an-approval-form-template">创建或更新审批表单模板</a>
     */
    public Response<FormCreateResponseBodyResult> workflowForms(String accessToken, FormComponent component) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(DEFAULT_API_URL).path(VERSION).path("/workflow/forms");
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<FormCreateResponseBodyResult>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(component, getDingHeader(accessToken)), new ParameterizedTypeReference<Response<FormCreateResponseBodyResult>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtain-the-form-schema">获取表单 schema</a>
     */
    public Response<QuerySchemaByProcessCodeResult> querySchemaByProcessCode(String accessToken, QuerySchemaByProcessCodeRequest request) {
        LinkedMultiValueMap<String, String> queryParams = getQueryParams(request);
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(DEFAULT_API_URL).path(VERSION).path("/workflow/forms/schemas/processCodes").queryParams(queryParams);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<QuerySchemaByProcessCodeResult>> exchange = restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, getDingHeader(accessToken)), new ParameterizedTypeReference<Response<QuerySchemaByProcessCodeResult>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/approval-process-prediction">获取审批单流程中的节点信息</a>
     */
    public Response<QuerySchemaByProcessCodeResult> processesForecast(String accessToken, ProcessForecastRequest request) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(DEFAULT_API_URL).path(VERSION).path("/workflow/processes/forecast");
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<QuerySchemaByProcessCodeResult>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(request, getDingHeader(accessToken)), new ParameterizedTypeReference<Response<QuerySchemaByProcessCodeResult>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/create-an-approval-instance">发起审批实例</a>
     */
    public Response<StartProcessInstanceResponseBody> processInstances(String accessToken, StartProcessInstanceRequest request) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(DEFAULT_API_URL).path(VERSION).path("/workflow/processInstances");
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<StartProcessInstanceResponseBody>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(request, getDingHeader(accessToken)), new ParameterizedTypeReference<Response<StartProcessInstanceResponseBody>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtains-the-details-of-a-single-approval-instance-pop">获取单个审批实例详情</a>
     */
    public Response<GetProcessInstanceResult> processInstancesInfo(String accessToken, String processInstanceId) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(DEFAULT_API_URL).path(VERSION).path("/workflow/processInstances").queryParam("processInstanceId", processInstanceId);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<GetProcessInstanceResult>> exchange = restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, getDingHeader(accessToken)), new ParameterizedTypeReference<Response<GetProcessInstanceResult>>() {
        });
        return exchange.getBody();
    }


    /**
     * <a href="https://open.dingtalk.com/document/orgapp/api-overview#f5f5bbd188rxh">创建或更新审批模板</a>
     */
    public Response<FormCreateResponseBodyResult> processCentres(String accessToken, SaveProcessRequest request) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(DEFAULT_API_URL).path(VERSION).path("processCentres/schemas");
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<FormCreateResponseBodyResult>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(request, getDingHeader(accessToken)), new ParameterizedTypeReference<Response<FormCreateResponseBodyResult>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/api-overview#f5f5bbd188rxh">获取模板code</a>
     */
    public Response<FormCreateResponseBodyResult> getProcessCentres(String accessToken, String name) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(DEFAULT_API_URL).path(VERSION).path("processCentres/schemaNames/processCodes").queryParam("name", name);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<FormCreateResponseBodyResult>> exchange = restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, getDingHeader(accessToken)), new ParameterizedTypeReference<Response<FormCreateResponseBodyResult>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/api-overview#f5f5bbd188rxh">删除模板</a>
     */
    public Response<FormCreateResponseBodyResult> deleteProcessCentres(String accessToken, String processCode, Boolean cleanRunningTask) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(DEFAULT_API_URL).path(VERSION).path("processCentres/schemas").queryParam("processCode", processCode).queryParam("cleanRunningTask", cleanRunningTask);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<FormCreateResponseBodyResult>> exchange = restOperations.exchange(uri, HttpMethod.DELETE, new HttpEntity<>(null, getDingHeader(accessToken)), new ParameterizedTypeReference<Response<FormCreateResponseBodyResult>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/api-overview#f5f5bbd188rxh">创建实例</a>
     */
    public Response<FormCreateResponseBodyResult> createProcessCentresInstance(String accessToken, SaveIntegratedInstanceRequest request) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(DEFAULT_API_URL).path(VERSION).path("processCentres/instances");
        URI uri = builder.build().encode().toUri();
        ResponseEntity<Response<FormCreateResponseBodyResult>> exchange = restOperations.exchange(uri, HttpMethod.DELETE, new HttpEntity<>(request, getDingHeader(accessToken)), new ParameterizedTypeReference<Response<FormCreateResponseBodyResult>>() {
        });
        return exchange.getBody();
    }


}

