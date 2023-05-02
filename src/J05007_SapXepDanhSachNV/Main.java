/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05007_SapXepDanhSachNV;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
        public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i=1; i<=n; i++){
            NhanVien nv = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(nv);
        }
        Collections.sort(list);
        for(NhanVien nv: list){
            System.out.println(nv.toString());
        }
    }
}
