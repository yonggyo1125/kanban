package models.works;

import java.util.ArrayList;
import java.util.List;

public enum Status {
    READY("준비중"),
    PROGRESS("진행중"),
    DONE("완료"),
    POSTPONE("보류");

    private String status;

    Status(String status) {
        this.status = status;
    }

    public List<String[]> getList() {
        List<String[]> items = new ArrayList<>();

    }
}
