/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                if(a[inner] > a[inner+1]){
                    temp = a[inner];
                    a[inner] = a[inner+1];
                    a[inner+1] = temp;
                }
                //ToDo 3: complete this algorithm, test it, provide its time complexity
            }
        }
    }f

    public static void main(String[] args) {
        int[] arr = {54, 87, 45, 12, 32, 23,};
        bubbleSort(arr, 6);
        System.out.println("Sorted array is");
        for (int i : arr) {
            System.out.println(i);
        }
    }

    //The time complexity of this algorithm is O(n^2) because it uses to nested for loops.
    
    
}
