package net.approachcircle.demo;

import java.util.Arrays;

public class BinarySearch {
        public static boolean search(String target, String[] arr) {
            System.out.println(Arrays.toString(arr));
            // decided to bitshift instead of divide and floor
            int midpoint = arr.length >> 1;
            // exit condition for instances where target is not present
            if (arr.length == 1) {
                return target.equals(arr[midpoint]);
            }
            if (target.compareTo(arr[midpoint]) == 0) {
                return true;
            } else if (target.compareTo(arr[midpoint]) < 0) {
                return search(target, Arrays.copyOfRange(arr, 0, midpoint));
            } else if (target.compareTo(arr[midpoint]) > 0) {
                return search(target, Arrays.copyOfRange(arr, midpoint, arr.length));
            }
            return false;
        }
}
