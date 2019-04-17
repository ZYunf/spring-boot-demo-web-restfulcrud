package com.zyunf.springboot.util;

import java.util.Scanner;

/**
 * @Author: Yunf
 * @Date: 2019/3/22 18:13
 * @ProjectName: spring-boot-demo-web-restfulcrud
 * @PackageName: com.zyunf.springboot.util
 */
public class TrimBank {
    public static void main(String[] args) {
       String data="(\n" +
               "'1110000',\n" +
               "'1120000',\n" +
               "'1130000',\n" +
               "'1140000',\n" +
               "'1150000',\n" +
               "'1210000',\n" +
               "'1220000',\n" +
               "'1230000',\n" +
               "'1310000',\n" +
               "'1320000',\n" +
               "'1330000',\n" +
               "'1340000',\n" +
               "'1350000',\n" +
               "'1360000',\n" +
               "'1370000',\n" +
               "'1410000',\n" +
               "'1420000',\n" +
               "'1430000',\n" +
               "'1440000',\n" +
               "'1450000',\n" +
               "'1460000',\n" +
               "'1500000',\n" +
               "'1520000',\n" +
               "'1530000',\n" +
               "'1540000',\n" +
               "'1610000',\n" +
               "'1620000',\n" +
               "'1630000',\n" +
               "'1640000',\n" +
               "'1650000',\n" +
               "'1900000',\n" +
               "'1910000',\n" +
               "'1920000',\n" +
               "'1930000',\n" +
               "'1940000')";
        data = data.replaceAll("\r|\n|\t", "");
        data=data.replaceAll(" ","" );
        data=data.replace("elseif","else if" );
        System.out.println(data);

    }


}
