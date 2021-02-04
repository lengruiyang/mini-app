package cn.huiounet.miniapp.dao;

import cn.huiounet.miniapp.pojo.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/3 19:35
 */
public interface UserDao extends Mapper<User> {

    User findByUserName(String username);
}
