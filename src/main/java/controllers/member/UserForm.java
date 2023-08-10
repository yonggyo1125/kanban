package controllers.member;

import lombok.Data;

@Data
public class UserForm {
    private long userNo;
    private String userId;
    private String userPw;
    private String userPwRe;
    private String userNm;
    private String email;
    private String mobile;
    private boolean agree;
}
