package io.ace.jsp.filter;

import javax.servlet.*;
import java.io.IOException;

public class LogFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        String initParameter = filterConfig.getInitParameter("log-param");
        System.out.println("Init  Param : " + initParameter);
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String remoteAddr = servletRequest.getRemoteAddr();
        System.out.println("Remote Address : " + remoteAddr);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {
        System.out.println("LogFilter#destroy method called.");
    }
}
