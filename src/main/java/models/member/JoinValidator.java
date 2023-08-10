package models.member;

import controllers.member.UserForm;
import validators.RequiredValidator;
import validators.Validator;

public class JoinValidator implements Validator<UserForm>, RequiredValidator {
    private UsersDao usersDao;

    public JoinValidator(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public void check(UserForm userForm) {
        /**
         * 1. 필수 항목 검증(userId, userPw, userPwRe, userNm, email, 약관동의)
         * 2. 아이디 중복 여부
         * 3. userPw(비밀번호), userPwRe(비밀번호 확인) 일치
         */

        String userId = users.getUserId();
        String userPw = users.getUserPw();
        //String userPwRe = users.getU
        // 1. 필수 항목 검증

    }
}
