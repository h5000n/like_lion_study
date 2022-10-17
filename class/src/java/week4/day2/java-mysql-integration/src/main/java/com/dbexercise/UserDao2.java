package com.dbexercise;

import java.sql.*;
import java.util.Map;

public class UserDao2 {
    public void add() throws ClassNotFoundException, SQLException {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST"); //보안을 위해서 환경변수를 받아서 사용(로컬에서만 돌기 때문에 안전해진다.)
        String dbUser= env.get("DB_USER");
        String dbPassword= env.get("DB_PASSWORD");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(dbHost, dbUser, dbPassword);
        PreparedStatement ps = conn.prepareStatement("INSERT INTO users(id, name, password) VALUE(?, ?, ?)");
        ps.setString(1,"2");
        ps.setString(2,"hyeon");
        ps.setString(3,"hello");

        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao2 userDao2 = new UserDao2();
        userDao2.add();
    }
}
