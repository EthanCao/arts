package me.ethancao.learningjava.arithmetic;

import java.util.HashMap;

/**
 * <a href="https://soulmachine.gitbooks.io/algorithm-essentials/content/java/linear-list/array/two-sum.html">算法珠玑 twoSum</a>
 * <p>
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * </P>
 */
public class TwoSum {

  public static int[] twoSum(Integer[] numbers, int target) {

    final HashMap<Integer, Integer> number2IndexMap = new HashMap<Integer, Integer>();

    for (int i = 0; i < numbers.length; i++) {
      number2IndexMap.put(numbers[i], i);
    }
    for (int i = 0; i < numbers.length; i++) {
      final Integer index = number2IndexMap.get(target - numbers[i]);
      if (index != null && index > i) {
        return new int[]{i + 1, index + 1};
      }
    }
    return null;
  }


}
