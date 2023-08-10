package models.member;

public class JoinService {
    private UsersDao usersDao;
    private JoinValidator validator;

    public JoinService(UsersDao usersDao, JoinValidator validator) {
        this.usersDao = usersDao;
        this.validator = validator;
    }

    public void join(Users users) {
        validator.check(users);
    }
}
