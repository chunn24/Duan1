/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.dao;

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
 * @author trieu
 */
public class NhanVienDAO extends FarmSysDAO<NhanVien, String> {

    String INSERT_SQL = "INSERT INTO NhanVien(MaNV, MatKhau, HoTen, GioiTinh, Email, Luong, VaiTro, Hinh) VALUES(?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NhanVien SET MatKhau=?,HoTen=?,GioiTinh=?,Email=?, Luong=?, VaiTro=?, Hinh=? WHERE MaNV=?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV=?";
    String SELECT_ALL_SQL = "SELECT *FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV=?";
    String SELECT_BY_Email_SQL = "SELECT * FROM NhanVien WHERE Email=?";
    String RESET_PASS_SQL = "UPDATE NhanVien SET MatKhau=? WHERE MaNV=?";

    @Override
    public void insert(NhanVien entity) {
        try {
            JdbcHelper.update(INSERT_SQL, entity.getMaNV(), entity.getMatKhau(), entity.getHoTen(), entity.isGioiTinh(), entity.getEmail(), entity.getLuong(), entity.isVaiTro(), entity.getHinh());
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(NhanVien entity) {
        try {
            JdbcHelper.update(UPDATE_SQL, entity.getMatKhau(), entity.getHoTen(), entity.isGioiTinh(), entity.getEmail(), entity.getLuong(), entity.isVaiTro(), entity.getHinh(), entity.getMaNV());
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String key) {
        try {
            JdbcHelper.update(DELETE_SQL, key);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String key) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public NhanVien selectByEmail(String key) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_Email_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setEmail(rs.getString("Email"));
                entity.setLuong(rs.getInt("Luong"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                entity.setHinh(rs.getString("Hinh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void resetPass(NhanVien entity) {
        try {
            JdbcHelper.update(RESET_PASS_SQL, entity.getMatKhau(), entity.getMaNV());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
