package cn.huiounet.miniapp.dao;

import cn.huiounet.miniapp.pojo.UserSysPojo;
import tk.mybatis.mapper.common.Mapper;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/3 10:07
 */
public interface UserSysPojoDao extends Mapper<UserSysPojo> {
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
