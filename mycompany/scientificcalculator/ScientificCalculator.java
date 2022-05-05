package com.mycompany.scientificcalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScientificCalculator extends Calculate {
    void Scalc() throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("Enter the number: ");
            double n=Integer.parseInt(br.readLine());
            System.out.print("Enter operation to be performed: \n A. Sine \n B. Cosine \n C. Tangent \n D. Log \n\n Enter your option: ");
            char x=(char)br.read();
            char ch0=(char)br.read();
            Calculate ob=new Calculate(n, x);
            ob.doCalculation();
            ob.getResult();
            System.out.println("\nEnter 'n' to stop calculation...");
            c=(char)br.read();
            ch0=(char)br.read();
        }while(c!='n');
    }
}
