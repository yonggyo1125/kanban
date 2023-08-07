package models.works;

public class SaveService {
    private WorkDao workDao = new UpgradedWorkDao();

    public void save(Work work) {

        // work 데이터 검증 (유효성 검사)

        workDao.save(work); // 의존

    }
}
