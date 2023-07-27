package io.github.ealenxie.worldfirst;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.worldfirst.dto.InquiryStatementPayload;
import io.github.ealenxie.worldfirst.dto.RequireArgs;
import io.github.ealenxie.worldfirst.vo.InquiryStatementResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.client.RestOperations;

/**
 * @author jadechiang
 * @since 2023/6/5 14:00
 */
public class BillClient extends WorldFirstClient {
    public BillClient(RestOperations restOperations, ObjectMapper objectMapper, RequireArgs requireArgs) {
        super(restOperations, objectMapper, requireArgs);
    }

    /**
     * <a href="https://developers.worldfirst.com.cn/docs/alipay-worldfirst/worldfirst_enterprise_solution_zh/inquiry_statement_list">获取财务账单。</a>
     */
    public InquiryStatementResponse inquiryStatementList(InquiryStatementPayload payload) {
        return postWorldfirst("/amsin/api/v1/business/account/inquiryStatementList", payload, new ParameterizedTypeReference<InquiryStatementResponse>() {
        });
    }
}
