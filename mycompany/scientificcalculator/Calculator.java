package com.mycompany.scientificcalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    void Bcalc() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c;
        do{
            System.out.print("Enter 1st number: ");
            int a=Integer.parseInt(br.readLine());
            System.out.print("Enter operation to be performed: ");
            char ch=(char)br.read();
            char ch0=(char)br.read();
            System.out.print("Enter 2nd number: ");
            int b=Integer.parseInt(br.readLine());
            Calculate obj = new Calculate(a,ch,b);
            if(obj.checkSecondNum())
                System.out.println("__Division By Zero__");
            else
            {
                obj.doCalculation();
                obj.getResult();
            }
            System.out.println("\nEnter 'n' to stop calculation...");
            c=(char)br.read();
            ch0=(char)br.read();
        }while(c!='n');
    }
}
