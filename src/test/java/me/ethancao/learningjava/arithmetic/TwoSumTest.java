package me.ethancao.learningjava.arithmetic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSumTest {

  @Test
  public void test() {
    Integer[] numbers = new Integer[]{2, 7, 11, 15};

    int[] results = TwoSum.twoSum(numbers, 9);
    Assert.assertTrue(results[0] == 1);
    Assert.assertTrue(results[1] == 2);


    int[] results2 = TwoSum.twoSum(numbers, 10);
    Assert.assertNull(results2);

    int[] results3 = TwoSum.twoSum(numbers, 18);
    Assert.assertTrue(results3[0] == 2);
    Assert.assertTrue(results3[1] == 3);

    int[] results4 = TwoSum.twoSum(numbers, 22);
    Assert.assertTrue(results4[0] == 2);
    Assert.assertTrue(results4[1] == 4);

  }
}
