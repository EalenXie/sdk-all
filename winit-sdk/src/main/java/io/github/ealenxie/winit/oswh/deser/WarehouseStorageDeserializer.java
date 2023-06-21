package io.github.ealenxie.winit.oswh.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import io.github.ealenxie.winit.oswh.inventory.vo.WarehouseStorage;

import java.io.IOException;
import java.util.Collections;

/**
 * 处理万邑通泛型返回时，jackson 反序列化失败问题
 *
 * @author lanzhi
 * Created on 2023/1/31 9:31
 **/
public class WarehouseStorageDeserializer extends JsonDeserializer<Object> implements ContextualDeserializer {

    private JavaType javaType;

    public WarehouseStorageDeserializer() {
    }

    public WarehouseStorageDeserializer(JavaType type) {
        this.javaType = type;
    }

    /**
     * 处理万邑通调用失败 {@link WarehouseStorage} data 返回值为[]和{}的问题
     *
     * @author lanzhi
     * Created on 2023/1/31 13:09
     */
    @Override
    public Object deserialize(JsonParser jsonparser, DeserializationContext context) throws IOException {
        JsonToken currentToken = jsonparser.getCurrentToken();
        if (currentToken == JsonToken.START_ARRAY) {
            return context.readValue(jsonparser, javaType);
        } else if (currentToken == JsonToken.START_OBJECT) {
            Class<?> rawClass = javaType.getContentType().getRawClass();
            return Collections.singletonList(context.readValue(jsonparser, rawClass));
        }
        return Collections.emptyList();
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
        return new WarehouseStorageDeserializer(type);
    }
}


