/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04019_Triangle;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public static Point nextPoint(Scanner sc){
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        Point p = new Point(x, y);
        return p;
    }
}
