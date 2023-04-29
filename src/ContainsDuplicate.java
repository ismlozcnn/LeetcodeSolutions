import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> unique=new HashSet<>();
        for (int i=0;i< nums.length;i++){
            unique.add(nums[i]);
            if(i+1== unique.size()){
                return false;
            }
        }

        return true;
    }
}
