package com.k7;

import com.k7.extended.DefaultArrayPrinter;
import com.k7.extended.SpecialArrayPrinter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Set print style: 1 - default; other - special");
        int style = sc.nextInt();
        sc.nextLine();
        ArrayPrinter arrayPrinter;
        if (style == 1) arrayPrinter = new DefaultArrayPrinter();
        else arrayPrinter = new SpecialArrayPrinter();
        int[] arrA = {2, 6, 8, 7, 9};
        int[] arrB = {0, 45, 7, 19};
        int[] arrC = {10, 45, 78, 1, -101};
        arrayPrinter.print(arrA);
        arrayPrinter.print(arrB);
        arrayPrinter.print(arrC);


    }
}
