package com;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


@WebServlet("/download")
public class Download extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext context = this.getServletContext();
        String filename = req.getParameter("finename");

        resp.setHeader("content-type",context.getMimeType(filename));
        resp.setHeader("content-disposition","attachment;filename="+filename);

        File f = new File(context.getRealPath("/img/"+filename));
        FileInputStream inputStream = new FileInputStream(f);
        ServletOutputStream fileOutputStream = resp.getOutputStream();
        byte[] bytes = new byte[1024 * 10];
        int len=0;
        while ((len=inputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
