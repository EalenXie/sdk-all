package io.github.ealenxie.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import org.springframework.util.ObjectUtils;

import java.io.IOException;

/**
 * @author lanzhi
 * Created on 2023/9/4 11:35
 **/
public class SellerSpriteResponseDeserializer  extends JsonDeserializer<Object> implements ContextualDeserializer {

    private JavaType javaType;

    public SellerSpriteResponseDeserializer() {

    }

    public SellerSpriteResponseDeserializer(JavaType type) {
        this.javaType = type;
    }

    /**
     * 处理万邑通调用失败 data 返回值为”XXX“非null问题
     *
     * @author lanzhi
     * Created on 2023/1/31 13:09
     */
    @Override
    public Object deserialize(JsonParser jsonparser, DeserializationContext context) throws IOException {
        JsonToken currentToken = jsonparser.getCurrentToken();
        if (currentToken == JsonToken.START_ARRAY || currentToken == JsonToken.START_OBJECT) {
            return context.readValue(jsonparser, javaType);
        }
        if (ObjectUtils.isEmpty(jsonparser.getText()) || currentToken == JsonToken.VALUE_STRING) {
            return null;
        }
        return context.readValue(jsonparser, javaType);
    }

    /**
     * 获取当前上下文的泛型类型
     *
     * @author lanzhi
     * Created on 2023/1/31 13:09
     */
    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext context, BeanProperty property) {
        JavaType type = context.getContextualType() != null
                ? context.getContextualType()
                : property.getMember().getType();
        return new SellerSpriteResponseDeserializer(type);
    }
}

