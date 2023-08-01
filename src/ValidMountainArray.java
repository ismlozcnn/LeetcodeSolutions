public class ValidMountainArray {

    public static boolean validMountainArray(int[] arr) {
        int half = 0;
        int i=0;
        boolean flag=false;
        if(arr.length<3){
            return false;
        }else{
            while (i<arr.length-1){
                if((arr[i]<arr[i+1])){
                    i++;
                }else{
                    half=i;
                    break;
                }
            }
            if(half==0){
                return false;
            }
            for(int k=0;k< arr.length-1;k++){
                if(k<half){
                    if(arr[k]<arr[k+1]){
                        flag=true;
                    }else{
                        flag=false;
                        break;
                    }
                }else{
                    if(arr[k]>arr[k+1]){
                        flag=true;
                    }else{
                        flag=false;
                        break;
                    }
                }

            }

        }

        return flag;
    }
}
