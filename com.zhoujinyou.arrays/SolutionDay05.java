/**
 * @Author 周金有
 * @Description 题目：只出现一次的数字 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 说明： 你的算法应该具有线性时间复杂度。
 * 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1: 输入: [2,2,1] 输出: 1
 * <p>
 * 示例2: 输入: [4,1,2,1,2] 输出: 4
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/x21ib6/
 * 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date: Created in 18:05 2022/8/2
 **/
public class SolutionDay05 {

    /**
     * 异或运算有如下规律：
     * <p>
     * a^a=0；自己和自己异或等于0
     * a^0=a；任何数字和0异或还等于他自己
     * a^b^c=a^c^b；异或运算具有 交换律
     * 只需要把所有的数字都异或一遍，最终的结果就是我们要求的那个数字
     * <p>
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single = single ^ num;
        }
        return single;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        int single = singleNumber(nums);
        System.out.println("single = " + single);
    }


}
