public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {
        int[] sorting=new int[nums.length];
        int j=0;
        int k=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                sorting[k]=nums[i];
                k++;
            }else{
                sorting[nums.length-1-j]=nums[i];
                j++;
            }

        }

        return sorting;
    }
}
