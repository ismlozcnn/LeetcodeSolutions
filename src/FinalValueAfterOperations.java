public class FinalValueAfterOperations {

    public static int finalValueAfterOperations(String[] operations) {
        int total=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].contains("+")){
                total++;
            }else{
                total--;
            }
        }


        return total;
    }
}
