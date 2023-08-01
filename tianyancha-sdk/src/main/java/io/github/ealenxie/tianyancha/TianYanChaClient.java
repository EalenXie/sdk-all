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
     * <a href="http://open.tianyancha.com/open/1001">工商信息</a>
     * <p>可以通过公司名称或ID获取包含企业基本信息、主要人员、股东信息、对外投资、分支机构等维度的相关信息</p>
     */
    public Response<CbIc> cbIc(String keyword) {
        return getByKeyword("/services/open/cb/judicial/2.0", keyword, new ParameterizedTypeReference<Response<CbIc>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/842">法律诉讼</a>
     * <p>可以通过公司名称或ID获取企业法律诉讼信息，法律诉讼包括案件名称、案由、案件身份、案号等字段的详细信息</p>
     */
    public Response<TotalItems<JrLawSuit>> jrLawSuit(KeywordPageQuery query) {
        return get("/services/open/jr/lawSuit/2.0", query, new ParameterizedTypeReference<Response<TotalItems<JrLawSuit>>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/822">变更记录</a>
     * <p>可以通过公司名称或ID获取企业变更记录，变更记录包括工商变更事项、变更前后信息等字段的详细信息</p>
     */
    public Response<TotalItems<Change>> icChangeInfo(KeywordPageQuery query) {
        return get("/services/open/ic/changeinfo/2.0", query, new ParameterizedTypeReference<Response<TotalItems<Change>>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/821">企业股东</a>
     * <p>可以通过公司名称或ID获取企业股东信息，股东信息包括股东名、出资比例、出资金额、股东总数等字段的详细信息</p>
     */
    public Response<TotalItems<IcHolder>> icHolder(KeywordPageQuery query) {
        return get("/services/open/ic/holder/2.0", query, new ParameterizedTypeReference<Response<TotalItems<IcHolder>>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/1116">企业基本信息查询</a>
     */
    public Response<BaseInfoNormal> icBaseInfoNormal(String keyword) {
        return getByKeyword("/services/open/ic/baseinfo/normal", keyword, new ParameterizedTypeReference<Response<BaseInfoNormal>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/816">搜索</a>
     * <p>可以通过关键词获取企业列表，企业列表包括公司名称或ID、类型、成立日期、经营状态、统一社会信用代码等字段的详细信息</p>
     */
    public Response<TotalItems<CompanyInfo>> search(KeywordPageQuery keyword) {
        return get("/services/open/search/2.0", keyword, new ParameterizedTypeReference<Response<TotalItems<CompanyInfo>>>() {
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
