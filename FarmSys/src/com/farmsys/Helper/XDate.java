/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.Helper;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author trieu
 */
public class XDate {
    static SimpleDateFormat fomater = new SimpleDateFormat();
    public static Date toDate(String date, String pattern){
        try {
            fomater.applyPattern(pattern);
            return fomater.parse(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static String toString(Date date, String pattern){
        fomater.applyPattern(pattern);
        return fomater.format(date);
    }
    public static Date addDays(Date date, long days){
        date.setTime(date.getTime()+days*24*60*60*1000);
        return date;
    }
}