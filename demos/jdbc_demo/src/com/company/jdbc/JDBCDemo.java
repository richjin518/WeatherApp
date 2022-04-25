package com.company.jdbc;

import java.io.FileInputStream;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Properties;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;

/*
 * JDBC
 */
public class JDBCDemo {

    private static final String begineDateStr = "1999-12-31";

    public static void main(String[] args) throws Exception {
	    // write your code here
        // 1. register driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. got connection from connection pool
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        Connection conn = dataSource.getConnection();

        // 3. sql
        Date todayDate = new Date();
        Date beginDate = new SimpleDateFormat("yyyy-MM-dd").parse(begineDateStr);
        long todayTimeSec = todayDate.getTime();
        long beginTimeSec = beginDate.getTime();
        long hourDiff = (todayTimeSec - beginTimeSec) / (1000 * 60 * 60);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;

        String sql = "INSERT INTO WEATHER VALUES(?, ?, 20.0, 25.0, 'cloudy', 10.4, 42.2, -122.5, 'Beijing', 'Beijing', 'China')";

        // 4. create sql statement
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1, hourDiff);
        pstmt.setString(2, format.format(todayDate));

        // 5. execute sql
        int count = pstmt.executeUpdate(); // impacted row counts

        // 6. final process
        System.out.println(count);

        // 7. release resource
        pstmt.close();
        conn.close();
    }
}
