/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import insertionsort.InsertionSort;

/**
 *
 * @author vhag9
 */
public class InsertionTest {
    public static void main(String[] args) {
        int arr[] = { 12, 15 ,0 , 52, 7};
        InsertionSort isort = new InsertionSort();
        isort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
