package ru.job4j.array;

public class EndsWith {
    /**
     * проверить. что массив word имеет последние элементы одинаковые с post
     */
    public static boolean endsWith(char[] word, char[] post) {

        for (int i = 0; i < post.length; i++) {
            if (post[i] != word[word.length - post.length + i]) {
                return false;
            }
        }
        return true;
    }
}