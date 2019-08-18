package com.company;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class zbiornik {

    static int[] zbior = new int[3];
    static int[] desort = new int[3];
    static Scanner scanner = new Scanner(System.in);

    public static void getIntegers(int c){
        for(int i =0; i<c; i++){
           zbior[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] costam){
        for(int i=0; i<costam.length;i++ ){
            System.out.println(costam[i]);

        }
    }
    public static void sortownik(){
        Arrays.sort(zbior);

        for(int i =0; i<zbior.length; i++){
            desort[i] =zbior[zbior.length- 1 - i];
        }
    }
}
