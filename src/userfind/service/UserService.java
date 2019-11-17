package userfind.service;

import userfind.domain.User;

import java.sql.SQLException;
import java.util.List;

/**
 * 用户管理的业务接口
 */
public interface UserService {

    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();

    public User loginBynameAndBypassword(User user) throws SQLException;
}
