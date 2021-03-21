package com.example.demo;

import org.apache.log4j.Logger;

public class TestLog {

    //默认是放在在src目录下
    public static Logger logger  =  Logger.getLogger(TestLog. class );

    public static void main(String[] args){

        logger.debug( " debug " );
        logger.error( " error " );
        logger.info( " info" );
    }
}
