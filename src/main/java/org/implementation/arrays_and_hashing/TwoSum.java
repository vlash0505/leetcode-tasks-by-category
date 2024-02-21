package org.implementation.arrays_and_hashing;

/*
https://leetcode.com/problems/two-sum/description/

1. Two Sum
Easy

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
**/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));

        System.out.println(Arrays.toString(twoSumOptimized(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSumOptimized(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSumOptimized(new int[]{3,3}, 6)));
    }

    // primitive approach of traversing both arrays
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No such values were found");
    }

    //optimized solution for O(n)
    public static int[] twoSumOptimized(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length;  i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {i, map.get(nums[i])};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No such values were found");
    }
}
