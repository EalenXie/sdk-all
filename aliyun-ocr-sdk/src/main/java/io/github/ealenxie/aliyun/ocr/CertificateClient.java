package io.github.ealenxie.aliyun.ocr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.aliyun.ocr.dto.UrlFileDTO;
import io.github.ealenxie.aliyun.ocr.vo.OcrResponse;
import io.github.ealenxie.aliyun.ocr.vo.RecognizeData;
import io.github.ealenxie.aliyun.ocr.vo.certificate.*;
import org.springframework.web.client.RestOperations;

/**
 * @author EalenXie created on 2023/4/4 14:33
 * <p>
 * <a href="https://help.aliyun.com/document_detail/442254.html">个人证照识别</a>
 */
public class CertificateClient extends OcrClient {

    public CertificateClient(String accessKeyId, String accessKeySecret) {
        super(accessKeyId, accessKeySecret);
    }

    public CertificateClient(String accessKeyId, String accessKeySecret, RestOperations restOperations) {
        super(accessKeyId, accessKeySecret, restOperations);
    }

    public CertificateClient(String accessKeyId, String accessKeySecret, ObjectMapper objectMapper, RestOperations restOperations) {
        super(accessKeyId, accessKeySecret, objectMapper, restOperations);
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442255.html">身份证识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<IdCard> recognizeIdCard(IdCardDTO dto) {
        return getData(ocr("RecognizeIdcard", dto, OcrResponse.class), new TypeReference<RecognizeData<IdCard>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442256.html">护照识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<Passport> recognizePassport(UrlFileDTO dto) {
        return getData(ocr("RecognizePassport", dto, OcrResponse.class), new TypeReference<RecognizeData<Passport>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442257.html">户口本识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<Household> recognizeHousehold(HouseholdDTO dto) {
        return getData(ocr("RecognizeHousehold", dto, OcrResponse.class), new TypeReference<RecognizeData<Household>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442258.html">不动产权证识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<Certification> recognizeEstateCertification(UrlFileDTO dto) {
        return getData(ocr("RecognizeEstateCertification", dto, OcrResponse.class), new TypeReference<RecognizeData<Certification>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442259.html">银行卡识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<BankCard> recognizeBankCard(UrlFileDTO dto) {
        return getData(ocr("RecognizeBankCard", dto, OcrResponse.class), new TypeReference<RecognizeData<BankCard>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442260.html">出生证明识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<BirthCertification> recognizeBirthCertification(UrlFileDTO dto) {
        return getData(ocr("RecognizeBirthCertification", dto, OcrResponse.class), new TypeReference<RecognizeData<BirthCertification>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442261.html">中国护照识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<ChinesePassport> recognizeChinesePassport(OutputFigureDTO dto) {
        return getData(ocr("RecognizeChinesePassport", dto, OcrResponse.class), new TypeReference<RecognizeData<ChinesePassport>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442262.html">来往大陆（内地）通行证识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<ExitEntryPermitToMainland> recognizeExitEntryPermitToMainland(OutputFigureDTO dto) {
        return getData(ocr("RecognizeExitEntryPermitToMainland", dto, OcrResponse.class), new TypeReference<RecognizeData<ExitEntryPermitToMainland>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442263.html">往来港澳台通行证识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<RecognizeExitEntryPermitToHK> recognizeExitEntryPermitToHK(OutputFigureDTO dto) {
        return getData(ocr("RecognizeExitEntryPermitToHK", dto, OcrResponse.class), new TypeReference<RecognizeData<RecognizeExitEntryPermitToHK>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442264.html">社保卡识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<SocialSecurityCardVersionII> recognizeSocialSecurityCardVersionII(UrlFileDTO dto) {
        return getData(ocr("RecognizeSocialSecurityCardVersionII", dto, OcrResponse.class), new TypeReference<RecognizeData<SocialSecurityCardVersionII>>() {
        });
    }


    /**
     * <a href="https://help.aliyun.com/document_detail/455939.html">国际身份证识别</a>
     *
     * @param dto 请求参数
     * @return 返回值请 根据传入国家 调用 {@link  #getRecognizeData(RecognizeData, Class)}自行序列化
     * <p>India {@link  IndiaIdCard}/{@link  IndiaTaxIdCard}  </p>
     * <p>Vietnam {@link VietnamIdCard}</p>
     * <p>Korea {@link  KoreaIdCard}</p>
     * <p>Bangladesh {@link  BangladeshIdCard}</p>
     */
    @SuppressWarnings("all")
    public RecognizeData<?> recognizeInternationalIdCard(InternationalIdCardDTO dto) {
        return getData(ocr("RecognizeInternationalIdcard", dto, OcrResponse.class), new TypeReference<RecognizeData<?>>() {
        });
    }
}
