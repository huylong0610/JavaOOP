/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04012_BaiToanTinhCong;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static int phucap(String s){
        if(s.compareTo("GD") == 0) return 250000;
        if(s.compareTo("PGD") == 0) return 200000;
        if(s.compareTo("TP") == 0) return 180000;
        return 150000;
    }
    
    public static int thuongsongay(int n, int luong){
        if(n >= 25)  return (int) (luong*0.2);
        if(22 <= n && n < 25)   return (int) (luong*0.1);
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String hoten = sc.nextLine();
        int luong = Integer.parseInt(sc.nextLine());
        int songay = Integer.parseInt(sc.nextLine());
        String chucvu = sc.nextLine();
        
        NhanVien nv = new NhanVien(1, hoten, luong, songay, chucvu);
        int luongthang = luong * songay; nv.setLuongthang(luongthang);
        int phucap = phucap(chucvu); nv.setPhucap(phucap);
        int thuong = thuongsongay(songay, luongthang); nv.setThuong(thuong);
        int thunhap = luongthang + thuong + phucap; nv.setThunhap(thunhap);
        
        System.out.println(nv.toString());
    }
}
