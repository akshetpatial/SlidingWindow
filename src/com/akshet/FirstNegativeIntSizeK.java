package com.akshet;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstNegativeIntSizeK {

    private static ArrayList<Integer> firstNegativeInteger(int[] arr, int n, int k) {
        int outer_index = 0;
        int inside_index = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();

        while(inside_index<n){
            if(inside_index-outer_index+1 !=k){
                inside_index++;
            }else{
                int check = 0;
                for(int i=outer_index;i<outer_index+k;i++){
                    if(arr[i]<0){
                        int val = arr[i];
                        list.add(val);
                        check++;
                        break;
                    }
                }if(check==0){
                    list.add(0);
                }
                outer_index++;
                inside_index++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of the Array: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println("Enter the elements of the Array: "); // 14 -9 -18 -2 5 1
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
