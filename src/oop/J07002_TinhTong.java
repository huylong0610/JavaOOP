/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J07002_TinhTong {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long tong = 0;   
        while(sc.hasNext()){
            try {
                int n = Integer.parseInt(sc.next());
                tong += n;   
            } catch (NumberFormatException e) {
                continue;
            }
        }
        System.out.println(tong);
    }
}
