import java.util.*;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        // int[] prefix = new int[nums.length];
        // int[] suffix = new int[nums.length];

        ans[0] = 1;
        // suffix[nums.length-1] = 1;

        // prefix calculation
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // sufix calculation
        int suffix = 1;
        for (int j = nums.length - 2; j >= 0; j--) {
            suffix = suffix * nums[j + 1];
            ans[j] = ans[j] * suffix;
        }

        // // calculation ans
        // for(int k = 0;k<nums.length; k++){
        // ans[k] = prefix[k]*suffix[k];
        // }

        return ans;
    }
}

public class ProdOfArrayExcSelf {
    Solution sl = new Solution();

    public static void main(String[] args) {
        ProdOfArrayExcSelf p = new ProdOfArrayExcSelf();
        int[] nums1 = { 1, 2, 3, 4 };
        int[] nums2 = { -1, 1, 0, -3, 3 };
        System.out.println("Product of Array Except Self :");
        System.out.println(Arrays.toString(p.sl.productExceptSelf(nums1)));
        System.out.println(Arrays.toString(p.sl.productExceptSelf(nums2)));
    }
}
