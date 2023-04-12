import java.util.LinkedList;
import java.util.Queue;

class NonRepeatingLeterInStream {

    public static void printNonRepeating(String str) {
        Queue<Character> q = new LinkedList<>();

        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            // removing the element from the queue which have count more than one in freq
            // arr;
            while (!q.isEmpty() && freq[ch - 'a'] > 1) {
                q.remove();
            }

            if (!q.isEmpty()) {
                System.out.println(q.peek() + " ");
            } else {
                System.out.println(-1 + " ");
            }
        }

    }

    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}