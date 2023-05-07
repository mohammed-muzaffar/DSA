public class HouseRobberI {

    static int solve(int[] nums, int ind) {
        if (ind == 0)
            return nums[ind];

        if (ind < 0)
            return 0;

        int pick = nums[ind] + solve(nums, ind - 2);
        int notPick = 0 + solve(nums, ind - 1);

        return Math.max(pick, notPick);
    }

    public static void main(String args[]) {

        int[] nums = { 2, 1, 4, 9 };
        int n = nums.length;
        System.out.println(solve(nums, n - 1));
    
    }
}