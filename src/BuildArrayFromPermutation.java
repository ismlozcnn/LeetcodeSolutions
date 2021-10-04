public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {

        int[] numbers=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            numbers[i]=nums[nums[i]];
        }
        return numbers;
    }

}
