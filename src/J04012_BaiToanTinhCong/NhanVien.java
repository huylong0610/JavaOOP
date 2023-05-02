/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04012_BaiToanTinhCong;

/**
 *
 * @author admin
 */
public class NhanVien {
    private String ma;
    private String hoten;
    private int luong;
    private int songay;
    private int luongthang;
    private String chucvu;
    private int phucap;
    private int thuong;
    private int thunhap;

    public NhanVien(int id, String hoten, int luong, int songay, String chucvu) {
        this.ma = "NV" + String.format("%02d", id);
        this.hoten = hoten;
        this.luong = luong;
        this.songay = songay;
        this.chucvu = chucvu;
    }

    public void setLuongthang(int luongthang) {
        this.luongthang = luongthang;
    }

    public int getPhucap() {
        return phucap;
    }

    public void setPhucap(int phucap) {
        this.phucap = phucap;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public int getThunhap() {
        return thunhap;
    }

    public void setThunhap(int thunhap) {
        this.thunhap = thunhap;
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + luongthang + " " + thuong + " " + phucap + " " + thunhap;
    }
    
    
}
