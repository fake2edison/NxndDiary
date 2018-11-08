package Servlet;

import dao.UserDao;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by fake2edison on 2018/11/1.
 */
@WebServlet(name = "login")
public class register extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        // TODO Auto-generated method stub
        UserDao userDao = new UserDao();
        String str_Name = request.getParameter("username");
        String str_NewName = new String(str_Name.getBytes("ISO-8859-1"), "UTF-8");
        String str_Tele = request.getParameter("phoneNum");
        String str_PassWD = request.getParameter("password");
        String result = userDao.regiestUser(str_NewName,str_Tele,str_PassWD);
        out.write(result);
        out.flush();
        out.close();

    }
}
