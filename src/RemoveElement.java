public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int size=0;
        int[] arr=new int[nums.length];
        for (int num : nums) {
            if (num != val) {
                arr[size] = num;
                size++;
            }
        }
        for (int i = 0; i < size; i++) {
            nums[i]=arr[i];
        }
        return size;
    }
}
