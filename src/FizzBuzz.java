import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> fizz=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if((i+1)%3==0 && (i+1)%5==0){
                fizz.add("FizzBuzz");
            }
            else if((i+1)%3==0){
                fizz.add("Fizz");
            }
            else if ((i+1)%5==0){
                fizz.add("Buzz");
            }else {
                fizz.add(String.valueOf(i+1));
            }
        }
        return fizz;

    }
}
