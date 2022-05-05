package com.mycompany.scientificcalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseCalculator {
    public static void main(String[] args) throws IOException {
        char c,ch0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("Choose calculator:- \n 1. Basic Calculator \n 2. Scientific Calculator \n\n Your choice: ");
            int n=Integer.parseInt(br.readLine());
            switch (n) {
                case 1 -> {
                    Calculator calc = new Calculator();
                    calc.Bcalc();
                }
                case 2 -> {
                    ScientificCalculator calcu = new ScientificCalculator();
                    calcu.Scalc();
                }

                default -> System.out.println("INVALID INPUT");
            }
            System.out.println("\nEnter 'n' to stop calculation...");
            c=(char)br.read();
            ch0=(char)br.read();
        }while(c!='n');
    }
}
