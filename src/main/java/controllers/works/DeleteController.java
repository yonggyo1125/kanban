package controllers.works;

import commons.UrlUtils;
import controllers.Controller;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.works.InfoService;
import models.works.WorkServiceManager;

import static commons.ScriptUtils.alertError;

public class DeleteController implements Controller {
    @Override
    public void get(HttpServletRequest req, HttpServletResponse resp) {
        try {
            InfoService infoService = WorkServiceManager.getInstance().infoService();
            long workNo = UrlUtils.getPatternData(req, "delete/(\\d*)");

        } catch (Exception e) {
            alertError(resp, e, -1);
        }
    }

    @Override
    public void post(HttpServletRequest req, HttpServletResponse resp) {

    }


}
