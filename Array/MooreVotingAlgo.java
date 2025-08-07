import java.util.Arrays;
public class MooreVotingAlgo {
    public int solution(int[] nums) {
        Arrays.sort(nums);
        int freq = 0,ans =  0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(freq==0){
                ans = nums[i];
            }
            if(ans==nums[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ans;
    }
    public static void main(String[] args){

        MooreVotingAlgo mva = new MooreVotingAlgo();
        int[] nums1 = {1,3,3,3,4,5,4,3,2};
        System.out.println("Majority :"+mva.solution(nums1));
        int[] nums2 = {2,2,2,3,4,1,2,5,5,5};
        System.out.println("Majority :"+mva.solution(nums2));
    }
}
