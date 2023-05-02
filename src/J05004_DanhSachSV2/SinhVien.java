/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05004_DanhSachSV2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author admin
 */
public class SinhVien {
    private String ma;
    private String hoten;
    private Date ngaysinh;
    private String lop;
    private float gpa;

    public SinhVien(int id, String hoten,String lop, String ngaysinh, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", id);
        this.hoten = chuanHoa(hoten);
        this.ngaysinh = new SimpleDateFormat("dd/mm/yyyy").parse(ngaysinh);
        this.lop = lop;
        this.gpa = gpa;
    }
    
    private String chuanHoa(String s){
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            sb.append(Character.toUpperCase(t.charAt(0)));
            for(int i=1; i<t.length(); i++){
                sb.append(Character.toLowerCase(t.charAt(i)));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + lop + " " + new SimpleDateFormat("dd/mm/yyyy").format(ngaysinh) 
                + " " + String.format("%.2f", gpa);
    }
    
    
}
