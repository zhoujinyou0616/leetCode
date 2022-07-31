import java.util.Arrays;

/**
 * @Author 周金有
 * @Description 题目：旋转数组 给你一个数组，将数组中的元素向右轮转 k个位置，其中k是非负数。 示例 1: 输入: nums = [1,2,3,4,5,6,7], k = 3 输出:
 * [5,6,7,1,2,3,4] 解释: 向右轮转 1 步: [7,1,2,3,4,5,6] 向右轮转 2 步: [6,7,1,2,3,4,5] 向右轮转 3 步:
 * [5,6,7,1,2,3,4]
 * <p>
 * 示例2: 输入：nums = [-1,-100,3,99], k = 2 输出：[3,99,-1,-100] 解释: 向右轮转 1 步: [99,-1,-100,3] 向右轮转 2 步:
 * [3,99,-1,-100]
 * <p>
 * 提示： 1 <= nums.length <= 105 -231 <= nums[i] <= 231 - 1 0 <= k <= 105
 * <p>
 * 进阶： 尽可能想出更多的解决方案，至少有 三种 不同的方法可以解决这个问题。 你可以使用空间复杂度为O(1) 的原地算法解决这个问题吗？
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2skh7/
 * 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date: Created in 16:10 2022/7/31
 **/
public class SolutionDay03 {

    /**
     * 方法一：使用新数组解决
     *
     * @param nums
     * @param k
     */
    public static void rotate1(int[] nums, int k) {
        System.out.println("当前数组为：" + Arrays.toString(nums));
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; ++i) {
            newArr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
        System.out.println("将数组中的元素向右轮转 " + k + " 个位置：");
        System.out.println("旋转后数组为：" + Arrays.toString(nums));
    }

    /**
     * 方法二：先给数组排序，然后根据k位置分段后将两段数组再排序
     *
     * @param nums
     * @param k
     */
    public static void rotate2(int[] nums, int k) {
        System.out.println("当前数组为：" + Arrays.toString(nums));
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        System.out.println("将数组中的元素向右轮转 " + k + " 个位置：");
        System.out.println("旋转后数组为：" + Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        // 方法一
        rotate1(nums, 3);
        // 方法二
        rotate2(nums, 3);
    }

}
