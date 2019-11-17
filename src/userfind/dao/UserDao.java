package userfind.dao;

import userfind.domain.User;

import java.sql.SQLException;
import java.util.List;

/**
 * 用户操作的DAO
 */
public interface UserDao {


    public List<User> findAll();
    public User loginByNameAndPassword(User user) throws SQLException;
}
