package userfind.service.impl;

import userfind.dao.UserDao;
import userfind.dao.impl.UserDaoImpl;
import userfind.domain.User;
import userfind.service.UserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        //调用Dao完成查询
        return dao.findAll();
    }

    @Override
    public User loginBynameAndBypassword(User user) throws SQLException {
        return dao.loginByNameAndPassword(user);
    }
}
