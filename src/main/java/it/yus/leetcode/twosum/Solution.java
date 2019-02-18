package it.yus.leetcode.twosum;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * @author yusong
 * @version 1.0
 * @date 2019/2/15 18:33
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
            if(map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]), i};
            }
        }
        return null;
    }
    
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 1, 3};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        Assert.assertArrayEquals(new int[]{0, 1}, result);
    }
}