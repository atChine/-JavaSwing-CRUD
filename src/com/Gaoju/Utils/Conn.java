package com.Gaoju.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ClassName: Conn
 * @Description: TODO
 * @Author: 高举
 * @Date: 2021/11/26 19:51
 * @URL：https://github.com/GaoHaiNB
 */
/*
 * 数据库连接
 */
public  class  Conn {
    public static Connection getCon() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school",
                "root", "123");
        return con;
    }
}
