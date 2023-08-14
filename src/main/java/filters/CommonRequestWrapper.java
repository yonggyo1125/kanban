package filters;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpSession;
import models.member.Users;

public class CommonRequestWrapper extends HttpServletRequestWrapper {

    public CommonRequestWrapper(HttpServletRequest request) {
        super(request);
        
        // 요청 전 공통 처리 부분
        // 로그인 여부
        HttpSession session = request.getSession();
        Users userInfo = (Users)session.getAttribute("users");
        boolean isLogin = userInfo != null;
        request.setAttribute("userInfo", userInfo);
        request.setAttribute("isLogin", isLogin);

    }
}
