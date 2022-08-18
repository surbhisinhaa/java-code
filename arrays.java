
import java.util.*;


public class arrays{
    public static void main(String args[]){
       /* System.out.println("enter the size of an arrays");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("enter elements of array");
        //taking input
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();

        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0; i<array.length;i++){
            if(array[i]>max){
                max=array[i];

            }
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(" enter the number of rows and col");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int numbers[][]=new int[row][col];
        //for taking input

        System.out.println("enter the elements of array");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                numbers[i][j]=sc.nextInt();

            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||j==0||j==col-1||i==row-1){
                    System.out.print(numbers[i][j]+" ");
                    
                }else{
                    System.out.print("  ");
                }

            }System.out.println();

        }*/
        // String Name="surbhi";
        // String LastName="sinha";
        // String FullName= Name+" "+LastName;
        // System.out.println(FullName);
        // System.out.println(FullName.length());
        // for(int i=0;i<FullName.length();i++){
        //     System.out.println(FullName.charAt(i));
        // }
        // StringBuilder sb=new StringBuilder("SURBHI");
        // System.out.println(sb);
        // System.out.println(sb.insert(5,'S'));

        // System.out.println("enter the value of a and b");
        // Scanner Sc=new Scanner(System.in);
        // int a= Sc.nextInt();
        // int b= Sc.nextInt();
        // int product=a*b;
        // System.out.println(product);

        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the radius");
        // int r=sc.nextInt();
        // float pia= 3.14f;
        // float a= pia*(r*r);
        // float perameter=2*pia*r;
        // System.out.println("area of a circle is:"+a);
        // System.out.println("perameter of a circle is :"+perameter);


        // Scanner sc =new Scanner(System.in);
        // int inches=sc.nextInt();
        // float meter= 0.0254f*inches;
        // System.out.println(meter);

        Scanner sc=new Scanner (System. in);
        System.out.println("enter the size of the array");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // if(a>b){
        //      if(a>c) {
        //         System.out.println("greater number is :"+"  "+a);
        //     }else{
        //         System.out.println("c is greater");
        //     }
        //     }
                
            
        
        //     else if (b>c){
        //         System.out.println("b is greater number"+"  "+b);
        //     }
        //     else{
        //         System.out.println("c is greater number"+ "  "+ c);
        //     }
        // int year=sc.nextInt();
        // if(year%4==0){
        //     System.out.println("this is leap year...");
        // }else{
        //     System.out.println("this is not leap year");
        // }

        int n=sc.nextInt();
        int array[]=new int[n];
        int sum=0;
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+array[i];
        }
        int average=sum/n;
        for(int i=0;i<n;i++){
            if(array[i]>average){
                System.out.println(array[i]+":"+"is greater than average of araay ");
            }
            
        }
        

            






    }

}