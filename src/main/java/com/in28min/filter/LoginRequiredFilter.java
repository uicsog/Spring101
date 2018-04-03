package com.in28min.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "*.do")
public class LoginRequiredFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        System.out.println("request.getRequestURI() = " + request.getRequestURI());

        if (request.getSession().getAttribute("name") != null) {
            System.out.println("-----------> HAS NAME");
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            System.out.println("-----------> WITHOUT NAME");
            request.getRequestDispatcher("/login.do").forward(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
