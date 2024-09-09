package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

//       int[] marks = new int[3];

//        int[] marks = {97, 98, 95};

//        marks[0] = 97; //phy
//        marks[1] = 98; //chem
//        marks[2] =95; //math
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

        //input
        for (int i=0; i<size;i++){
            numbers[i] = sc.nextInt();
        }

        //output
        for (int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}