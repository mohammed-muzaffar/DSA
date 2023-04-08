import java.util.Stack;

public class NextGreaterElement {

    public static int[] greaterEle(int[] nums, int n) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int nextGen = 0;
            while (!s.isEmpty() && nums[i] >= nums[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextGen = -1;
            } else {
                nextGen = nums[s.peek()];
            }
            s.push(i);
            res[i] = nextGen;
        }
        return res;
    }

    public static void printStack(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 3 };
        int n = nums.length;

        int[] res = NextGreaterElement.greaterEle(nums, n);
        printStack(res);
    }
}