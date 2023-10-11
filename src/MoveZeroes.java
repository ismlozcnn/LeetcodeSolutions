public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int haveZeroes=0;
        int size=nums.length;

        for(int i=0;i<size;i++){
            if(nums[i]!=0){
                nums[haveZeroes]=nums[i];
                haveZeroes++;
            }
        }
        while(haveZeroes<size){
            nums[haveZeroes]=0;
            haveZeroes++;
        }
    }
}
