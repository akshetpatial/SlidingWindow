package com.akshet;

import java.util.Scanner;

public class MinSumSubArrayFixed {

    public static void main(String[] args) {
        System.out.println("Enter the Size of the Array: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println("Enter the elements of the Array: ");
        int[] arr = new int[size];
        for(int i =0;i<size;i++)
            arr[i] = scan.nextInt();
        System.out.println("Entered Array is: ");
        System.out.print("[");
        for(int i =0;i<size;i++)
            System.out.print(arr[i]+",");
        System.out.print("]");
        System.out.println("Enter the Size of the window: ");
        int win = scan.nextInt();

        int ans =  minSubArraySum(arr,size, win);
        System.out.println(ans);
    }

}