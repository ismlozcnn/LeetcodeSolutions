public class LeftRightDifferences {
    public static int[] leftRigthDifference(int[] nums) {
        int[] answer=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sumLeft=0;
            int sumRight=0;
            if(i==0){
                for (int j = i+1; j < nums.length ; j++) {
                    sumRight=sumRight+nums[j];
                }
                answer[i]=Math.abs(sumLeft-sumRight);
            }
            else if(i== nums.length-1){
                for (int j = 0; j <i ; j++) {
                    sumLeft=sumLeft+nums[j];
                }
                answer[i]=Math.abs(sumLeft-sumRight);
            }
            else {
                for (int j = 0; j <i ; j++) {
                    sumLeft=sumLeft+nums[j];
                }
                for (int j = i+1; j < nums.length ; j++) {
                    sumRight=sumRight+nums[j];
                }
                answer[i]=Math.abs(sumLeft-sumRight);
            }
        }
        return  answer;
    }
}
