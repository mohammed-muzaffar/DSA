import java.util.LinkedList;
import java.util.Queue;

class NonRepeatingLetterInStream {

    public static void printNonRepeating(String str) {
        Queue<Character> q = new LinkedList<>();

        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // adding to queue
            q.add(ch);
            // increment the element count in freq arr
            freq[ch - 'a']++;

            // removing the element from the queue which have count more than one in freq
            // arr;
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }

    }

    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}