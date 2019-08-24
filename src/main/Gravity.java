package main;

import java.util.Scanner;

public class Gravity {

    public static void main(String[] args) {
        double t;
        double gr = 9.8;
        double sp;
        double dis;
        Scanner sc = new Scanner(System.in);
        t = sc.nextDouble();
        sp = gr * t;
        dis = .5 * gr * t * t;
        System.out.println("The speed of the object at " + t + " seconds after its release is " + sp + " and the distance the object has travelled " + dis);
    }
}
