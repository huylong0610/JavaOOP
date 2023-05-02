/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07054_TinhDiemTrungBinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            SinhVien sv = new SinhVien(i, sc.nextLine(), 
                    Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            list.add(sv);
        }
        Collections.sort(list);
        
        int xh = 1;
        list.get(0).setXephang(xh);
        
        for(int i=1; i<n; i++){
            if(list.get(i).getDiemtb() < list.get(i-1).getDiemtb()){
                xh = i+1;
            }
            list.get(i).setXephang(xh);
        }
        
        for(SinhVien sv: list){
            System.out.println(sv.toString());
        }
    }
}
