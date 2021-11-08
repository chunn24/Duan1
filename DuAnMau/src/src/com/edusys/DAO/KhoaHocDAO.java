/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.DAO;

import com.edusys.Helper.JdbcConnect;
import com.edusys.Modal.KhoaHoc;
import com.edusys.Modal.KhoaHoc;
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
public class KhoaHocDAO extends systemDAO<KhoaHoc, String>{
    
    String INSERT_SQL = "INSERT INTO KhoaHoc(MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV)" +
                        "VALUES(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE KhoaHoc SET MaCD = ?, HocPhi = ?, ThoiLuong = ?, NgayKG = ?, " +
                        "GhiChu = ?, MaNV = ? WHERE MaKH = ?";
    String DELETE_SQL = "DELETE FROM KhoaHoc WHERE MaKH = ?";
    String SELECT_ALL_SQL = "SELECT * FROM KhoaHoc";
    String SELECT_BY_ID_SQL = "SELECT * FROM KhoaHoc WHERE MaKH = ?";

    @Override
    public void insert(KhoaHoc entity) {
        try {
            JdbcConnect.update(INSERT_SQL, entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getNgayKG(),
                    entity.getGhiChu(), entity.getMaNV());
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

    @Override
    public void update(KhoaHoc entity) {
        try {
            JdbcConnect.update(UPDATE_SQL, entity.getMaCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getNgayKG(),
                    entity.getGhiChu(), entity.getMaNV(), entity.getMaKH());
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
    public KhoaHoc selectById(String id) {
        List<KhoaHoc> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<KhoaHoc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<KhoaHoc> selectBySql(String sql, Object... args) {
        List<KhoaHoc> list = new ArrayList<KhoaHoc>();
        try{
            ResultSet rs = JdbcConnect.query(sql, args);
            while(rs.next()){
                KhoaHoc entity = new KhoaHoc();
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaCD(rs.getString("MaCD"));
                entity.setHocPhi(rs.getDouble("HocPhi"));
                entity.setThoiLuong(rs.getInt("ThoiLuong"));
                entity.setNgayKG(rs.getDate("NgayKG"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayTao(rs.getDate("NgayTao"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    public List<KhoaHoc> selectByChuyenDe(String macd){
        String sql = "SELECT * FROM KhoaHoc Where MaCD = ?";
        return this.selectBySql(sql, macd);
    }
    public List<String> selectByChuyenDe_MaKH(String macd){
        String sql = "SELECT Cast(MaKH as varchar(50))+'.'+A.MaCD+' ('+Cast(NgayKG as varchar(50))+')' From KhoaHoc A\n" +
                     "join ChuyenDe B on a.MaCD = B.MaCD where A.MaCD = ?";
        List<String> list = new ArrayList<>();
        try{
            ResultSet rs = JdbcConnect.query(sql,macd);
            while(rs.next()){
                list.add(rs.getString(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<String> selectByChuyenDe_MaKH(){
        String sql = "SELECT Cast(MaKH as varchar(50))+'.'+A.MaCD+' ('+Cast(NgayKG as varchar(50))+')' From KhoaHoc A\n" +
                     "join ChuyenDe B on a.MaCD = B.MaCD";
        List<String> list = new ArrayList<>();
        try{
            ResultSet rs = JdbcConnect.query(sql);
            while(rs.next()){
                list.add(rs.getString(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Integer> selectYears(){
        String sql = "SELECT DISTINCT year(NgayKG) FROM KhoaHoc ORDER BY Year(NgayKG) DESC";
        List<Integer> list = new ArrayList<>();
        try{
            ResultSet rs = JdbcConnect.query(sql);
            while(rs.next()){
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }
}
