package io.github.ealenxie.aliyun.ocr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.aliyun.ocr.vo.OcrResponse;
import io.github.ealenxie.aliyun.ocr.vo.invoice.verify.VerifyBusinessLicense;
import io.github.ealenxie.aliyun.ocr.vo.invoice.verify.VerifyBusinessLicenseDTO;
import io.github.ealenxie.aliyun.ocr.vo.invoice.verify.VerifyVATInvoice;
import io.github.ealenxie.aliyun.ocr.vo.invoice.verify.VerifyVATInvoiceDTO;
import org.springframework.web.client.RestOperations;

/**
 * Created by EalenXie on 2023/3/23 10:47
 * <p>
 * <a href="https://help.aliyun.com/document_detail/465265.html">票证核验</a>
 */
public class InvoiceVerifyClient extends OcrClient {

    public InvoiceVerifyClient(String accessKeyId, String accessKeySecret) {
        super(accessKeyId, accessKeySecret);
    }

    public InvoiceVerifyClient(String accessKeyId, String accessKeySecret, RestOperations restOperations) {
        super(accessKeyId, accessKeySecret, restOperations);
    }

    public InvoiceVerifyClient(String accessKeyId, String accessKeySecret, ObjectMapper objectMapper, RestOperations restOperations) {
        super(accessKeyId, accessKeySecret, objectMapper, restOperations);
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/465204.html">营业执照核验</a>
     *
     * @param dto 请求参数
     */
    public VerifyBusinessLicense verifyBusinessLicense(VerifyBusinessLicenseDTO dto) {
        return getData(ocr("VerifyBusinessLicense", dto, OcrResponse.class), new TypeReference<VerifyBusinessLicense>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/465205.html">发票核验</a>
     *
     * @param dto 请求参数
     */
    public VerifyVATInvoice verifyVATInvoice(VerifyVATInvoiceDTO dto) {
        return getData(ocr("VerifyVATInvoice", dto, OcrResponse.class), new TypeReference<VerifyVATInvoice>() {
        });
    }
}
