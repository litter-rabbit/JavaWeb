package com;


import javax.jws.WebService;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLOutput;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("psot");

    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String input_code_str =req.getParameter("code_str");

        String code_str = (String)req.getSession().getAttribute("code_str");
        System.out.println("code_str:  "+code_str);
        if (code_str!=null&&code_str.equals(input_code_str)) {
            //验证码正确
            if("123456".equals(password)){

                resp.sendRedirect("/success.jsp");
                req.getSession().setAttribute("username",username);
                System.out.println("登录成功");

            }
            else{
                req.getRequestDispatcher("/login.jsp").forward(req,resp);
                System.out.println("密码错误");
            }

        }else{

             req.getRequestDispatcher("/login.jsp").forward(req,resp);
            System.out.println("验证码错误");

        }



    }



}
