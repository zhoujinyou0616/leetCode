import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author 周金有
 * @Description 题目：存在重复元素 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 * <p>
 * 示例 1： 输入：nums = [1,2,3,1] 输出：true
 * <p>
 * 示例 2： 输入：nums = [1,2,3,4] 输出：false
 * <p>
 * 示例3： 输入：nums = [1,1,1,3,3,4,3,2,4,2] 输出：true
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/x248f5/
 * 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date: Created in 16:44 2022/8/1
 **/
public class SolutionDay04 {

    /**
     * 使用set的元素唯一特性，判断set和数组的长度，如果set长度小于数组长度，则代表有元素重复
     *
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for (int num : nums) {
            sets.add(num);
        }
        return sets.size() < nums.length;
    }

    /**
     * 优化版本，如果添加操作元素失败，直接返回true
     */
    public static boolean containsDuplicate1(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for (int num : nums) {
            // 如果添加失败，则代表元素重复
            if (!sets.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println("初始数组" + Arrays.toString(nums));
        boolean b = containsDuplicate(nums);
//        boolean b = containsDuplicate1(nums);
        System.out.println("是否有重复元素" + b);
    }

}
