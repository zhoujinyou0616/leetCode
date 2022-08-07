import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 周金有
 * @Description 题目:两数之和 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。 你可以按任意顺序返回答案。
 * <p>
 * 示例 1： 输入：nums = [2,7,11,15], target = 9 输出：[0,1] 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6 输出：[1,2] 示例 3：
 * <p>
 * 输入：nums = [3,3], target = 6 输出：[0,1]
 * 提示：
 * 2 <= nums.length <= 104 -109 <= nums[i] <= 109 -109 <= target <= 109 只会存在一个有效答案 进阶：你可以想出一个时间复杂度小于
 * O(n2) 的算法吗？
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2jrse/
 * 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date: Created in 16:23 2022/8/7
 **/
public class SolutionDay09 {

    // 暴力破解法，双重for循环
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            int result = target - num;
            for (int j = i + 1; j < length; j++) {
                if (nums[j] == result) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }

    // 使用hashmap来解决
    public static int[] twoSumByHashMap(int[] nums, int target) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (sumMap.get(target - nums[i]) != null) {
                return new int[]{i, sumMap.get(target - nums[i])};
            }
            sumMap.put(nums[i], i);
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};
//        int[] sum = twoSum(nums, 6);
        int[] sum1 = twoSumByHashMap(nums, 6);
        System.out.println("sum = " + Arrays.toString(sum1));
    }
}
