package io.github.ealenxie.tianyancha;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.tianyancha.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

/**
 * Created by EalenXie on 2022/12/14 15:23
 */
public class TianYanChaClient extends RestClient {

    public TianYanChaClient(String token) {
        this(new RestTemplate(), new ObjectMapper(), token);
    }

    public TianYanChaClient(RestOperations restOperations, String token) {
        this(restOperations, new ObjectMapper(), token);
    }

    public TianYanChaClient(RestOperations restOperations, ObjectMapper objectMapper, String token) {
        super(restOperations, objectMapper, token);
    }

    /**
     * <a href="http://open.tianyancha.com/open/1139">知识产权</a>
     * <p>可以通过公司名称或ID获取包含商标、专利、作品著作权、软件著作权、网站备案等维度的相关信息</p>
     */
    public Response<CbIpr> cbIpr(String keyword) {
        return getByKeyword("/services/open/cb/ipr/3.0", keyword, new ParameterizedTypeReference<Response<CbIpr>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/1002">司法风险</a>
     * <p>可以通过公司名称或ID获取包含法律诉讼、法院公告、开庭公告、失信人、被执行人、立案信息、送达公告等维度的相关信息</p>
     */
    public Response<CbJudicial> cbJudicial(String keyword) {
        return getByKeyword("/services/open/cb/judicial/2.0", keyword, new ParameterizedTypeReference<Response<CbJudicial>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/1116">企业基本信息查询</a>
     */
    public Response<BaseInfoNormalResponse> icBaseInfoNormal(String keyword) {
        return getByKeyword("/services/open/ic/baseinfo/normal", keyword, new ParameterizedTypeReference<Response<BaseInfoNormalResponse>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/1117">特殊企业基本信息</a>
     * <p>getResult()返回值 序列化 请参考 ResponseJsonNode#getEntityType()和  getResult(ResponseJsonNode, Class)</p>
     *
     * @return 响应的 ResponseJsonNode
     */
    public ResponseJsonNode icBaseInfoSpecial(String keyword) {
        return getByKeyword("/services/open/ic/baseinfo/special", keyword, new ParameterizedTypeReference<ResponseJsonNode>() {
        });
    }


}
