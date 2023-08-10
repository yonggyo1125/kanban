package models.member;

import configs.DBConnection;
import org.apache.ibatis.session.SqlSession;

public class UsersDao {
    public boolean register(Users users) {
        SqlSession sqlSession = DBConnection.getSession();

        sqlSession.commit();
    }

    public Users get(String userId) {

    }

    public boolean exists(String userId) {

    }
}
