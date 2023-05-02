/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class J07022_LoaiBoSoNguyen {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            try{
                int n = Integer.parseInt(s);
            }catch(Exception e){
                list.add(s);
                Collections.sort(list);
            } 
        }
        for(String x: list){
            System.out.print(x + " ");
        }
    }
}
