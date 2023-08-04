package controllers.member;

import controllers.URLRouter;
import jakarta.servlet.http.HttpServletRequest;

public class MemberURLRouter implements URLRouter {
    @Override
    public void route(String URL, String location) {
        String mode = getMode(URL, location);
        System.out.println(mode);
    }

    public void route(HttpServletRequest request, String location) {
        route(request.getRequestURI(), location);
    }

}
