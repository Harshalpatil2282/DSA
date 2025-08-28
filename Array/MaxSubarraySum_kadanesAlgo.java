import java.util.*;

public class MaxSubarraySum_kadanesAlgo {
    public static void main(String[] args){
        MaxSubarraySum_kadanesAlgo ms = new MaxSubarraySum_kadanesAlgo();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max Subarray Sum :"+ms.maxSuarraySum(arr));
    }   
    public int maxSuarraySum(int[] nums){
    int maxSum = nums[0];
    int currSum = 0;
    for(int i=0; i<nums.length; i++){
        currSum += nums[i];
        maxSum = Math.max(currSum, maxSum);
        if(currSum < 0){
            currSum = 0;
        } 
    }
    return maxSum;
} 
}
