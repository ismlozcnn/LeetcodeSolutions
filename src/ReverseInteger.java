public class ReverseInteger {

    public static int reverse(int x) {
        long donen=0;
        if(x==0)
            return 0;
        while(x!=0){

            donen=donen*10+x%10;
            x=x/10;
        }
        if(donen > Integer.MAX_VALUE || donen < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)donen;
    }

}
