public class main {

    public static int maxvalue(int arr[]){
        int n=arr.length;
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            
        }
    }
    return max;
    }
    public static boolean equalSubarray(int arr[], int max){
        int secondSum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=max)
               secondSum=secondSum+arr[i];

        }
        if(secondSum!=max){
            return false;
        }else{
            return true;
        }
    }

   

    public static void main(String[]args){
        int arr[]={1,5,5,11};
           System.out.println(maxvalue(arr));
           System.out.println(equalSubarray(arr,max));
        

    
}
}
    

