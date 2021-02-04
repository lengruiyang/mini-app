package cn.huiounet.miniapp.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/3 10:01
 */
@Data
@Table(name = "huiou_user_sys")
public class UserSysPojo implements Serializable {
    private Integer id;
    private String open_id;
    private String nick_name;
    private String user_head_img;
    private String phone_number;
    private String sex;
    private String from_user;
    private String create_time;
    private String status;
    private String password;
}
