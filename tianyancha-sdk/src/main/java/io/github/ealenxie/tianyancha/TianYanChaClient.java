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
    public Response<TotalItems<LawSuit2>> lawSuit2(KeywordPageQuery query) {
        return get("/services/open/jr/lawSuit/2.0", query, new ParameterizedTypeReference<Response<TotalItems<LawSuit2>>>() {
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

    /**
     * <a href="https://open.tianyancha.com/open/823">对外投资</a>
     * <p>可以通过公司名称或ID获取企业对外投资信息，对外投资信息包括被投资企业、企业法人、投资占比、对外投资总数等字段的详细信息</p>
     */
    public Response<TotalItems<Inverst>> icInverst(KeywordPageQuery query) {
        return get("/services/open/ic/inverst/2.0", query, new ParameterizedTypeReference<Response<TotalItems<Inverst>>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/876">历史对外投资</a>
     * <p>历史对外投资</p>
     */
    public Response<TotalItems<HiInvest>> hiInvest(KeywordPageQuery query) {
        return get("/services/open/hi/invest/2.0", query, new ParameterizedTypeReference<Response<TotalItems<HiInvest>>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/824">分支机构</a>
     * <p>可以通过公司名称或ID获取企业分支机构信息，分支机构信息包括分公司名称或ID、企业法人、经营状态、分公司总数等字段的详细信息</p>
     */
    public Response<TotalItems<IcBranch>> icBranch(KeywordPageQuery query) {
        return get("/services/open/ic/branch/2.0", query, new ParameterizedTypeReference<Response<TotalItems<IcBranch>>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/963">总公司</a>
     * <p>可以通过公司名称或ID获取企业总公司信息，总公司信息包括总公司名称或ID、企业法人、经营状态、注册资本等字段的详细信息</p>
     */
    public Response<IcParentCompany> icParentCompany(String keyword) {
        return getByKeyword("/services/open/ic/parentCompany/2.0", keyword, new ParameterizedTypeReference<Response<IcParentCompany>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/825">企业年报</a>
     * <p>可以通过公司名称或ID获取企业年报，企业年报包括企业基本信息、股东及出资信息、企业资产状况信息、对外投资信息等字段的详细信息</p>
     */
    public Response<TotalItems<IcAnnualReport>> icAnnualReport(String keyword) {
        return getByKeyword("/services/open/ic/annualreport/2.0", keyword, new ParameterizedTypeReference<Response<TotalItems<IcAnnualReport>>>() {
        });
    }

    /**
     * <a href="https://open.tianyancha.com/open/878">历史工商信息</a>
     * <p>历史工商信息</p>
     */
    public Response<HiIc> hiIc(String keyword) {
        return getByKeyword("/services/open/hi/ic/2.0", keyword, new ParameterizedTypeReference<Response<HiIc>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/1114">法律诉讼</a>
     * <p>可以通过公司名称或ID获取企业法律诉讼信息，包括案号、案件名称、案由、案件金额、案件身份、裁判结果标签等字段的详细信息</p>
     */
    public Response<TotalItems<LawSuit3>> lawSuit3(KeywordPageQuery query) {
        return get("/services/open/jr/lawSuit/3.0", query, new ParameterizedTypeReference<Response<TotalItems<LawSuit3>>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/1115">历史法律诉讼</a>
     * <p>可以通过公司名称或ID获取企业历史法律诉讼信息，包括案号、案件名称、案由、案件金额、案件身份、裁判结果标签等字段的详细信息</p>
     */
    public Response<TotalItems<LawSuit3>> hiLawSuit3(KeywordPageQuery query) {
        return get("/services/open/hi/lawSuit/3.0", query, new ParameterizedTypeReference<Response<TotalItems<LawSuit3>>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/1073">法律诉讼详情</a>
     * <p>根据法律诉讼ID获取法律诉讼详情，法律诉讼详情包括标题、关联公司、关联律所、审理法院、文书类型、案号、文书内容、本案裁判结果等字段的详细信息</p>
     */
    public Response<LawSuitDetail> lawSuitDetail(String uuid) {
        return get("/services/open/jr/lawSuit/detail", String.format("uuid=%s", uuid), new ParameterizedTypeReference<Response<LawSuitDetail>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/875">历史开庭公告</a>
     * <p>可以通过公司名称或ID获取企业历史的开庭公告，历史开庭公告信息包括被告/被上诉人、法院、原告/上诉人、开庭日期、案由、内部ID、案号等字段信息</p>
     */
    public Response<TotalItems<HiAnnouncement>> hiAnnouncement(KeywordPageQuery query) {
        return get("/services/open/hi/announcement/2.0", query, new ParameterizedTypeReference<Response<TotalItems<HiAnnouncement>>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/841">法院公告</a>
     * <p>可以通过公司名称或ID获取企业法院公告，法院公告信息包括执行法院、案件内容、公告类型、刊登日期、公司名、当事人等字段的详细信息</p>
     */
    public Response<TotalItems<JrCourtAnnouncement>> jrCourtAnnouncement(KeywordPageQuery query) {
        return get("/services/open/jr/courtAnnouncement/2.0", query, new ParameterizedTypeReference<Response<TotalItems<JrCourtAnnouncement>>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/873">历史法院公告</a>
     * <p>可以通过公司名称或ID获取企业历史的法院公告，历史法院公告信息包括执行法院、案件内容、公告类型、刊登日期、公司名、当事人等字段信息</p>
     */
    public Response<TotalItems<HiCourt>> hiCourt(KeywordPageQuery query) {
        return get("/services/open/hi/court/2.0", query, new ParameterizedTypeReference<Response<TotalItems<HiCourt>>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/962">送达公告</a>
     * <p>可以通过公司名称或ID获取送达公告信息，送达公告信息包括公告名称、法院名称、公告内容、发布日期等字段的详细信息</p>
     */
    public Response<TotalItems<SendAnnouncement>> sendAnnouncement(KeywordPageQuery query) {
        return get("/services/open/jr/sendAnnouncement/2.0", query, new ParameterizedTypeReference<Response<TotalItems<SendAnnouncement>>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/961">立案信息</a>
     * <p>可以通过公司名称或ID获取立案信息，立案信息包括案件编号、案由、立案时间、案件原被告双方信息等字段的详细信息</p>
     */
    public Response<TotalItems<JrCourtRegister>> courtRegister(KeywordPageQuery query) {
        return get("/services/open/jr/courtRegister/2.0", query, new ParameterizedTypeReference<Response<TotalItems<JrCourtRegister>>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/756">司法协助</a>
     * <p>可以通过公司名称或ID获取司法协助信息，司法协助信息包括执行法院、案件内容、被执行人名称等字段的详细信息</p>
     */
    public Response<JudicialV4> judicialV4(KeywordPageQuery query) {
        return get("/services/v4/open/judicial", query, new ParameterizedTypeReference<Response<JudicialV4>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/757">司法协助详情</a>
     * <p>根据司法协助ID获取司法协助详情，判断司法协助类型，包括股权变更、股权冻结、结解除冻结、司法协助续行、股权数额、司法冻结失效及对应的详细信息</p>
     */
    public Response<JudicialDetailV4> getJudicialDetail(String assistanceId) {
        return get("/services/v4/open/getJudicialDetail", String.format("assistanceId=%s", assistanceId), new ParameterizedTypeReference<Response<JudicialDetailV4>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/1015">历史司法协助</a>
     * <p>可以通过公司名称或ID获取企业历史的司法协助信息，历史司法协助信息包括执行法院、案件内容、被执行人名称等字段信息</p>
     */
    public Response<JudicialV4> hiJudicial(KeywordPageQuery query) {
        return get("/services/open/hi/judicial/2.0", query, new ParameterizedTypeReference<Response<JudicialV4>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/1016">历史司法协助详情</a>
     * <p>根据司法协助ID获取历史的司法协助详情，判断司法协助类型，历史司法协助详情包括股权变更、股权冻结、结解除冻结、司法协助续行、股权数额、司法冻结失效及对应的详细信息</p>
     */
    public Response<JudicialDetailV4> hiJudicialDetail(String businessId) {
        return get("/services/open/hi/judicial/detail/2.0", String.format("businessId=%s", businessId), new ParameterizedTypeReference<Response<JudicialDetailV4>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/1036">破产重整</a>
     * <p>可以通过公司名称或ID获取破产重整信息，破产重整信息包括破产案件公开时间、申请人、被申请人、申请对象等字段的详细信息</p>
     */
    public Response<Bankruptcy> bankruptcy(KeywordPageQuery query) {
        return get("/services/open/jr/bankruptcy/2.0", query, new ParameterizedTypeReference<Response<Bankruptcy>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/1037">破产重整详情</a>
     * <p>可以通过公司名称或ID获取破产重整信息，破产重整信息包括破产案件公开时间、申请人、被申请人、申请对象、管理人主要负责人等字段的详细信息</p>
     */
    public Response<BankruptcyDetail> bankruptcyDetail(String gid, String uuid) {
        return get("/services/open/jr/bankruptcy/detail/2.0", String.format("gid=%s&uuid=%s", gid, uuid), new ParameterizedTypeReference<Response<BankruptcyDetail>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/839">被执行人</a>
     * <p>可以通过公司名称或ID获取破产重整信息，破产重整信息包括破产案件公开时间、申请人、被申请人、申请对象、管理人主要负责人等字段的详细信息</p>
     */
    public Response<TotalItems<Zhixinginfo>> zhixinginfo(KeywordPageQuery query) {
        return get("/services/open/jr/zhixinginfo/2.0", query, new ParameterizedTypeReference<Response<TotalItems<Zhixinginfo>>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/871">历史被执行人</a>
     * <p>可以通过公司名称或ID获取企业历史的被执行人信息，历史被执行人信息包括执行法院、案件内容、执行标的、被执行人名称、组织机构代码等字段信息</p>
     */
    public Response<TotalItems<Zhixinginfo>> hiZhixing(KeywordPageQuery query) {
        return get("/services/open/hi/zhixing/2.0", query, new ParameterizedTypeReference<Response<TotalItems<Zhixinginfo>>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/843">失信人</a>
     * <p>可以通过公司名称或ID判定企业失信情况，失信信息包括失信人名称、组织机构代码、履行情况、失信行为具体情形等字段的详细信息</p>
     */
    public Response<TotalItems<JrDishonest>> dishonest(KeywordPageQuery query) {
        return get("/services/open/jr/dishonest/2.0", query, new ParameterizedTypeReference<Response<TotalItems<JrDishonest>>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/872">历史失信人</a>
     * <p>可以通过公司名称或ID获取企业历史的失信情况，历史失信信息包括失信人名称、组织机构代码、履行情况、失信行为具体情形等字段信息</p>
     */
    public Response<TotalItems<HiDishonest>> hiDishonest(KeywordPageQuery query) {
        return get("/services/open/hi/dishonest/2.0", query, new ParameterizedTypeReference<Response<TotalItems<HiDishonest>>>() {
        });
    }

    /**
     * <a href="http://open.tianyancha.com/open/1014">限制消费令</a>
     * <p>可以通过公司名称或ID获取限制消费令信息，限制消费令信息包括执行法院、案件内容、被执行人名称等字段的详细信息</p>
     */
    public Response<TotalItems<ConsumptionRestriction>> consumptionRestriction(KeywordPageQuery query) {
        return get("/services/open/jr/consumptionRestriction/2.0", query, new ParameterizedTypeReference<Response<TotalItems<ConsumptionRestriction>>>() {
        });
    }
}
