package com;

import com.stx.utils.DruidJDBCUtils;
import org.junit.Test;


import java.sql.Connection;
import java.sql.SQLException;


public class TestDemo {

    @Test
    public void test() throws SQLException {
        Connection connection = DruidJDBCUtils.getConnection();
        System.out.println(connection);
    }
}
