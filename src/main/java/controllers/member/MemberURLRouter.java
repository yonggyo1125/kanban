package controllers.member;

import controllers.URLRouter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberURLRouter implements URLRouter {
    @Override
    public void route(HttpServletRequest request, HttpServletResponse response, String location) {
        String mode = getMode(request.getRequestURI(), "member");

        if (mode == null || mode.isBlank()) {
            return;
        }

        String method = request.getMethod().toUpperCase(); //  요청 메서드

        if (mode.equals("join")) { // 회원가입

        } else if (mode.equals("login")) { //로그인 

        } else if (mode.equals("info")) { // 회원정보 확인
            
        }
    }

}
