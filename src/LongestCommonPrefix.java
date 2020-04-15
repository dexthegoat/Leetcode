public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        String res = longestCommonPrefix(input);
        System.out.println(res);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String temp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(temp) != 0) {//indexOf() is case sensitive
                temp = temp.substring(0, temp.length() - 1);
                if (temp.isEmpty()) return "";
            }
        }
        return temp;
    }
}
