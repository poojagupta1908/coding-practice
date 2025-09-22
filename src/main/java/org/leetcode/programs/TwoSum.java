package org.leetcode.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

       /* //input numbers in this array from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int size = scanner.nextInt();

        //create array
        int[] nums = new int[size];

        //input elements
        System.out.println("Enter" + size + "numbers:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Array Elements : " + Arrays.toString(nums));*/

        //brute force
        int[] nums1 = {2, 3, 6, 7, 8};
        //int[] result = twoSum(nums1, 13);
        //System.out.println("result is:" + Arrays.toString(result));

        //using map
        int[] result = twoSumUsingMapLatest(nums1, 9);
        System.out.println("result is:" + Arrays.toString(result));


    }

    //brute force,complexity=O(n^2)s
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    //using map =O(n)
    public static int[] twoSumUsingMap(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();

        //put elements of array with index in map
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        System.out.println("print map elements"+map);
        for(int i=0;i<nums.length;i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
               return new int[]{i,map.get(target-nums[i])};
            }
        }

        return null;
    }

    //more optimize
    public static int[] twoSumUsingMapLatest(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }


}
