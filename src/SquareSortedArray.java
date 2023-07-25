public class SquareSortedArray {
    public static int[] sortedSquares(int[] nums) {
        if(nums.length==1){
            nums[0]*=nums[0];
            return nums;
        }

        for(int i=0,j=i+1;i< nums.length;){
            if(j==nums.length){
                nums[i]=nums[i]*nums[i];
                i++;
                j=i+1;
                if(i== nums.length-1){
                    nums[i]=nums[i]*nums[i];
                    break;
                }
            }
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
            j++;
        }

        return nums;
    }
}
