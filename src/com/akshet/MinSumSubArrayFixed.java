package com.akshet;
// https://www.codingninjas.com/studio/problems/find-minimum-sum-subarray-of-given-size_873368
import java.util.Scanner;

public class MinSumSubArrayFixed {

    private static int minSubArraySum(int[] arr, int n, int k) {
        int upper_loop  = 0;
        int inside_loop = 0;
        int min_sum = Integer.MAX_VALUE;
        int sum =0;
        // while(upper_loop<=n-k){
        while(inside_loop<n){
            if(inside_loop-upper_loop+1 !=k){
                sum+=arr[inside_loop];
                inside_loop++;
            }else{
                sum+=arr[inside_loop];
                // System.out.print("sum: "+sum);
                if(min_sum>sum){
                    min_sum=sum;
                }
                sum=sum-arr[upper_loop];
                upper_loop++;
                inside_loop++;
                // inside_loop=upper_loop;
            }
            // }
        }
        return min_sum;
    }

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

        int ans =  minSubArraySum(arr,size, win);
        System.out.println(ans);
    }

}