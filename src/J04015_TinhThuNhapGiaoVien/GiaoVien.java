/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04015_TinhThuNhapGiaoVien;

/**
 *
 * @author admin
 */
public class GiaoVien {
    private String ma;
    private String hoten;
    private int lcb;
    private int phucap;
    private int thunhap;
    private int heso;

    public GiaoVien() {
    }

    public GiaoVien(String ma, String hoten, int lcb, int phucap, int heso) {
        this.ma = ma;
        this.hoten = hoten;
        this.lcb = lcb;
        this.phucap = phucap;
        this.heso = heso;
        this.thunhap = lcb*heso + phucap;
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + heso + " " + phucap + " " + thunhap;
    }

    
}
