/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lewie.sortingtests;

/**
 *
 * @author lewis.kimani<kimanilewi@gmail.com>
 */
public class BinarySearch {

    public static void main(String[] args) {
        String[] arr = {"This", "is", "a", "sample", "binary", "test"};
        String searchString = "binary";
        int result = binarySearch(arr, searchString);

        if (result == -1) {
            System.out.println("String not present");
        } else {
            System.out.println("String found at "
                    + "index " + result);
        }
    }

    static int binarySearch(String[] arr, String searchString) {
        int left = 0, rignt = arr.length - 1;
        while (left <= rignt) {
            int mid = left + (rignt - left) / 2;

            int res = searchString.compareTo(arr[mid]);

            // Check if string is present at middle 
            if (res == 0) {
                return mid;
            }

            // If string is greater, ignore left half 
            if (res > 0) {
                left = mid + 1;
            } // If string is smaller, ignore right half 
            else {
                rignt = mid - 1;
            }
        }

        return -1;
    }
} 
