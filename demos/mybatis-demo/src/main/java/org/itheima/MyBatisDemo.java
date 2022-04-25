package org.itheima;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.itheima.pojo.WeatherRecord;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisDemo {

    public static void main(String[] args) throws IOException {

        // 1. load mybatis settings, get sql session factory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. load sql session object to execute sql
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. execute sql
        List<WeatherRecord> records = sqlSession.selectList("test.selectAll");
        System.out.println(records);

        // 4. release resource
        sqlSession.close();
    }
}
