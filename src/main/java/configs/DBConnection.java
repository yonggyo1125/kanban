package configs;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class DBConnection {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String mode = "dev";
            Reader reader = Resources.getResourceAsReader("mybatis/config/config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader, mode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }
}
