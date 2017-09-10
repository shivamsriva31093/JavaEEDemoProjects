package com.example.servlets;

import model.User;
import util.DBCon;
import util.services.UserAuthService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sHIVAM on 9/10/2017.
 */
@WebServlet(name = "AuthServlet", urlPatterns = "/auth")
public class AuthServlet extends HttpServlet {

    private static final String AUTH_SUCCESS = "success.jsp";
    private static final String AUTH_FAILURE = "failure.jsp";

    @Override
    public void init() throws ServletException {
        super.init();
        DBCon.init();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String pwd  = request.getParameter("pwd");

        System.out.println(uname+" and "+ pwd);

        User user = authenticate(uname, pwd);

        String forward;
        if(user != null) {
            createNewOrContinueSession();
            forward = AUTH_SUCCESS;
        } else {
            forward = AUTH_FAILURE;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
        dispatcher.forward(request, response);
    }

    private void createNewOrContinueSession() {

    }

    private User authenticate(String uname, String pwd) {
        return new UserAuthService().validateUser(uname, pwd);
    }
}
