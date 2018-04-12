package com.example.demo.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 1、利用代码注册servlet，在App.java中有@Bean注解
 *
 * 2、利用注解注册servlet，需要@WebServlet，App.java中加入注解@ServletComponentScan
 *
 *
 * Created by zhangwei on 2018/4/10.
 */
@WebServlet(urlPatterns = "/myservlet2/*", description = "注解注册需要这个")
public class MyServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-------------------doGET---------------");
        doPost(req, resp);
    }

    /*
    * 不能super
    * */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------------------doPost---------------");
        //指定输出的数据
        resp.setContentType("text/html");
        //指定编码格式。否则可能会乱码
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>1、代码注册servlet，App.java中加入@Bean</h2>");
        out.println("<h2>2、注解注册servlet，@WebServlet和App.java加入@ServletComponentScan</h2>");
        out.println("</body>");
        out.println("</html>");
    }
}
