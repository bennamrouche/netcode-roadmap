class Solution {
   public boolean isOpen(char c) {
        String s = "{([";
        return s.indexOf(c) != -1;
    }

    public boolean isOpenClose(char op, char cls) {
        switch (op) {
            case '{':
                return cls == '}';
            case '(':
                return cls == ')';
            case '[':
                return cls == ']';
            default:
                return false;
        }
    }

    public boolean isValid(String s) {
        Stack<Character> data = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isOpen(c))
                data.push(c);
            else {
                if (!data.isEmpty() && isOpenClose(data.peek(), c))
                    data.pop();
                else
                    return false;
            }
        }

        return data.isEmpty();
    }
}
