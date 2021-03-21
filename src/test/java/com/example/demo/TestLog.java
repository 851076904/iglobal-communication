package com.example.demo;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

public class TestLog {
    //默认是放在在src目录下
    public static Logger logger  =  Logger.getLogger(TestLog. class );

    @Test
    public void loggerTest(){
        logger.debug( " debug " );
        logger.error( " error " );
        logger.info( " info" );
    }
}
