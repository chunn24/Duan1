/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.dao;

import com.farmsys.DTO.GianTrong;
import com.farmsys.DTO.NhanVien;
import com.farmsys.Helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class DanTrongDAO extends FarmSysDAO<GianTrong, String> {

    String INSERT_SQL = "INSERT INTO GianTrong (MaGian, TenGian, TrangThai) VALUES(?,?,?)";
    String UPDATE_SQL = "UPDATE GianTrong SET TenGian =?, TrangThai =? WHERE MaGian =?";
    String DELETE_SQL = "DELETE FROM GianTrong WHERE MaGian =?";
    String SELECT_ALL_SQL = "SELECT * FROM GianTrong";
    String SELECT_BY_ID_SQL = "SELECT * FROM GianTrong WHERE MaGian=?";

    @Override
    public void insert(GianTrong entity) {
        try {
            JdbcHelper.update(INSERT_SQL, entity.getMaDan(), entity.getTenDan(), entity.isTrangThai());
        } catch (SQLException ex) {
            Logger.getLogger(DanTrongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(GianTrong entity) {
        try {
            JdbcHelper.update(UPDATE_SQL, entity.getTenDan(), entity.isTrangThai(), entity.getMaDan());
        } catch (SQLException ex) {
            Logger.getLogger(DanTrongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String key) {
        try {
            JdbcHelper.update(DELETE_SQL, key);
        } catch (SQLException ex) {
            Logger.getLogger(DanTrongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<GianTrong> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public GianTrong selectById(String key) {
        List<GianTrong> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<GianTrong> selectBySql(String sql, Object... args) {
        List<GianTrong> list = new ArrayList<GianTrong>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                GianTrong entity = new GianTrong();
                entity.setMaDan(rs.getInt("MaGian"));
                entity.setTenDan(rs.getString("TenGian"));
                entity.setTrangThai(rs.getBoolean("TrangThai"));               
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
