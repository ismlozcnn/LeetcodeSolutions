public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";


        String donen=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(donen)){
                donen=donen.substring(0,donen.length()-1);

            }

        }
        return donen;

    }
}
