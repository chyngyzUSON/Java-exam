package com.examApplication.dao;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnectionPool {
    private static BasicDataSource dataSource = new BasicDataSource();

    static {
        try {
            Class.forName("org.postgresql.Driver");
            dataSource.setUrl("jdbc:postgresql://localhost:5432/exam5");
            dataSource.setUsername("postgres");
            dataSource.setPassword("5454");
            dataSource.setInitialSize(20);
            dataSource.setMaxOpenPreparedStatements(100);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException{
        return dataSource.getConnection();
    }
}
