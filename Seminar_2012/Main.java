public class Main {
    public static void main(String[] args) {

        /* Solution 1 */
        String[] words1 = {"leetcode", "is", "amazing", "as", "is"};
        String[] words2 = {"amazing", "leetcode", "is"};
        System.out.println(Solution1.countWords(words1, words2));

        /* Solution 2 */
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        System.out.println(Solution2.findDuplicate(paths));
    }
}