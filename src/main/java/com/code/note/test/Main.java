package com.code.note.test;

public class Main {
    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();

        char[] inputChars = S.toCharArray();
        int count = 0;
        for (int i = 0; i < inputChars.length; i++) {
            char currChar = inputChars[i];

            if (currChar == '(') {
                count++;
            }

            if (count > 1) {
                sb.append(currChar);
            }

            if (currChar == ')') {
                count--;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "(())";
        Main m = new Main();
        String result = m.removeOuterParentheses(input);
        System.out.println("result: " + result);
    }
}
