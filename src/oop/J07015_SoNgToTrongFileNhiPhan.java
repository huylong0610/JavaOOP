/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.io.FileInputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class J07015_SoNgToTrongFileNhiPhan {
    public static boolean isPrime(Integer n){
        if(n < 2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0)    return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        int a[] = new int[10000];
        for(Integer i: list){
            if(isPrime(i)){
                a[i]++;
            }
        }
        
        for(int i=0; i<10000; i++){
            if(a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
        
    }
}
