package com.ion;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.javassist.tools.framedump;

/**
 * causalTest
 */
public class causalTest {

    public static void main(String[] args) {
        Date da=new Date();
        SimpleDateFormat sf=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
      
        

        
        System.out.println(sf.format(da));
    }
    }