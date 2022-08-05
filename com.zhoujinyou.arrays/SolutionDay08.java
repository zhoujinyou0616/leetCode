import java.util.Arrays;

/**
 * @Author 周金有
 * @Description 题目：移动零 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 请注意，必须在不复制数组的情况下原地对数组进行操作。
 * <p>
 * 示例 1: 输入: nums = [0,1,0,3,12] 输出: [1,3,12,0,0]
 * <p>
 * 示例 2: 输入: nums = [0] 输出: [0]
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2ba4i/
 * 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date: Created in 16:47 2022/8/5
 **/
public class SolutionDay08 {

    /**
     * 双指针，把非0的往前挪，后面的数据就是0
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        // 设置一个0起点角标位
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            // 如果当前数据不是0，就向前移动，完成后所有非0数据都在前面
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        // 再根据0起点坐标位把后面数据设置位0
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
