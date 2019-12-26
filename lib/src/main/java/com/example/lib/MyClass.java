package com.example.lib;
import java.util.Scanner;
public class MyClass {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入淨利:(萬)");
        double income = scanner.nextDouble();
        double bonus = 0;
        if(income<=10){
            bonus=0.1*income;
        }
        else if (income<=20){
            income-=10;
            bonus=1+income*0.075;
        }
        else if (income<=40){
            income-=20;
            bonus=(Double)2.5+income*0.05;//1+1.5
        }
        else if (income<=60){
            income-=40;
            bonus=(Double)3.5+income*0.03;//1+1.5+1
        }
        else if (income<=100){
            income-=60;
            bonus=(Double)4.1+income*0.015;//1+1.5+1+0.6
        }
        else if (income>100){
            income-=100;
            bonus=(Double)4.7+income*(Double)0.015;//1+1.5+1+0.6+0.6
        }
        System.out.println("發放總獎金:"+bonus+"萬");
    }
}