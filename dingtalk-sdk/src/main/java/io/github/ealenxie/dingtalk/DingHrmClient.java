package io.github.ealenxie.dingtalk;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.dingtalk.personnel.PageResponse;
import io.github.ealenxie.dingtalk.personnel.dto.JobRanksQueryParams;
import io.github.ealenxie.dingtalk.personnel.dto.PageQueryParams;
import io.github.ealenxie.dingtalk.personnel.dto.PositionsQueryPayload;
import io.github.ealenxie.dingtalk.personnel.dto.QueryJobsQueryParams;
import io.github.ealenxie.dingtalk.personnel.vo.JobRankVO;
import io.github.ealenxie.dingtalk.personnel.vo.JobVO;
import io.github.ealenxie.dingtalk.personnel.vo.PositionVO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * 钉钉智能人事相关API
 *
 * @author create by sch  2023/4/28 10:03
 * @version 1.0
 */
public class DingHrmClient extends DingClient {

    public DingHrmClient() {
        super(new RestTemplate(), new ObjectMapper());
    }

    public DingHrmClient(ObjectMapper objectMapper) {
        super(objectMapper);
    }

    public DingHrmClient(RestOperations restOperations, ObjectMapper objectMapper) {
        super(restOperations, objectMapper);
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtain-enterprise-position-information">获取企业职位列表</a>
     */
    public PageResponse<PositionVO> queryPositions(String apiSecret, PageQueryParams queryParams, PositionsQueryPayload payload) {
        URI uri = buildUri(DEFAULT_API_URL, String.format("%s/hrm/positions/query", VERSION), queryParams);
        return restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(payload, getDingHeader(apiSecret)), new ParameterizedTypeReference<PageResponse<PositionVO>>() {
        }).getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtain-enterprise-rank-information">获取企业职级列表</a>
     */
    public PageResponse<JobRankVO> queryJobRanks(String apiSecret, JobRanksQueryParams queryParams) {
        URI uri = buildUri(DEFAULT_API_URL, String.format("%s/hrm/jobRanks", VERSION), queryParams);
        return restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, getDingHeader(apiSecret)), new ParameterizedTypeReference<PageResponse<JobRankVO>>() {
        }).getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtain-enterprise-title-information">获取企业职务列表</a>
     */
    public PageResponse<JobVO> queryJobs(String apiSecret, QueryJobsQueryParams queryParams) {
        URI uri = buildUri(DEFAULT_API_URL, String.format("%s/hrm/jobs", VERSION), queryParams);
        return restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(null, getDingHeader(apiSecret)), new ParameterizedTypeReference<PageResponse<JobVO>>() {
        }).getBody();
    }


}
