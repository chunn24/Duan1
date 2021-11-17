/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmsys.DTO;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class KhoHang {
    private String TenDan;
    private String TenCay;
    private int TrongLuong;
    private Date NgayTH;
    private float GiaThanh;
    
    public KhoHang(){
        
    }

    public KhoHang(String TenDan, String TenCay, int TrongLuong, Date NgayTH, float GiaThanh) {
        this.TenDan = TenDan;
        this.TenCay = TenCay;
        this.TrongLuong = TrongLuong;
        this.NgayTH = NgayTH;
        this.GiaThanh = GiaThanh;
    }

    public String getTenDan() {
        return TenDan;
    }

    public void setTenDan(String TenDan) {
        this.TenDan = TenDan;
    }

    public String getTenCay() {
        return TenCay;
    }

    public void setTenCay(String TenCay) {
        this.TenCay = TenCay;
    }

    public int getTrongLuong() {
        return TrongLuong;
    }

    public void setTrongLuong(int TrongLuong) {
        this.TrongLuong = TrongLuong;
    }

    public Date getNgayTH() {
        return NgayTH;
    }

    public void setNgayTH(Date NgayTH) {
        this.NgayTH = NgayTH;
    }

    public float getGiaThanh() {
        return GiaThanh;
    }

    public void setGiaThanh(float GiaThanh) {
        this.GiaThanh = GiaThanh;
    }
    
}
