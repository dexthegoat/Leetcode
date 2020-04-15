import java.util.Stack;

/**
 * if与多个else if是分枝情况。只执行其中一条代码，if与多个if是并列情况，会顺序执行
 * 如果是多个else if的话，只要第一个if条件成立，即使满足else if的条件也不会执行else if及else的内容
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String test = "((())){{}}[[]]";
        System.out.println(new ValidParentheses().isValid(test));
    }

    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '[')
                stack.push(']');
            else if (c == '{')
                stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

}
