package userfind.dao.impl;

import userfind.dao.UserDao;
import userfind.domain.User;
import userfind.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        //使用JDBC操作数据库...
        //1.定义sql
        String sql = "select * from user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));

        return users;
    }

    @Override
    public User loginByNameAndPassword(User user) throws SQLException {
        String sql  = "select username ,password from user where username=? and password=?";
        Connection connection=JDBCUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,user.getUsername());
        preparedStatement.setString(2, user.getPassword());
        ResultSet resultSet=preparedStatement.executeQuery();
        User user1 =null;
        while(resultSet.next()){
                user1=new User();
                user1.setUsername(resultSet.getString(1));
                user1.setPassword(resultSet.getString(2));
        }
        return user1;

    }
}
