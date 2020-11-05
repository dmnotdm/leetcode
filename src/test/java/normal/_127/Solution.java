package normal._127;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhizhao.zhang
 * @date 2020/11/05
 */
class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord.length() != endWord.length()) {
            return 0;
        }
        if (wordList == null || wordList.isEmpty()) {
            return 0;
        }
        wordList = new LinkedList<>(wordList);
        String nowWord;
        Stack stack = new Stack(wordList.size());
        Stack back = new Stack(wordList.size());
        Stack p;
        int re = 0;
        stack.push(beginWord);
        do {
            re++;
            do {
                nowWord = stack.pop();
                Iterator<String> it = wordList.iterator();
                while (it.hasNext()) {
                    String word = it.next();
                    if (diff(nowWord, word)) {
                        if (word.equals(endWord)) {
                            return re + 1;
                        }
                        back.push(word);
                        it.remove();
                    }
                }
            } while (stack.notEmpty());
            p = stack;
            stack = back;
            back = p;
        } while (stack.notEmpty());
        return 0;
    }

    private boolean diff(String a, String b) {
        int re = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                re++;
            }
            if (re > 1) {
                break;
            }
        }
        return re == 1;
    }

    private static class Stack {
        private final String[] content;
        private int ans;

        public Stack(int size) {
            content = new String[size];
        }

        public void push(String s) {
            content[ans++] = s;
        }

        public String pop() {
            return content[--ans];
        }

        public boolean notEmpty() {
            return ans != 0;
        }

        @Override
        public String toString() {
            return Arrays.toString(Arrays.copyOf(content, ans));
        }
    }
}