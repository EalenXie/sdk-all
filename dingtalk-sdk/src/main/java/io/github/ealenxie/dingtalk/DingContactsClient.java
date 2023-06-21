package io.github.ealenxie.dingtalk;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.dingtalk.addressbook.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestOperations;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/10 14:35
 **/
public class DingContactsClient extends DingClient {

    public DingContactsClient(ObjectMapper objectMapper) {
        super(objectMapper);
    }

    public DingContactsClient(RestOperations restOperations, ObjectMapper objectMapper) {
        super(restOperations, objectMapper);
    }

    private static final String ACCESS_TOKEN = "access_token";

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtain-the-department-list-v2">获取部门列表</a>
     */
    public ResponseV1<List<DeptBaseResponse>> departments(String accessToken, DepartmentListsubRequest request) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(OLD_API_URL).path(OLD_VERSION).path("/department/listsub").queryParam(ACCESS_TOKEN, accessToken);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<ResponseV1<List<DeptBaseResponse>>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(request, getDingHeader()), new ParameterizedTypeReference<ResponseV1<List<DeptBaseResponse>>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/queries-the-complete-information-of-a-department-user">获取部门用户详情</a>
     */
    public ResponseV1<PageResultV1<ListUserResponse>> users(String accessToken, UserListRequest request) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(OLD_API_URL).path(OLD_VERSION).path("/user/list").queryParam(ACCESS_TOKEN, accessToken);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<ResponseV1<PageResultV1<ListUserResponse>>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(request, getDingHeader()), new ParameterizedTypeReference<ResponseV1<PageResultV1<ListUserResponse>>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/isvapp/query-the-list-of-all-parent-departments-of-a-department">获取指定部门的所有父部门列表</a>
     */
    public ResponseV1<DeptListParentByDeptIdResponse> listParentByDept(String accessToken, DepartmentListParentRequest request) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(OLD_API_URL).path(OLD_VERSION).path("/department/listparentbydept").queryParam(ACCESS_TOKEN, accessToken);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<ResponseV1<DeptListParentByDeptIdResponse>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(request, getDingHeader()), new ParameterizedTypeReference<ResponseV1<DeptListParentByDeptIdResponse>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/isvapp/obtains-a-list-of-enterprise-roles">获取角色列表</a>
     */
    public ResponseV1<PageResultV1<OpenRoleGroup>> roles(String accessToken, RoleListRequest request) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(OLD_API_URL).path("/role/list").queryParam(ACCESS_TOKEN, accessToken);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<ResponseV1<PageResultV1<OpenRoleGroup>>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(request, getDingHeader()), new ParameterizedTypeReference<ResponseV1<PageResultV1<OpenRoleGroup>>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtain-the-list-of-employees-of-a-role">获取指定角色的员工列表</a>
     */
    public ResponseV1<PageResultV2<OpenEmpSimple>> roleSimples(String accessToken, RoleSimpleListRequest request) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(OLD_API_URL).path("role/simplelist").queryParam(ACCESS_TOKEN, accessToken);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<ResponseV1<PageResultV2<OpenEmpSimple>>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(request, getDingHeader()), new ParameterizedTypeReference<ResponseV1<PageResultV2<OpenEmpSimple>>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/dingtalk-retrieve-user-information">获取用户通讯录个人信息</a>
     */
    public GetUserResponseBody contactUsers(String accessToken, String unionId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(DEFAULT_API_URL).path(VERSION).path("/contact/users/").path(unionId);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<GetUserResponseBody> exchange = restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, getDingHeader(accessToken)), new ParameterizedTypeReference<GetUserResponseBody>() {
        });
        return exchange.getBody();
    }
}

