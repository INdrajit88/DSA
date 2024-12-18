package DSA.ArrayPS;

public class maxcircularsubarray {
    public static int maxCircularSubarraySum(int[] nums) {
    int totalSum = 0;
    int currMaxSum = 0;
    int currMinSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int minSum = Integer.MAX_VALUE;

    for (final int num : nums) {
      totalSum += num;
      currMaxSum = Math.max(currMaxSum + num, num);
      currMinSum = Math.min(currMinSum + num, num);
      maxSum = Math.max(maxSum, currMaxSum);
      minSum = Math.min(minSum, currMinSum);
    }

    return maxSum < 0 ? maxSum : Math.max(maxSum, totalSum - minSum);
}
  public static void main(String[] args) {
    int[] nums = {1, -2, 3, -2};
    System.out.println(maxCircularSubarraySum(nums));
  }
}
