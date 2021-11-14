/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.dao;

import com.farmsys.DTO.CayTrong;
import com.farmsys.DTO.NhatKy;
import com.farmsys.Helper.JdbcHelper;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class NhatKyDAO extends FarmSysDAO<NhatKy, String> {

    String INSERT_SQL = "INSERT INTO NhatKy (TenCV, TenCay, TenGian, ChiTiet, NguoiTao, Nhanvien, NgayBatDau, NgayKetThuc, TrangThai) VALUES(?,?,?,?,?,?,?,?,?)";
    String select_all_sql = "select*from NhatKy";
    String select_by_ten_sql = "select * from NhatKy where STT = ?";
    String select_by_trangthai_sql = "select * from NhatKy where TrangThai = ?";
    String select_by_tennv_sql = "select * from NhatKy where TrangThai = ? and Nhanvien like ?";
    String UPDATE_Done_SQL = "UPDATE NhatKy SET TrangThai = 3 where STT = ?";
    String UPDATE_SQL = "UPDATE NhatKy SET TrangThai = 1 where STT = ?";
    String UPDATE_TuChoi_SQL = "UPDATE NhatKy SET TrangThai = 2 where STT = ?";

    @Override
    public void insert(NhatKy entity) {
        try {
            JdbcHelper.update(INSERT_SQL, entity.getTenCV(), entity.getTenCay(), entity.getTenGian(), entity.getChiTiet(), entity.getNguoiTao(), entity.getNhanVien(), entity.getNgayBatDau(), entity.getNgayKetThuc(), entity.getTrangThai());
        } catch (SQLException ex) {
            Logger.getLogger(CayTrongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(int entity) {
        try {
            JdbcHelper.update(UPDATE_SQL, entity);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateTuChoi(int entity) {
        try {
            JdbcHelper.update(UPDATE_TuChoi_SQL, entity);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public List<NhatKy> selectAll() {
        return selectBySql(select_all_sql);
    }

    public void updateTrangThai(int stt) {
        try {
            JdbcHelper.update(UPDATE_Done_SQL, stt);
        } catch (SQLException ex) {
            Logger.getLogger(NhatKyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public NhatKy selectById(String macv) {
        List<NhatKy> list = this.selectBySql(select_by_ten_sql, macv);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public NhatKy selectById(Integer macv) {
        List<NhatKy> list = this.selectBySql(select_by_ten_sql, macv);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<NhatKy> selectByTen(String tencv) {
        return selectBySql(select_by_ten_sql, tencv);
    }

    public List<NhatKy> selectByTrangThai(int trangthai) {
        return selectBySql(select_by_trangthai_sql, trangthai);
    }

    public List<NhatKy> selectByTrangThaiAndTenNv(int trangthai, String tennv) {
        return selectBySql(select_by_tennv_sql, trangthai, tennv);
    }

    @Override
    protected List<NhatKy> selectBySql(String sql, Object... args) {
        List<NhatKy> list = new ArrayList<NhatKy>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                NhatKy entity = new NhatKy();//Tạo đối tượng NhatKy
                entity.setStt(rs.getInt("STT"));
                entity.setTenCV(rs.getString("TenCV"));
                entity.setTenCay(rs.getString("TenCay"));
                entity.setTenGian(rs.getString("TenGian"));
                entity.setChiTiet(rs.getString("ChiTiet"));
                entity.setNguoiTao(rs.getString("NguoiTao"));
                entity.setNhanVien(rs.getString("NhanVien"));
                entity.setNgayBatDau(rs.getDate("NgayBatDau"));
                entity.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                entity.setTrangThai(rs.getInt("TrangThai"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void update(NhatKy entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
