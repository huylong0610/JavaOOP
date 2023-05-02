/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import javax.print.attribute.standard.Sides;

/**
 *
 * @author admin
 */
public class NewClass1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Date ngaysinh1 = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        Date ngaysinh2 = new SimpleDateFormat("dd/MM/yyyy").parse(sc.nextLine());
        
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh1));
    }
}
