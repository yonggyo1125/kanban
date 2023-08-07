package controllers.member;

import controllers.Controller;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LoginController implements Controller  {
    public void get(HttpServletRequest req, HttpServletResponse resp) {
        try {
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/member/login.jsp");
            rd.forward(req, resp);
        } catch (Exception e) {}
    }

    public void post(HttpServletRequest req, HttpServletResponse resp) {

    }
}
