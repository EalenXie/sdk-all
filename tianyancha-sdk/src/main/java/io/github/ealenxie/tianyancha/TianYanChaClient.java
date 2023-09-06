package io.github.ealenxie.tianyancha;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.tianyancha.vo.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

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
    public Response<Ipr> cbIpr(String keyword) {
        return getByKeyword("/services/open/cb/ipr/3.0", keyword, new ParameterizedTypeReference<Response<Ipr>>() {
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
     * <p>可以通过公司名称或ID获取企业基本信息，企业基本信息包括公司名称或ID、类型、成立日期、经营状态、注册资本、法人、工商注册号、统一社会信用代码、组织机构代码、纳税人识别号等字段信息</p>
     */
    public Response<BaseInfoNormal> icBaseInfoNormal(String keyword) {
        return getByKeyword("/services/open/ic/baseinfo/normal", keyword, new ParameterizedTypeReference<Response<BaseInfoNormal>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/816">搜索</a>
     * <p>可以通过关键词获取企业列表，企业列表包括公司名称或ID、类型、成立日期、经营状态、统一社会信用代码等字段的详细信息</p>
     */
    public Response<TotalItems<SearchInfo>> search(KeywordPageQuery keyword) {
        return get("/services/open/search/2.0", keyword, new ParameterizedTypeReference<Response<TotalItems<SearchInfo>>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/450">人员所有公司</a>
     * <p>可以通过公司名称或ID和人名获取企业人员的所有相关公司，包括其担任法人、股东、董监高的公司信息</p>
     */
    public Response<TotalItems<Company>> allCompanys(AllCompanysQueryParams queryParams) {
        return get("/services/v4/open/allCompanys", queryParams, new ParameterizedTypeReference<Response<TotalItems<Company>>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/425">企业天眼风险</a>
     * <p>可以通过关键字（公司名称、公司id、注册号或社会统一信用代码）获取企业相关天眼风险列表，包括企业自身/周边/预警风险信息</p>
     */
    public Response<List<RiskInfo>> riskInfo(String keyword) {
        return getByKeyword("/services/v4/open/riskInfo", keyword, new ParameterizedTypeReference<Response<List<RiskInfo>>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/1074">企业三要素验证</a>
     * <p>可以通过输入企业名称、法人、注册号 /组织机构代码 /统一社会信用代码，验证三者是否匹配一致</p>
     */
    public Response<IcVerify> icVerify(IcVerifyQueryParams queryParams) {
        return get("/services/open/ic/verify/2.0", queryParams, new ParameterizedTypeReference<Response<IcVerify>>() {
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

    /**
     * <a href="https://open.tianyancha.com/open/818">企业基本信息（含企业联系方式）</a>
     * <p>可以通过公司名称或ID或ID称获取企业基本信息和企业联系方式，包括公司名称或ID、类型、成立日期、电话、邮箱、网址等字段的详细信息</p>
     */
    public Response<BaseInfoV2> icBaseInfoV2(String keyword) {
        return getByKeyword("/services/open/ic/baseinfoV2/2.0", keyword, new ParameterizedTypeReference<Response<BaseInfoV2>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/819">企业基本信息（含主要人员）</a>
     * <p>可以通过公司名称或ID获取企业基本信息和主要人员信息，包括公司名称或ID、类型、成立日期、联系方式、主要人员名称、职位等字段的详细信息</p>
     */
    public Response<BaseInfoV3> icBaseInfoV3(String keyword) {
        return getByKeyword("/services/open/ic/baseinfoV3/2.0", keyword, new ParameterizedTypeReference<Response<BaseInfoV3>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/1045">工商快照</a>
     * <p>可以通过公司名称或ID获取工商快照信息，工商快照信息包括工商官网信息快照、营业执照信息、股东及出资信息等</p>
     */
    public Response<String> icSnapshot(String keyword) {
        return getByKeyword("/services/open/ic/snapshot", keyword, new ParameterizedTypeReference<Response<String>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/1047">企业类型</a>
     * <p>可以通过公司名称或ID获取企业类型信息</p>
     */
    public Response<String> icCompanyType(String keyword) {
        return getByKeyword("/services/open/ic/companyType", keyword, new ParameterizedTypeReference<Response<String>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/1046">企业联系方式</a>
     * <p>可以通过公司名称或ID获取企业联系方式信息，企业联系方式信息包括邮箱、网址、电话等字段的详细信息</p>
     */
    public Response<IcContact> icContact(String keyword) {
        return getByKeyword("/services/open/ic/contact", keyword, new ParameterizedTypeReference<Response<IcContact>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/820">主要人员</a>
     * <p>可以通过公司名称或ID获取企业主要人员信息，主要人员信息包括董事、监事、高级管理人员姓名、职位、主要人员总数等字段的详细信息</p>
     */
    public Response<TotalItems<Staff>> icStaff(String keyword) {
        return getByKeyword("/services/open/ic/staff/2.0", keyword, new ParameterizedTypeReference<Response<TotalItems<Staff>>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/1050">历史主要人员</a>
     * <p>可以通过公司名称或ID获取企业主要人员信息，主要人员信息包括董事、监事、高级管理人员姓名、职位、主要人员总数等字段的详细信息</p>
     */
    public Response<HiMember> hiMembers(String keyword) {
        return getByKeyword("/services/open/hi/members", keyword, new ParameterizedTypeReference<Response<HiMember>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/877">历史股东信息</a>
     * <p>可以通过公司名称或ID获取企业历史的股东信息，历史股东信息包括股东名、出资比例、认缴金额、股东总数等字段信息</p>
     */
    public Response<TotalItems<HiShareholder>> hiHolder(KeywordPageQuery query) {
        return get("/services/open/hi/holder/2.0", query, new ParameterizedTypeReference<Response<TotalItems<HiShareholder>>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/997">公司公示-股东出资</a>
     * <p>可以通过公司名称或ID获取股东及出资信息，股东及出资信息包括股东名、出资比例、出资金额、股东总数等字段的详细信息</p>
     */
    public Response<TotalItems<ShareHolder>> icHolderList(KeywordPageQuery query) {
        return get("/services/open/ic/holderList/2.0", query, new ParameterizedTypeReference<Response<TotalItems<ShareHolder>>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/998">公司公示-股权变更</a>
     * <p>可以通过公司名称或ID获取企业股权变更信息，股权变更包括变更前后的股东名、变更时间等字段的详细信息</p>
     */
    public Response<TotalItems<HolderChange>> icHolderChange(KeywordPageQuery query) {
        return get("/services/open/ic/holderChange/2.0", query, new ParameterizedTypeReference<Response<TotalItems<HolderChange>>>() {
        });
    }
}
