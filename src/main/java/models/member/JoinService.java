package models.member;

import controllers.member.UserForm;

public class JoinService {
    private UsersDao usersDao;
    private JoinValidator validator;

    public JoinService(UsersDao usersDao, JoinValidator validator) {
        this.usersDao = usersDao;
        this.validator = validator;
    }

    public void join(UserForm userForm) {

        // 유효성 검사
        validator.check(userForm);

        // 유효성 검사 성공시 DB 처리
        boolean result = usersDao.register(userForm);
    }
}
