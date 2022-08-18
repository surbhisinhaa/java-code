public class random {

    // public static int MissingNumber(int a[]){
    //     int n=a.length;
    //     int sum=((n+1)*(n+2))/2 ;
    //     int elementsum=0;
    //      for(int i=0;i<n;i++){
    //         elementsum=elementsum+a[i];
    //      }
    //      int missingNum= Math.max(elementsum,sum)- Math.min(elementsum,sum);
    //      return missingNum ;
    //     }
    public static void main(String[]args){
        int a[]={1,2,3,4,5,6,8};
       int ans= MissingNumber(a);
       System.out.println(ans);


    }    
    
    
}

