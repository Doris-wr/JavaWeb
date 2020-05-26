package servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author:wangrui
 * @Date:2020/4/3 20:50
 */
public class ServletDemo2 implements Servlet {
    /*
     * 功能描述:初始化方法，在Servlet被创建时执行，只会执行一次
     * @return void
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init……");
    }
    /*
     * 功能描述:获取ServletConfig对象
     * ServletConfig：Servlet的配置对象
     * @return javax.servlet.ServletConfig
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    /*
     * 功能描述:提供服务的方法，每一次Servlet被访问时，执行，执行多次
     * @return void
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service……");
    }

    @Override
    public String getServletInfo() {
        return null;
    }
    /*
     * 功能描述:销毁方法，在服务器正常关闭时执行，执行一次。
     * @return
     */
    @Override
    public void destroy() {
        System.out.println("destroy……");
    }
}
