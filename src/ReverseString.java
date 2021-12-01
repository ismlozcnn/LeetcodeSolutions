import java.util.ArrayList;
import java.util.List;

public class ReverseString {

    public static void reverseString(char[] s) {
        char[] bag=new char[s.length];
        for(int i=0;i<s.length;i++){
            bag[i]=s[s.length-i-1];
        }
        for(int i=0;i<s.length;i++){
            s[i]=bag[i];
        }


        

    }


}
