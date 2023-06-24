public class RunningSumOfArray {
    public static int[] runningSum(int[] nums) {

        int[] runningSum=new int[nums.length];
        runningSum[0]=nums[0];
        int sum=nums[0];
        for (int i=1;i< nums.length;i++ ){
            sum+=nums[i];
            runningSum[i]=sum;
        }
        return runningSum;
    }
}

