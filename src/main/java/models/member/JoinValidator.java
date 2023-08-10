package models.member;

import validators.Validator;

public class JoinValidator implements Validator<Users> {
    private UsersDao usersDao;

    public JoinValidator(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public void check(Users users) {

    }
}
