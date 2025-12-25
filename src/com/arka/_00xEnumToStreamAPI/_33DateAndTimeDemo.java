package com.arka._00xEnumToStreamAPI;


public class _33DateAndTimeDemo {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println(date);
        long time = date.getTime();//returns time in ms
        System.out.println(time);

        java.sql.Date sdate = new java.sql.Date(time); //pass time in ms in long format
        System.out.println(sdate);
    }
}
