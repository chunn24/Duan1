/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.dao;

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

    String UPDATE_SQL = "UPDATE NhatKy SET TrangThai = ? where TenCV = ?";
    String select_all_sql = "select*from NhatKy;";
    String select_by_id_sql = "select * from NhatKy where TenCV = ?";

    @Override
    public void insert(NhatKy entity) {

    }

    @Override
    public void update(NhatKy entity) {
        try {
            JdbcHelper.update(UPDATE_SQL, entity.getTrangThai(),entity.getTenCV());
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

    @Override
    public NhatKy selectById(String macv) {
        List<NhatKy> list = this.selectBySql(select_by_id_sql, macv);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public NhatKy selectById(Integer macv) {
        List<NhatKy> list = this.selectBySql(select_by_id_sql, macv);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
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
                entity.setMaCay(rs.getInt("MaCay"));
                entity.setMaGian(rs.getInt("MaGian"));
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
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
//    public List<NhatKy> selectByTenCV(int tencv){
//        String sql = "SELECT * FROM NhatKy WHERE TenCV = ?";
//        return this.selectBySql(sql, tencv);
//    }

    public List<NhatKy> selectByTrangThai(int trangthai) {
        String sql = "SELECT * FROM NhatKy WHERE TrangThai = ?";
        return this.selectBySql(sql, trangthai);
    }

}
