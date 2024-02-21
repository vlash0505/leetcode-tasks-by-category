package org.implementation.arrays_and_hashing;

/*
https://leetcode.com/problems/contains-duplicate/description/

217. Contains Duplicate
Easy

Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{2,3,1}));
        System.out.println(containsDuplicate(new int[]{2,3,1}));
        System.out.println(containsDuplicate(new int[]{2,3,1}));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }

            set.add(i);
        }
        return false;
    }
}
