package com.k7;

import java.util.Arrays;

public abstract class ArrayPrinter {
    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i==0) System.out.print("["+printElem(array[i])+" ");
            else if (i==array.length-1) System.out.println(printElem(array[i])+"]");
            else System.out.print(printElem(array[i])+" ");
        }
    }

    protected abstract String printElem(int elem);

}
