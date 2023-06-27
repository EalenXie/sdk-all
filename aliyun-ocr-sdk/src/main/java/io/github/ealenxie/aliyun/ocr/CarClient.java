package io.github.ealenxie.aliyun.ocr;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ealenxie.aliyun.ocr.dto.UrlFilePayload;
import io.github.ealenxie.aliyun.ocr.vo.OcrResponse;
import io.github.ealenxie.aliyun.ocr.vo.RecognizeData;
import io.github.ealenxie.aliyun.ocr.vo.car.*;
import org.springframework.web.client.RestOperations;

/**
 * @author EalenXie created on 2023/4/6 16:12
 * <p>
 * <a href="https://help.aliyun.com/document_detail/442297.html">车辆物流识别</a>
 */
public class CarClient extends OcrClient {
    protected CarClient(String accessKeyId, String accessKeySecret) {
        super(accessKeyId, accessKeySecret);
    }

    protected CarClient(String accessKeyId, String accessKeySecret, RestOperations restOperations) {
        super(accessKeyId, accessKeySecret, restOperations);
    }

    protected CarClient(String accessKeyId, String accessKeySecret, ObjectMapper objectMapper, RestOperations restOperations) {
        super(accessKeyId, accessKeySecret, objectMapper, restOperations);
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442298.html">行驶证识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<VehicleLicense> recognizeVehicleLicense(UrlFilePayload dto) {
        return getData(ocr("RecognizeVehicleLicense", dto, OcrResponse.class), new TypeReference<RecognizeData<VehicleLicense>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442299.html">驾驶证识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<DrivingLicense> recognizeDrivingLicense(UrlFilePayload dto) {
        return getData(ocr("RecognizeDrivingLicense", dto, OcrResponse.class), new TypeReference<RecognizeData<DrivingLicense>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442300.html">电子面单识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<Waybill> recognizeWaybill(UrlFilePayload dto) {
        return getData(ocr("RecognizeWaybill", dto, OcrResponse.class), new TypeReference<RecognizeData<Waybill>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442301.html">车牌识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<CarNumber> recognizeCarNumber(UrlFilePayload dto) {
        return getData(ocr("RecognizeCarNumber", dto, OcrResponse.class), new TypeReference<RecognizeData<CarNumber>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442302.html">车辆vin码识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<CarVinCode> recognizeCarVinCode(UrlFilePayload dto) {
        return getData(ocr("RecognizeCarVinCode", dto, OcrResponse.class), new TypeReference<RecognizeData<CarVinCode>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442303.html">机动车注册登记证识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<VehicleRegistration> recognizeVehicleRegistration(UrlFilePayload dto) {
        return getData(ocr("RecognizeVehicleRegistration", dto, OcrResponse.class), new TypeReference<RecognizeData<VehicleRegistration>>() {
        });
    }

    /**
     * <a href="https://help.aliyun.com/document_detail/442304.html">车辆合格证识别</a>
     *
     * @param dto 请求参数
     */
    public RecognizeData<VehicleCertification> recognizeVehicleCertification(UrlFilePayload dto) {
        return getData(ocr("RecognizeVehicleCertification", dto, OcrResponse.class), new TypeReference<RecognizeData<VehicleCertification>>() {
        });
    }

}
