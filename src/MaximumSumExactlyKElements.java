public class MaximumSumExactlyKElements {
    public static int maximizeSum(int[] nums, int k) {
        int max=nums[0];
        int sum=0;
        for(int i=1;i< nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        while(k>0){
            sum+=max;
            max++;
            k--;
        }

        return sum;
    }
}
