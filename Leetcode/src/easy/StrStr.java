package easy;

/**
 * @author : lixiang
 * @date : 2019-12-17 16:49
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class StrStr {

    /**
     *  看了解法 有kmp算法  基本没有用substring的方法的；不知道是不是我理解的有问题；但是leetcode可以解决
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if(needle.length()==0||needle==null){
            return 0;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,needle.length()+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
