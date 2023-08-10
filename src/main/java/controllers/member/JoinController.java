package controllers.member;

import commons.ViewUtils;
import controllers.Controller;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.member.JoinService;
import models.member.MemberServiceManager;

import static commons.ScriptUtils.alertError;

public class JoinController implements Controller {
    public void get(HttpServletRequest req, HttpServletResponse resp) {

        ViewUtils.load(req, resp, "member", "join");
    }

    public void post(HttpServletRequest req, HttpServletResponse resp) {
        JoinService joinService = MemberServiceManager.getInstance().joinService();

        try {
            joinService.join(req);

        } catch (Exception e) {
            alertError(resp, e);
        }
    }
}
