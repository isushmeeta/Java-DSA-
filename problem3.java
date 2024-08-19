import java.util.*;

public class problem3 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols=sc.nextInt();
        int [][] numbers= new int[rows][cols];

        //input

        for (int i=0;i<rows;i++){
            for (int j=0; j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the value of X");
        int x=sc.nextInt();

        //output

        for (int i=0;i<rows;i++){
            for (int j=0; j<cols;j++){
                //compare
                if (numbers[i][j]==x){
                    System.out.println("X found at(" + i + ","+ j +")");

                }

            }
        }





        sc.close();

        

    }
    
}
