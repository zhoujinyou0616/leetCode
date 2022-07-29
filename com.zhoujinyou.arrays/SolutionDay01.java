import java.util.Arrays;

/**
 * @Author 周金有
 * @Description 题目：删除排序数组中的重复项
 * <p>
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
 * 由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么nums的前 k 个元素应该保存最终结果。
 * 将最终结果插入nums 的前 k 个位置后返回 k 。 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。 示例 1：
 * <p>
 * 输入：nums = [1,1,2] 输出：2, nums = [1,2,_] 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2
 * 。不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 示例 2：
 * <p>
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4] 输出：5, nums = [0,1,2,3,4] 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为
 * 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2gy9m/
 * 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date: Created in 15:22 2022/7/29
 **/
public class SolutionDay01 {

    /**
     * （双指针法）移除重复数组，返回新的长度
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        // 左指针
        int left = 0;
        // 右指针
        int right = 1;
        while (right <= nums.length - 1) {
            // 如果左指针内容小于右指针内容，则可以进行交换位置
            if (nums[left] < nums[right]) {
                // 左指针向右移动一位
                left = left + 1;
                nums[left] = nums[right];
            }
            // 右指针向右移动一位
            right = right + 1;
        }
        return left + 1;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("原数组为：" + Arrays.toString(nums));
        System.out.println("去重处理开始...");
        Thread.sleep(2000);
        System.out.println("去重处理完成...");
        int length = removeDuplicates(nums);
        System.out.println("去重后的数组长度为：" + length);
        int[] removalNums = new int[length];
        // 复制数组
        System.arraycopy(nums, 0, removalNums, 0, length);
        System.out.println("去重后的数组为：" + Arrays.toString(removalNums));
    }
}
