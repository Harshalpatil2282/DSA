import java.util.*;
class MajorityArray {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int freq = 1,ans = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                freq++;

            }else{
                freq = 1;
            }
            if(freq>n/2){
                return nums[i];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        MajorityArray ma = new MajorityArray();
        int[] nums = {3,2,3};
        System.out.println("Majority element :"+ma.solution(nums)); // Output: 3
        int[] nums2 = {2,2,1,1,1,2,2};
        System.out.println("Majority Element :"+ma.solution(nums2)); 
    }
}