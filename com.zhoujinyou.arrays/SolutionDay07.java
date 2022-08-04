import java.util.Arrays;

/**
 * @Author 周金有
 * @Description 题目：加一 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 你可以假设除了整数
 * 0 之外，这个整数不会以零开头。
 * <p>
 * 示例1： 输入：digits = [1,2,3] 输出：[1,2,4] 解释：输入数组表示数字 123。
 * <p>
 * 示例2： 输入：digits = [4,3,2,1] 输出：[4,3,2,2] 解释：输入数组表示数字 4321。
 * <p>
 * 示例 3： 输入：digits = [0] 输出：[1]
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2cv1c/
 * 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date: Created in 18:17 2022/8/4
 **/
public class SolutionDay07 {

    /**
     * 这个题的重点就是要考虑加1后是否进位，极端场景就是999的情况，这时要改变数组长度。
     *
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        int[] digit = new int[length + 1];
        digit[0] = 1;
        return digit;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{9, 9, 9};
        int[] ints = plusOne(digits);
        System.out.println(Arrays.toString(ints));
    }

}
