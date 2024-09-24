package com.prj;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of inputs u wanna enter ");
        int n=sc.nextInt();
        String[] inputs = new String[n];
        for (int i=0;i<n;i++) {
           inputs[i]=sc.nextLine();
        }
        for (String input : inputs) {
            try {
                int result = StringCalculator.add(input);
                System.out.println(input + " ->" + result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
