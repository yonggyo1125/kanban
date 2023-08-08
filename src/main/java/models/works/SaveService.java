package models.works;

import validators.Validator;

public class SaveService {
    private WorkDao workDao;
    private Validator<Work> validator;

    public SaveService(WorkDao workDao, Validator<Work> validator) {
        this.workDao = workDao;
        this.validator = validator;
    }


    public void save(Work work) {

        // 유효성 검사
        validator.check(work);

        workDao.save(work);

    }
}
