import java.util.*;


public class question {
   
        
    public static void main(String args[]){
      
       int a[] ={1,2,2,3,6,7,7};
        // //input
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // //bubble sorting
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(arr[j]>arr[j+1]){
        //             //swap
        //             int temp=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;

        //         }
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+"  ");

        // }
        int j =0;
        for (int i=0;i<arr.length;i++){
            if(a[i]!=a[i+1]){
                a[j]=a[i];
            }j++;
            
            for(int j=0;i<j;j++){
                System.out.println(a[j]);
            }
            
    } 
    
}
}
