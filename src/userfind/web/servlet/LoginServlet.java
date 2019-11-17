package userfind.web.servlet;

import org.apache.commons.beanutils.BeanUtils;
import userfind.domain.User;
import userfind.service.UserService;
import userfind.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String input_code = req.getParameter("verifycode");

        HttpSession session = req.getSession();
        String code = (String)session.getAttribute("code_str");

        if (!input_code.equalsIgnoreCase(code)) {

            req.setAttribute("login_msg","验证码错误");

            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }

        User user = new User();
        Map<String,String[]> map = req.getParameterMap();

        try {
            BeanUtils.populate(user, map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        User loginUser=null;
        UserService userService = new UserServiceImpl();
        try {
            loginUser = userService.loginBynameAndBypassword(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(loginUser!=null){
            resp.sendRedirect(req.getContextPath()+"/index.jsp");
            System.out.println("登录成功");

        }
        else{
            req.setAttribute("login_msg","用户名或者密码错误");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }


    }
}
