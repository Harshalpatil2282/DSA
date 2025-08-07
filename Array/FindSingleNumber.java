class Solution{
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            res = res ^ nums[i];
        }
        return res;
    }
}
public class FindSingleNumber {
    public static void main(String[] rgs){
        Solution sol = new Solution();
        int[] nums1 = {1,2,1,2,4};
        int[] nums2 = {10,5,10,4,4,5,15};
        System.out.println("Single Number Is :"+sol.singleNumber(nums1));
        System.out.println("Single Number Is :"+sol.singleNumber(nums2));

    }
}
