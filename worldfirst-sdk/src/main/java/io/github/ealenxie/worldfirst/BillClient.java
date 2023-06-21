package io.github.ealenxie.worldfirst;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.worldfirst.dto.InquiryStatementDTO;
import io.github.ealenxie.worldfirst.dto.RequireArgs;
import io.github.ealenxie.worldfirst.vo.InquiryStatementVO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;

/**
 * @author jadechiang
 * @since 2023/6/5 14:00
 */
public class BillClient extends WorldFirstClient {
    public BillClient(RestOperations restOperations, ObjectMapper objectMapper) {
        super(restOperations, objectMapper);
    }

    /**
     * <a href="https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/inquiry_statement_list">获取财务账单。</a>
     *
     * @param requireArgs 系统级必填参数
     * @param dto         业务参数
     */
    public InquiryStatementVO inquiryStatementList(RequireArgs requireArgs, InquiryStatementDTO dto, String customerId) {
        return postWorldfirst("/amsin/api/v1/business/account/inquiryStatementList", requireArgs, dto, customerId, new ParameterizedTypeReference<InquiryStatementVO>() {
        });
    }
}
