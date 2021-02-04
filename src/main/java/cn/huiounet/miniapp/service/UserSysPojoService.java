package cn.huiounet.miniapp.service;

import cn.huiounet.miniapp.pojo.UserSysPojo;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/3 10:09
 */
public interface UserSysPojoService {
    /**
     *
     * @param id 用户ID
     * @return 用户信息
     */
    UserSysPojo findById(int id);


    /**
     *
     * @param open_id 用户openId
     * @return 用户信息
     */
    UserSysPojo findByOpenId(String open_id);
}
