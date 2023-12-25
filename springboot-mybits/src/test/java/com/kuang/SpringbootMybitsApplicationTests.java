package com.kuang;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class SpringbootMybitsApplicationTests {

    @Autowired
     DataSource DataSource;

    @Test
    void contextLoads() throws SQLException {
       System.out.println(DataSource.getClass());
       System.out.println(DataSource.getConnection());
    }

}
