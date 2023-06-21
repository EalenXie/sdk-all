package io.github.ealenxie.dingtalk;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.dingtalk.personnel.PageResponse;
import io.github.ealenxie.dingtalk.personnel.dto.PageDTO;
import io.github.ealenxie.dingtalk.personnel.dto.QueryJobRanksDTO;
import io.github.ealenxie.dingtalk.personnel.dto.QueryJobsDTO;
import io.github.ealenxie.dingtalk.personnel.dto.QueryPositionsDTO;
import io.github.ealenxie.dingtalk.personnel.vo.JobRankVO;
import io.github.ealenxie.dingtalk.personnel.vo.JobVO;
import io.github.ealenxie.dingtalk.personnel.vo.PositionVO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

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
    public PageResponse<PositionVO> queryPositions(String apiSecret, PageDTO pageDTO, QueryPositionsDTO dto) {
        LinkedMultiValueMap<String, String> pageParams = getQueryParams(pageDTO);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/%s/hrm/positions/query", DEFAULT_API_URL, VERSION)).queryParams(pageParams);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<PageResponse<PositionVO>> exchange = restOperations.exchange(uri, HttpMethod.POST, new HttpEntity<>(dto, getDingHeader(apiSecret)), new ParameterizedTypeReference<PageResponse<PositionVO>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtain-enterprise-rank-information">获取企业职级列表</a>
     */
    public PageResponse<JobRankVO> queryJobRanks(String apiSecret, QueryJobRanksDTO dto) {
        LinkedMultiValueMap<String, String> queryParams = getQueryParams(dto);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/%s/hrm/jobRanks", DEFAULT_API_URL, VERSION)).queryParams(queryParams);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<PageResponse<JobRankVO>> exchange = restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(dto, getDingHeader(apiSecret)), new ParameterizedTypeReference<PageResponse<JobRankVO>>() {
        });
        return exchange.getBody();
    }

    /**
     * <a href="https://open.dingtalk.com/document/orgapp/obtain-enterprise-title-information">获取企业职务列表</a>
     */
    public PageResponse<JobVO> queryJobs(String apiSecret, QueryJobsDTO dto) {
        LinkedMultiValueMap<String, String> queryParams = getQueryParams(dto);
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/%s/hrm/jobs", DEFAULT_API_URL, VERSION)).queryParams(queryParams);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<PageResponse<JobVO>> exchange = restOperations.exchange(uri, HttpMethod.GET, new HttpEntity<>(dto, getDingHeader(apiSecret)), new ParameterizedTypeReference<PageResponse<JobVO>>() {
        });
        return exchange.getBody();
    }


}
