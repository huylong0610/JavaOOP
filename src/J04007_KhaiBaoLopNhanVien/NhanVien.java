/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04007_KhaiBaoLopNhanVien;

/**
 *
 * @author admin
 */
public class NhanVien {
    private String ma, hoten, gioitinh, ngaysinh, diachi, masothue, day;

    public NhanVien() {
    }

    public NhanVien(String hoten, String gioitinh, String ngaysinh, String diachi, String masothue, String day) {
        this.ma = "00001";
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.masothue = masothue;
        this.day = day;
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + gioitinh + " " + ngaysinh + " " + diachi + " " + masothue + " " + day;
    }
    
    
}
