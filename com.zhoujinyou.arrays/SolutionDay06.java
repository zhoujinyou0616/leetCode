import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author 周金有
 * @Description 题目：两个数组的交集 II 给你两个整数数组nums1 和
 * nums2，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 * <p>
 * 示例 1： 输入：nums1 = [1,2,2,1], nums2 = [2,2] 输出：[2,2]
 * <p>
 * 示例 2: 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4] 输出：[4,9]
 * <p>
 * 提示： 1 <= nums1.length, nums2.length <= 1000 0 <= nums1[i], nums2[i] <= 1000
 * <p>
 * 进阶： 如果给定的数组已经排好序呢？你将如何优化你的算法？ 如果nums1的大小比nums2 小，哪种方法更优？
 * 如果nums2的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2y0c2/
 * 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date: Created in 16:11 2022/8/3
 **/
public class SolutionDay06 {

    /**
     * 排序后双指针比较
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        // 先排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // 分表对两个数组进行对比
        int left = 0;
        int right = 0;
        List<Integer> list = new ArrayList<>();
        while (left < nums1.length && right < nums2.length) {
            // 如果俩元素相同，就把该元素放到list里，并且两数组同时向后移动一位
            if (nums1[left] == nums2[right]) {
                list.add(nums1[left]);
                left++;
                right++;
            } else if (nums1[left] < nums2[right]) {
                //如果左数组小于右数组，则把左数组向后移动一位
                left++;
            } else {
                //如果右数组小于左数组，则把右数组向后移动一位
                right++;
            }
        }
        // 转换为 int[] 数组
        Integer[] integers = list.toArray(new Integer[0]);
        return Arrays.stream(integers).mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};
        int[] intersect = intersect(nums1, nums2);
        System.out.println("intersect = " + Arrays.toString(intersect));
    }
}
