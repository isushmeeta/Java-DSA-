import java.util.*;

public class Arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        //int[] marks=new int[20]; definfing array
        //int marks []=new int[3]; defining array 2nd way
        //int marks[]={97,98,99}; //defining array 3rd way
        int numbers[]=new int[size];//taking array size from users

            //marks[0]= 97;
           // marks[1]=98;
           // marks[2]=99;
        for (int i=0;i<size;i++){
            numbers[i]=sc.nextInt();

            }//taking input from users

        
        // Declaring array literal 
        //int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };


          for (int i=0;i<size;i++){
            System.out.println(numbers[i]);

        }//printing the array using for loop, 

//java automatically stores 0 in empty indexes
        //for(int i=0;i<3;i++){
            //System.out.println(marks[i]);

        //}
        sc.close();
        
    }

}