

public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {

        for (int i=0;i<arr.length;i++){
            if(i== arr.length-1){
                break;
            }
            if(arr[i]==0){
                for (int k= arr.length-1;k> i+1;k--){
                    arr[k]=arr[k-1];
                }
                arr[i+1]=arr[i];
                i++;
            }
        }

    }
}
