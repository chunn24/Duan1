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
    private int maCV;
    private int tenCV;
    private int maGian;
    private String chiTiet;
    private String nguoiTao;
    private String nhanVien;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private int trangThai;

    @Override
    public String toString() {
        return this.toString();
    }

    public NhatKy() {
    }

    public NhatKy(int maCV, int tenCV, int maGian, String chiTiet, String nguoiTao, String nhanVien, Date ngayBatDau, Date ngayKetThuc, int trangThai) {
        this.maCV = maCV;
        this.tenCV = tenCV;
        this.maGian = maGian;
        this.chiTiet = chiTiet;
        this.nguoiTao = nguoiTao;
        this.nhanVien = nhanVien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.trangThai = trangThai;
    }

    public int getMaCV() {
        return maCV;
    }

    public void setMaCV(int maCV) {
        this.maCV = maCV;
    }

    public int getTenCV() {
        return tenCV;
    }

    public void setTenCV(int tenCV) {
        this.tenCV = tenCV;
    }

    public int getMaGian() {
        return maGian;
    }

    public void setMaGian(int maGian) {
        this.maGian = maGian;
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
    
    
}
