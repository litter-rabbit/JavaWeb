package com;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkimage")
public class CheckImage  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int width=200;
        int height=50;

        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        Graphics g = image.getGraphics();
        g.setColor(Color.PINK);
        g.fillRect(0,0,width,height);
        Random random = new Random();
        String codetemp =  "acbdefgitggdfj1232349ouweqr";
        StringBuilder codestr = new StringBuilder();
        g.setColor(Color.BLACK);
        for(int i=0;i<4;i++){
            int index = random.nextInt(codetemp.length()-1);
            char ch = codetemp.charAt(index);
            codestr.append(ch);
            g.drawString(ch+"",40*(i+1),height/2);

        }
        System.out.println(codestr.toString());
        req.getSession().setAttribute("code_str",codestr.toString());

        ServletOutputStream outputStream  = resp.getOutputStream();
        ImageIO.write(image, "jpg", outputStream);



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
