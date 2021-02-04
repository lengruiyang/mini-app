package cn.huiounet.miniapp.service.impl;

import cn.huiounet.miniapp.dao.UserSysPojoDao;
import cn.huiounet.miniapp.pojo.UserSysPojo;
import cn.huiounet.miniapp.service.UserSysPojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/3 10:09
 */
@Service
public class UserSysPojoServiceImpl implements UserSysPojoService {
    @Autowired(required = false)
    private UserSysPojoDao userSysPojoDao;

    @Override
    public UserSysPojo findById(int id) {
        return userSysPojoDao.findById(id);
    }

    @Override
    public UserSysPojo findByOpenId(String open_id) {
        return userSysPojoDao.findByOpenId(open_id);
    }
}
