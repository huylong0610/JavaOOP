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
public class J07001_DocFileVanBan {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
