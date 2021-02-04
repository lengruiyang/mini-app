package cn.huiounet.miniapp;

import cn.huiounet.miniapp.pojo.UserSysPojo;
import cn.huiounet.miniapp.service.UserSysPojoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MiniAppApplicationTests {

    @Autowired
    private UserSysPojoService userSysPojoService;

    @Test
    public void userTest(){

    }

}
