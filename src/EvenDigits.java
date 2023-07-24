public class EvenDigits {
    public static int findNumbers(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            int k=1;
            while(nums[i]/10!=0){
                nums[i]/=10;
                k++;
            }
            if(k%2==0){
                count++;
            }
        }

        return count;
    }
}
