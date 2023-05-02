/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05007_SapXepDanhSachNV;

/**
 *
 * @author admin
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class NhanVien implements Comparable<NhanVien>{
    private String ma;
    private String hoten;
    private String gioitinh;
    private Date ngaysinh;
    private String diachi;
    private String masothue;
    private Date ngayki;

    public NhanVien(int id, String hoten, String gioitinh, String ngaysinh, String diachi, String masothue, String ngayki) throws ParseException {
        this.ma = String.format("%05d", id);
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaysinh);
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngayki = new SimpleDateFormat("dd/mm/yyyy").parse(ngayki);
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + gioitinh + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaysinh) 
                + " " + diachi + " " + masothue + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngayki);
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.ngaysinh.compareTo(o.ngaysinh);
    }
    
    
}
