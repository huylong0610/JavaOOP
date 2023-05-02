/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07010_DanhSachSVFile2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class SinhVien {
    private String maSV, hoten, lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id, String hoten, String lop, String ngaysinh, float gpa) throws ParseException {
        this.maSV = "B20DCCN" + String.format("%03d", id);
        this.hoten = hoten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return maSV + " " + hoten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " " 
                + String.format(("%.2f"), gpa);
    }
    
    
}
