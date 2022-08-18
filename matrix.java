import java.util.*;

public class matrix {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the rows and col");
        // int row=sc.nextInt();
        // int col=sc.nextInt();
        // int arr1[][]=new int[row][col];
        // int arr2[][]=new int[row][col];
        
        // System.out.println("enter the elemets of matrix");
        // //.......input..................
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         arr1[i][j]=sc.nextInt();
        //     }
        // }
        // //.....................output.................
        // System.out.println("original matrix");
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         System.out.print(arr1[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("after transposing");
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         arr2[i][j]=arr1[j][i];
        //         System.out.print(arr2[i][j]+" ");

        //     }
        //     System.out.println();
        // }
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        //................taking input................
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        //............output............
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("diagonal elements");
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0||j==0||i){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
        



        




        

    }
    
}
