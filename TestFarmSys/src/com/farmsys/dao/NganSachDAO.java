/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmsys.dao;

import com.farmsys.DTO.KhoHang;
import com.farmsys.DTO.NganSach;
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
public class NganSachDAO {
    String INSERT_SQL = "INSERT INTO NganSach (TongNganSach) VALUES(?)";
    String SELECT_ALL_SQL = "select*from NganSach " ;
    String DELETE_SQL = "DELETE FROM NganSach where TongNganSach = ?";
    String UPDATE_SQL = "UPDATE NganSach SET TongNganSach =? WHERE MaNS =?";
    String SELECT_SLBan_SQL = "UPDATE NganSach set TongNganSach = ?  where MaNS = ?";
    
    public List<NganSach> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public void insert(NganSach entity) {
        try {
            JdbcHelper.update(INSERT_SQL, entity.getTongNganSach());
        } catch (SQLException ex) {
            Logger.getLogger(CayTrongDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(NganSach entity) {
        try {
            JdbcHelper.update(UPDATE_SQL, entity.getTongNganSach(), entity.getMaNS());
        } catch (SQLException ex) {
            Logger.getLogger(NganSachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Float TongNganSach, int MaNS) {
        try {
            JdbcHelper.update(SELECT_SLBan_SQL, TongNganSach, MaNS);
        } catch (SQLException ex) {
            Logger.getLogger(NganSachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(String key) {
        try {
            JdbcHelper.update(DELETE_SQL, key);
        } catch (SQLException ex) {
            Logger.getLogger(NganSachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected List<NganSach> selectBySql(String sql, Object... args) {
        List<NganSach> list = new ArrayList <NganSach>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                NganSach entity = new NganSach();
                entity.setMaNS(rs.getInt("MaNS"));
                entity.setTongNganSach(rs.getFloat("TongNganSach"));
                
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
