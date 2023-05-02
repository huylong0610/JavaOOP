/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05081_DanhSachMatHang;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) throws ParseException{
        ArrayList<MatHang> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=m; i++){
            MatHang mh = new MatHang(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            ds.add(mh);
        }
        Collections.sort(ds);
        for(MatHang x: ds){
            System.out.println(x);
        }
    }
}
