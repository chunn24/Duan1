/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmsys.Helper;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author trieu
 */
public class XImage {

    public static Image getAppIcon() {
        URL url = XImage.class.getResource("com/farmsys/icons/avatar.png");
        return new ImageIcon(url).getImage();
        //Lấy địa chỉ hình ảnh và tạo ảnh --> return
    }

    public static void save(File src) {
        File dst = new File("logos", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdir();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(src.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    
    public static boolean saveImage(File file) {
        File dir = new File("logos");
        // Tạo thư mục nếu chưa tồn tại
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File newFile = new File(dir, file.getName());
        try {
            // Copy vào thư mục logos (đè nếu đã tồn tại)
            Path source = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(newFile.getAbsolutePath());
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static ImageIcon read(String fileName) {
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }

//    public static Image getAppIcon(){
//        URL url = XImage.class.getResource("/com/edusys/Icon/ong.jpg");
//        return new ImageIcon(url).getImage();
//    }
//    public static void save(File src){
//        File dst = new File("logos", src.getName());
//        if(!dst.getParentFile().exists()){
//            dst.getParentFile().mkdirs();
//        }
//        try{
//            Path from = Paths.get(src.getAbsolutePath());
//            Path to = Paths.get(dst.getAbsolutePath());
//            Files.copy(from, to,StandardCopyOption.REPLACE_EXISTING);
//        }catch(Exception ex){
//            throw new RuntimeException(ex);
//        }
//    }
//    public static ImageIcon read(String fileName){
//        File path = new File("logos", fileName);
//        return new ImageIcon(path.getAbsolutePath());
//    }
//    
}
