/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i]==x){
                return i;
            }
        }
        // Todo 01: - complete the implementation of linear search and test your code  
        //          - prvoide asymptotic analysis of the developed solution
        //            The time complexity is O(n), where n is the number of elements in the array.
        //            The space complexity of the algorithm is O(1), which means that the amount of memory required by the algorithm is constant
        //            and does not increase with the size of the input array.
        //            Time complexity: O(n)
        //            Space complexity: O(1)
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {64, 23, 54, 56, 76, 90, 33};
        int x = 54;
        int valIndex = search(arr, x);
        if (valIndex != -1){
            System.out.println("Element " + x + " found at index " + valIndex);
        }   else    {
            System.out.println("Element " + x + " not found in aray");
        }
    }
    
}
