package demo;

import java.util.Scanner;

public class Calculator {
    public static int addition(int a, int b){
        return a+b;
    }
    public static int subtraction(int a, int b){
        return a-b;
    }
    public static int product(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        if(b!=0)
            return a/b;
        else
            throw new ArithmeticException();
    }

    public static void main(String args[]){
        int a,b,option;
        System.out.println("enter 2 numbers:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("enter operation to be perfomed:\n"+"1.Addition\n"+"2.Subtraction\n"+"3.Multiplication\n"+"4.Division");
        option=s.nextInt();
        switch (option){
            case 1:{
                System.out.println("SUM IS : "+(addition(a,b)));
                break;
            }
            case 2: {
                System.out.println("DIFFERNECE IS : "+(subtraction(a,b)));
                break;
            }
            case 3: {
                System.out.println("PRODUCT IS : "+(product(a,b)));
                break;
            }
            case 4: {
                System.out.println("QUOTIENT IS : "+(division(a,b)));
                break;
            }
            default:
                System.out.println("invalid option");
        }

    }
}
