package com.akshet;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstNegativeIntSizeK {
    public static void main(String[] args) {
        System.out.println("Enter the Size of the Array: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println("Enter the elements of the Array: "); // 10 4 2 5 6 3 8 1
        int[] arr = new int[size];
        for(int i =0;i<size;i++)
            arr[i] = scan.nextInt();
        System.out.println("Entered Array is: ");
        System.out.print("[");
        for(int i =0;i<size;i++)
            System.out.print(arr[i]+",");
        System.out.println("]");
        System.out.println("Enter the Size of the window: ");
        int win = scan.nextInt();

        ArrayList<Integer> ans =  firstNegativeInteger(arr,size, win);
        System.out.println(ans);
    }
}
