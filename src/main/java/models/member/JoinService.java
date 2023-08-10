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
        validator.check(userForm);
    }
}
