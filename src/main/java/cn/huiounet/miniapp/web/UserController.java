package cn.huiounet.miniapp.web;

import cn.huiounet.miniapp.pojo.MiAppConfigPojo;
import cn.huiounet.miniapp.pojo.UserSysPojo;
import cn.huiounet.miniapp.service.UserSysPojoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/3 10:28
 */
@RestController
@RequestMapping("/app")
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserSysPojoService userSysPojoService;
    @Autowired
    private MiAppConfigPojo miAppConfigPojo;

    @GetMapping("/app")
    public MiAppConfigPojo getConfig(){
        return miAppConfigPojo;
    }

    @GetMapping("/user")
    public UserSysPojo getUser(String open_id){
        UserSysPojo byOpenId = userSysPojoService.findByOpenId(open_id);
        logger.info(byOpenId);
        return byOpenId;
    }
}
