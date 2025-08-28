import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int tar) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n-3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i+1; j < n -2 ;j++) {
                if(j < i+1 && nums[j] == nums[j-1]) continue;
                int p = i + 1, q = n - 1;

                while (p < q) {
                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[p] + (long)nums[q];
                    if (sum < tar)
                        p++;
                    else if (sum > tar)
                        q--;
                    else {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;
                        while (p < q && nums[p] == nums[p - 1])
                            p++;
                        while (p < q && nums[q] == nums[q + 1])
                            q--;
                    }
                }
                
            }
        }
        return ans;
    }
}

public class FourSum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { 7, -8, -7, 2, -7, -7, 10, -6, 10, -9, 2, -7, -4, -7 };
        int target = -22;
        int[] arr1 = { 7, -8, -7, 2, -7, -7, 10, -6, 10, -9, 2, -7, -4, -7 };
        int target1 = -9;
        System.out.println("Solution :" + sol.fourSum(arr, target));
        System.out.println("Solution :" + sol.fourSum(arr1, target1));
    }
}
