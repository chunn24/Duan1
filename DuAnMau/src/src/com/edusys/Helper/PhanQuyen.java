/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Helper;

import com.edusys.Modal.NhanVien;

/**
 *
 * @author ADMIN
 */
public class PhanQuyen {
    public static NhanVien user = null;
    public static void clear(){
        PhanQuyen.user = null;
    }
    public static boolean isLogin(){
        return PhanQuyen.user != null;
    }
    public static boolean isManager(){
        return PhanQuyen.isLogin() && user.getVaiTro();
    }
}
