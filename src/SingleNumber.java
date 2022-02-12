import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        HashMap<Integer,Integer> numberOfCount=new HashMap<>();

        for (int num : nums) {
            if (!numberOfCount.containsKey(num)) {
                numberOfCount.put(num, 1);
            } else {
                numberOfCount.put(num, numberOfCount.get(num) + 1);
            }
        }
        for(Map.Entry<Integer,Integer> e :numberOfCount.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }

        return 1;


    }
}
