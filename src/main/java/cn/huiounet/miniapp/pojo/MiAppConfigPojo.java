package cn.huiounet.miniapp.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/3 11:00
 */
@Data
@Component
@ConfigurationProperties(prefix = "app-config")
public class MiAppConfigPojo {
    private String appKey;
    private String appId;
    private String payKey;
    private String payId;
    private String appVersion;
}
