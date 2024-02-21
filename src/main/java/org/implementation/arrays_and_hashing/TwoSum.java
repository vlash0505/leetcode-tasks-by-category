package org.implementation.arrays_and_hashing;

import java.util.*;
import java.util.stream.Collectors;

public class TwoSum {
    public static void main(String[] args) {

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
    public static int[] twoSumSecond(int[] nums, int target) {
        Set<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

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
