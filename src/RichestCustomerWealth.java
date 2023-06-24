import java.util.ArrayList;
import java.util.List;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        List<Integer> sum=new ArrayList<>();

        for (int[] account : accounts) {
            int count = 0;
            for (int j = 0; j < account.length; j++) {
                count += account[j];
            }
            sum.add(count);
        }
        int customer=0;
        for (int i=0;i<sum.size();i++){
            if(sum.get(i)>customer){
                customer=sum.get(i);
            }
        }

        return customer;
    }
}
