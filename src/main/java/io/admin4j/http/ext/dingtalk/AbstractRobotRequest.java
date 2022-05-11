package io.admin4j.http.ext.dingtalk;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import io.admin4j.http.ext.dingtalk.core.At;
import io.admin4j.http.ext.dingtalk.core.MsgType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author andanyang
 * @since 2022/5/11 11:51
 */
@Data
@NoArgsConstructor
public abstract class AbstractRobotRequest {
    private At at;

    @JSONField(name = "msgtype", serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
    public abstract MsgType getMsgType();
}
