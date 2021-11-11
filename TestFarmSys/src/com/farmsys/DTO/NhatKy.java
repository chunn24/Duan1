/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.DTO;

import java.util.Date;

/**
 *
 * @author trieu
 */
public class NhatKy {
    private int stt;
    private String tenCV; 
    private String TenCay;
    private String TenGian;
    private String chiTiet;
    private String nguoiTao;
    private String nhanVien;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private int trangThai; // 0: to do , 1:doing , 2:Từ chối , 3:Hoàn thành , 4:Hoàn thành + trễ

    @Override
    public String toString() {
        return this.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public NhatKy() {
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public String getTenCay() {
        return TenCay;
    }

    public void setTenCay(String TenCay) {
        this.TenCay = TenCay;
    }

    public String getTenGian() {
        return TenGian;
    }

    public void setTenGian(String TenGian) {
        this.TenGian = TenGian;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public String getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(String nhanVien) {
        this.nhanVien = nhanVien;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public NhatKy(int stt, String tenCV, String TenCay, String TenGian, String chiTiet, String nguoiTao, String nhanVien, Date ngayBatDau, Date ngayKetThuc, int trangThai) {
        this.stt = stt;
        this.tenCV = tenCV;
        this.TenCay = TenCay;
        this.TenGian = TenGian;
        this.chiTiet = chiTiet;
        this.nguoiTao = nguoiTao;
        this.nhanVien = nhanVien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
    }

    
    
}