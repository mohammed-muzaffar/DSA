public class JumpGame2 {

    public static int jumpGame(int[] nums, int idx) {

        if (idx == nums.length - 1)
            return 0;

        int min = Integer.MAX_VALUE;
        for (int j = idx + 1; j < nums.length && j <= idx + nums[idx]; j++) {
            int jumps = 1 + jumpGame(nums, j);
            min = Math.min(min, jumps);
        }
        return min;
    }

    public static void main(String args[]) {
        int[] nums = { 2, 3, 1, 1, 4 };
        System.out.println(jumpGame(nums, 0));
    }
}