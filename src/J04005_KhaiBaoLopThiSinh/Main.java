/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04005_KhaiBaoLopThiSinh;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(ts);
    }
}
