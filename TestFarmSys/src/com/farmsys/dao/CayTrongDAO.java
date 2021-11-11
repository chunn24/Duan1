/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.dao;

import com.farmsys.DTO.CayTrong;
import com.farmsys.Helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class CayTrongDAO extends FarmSysDAO<CayTrong, String> {
    String INSERT_SQL = "INSERT INTO LoaiCay(MaCay, TenCay, ThoiGianThuHoach, DoTDS, DoPH, NhietDo, DoAm, Hinh) VALUES(?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE LoaiCay SET TenCay=?, ThoiGianThuHoach=?, DoTDS=?, DoPH=?, NhietDo=?, DoAm=?, Hinh=? WHERE MaCay=?";
    String DELETE_SQL = "DELETE FROM LoaiCay WHERE MaCay=?";
    String SELECT_ALL_SQL = "SELECT *FROM LoaiCay";
    String SELECT_BY_ID_SQL = "SELECT * FROM LoaiCay WHERE MaCay=?";
//    String SELECT_TENCAY = "SELECT TenCay FROM LoaiCay";
    
    @Override
    public void insert(CayTrong entity) {
        try {
            JdbcHelper.update(INSERT_SQL, entity.getMaCay(), entity.getTenCay(), entity.getThoiGianThuHoach(), entity.getDoTDS(), entity.getDoPH(), entity.getNhietDo(), entity.getDoAm(), entity.getAnh());
        } catch (SQLException ex) {
            Logger.getLogger(CayTrongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void update(CayTrong entity) {
        try {
            JdbcHelper.update(UPDATE_SQL,entity.getMaCay(), entity.getTenCay(), entity.getThoiGianThuHoach(), entity.getDoTDS(), entity.getDoPH(), entity.getNhietDo(), entity.getDoAm(), entity.getAnh());
        } catch (SQLException ex) {
            Logger.getLogger(CayTrongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String key) {
        try {
            JdbcHelper.update(DELETE_SQL, key);
        } catch (SQLException ex) {
            Logger.getLogger(CayTrongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<CayTrong> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
    
    
//    public List<CayTrong> selectTENCAY() {
//        return this.selectBySql(SELECT_TENCAY);
//    }

    @Override
    public CayTrong selectById(String key) {
        List<CayTrong> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<CayTrong> selectBySql(String sql, Object... args) {
        List<CayTrong> list = new ArrayList<CayTrong>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                CayTrong entity = new CayTrong();
                entity.setMaCay(rs.getInt("MaCay"));
                entity.setTenCay(rs.getString("TenCay"));
                entity.setThoiGianThuHoach(rs.getInt("ThoiGianThuHoach"));
                entity.setDoTDS(rs.getFloat("DoTDS"));
                entity.setDoPH(rs.getFloat("DoPH"));
                entity.setNhietDo(rs.getInt("NhietDo"));
                entity.setDoAm(rs.getFloat("DoAm"));
                entity.setAnh(rs.getString("Hinh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
