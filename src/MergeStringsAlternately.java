public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {

        /*int l1 = word1.length();
        int l2 = word2.length();
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        char[] merged = new char[l1 + l2];
        int merge = l1 + l2;
        int a = 0;
        int b = 0;
        int min2 = 2 * Math.min(l1, l2);

        for (int i = 0; i < min2; i++) {
            if (i % 2 == 0 && a < l1) {
                merged[i] = w1[a];
                a++;
            } else {
                merged[i] = w2[b];
                b++;
            }
        }
        if (min2 < merge) {
            if (l1 > l2) {
                for (int i = min2; i < merge; i++) {
                    merged[i] = w1[a];
                    a++;
                }
            } else {
                for (int i = min2; i < merge; i++) {
                    merged[i] = w2[b];
                    b++;
                }
            }
        }


        return String.valueOf(merged);*/
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.max(word1.length(),word2.length()) ; i++) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();


    }
}
