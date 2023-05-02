/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04003_PhanSo;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
   public static long ucln(long a, long b){
        if(a == 0)  
            return b;
        return ucln(b%a, a);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long gcd = ucln(a, b);
        long tuso = a/gcd;
        long mauso = b/gcd;
         
        PhanSo ps = new PhanSo(tuso, mauso);
        System.out.println(ps);
    }
}
