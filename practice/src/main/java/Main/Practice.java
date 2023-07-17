package Main;
import objects.*;
import smallPrograms.*;


import java.util.Scanner;

public class Practice {

    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scan = new Scanner(System.in);
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        System.out.println("Enter the numerator for fraction 1");
        f1.setNum(scan.nextInt());
        System.out.println("Enter the denominator for fraction 1");
        f1.setDen(scan.nextInt());
        System.out.println("Enter the numerator for fraction 2");
        f2.setNum(scan.nextInt());
        System.out.println("Enter the denominator for fraction 2");
        f2.setDen(scan.nextInt());
        
        Fraction check1 = (Fraction) f1.clone();
        Fraction check2 = (Fraction) f2.clone();
        check1.reduce();
        check2.reduce();
        
        if(check1.equals(check2)){
            System.out.println(f1.toString() + " = " + f2.toString());
        }
        else{
            System.out.println(f1.toString() + " != " + f2.toString());
        
    }
      
        
    }
}

