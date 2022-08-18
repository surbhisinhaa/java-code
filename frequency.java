import java.util.*;

import javax.annotation.processing.SupportedOptions;
public class frequency {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];
        System.out.println("enter the elements of matrix");
        //input....
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output...
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||j==0||i==row||j==col){
                    sum=sum+matrix[i][j];
                }

            }
        }System.out.println(sum);


     
}
}

    