public class DoubleReversal {

    public static boolean isSameAfterReversals(int num) {

        String numString=String.valueOf(num);
        int reverseNumber=reverseNumber(numString);
        String sameStr=String.valueOf(reverseNumber);
        int sameNumber=reverseNumber(sameStr);
        if (sameNumber==num)
            return true;

        return false;
    }

    public static int reverseNumber(String numString){
        StringBuffer sb=new StringBuffer(numString);
        sb.reverse();
        String reverse=sb.toString();
        int reverseNum=Integer.valueOf(reverse);
        return reverseNum;

    }
}
