package io.github.ealenxie.dingtalk.workflow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author lanzhi
 * Created on 2023/5/8 15:53
 **/
@Getter
@Setter
public class SaveProcessFeatureConfig {

    /**
     * 配置列表
     */
    private List<SaveProcessRequestConfigFeatures> features;

}

