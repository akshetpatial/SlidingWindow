package com.akshet;
//https://leetcode.com/problems/sliding-window-maximum/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class slidingWindowMax {

    /* This Will Exceed the time limit */
    private static int[] windowMax(int[] arr, int win) {
        int i =0;
        int j = win-1;
        int size =  arr.length - win +1;
        int[] ans = new int[size];
        while(j<arr.length){
            int max = findMax(i,j,arr);
            ans[i] = max;
            i++;
            j++;
        }
        return ans;
    }

    private static int findMax(int start, int end, int[] arr) {
        int max = arr[start];
        for(int i =start;i<=end;i++){
            if(max<arr[i])
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args){
        System.out.println("Enter the Size of the Array: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println("Enter the elements of the Array: "); // 1 3 -1 -3 5 3 6 7
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

        int[] ans =  windowMax(arr, win);
        for(int ele : ans){
            System.out.print(ele + " ");
        }
    }

}
