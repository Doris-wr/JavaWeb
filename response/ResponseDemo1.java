package response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author:wangrui
 * @Date:2020/4/7 8:08
 */
@WebServlet("/responseDemo1")
public class ResponseDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo1被访问了");
       /* //访问/responseDemo1，会自动跳转到responseDemo2找资源
        //1.设置状态码为302
        response.setStatus(302);
        ///2.设置响应头location
        response.setHeader("location","/Servlet/responseDemo2");*/
        //简单的重定向
        response.sendRedirect("/Servlet/responseDemo2");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
