package response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author:wangrui
 * @Date:2020/4/7 9:38
 */
@WebServlet("/responseDemo3")
public class ResponseDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* //获取流对象之前要设置流的默认编码   ：ISO-8859-1设置为：GBK
        response.setCharacterEncoding("GBK");*/
       //告诉浏览器服务器发送消息的体数据的编码，建议浏览器使用该编码解码
        //简单的形式，设置编码—必须要在获取流之前，设置编码
        response.setContentType("text/html;charset=utf-8");
        //1.获取字符输出流
        PrintWriter pw=response.getWriter();
        pw.write("<h1>你好啊啊啊啊<h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
