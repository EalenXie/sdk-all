package io.github.ealenxie.tianyancha.vo;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

/**
 * @author jadechiang
 * @since 2022/12/14 15:32
 */
@Setter
@Getter
public class ResponseJsonNode extends Response<JsonNode> {

    /**
     * 2-香港公司，3-社会组织，4-律所，5-事业单位，6-基金会，9-新机构
     * 获取EntityType 实体类型 ,其返回值决定其类型
     * <p>当 entityType 为null 则未成功查询到结果信息
     * <p>当 entityType = 2, 可调用  getResult(response, Result2.class)进行序列化</p>
     * <p>当 entityType = 3, 可调用  getResult(response, Result3.class)进行序列化</p>
     * <p>当 entityType = 4, 可调用  getResult(response, Result4.class)进行序列化</p>
     * <p>当 entityType = 5, 可调用  getResult(response, Result5.class)进行序列化</p>
     * <p>当 entityType = 6, 可调用  getResult(response, Result6.class)进行序列化</p>
     * <p>当 entityType = 9, 可调用  getResult(response, Result9.class)进行序列化</p>
     *
     * @return 返回值决定实体转换类型
     */
    @Nullable
    public Integer getEntityType() {
        JsonNode jsonNode = getResult();
        if (jsonNode != null) {
            return jsonNode.get("entityType").asInt();
        }
        return null;
    }

}
