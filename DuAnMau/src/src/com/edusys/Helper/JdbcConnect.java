/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class JdbcConnect {
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String dburl = "jdbc:sqlserver://localhost;database=Polypro";
    static String user = "sa";
    static String password = "123";
    static{
        try{
            Class.forName(driver);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    
    public static void ConnectDAO(){
        try{
            Connection conn = DriverManager.getConnection(dburl, user, password);
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException{
        Connection conn = DriverManager.getConnection(dburl, user, password);
        PreparedStatement stmt;
        if(sql.trim().startsWith("{")){
            stmt = conn.prepareCall(sql); //PROC
        }else{
            stmt = conn.prepareStatement(sql); // SQL
        }
        for(int i = 0; i< args.length; i++){
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }
    public static int update(String sql, Object... args) throws SQLException{
        try{
            PreparedStatement stmt = JdbcConnect.getStmt(sql, args);
            try{
                return stmt.executeUpdate();
            }finally{
                stmt.getConnection().close();
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    public static ResultSet query(String sql, Object... args) throws SQLException{
        PreparedStatement stmt = JdbcConnect.getStmt(sql,args);
        return stmt.executeQuery();
    }
    public static Object value(String sql, Object... args){
        try{
            ResultSet rs = JdbcConnect.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
