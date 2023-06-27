package io.github.ealenxie.aliyun.ocr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.aliyun.ocr.dto.UrlFilePayload;
import io.github.ealenxie.aliyun.ocr.vo.OcrResponse;
import io.github.ealenxie.aliyun.ocr.vo.RecognizeData;
import io.github.ealenxie.aliyun.ocr.vo.certificate.CountryPayload;
import io.github.ealenxie.aliyun.ocr.vo.qualification.*;
import org.springframework.web.client.RestOperations;

/**
 * @author EalenXie created on 2023/4/4 17:17
 * <p>
 * <a href="https://help.aliyun.com/document_detail/442287.html">企业资质识别</a>
 */
public class QualificationClient extends OcrClient {
    public QualificationClient(String accessKeyId, String accessKeySecret) {
        super(accessKeyId, accessKeySecret);
    }

    public QualificationClient(String accessKeyId, String accessKeySecret, RestOperations restOperations) {
        super(accessKeyId, accessKeySecret, restOperations);
    }

    public QualificationClient(String accessKeyId, String accessKeySecret, ObjectMapper objectMapper, RestOperations restOperations) {
        super(accessKeyId, accessKeySecret, objectMapper, restOperations);
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442288.html">营业执照识别</a>
     *
     * @param payload 请求参数
     */
    public RecognizeData<BusinessLicense> recognizeBusinessLicense(UrlFilePayload payload) {
        return getData(ocr("RecognizeBusinessLicense", payload, OcrResponse.class), new TypeReference<RecognizeData<BusinessLicense>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442289.html">银行开户许可证识别</a>
     *
     * @param payload 请求参数
     */
    public RecognizeData<BankAccountLicense> recognizeBankAccountLicense(UrlFilePayload payload) {
        return getData(ocr("RecognizeBankAccountLicense", payload, OcrResponse.class), new TypeReference<RecognizeData<BankAccountLicense>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442290.html">商标注册证识别</a>
     *
     * @param payload 请求参数
     */
    public RecognizeData<TradeMarkCertification> recognizeTradeMarkCertification(UrlFilePayload payload) {
        return getData(ocr("RecognizeTradeMarkCertification", payload, OcrResponse.class), new TypeReference<RecognizeData<TradeMarkCertification>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442291.html">食品生产许可证识别</a>
     *
     * @param payload 请求参数
     */
    public RecognizeData<FoodProduceLicense> recognizeFoodProduceLicense(UrlFilePayload payload) {
        return getData(ocr("RecognizeFoodProduceLicense", payload, OcrResponse.class), new TypeReference<RecognizeData<FoodProduceLicense>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442292.html">食品经营许可证识别</a>
     *
     * @param payload 请求参数
     */
    public RecognizeData<FoodManageLicense> recognizeFoodManageLicense(UrlFilePayload payload) {
        return getData(ocr("RecognizeFoodManageLicense", payload, OcrResponse.class), new TypeReference<RecognizeData<FoodManageLicense>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442293.html">医疗器械经营许可证识别</a>
     *
     * @param payload 请求参数
     */
    public RecognizeData<MedicalDeviceManageLicense> recognizeMedicalDeviceManageLicense(UrlFilePayload payload) {
        return getData(ocr("RecognizeMedicalDeviceManageLicense", payload, OcrResponse.class), new TypeReference<RecognizeData<MedicalDeviceManageLicense>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442294.html">医疗器械生产许可证识别</a>
     *
     * @param payload 请求参数
     */
    public RecognizeData<MedicalDeviceProduceLicense> recognizeMedicalDeviceProduceLicense(UrlFilePayload payload) {
        return getData(ocr("RecognizeMedicalDeviceProduceLicense", payload, OcrResponse.class), new TypeReference<RecognizeData<MedicalDeviceProduceLicense>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442295.html">第二类医疗器械经营备案凭证识别</a>
     *
     * @param payload 请求参数
     */
    public RecognizeData<CTwoMedicalDeviceManageLicense> recognizeCTwoMedicalDeviceManageLicense(UrlFilePayload payload) {
        return getData(ocr("RecognizeCtwoMedicalDeviceManageLicense", payload, OcrResponse.class), new TypeReference<RecognizeData<CTwoMedicalDeviceManageLicense>>() {
        });
    }


    /**
     * <a href="https://help.aliyun.com/document_detail/442296.html">化妆品生产许可证识别</a>
     *
     * @param payload 请求参数
     */
    public RecognizeData<CosmeticProduceLicense> recognizeCosmeticProduceLicense(UrlFilePayload payload) {
        return getData(ocr("RecognizeCosmeticProduceLicense", payload, OcrResponse.class), new TypeReference<RecognizeData<CosmeticProduceLicense>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/463487.html">国际企业执照识别</a>
     *
     * @return 返回值请 根据传入国家 调用 {@link  #getRecognizeData(RecognizeData, Class)}自行序列化
     * <p>India {@link  IndiaBusinessLicense}</p>
     * <p>Korea {@link  KoreaBusinessLicense}</p>
     */
    @SuppressWarnings("all")
    public RecognizeData<?> recognizeInternationalBusinessLicense(CountryPayload payload) {
        return getData(ocr("RecognizeInternationalBusinessLicense", payload, OcrResponse.class), new TypeReference<RecognizeData<?>>() {
        });
    }

}
