/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author admin
 */
public class J07004_SoKhacNhauTrongFile1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeSet<Integer> ts = new TreeSet<>();
        int a[] = new int[1001];
        
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.next());
            ts.add(n);
            a[n]++;
        }
        for(Integer x: ts){
            System.out.println(x + " " + a[x]);
        }
    }
}
