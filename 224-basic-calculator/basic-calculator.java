class Solution {
    public int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int number = 0;
        int sign = 1;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            }

            else if (c == '+' || c == '-') {
                result += sign * number;
                number = 0;
                sign = (c == '+') ? 1 : -1;
            }

            else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            }

            else if (c == ')') {
                result += sign * number;
                number = 0;
                int prevSign = stack.pop();
                int prevResult = stack.pop();
                result = prevResult + prevSign * result;
            }
        }

        // Add any remaining number to result
        result += sign * number;
        return result;
    }
}