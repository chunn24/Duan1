/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class DAte {
    static SimpleDateFormat formater = new SimpleDateFormat();
    
    // Chuyển chuỗi thành ngày.
    public static Date toDate(String date, String pattern){
        try{
            formater.applyPattern(pattern);
            return formater.parse(date);
        }catch(ParseException ex){
            throw new RuntimeException(ex);
        }
    }
    
    // Chuyển ngày thành một chuỗi
    public static String toString(Date date, String pattern){
        formater.applyPattern(pattern);
        return formater.format(date);
    }
    
    // Di chuyển đến một thời gian cách days ngày
    public static Date addDays(Date date, long days){
        date.setTime(date.getTime() + days*24*60*60*1000);
        return date;
    }
}
