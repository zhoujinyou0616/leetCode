import java.util.Arrays;

/**
 * @Author 周金有 反转字符串
 * @Description 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1)
 * 的额外空间解决这一问题。 示例 1： 输入：s = ["h","e","l","l","o"] 输出：["o","l","l","e","h"] 示例 2： 输入：s =
 * ["H","a","n","n","a","h"] 输出：["h","a","n","n","a","H"] 提示： 1 <= s.length <= 105 s[i] 都是 ASCII
 * 码表中的可打印字符 相关标签
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnhbqj/
 * 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date: Created in 17:39 2022/8/16
 **/
public class SolutionCharDay01 {

    /**
     * 对称交换
     *
     * @param s
     */
    public static void reverseString(char[] s) {
        System.out.println("字符串：" + Arrays.toString(s));
        int length = s.length;
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = temp;
        }
        System.out.println("反转后字符串：" + Arrays.toString(s));
    }

    public static void main(String[] args) {
        char[] c = {'h', 'e', 'l', 'l', 'o'};
        reverseString(c);
    }
}
