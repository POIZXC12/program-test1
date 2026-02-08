class Solution {
    public String solution(String s) {

        StringBuilder result = new StringBuilder();
        boolean word = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                result.append(ch);
                word = true;
            } else {
                if (word) {
                    result.append(Character.toUpperCase(ch));
                    word = false;
                } else {
                    result.append(Character.toLowerCase(ch));
                }
            }
        }

        return result.toString();
    }
}