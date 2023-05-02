/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04015_TinhThuNhapGiaoVien;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static int phucap(String s){
        if(s.compareTo("HT")== 0) return 2000000;
        if(s.compareTo("HP")== 0) return 900000;
        if(s.compareTo("GV")== 0) return 500000;
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String maphucap = ma.substring(0,2);
        int phucap = phucap(maphucap);
        
        int heso = Integer.parseInt(ma.substring(2));
        String hoten = sc.nextLine();
        int lcb = sc.nextInt();
        
        GiaoVien gv = new GiaoVien(ma, hoten, lcb, phucap, heso);
        System.out.println(gv);
    }
}
