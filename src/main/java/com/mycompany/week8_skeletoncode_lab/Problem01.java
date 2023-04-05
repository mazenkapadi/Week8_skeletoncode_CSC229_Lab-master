/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;
import java.util.*;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
        int sum = 0;
        for(int i = 2; i <= n; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i%j == 0 ) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSumOfPrimes(10)); //Output should be 17
        System.out.println(getSumOfPrimes(20)); //Output should be 77
    }

    //the space complexity of this method is O(n/log(n)).
}   //the time complexity of this method is O(n*log(n))
