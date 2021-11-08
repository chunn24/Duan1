/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import com.edusys.Helper.JdbcConnect;
import com.edusys.Modal.HocVien;
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
public class HocVienDAO extends systemDAO<HocVien, String>{
    
    String INSERT_SQL = "INSERT INTO HocVien(MaKH, MaNH, Diem) VALUES (?, ?, ?)";
    String UPDATE_SQL = "UPDATE HocVien SET MaKH = ?, MaNH = ?, Diem = ? WHERE MaHV = ?";
    String DELETE_SQL = "DELETE FROM HocVien WHERE MaHV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM HocVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM HocVien WHERE MaHV = ?";

    @Override
    public void insert(HocVien entity) {
        try {
            JdbcConnect.update(INSERT_SQL, entity.getMaKH(), entity.getMaNH(), entity.getDiem());
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(HocVien entity) {
        try {
            JdbcConnect.update(UPDATE_SQL, entity.getMaKH(), entity.getMaNH(), entity.getDiem(), entity.getMaHV());
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        try {
            JdbcConnect.update(DELETE_SQL, id);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public HocVien selectById(String id) {
        List<HocVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HocVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<HocVien> selectBySql(String sql, Object... args) {
        List<HocVien> list = new ArrayList<HocVien>();
        try{
            ResultSet rs = JdbcConnect.query(sql, args);
            while(rs.next()){
                HocVien entity = new HocVien();
                entity.setMaHV(rs.getInt("MaHV"));
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaNH(rs.getString("MaNH"));
                entity.setDiem(rs.getDouble("Diem"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    public List<HocVien> selectByKhoaHoc(int makh){
        String sql = "SELECT * FROM HocVien WHERE MaKH = ?";
        return this.selectBySql(sql, makh);
    }
}
