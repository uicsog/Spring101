package com.in28min.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

    public static final String ERROR_MESSAGE = "errorMessage";

    private LoginService userValidationService = new LoginService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        boolean isValidUser = userValidationService.validateUser(name, password);

        if (isValidUser) {
            request.getSession().setAttribute("name", name);
            response.sendRedirect("/list-todo.do");
        } else {
            request.setAttribute(ERROR_MESSAGE, "Invalid Credentials!!");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward (request, response);
        }
    }

}