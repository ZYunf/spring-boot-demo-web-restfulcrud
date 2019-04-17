package com.zyunf.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class  SpringBootDemoWebRestfulcrudApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        logger.trace("这是trace...");
        logger.debug("这是debug...");

        //默认info级别
        logger.info("这个是info");
        logger.warn("这是warning");
        logger.error("这是error");

        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());
    }

}
