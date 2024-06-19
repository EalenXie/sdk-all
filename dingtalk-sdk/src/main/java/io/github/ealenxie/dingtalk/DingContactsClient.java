package io.github.ealenxie.dingtalk;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.dingtalk.addressbook.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;

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

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtain-the-department-list-v2">获取部门列表</a>
     */
    public ResponseV1<List<DeptBaseResponse>> departments(String accessToken, DeptIdPayload payload) {
        URI uri = buildUri(OLD_API_URL, "/v2/department/listsub", new AccessTokenQueryParams(accessToken));
        return restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(payload, getDingHeader()), new ParameterizedTypeReference<ResponseV1<List<DeptBaseResponse>>>() {
        }).getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/queries-the-complete-information-of-a-department-user">获取部门用户详情</a>
     */
    public ResponseV1<PageResultV1<ListUserResponse>> users(String accessToken, UserListPayload payload) {
        URI uri = buildUri(OLD_API_URL, "/v2/user/list", new AccessTokenQueryParams(accessToken));
        return restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(payload, getDingHeader()), new ParameterizedTypeReference<ResponseV1<PageResultV1<ListUserResponse>>>() {
        }).getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/isvapp/query-the-list-of-all-parent-departments-of-a-department">获取指定部门的所有父部门列表</a>
     */
    public ResponseV1<ParentIdsResponse> listParentByDept(String accessToken, DeptIdPayload payload) {
        URI uri = buildUri(OLD_API_URL, "/v2/department/listparentbydept", new AccessTokenQueryParams(accessToken));
        return restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(payload, getDingHeader()), new ParameterizedTypeReference<ResponseV1<ParentIdsResponse>>() {
        }).getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/isvapp/obtains-a-list-of-enterprise-roles">获取角色列表</a>
     */
    public ResponseV1<PageResultV1<OpenRoleGroup>> roles(String accessToken, RoleListRequest request) {
        URI uri = buildUri(OLD_API_URL, "/role/list", new AccessTokenQueryParams(accessToken));
        return restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(request, getDingHeader()), new ParameterizedTypeReference<ResponseV1<PageResultV1<OpenRoleGroup>>>() {
        }).getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtain-the-list-of-employees-of-a-role">获取指定角色的员工列表</a>
     */
    public ResponseV1<PageResultV2<OpenEmpSimple>> roleSimples(String accessToken, RoleSimpleListRequest request) {
        URI uri = buildUri(OLD_API_URL, "/role/simplelist", new AccessTokenQueryParams(accessToken));
        return restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(request, getDingHeader()), new ParameterizedTypeReference<ResponseV1<PageResultV2<OpenEmpSimple>>>() {
        }).getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/dingtalk-retrieve-user-information">获取用户通讯录个人信息</a>
     */
    public UserResponse contactUsers(String accessToken, String unionId) {
        URI uri = buildUri(DEFAULT_API_URL, String.format("%s/contact/users/%s", VERSION, unionId), null);
        return restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, getDingHeader(accessToken)), UserResponse.class).getBody();
    }
}

